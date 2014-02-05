package com.joeylawrance.starterupper.model.host.impl;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.joeylawrance.starterupper.model.host.GenericGitHostRepository;
import com.joeylawrance.starterupper.model.host.HostAction;

public class GitLab extends GenericGitHostRepository {
	private final Logger logger = LoggerFactory.getLogger(GitLab.class);
	
	public GitLab() {
		super("GitLab", GitLab.class.getResource("/gitlab.png"), "GitLab Cloud is an open source git project host.");
		setHost("gitlab.com");
		setURL(HostAction.login,"https://gitlab.com/users/sign_in");
		setURL(HostAction.logout,"https://gitlab.com/users/sign_out");
		setURL(HostAction.signup,"https://gitlab.com/users/sign_up");
		setURL(HostAction.reset,"https://gitlab.com/users/password/new");
		setPublicKeyURL("https://gitlab.com/profile/keys/new");
		setRepositoryCreateURL("https://gitlab.com/projects/new");
		setCollaboratorURL("https://gitlab.com/%s/%s/team_members/new");
	}

	@Override
	public boolean signUp() {
		super.signUp();
		
		HtmlPage p = getClient().getPageInWindow(getHostName());
		HtmlElement acceptTerms = (HtmlElement) p.getElementById("user_accept_terms");
		try {
			acceptTerms.click();
		} catch (IOException e) {
			logger.error("Unable to click accept terms.", e);
		}
		
		getClient().submitForm(getHostName(),"Sign up");
		
		return !getURL(HostAction.signup).equals(getClient().getPageUrl(getHostName()));
	}
}
