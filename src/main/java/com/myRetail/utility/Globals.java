package com.myRetail.utility;


import java.util.ArrayList;
import java.util.List;

public class Globals {
	public static final long ZOMBIE_LOOP_TIME = 5000;


	//global constants must be defined as static final
	public static final String GCMServerKey = "AIzaSyCF_pvDl4MTcLPIPkua65ZmhJvdsOOctoI";

	public static List<String> gcmIdStore;

	public static List<String> getOrderedUserFields() {
		ArrayList<String> list = new ArrayList<>();
		list.add("name");
		list.add("total kills");
		list.add("kills");
		list.add("active");
		list.add("ammo");
		list.add("serum");
		list.add("last used serum");
		return list;
	}


}
