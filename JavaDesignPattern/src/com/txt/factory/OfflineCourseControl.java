package com.txt.factory;

public class OfflineCourseControl extends AbstractCourseControl {

	@Override
	protected AbstractCourseFactory getCourseFactory() {
		return new OfflineCourseFactory();
	}

}
