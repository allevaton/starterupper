package com.joeylawrance.starterupper.model;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Email2SchoolTest {

	@Test
	public void test() {
		assertThat(Email2School.schoolFromEmail("somebody@open.ac.uk"), is ("The Open University"));
		assertThat(Email2School.schoolFromEmail("somebody@csail.mit.edu"), is("Massachusetts Institute of Technology"));
		assertThat(Email2School.schoolFromEmail("somebody@tsinghua.edu.cn"), is ("Tsinghua University"));
	}

}
