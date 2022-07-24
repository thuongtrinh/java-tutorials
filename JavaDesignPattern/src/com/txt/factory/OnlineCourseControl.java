package com.txt.factory;

public class OnlineCourseControl extends AbstractCourseControl {

	@Override
	protected AbstractCourseFactory getCourseFactory() {
		return new OnlineCourseFactory();
	}

}
