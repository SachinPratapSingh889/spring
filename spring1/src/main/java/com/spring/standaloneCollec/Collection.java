package com.spring.standaloneCollec;

import java.util.List;
import java.util.Map;

public class Collection {
   private List<String> names;
   private Map<String, Integer> courese;

public Map<String, Integer> getCourese() {
	return courese;
}

public void setCourese(Map<String, Integer> courese) {
	this.courese = courese;
}

public List<String> getnames() {
	return names;
}

public void  setnames(List<String> names) {
	this.names = names;
}

public Collection(List<String> names) {
	super();
	this.names = names;
}

public Collection() {
	super();
	// TODO Auto-generated constructor stub
}

//@Override
//public String toString() {
//	return "Collection [names=" + names + "]";
//}
@Override
public String toString() {
	return "Collection [courese=" + courese + "] [names=" + names + "]";
}
   
   
}
