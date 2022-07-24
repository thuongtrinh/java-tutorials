package com.txt.junit4.powermock.statics;

import com.txt.common.utils.UserUtils;

public class UserService3 {

	public String insert() {
		final String username = "com.txt";
		UserUtils.validate(username);
		String uuid = UserUtils.generateUniqueId();
		UserUtils.validate(uuid);
		return username;
	}
}
