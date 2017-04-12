package com.dineshkrish;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Dinesh Krishnan
 *
 */

public class RoundRobinTest {

	public static List<String> getResources() {

		List<String> resourceList = new ArrayList<String>();

		resourceList.add("instance_1");
		resourceList.add("instance_2");
		resourceList.add("instance_3");

		return resourceList;
	}

	public static void main(String[] args) {

		// creating container with resources
		RoundRobin<String> rr = new RoundRobinImpl<String>(getResources());

		try {

			// selecting the resource
			System.out.println(rr.select());
			System.out.println(rr.select());
			System.out.println(rr.select());

			System.out.println(rr.select());
			System.out.println(rr.select());
			System.out.println(rr.select());

		} catch (RoundRobinException e) {

			System.out.println(e.getMessage());
		}

	}
}
