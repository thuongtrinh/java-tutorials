package com.txt.junit4.basic;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.txt.common.utils.TaskUtils;

public class TimeoutTest2 {

	// Set timeout max 3 seconds per each method tested
	@Rule
	public Timeout globalTimeout = Timeout.seconds(3); // 3 seconds

	@Test
	public void testTimeout1() {
		int expected = 1;
		int actual = TaskUtils.doNormalTask();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testTimeout2() {
		int expected = 1;
		int actual = TaskUtils.doHeavyTask();
		Assert.assertEquals(expected, actual);
	}

}
