package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

//Demo on Collection Interface
public class DemoOnCollectionInterface {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Collection obj=new ArrayList<>();
		//adding the values
		obj.add("Caroline");
		obj.add('x');
		obj.add(87.90f);
		System.out.println("The elements in collections are: "+obj);

	}
