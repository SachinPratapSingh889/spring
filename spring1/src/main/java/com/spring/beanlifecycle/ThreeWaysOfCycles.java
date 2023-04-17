package com.spring.beanlifecycle;
//we have two methods for bean life cycle that we can use first is init() and destroy(), init can be called after instatiantion and setting of value in 
//object and later as a clean up code we use destroy()

//way 1= by defineing names of init-method and destroy-method in xml , destroy-method doesnot run until we use AbstractApplicationContext interface because it have 
// registerShutDownHook() after this destroy-method will work

//way 2= by interfaces intializtingBean for init fun and disposableBean for destroy
public class ThreeWaysOfCycles {
     private String name;
     private String city;
	public ThreeWaysOfCycles(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public ThreeWaysOfCycles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting first");

		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
     
	public void init() {
		System.out.println(" init method is running");

	}
	@Override
	public String toString() {
		return "ThreeWaysOfCycles [name=" + name + ", city=" + city + "]";
	}
	public void destroy() {
		System.out.println("destroy method is running");
	}
}
