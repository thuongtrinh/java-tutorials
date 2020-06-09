package com.txt.solid.s;

import com.txt.entity.User;

/**
 * @Comemnt Not SRP
 */
public class UnSPrinciple { // Get data from database

	public User getUser() {
		return null;
	}

	// Check validation
	public boolean isValid() {
		return true;
	}

	// Show Notification
	public void showNotification() {

	}

	// Logging
	public void logging() {
		System.out.println("...");
	}

	// Parsing
	public User parseJson(String json) {
		return null;
	}
}
