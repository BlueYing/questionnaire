package com.test;

import java.util.ArrayList;
import java.util.List;

import com.sgcc.Filed;

public class TestValue {

	public List<Filed> getV(){
		List<Filed> list = new ArrayList<Filed>();
		Filed f = new Filed();
		f.setId("1");
		f.setTitlename("第一道题");
		f.setLength("50");
		f.setType("input");
		list.add(f);
		return list;
	}
	
}
