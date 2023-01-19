package com.demo.Entity;

import java.util.Iterator;
import java.util.List;

public class MCQ {

private int id;
private String sname;
private List<String>ans;
public MCQ() {
	
}
public MCQ(int id,String sname,List<String>ans) {
	super();
	this.id=id;
	this.sname=sname;
	this.ans=ans;
	
}
public void display() {
	System.out.println(id+" "+sname);
	System.out.println("Answers are:");
Iterator <String> itr=ans.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
}

}

