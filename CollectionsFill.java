package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFill {
/*
  *Collections.fill replaces the entire list elements with the element value given as 
  *input Collections.fill(list,value)
  */
	public static void main(String[] args) {
		List<String> stringList=new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Cherry");
		System.out.println("Before filling"+stringList);
		Collections.fill(stringList, "Fruit");
		System.out.println("After filling"+stringList);
    
		}
		
	}
