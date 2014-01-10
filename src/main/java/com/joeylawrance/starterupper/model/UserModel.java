package com.joeylawrance.starterupper.model;

/**
 * Defines getters and setters for a user's name and email address.
 * 
 * @author Joey Lawrance
 *
 */
public interface UserModel {
	/**
	 * Set the user name.
	 * @param username
	 */
	public void setUsername(String username);
	/**
	 * Get the user name.
	 * @return
	 */
	public String getUsername();
	/**
	 * Set the email address.
	 * @param email
	 */
	public void setEmail(String email);
	/**
	 * Get the email address.
	 * @return the email address
	 */
	public String getEmail();
	/**
	 * Set the first name.
	 * @param firstname
	 */
	public void setFirstname(String firstname);
	/**
	 * Get the first name.
	 * @return the first name
	 */
	public String getFirstname();
	/**
	 * Set the last name.
	 * @param lastname
	 */
	public void setLastname(String lastname);
	/**
	 * Get the last name.
	 * @return the last name
	 */
	public String getLastname();
	/**
	 * Set the full name.
	 * @param fullname
	 */
	public void setFullname(String fullname);
	/**
	 * Get the full name.
	 * @return the full name
	 */
	public String getFullname();
}
