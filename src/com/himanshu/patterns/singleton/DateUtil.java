package com.himanshu.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable , Cloneable{

	private static final long serialVersionUID = 1L;
	private static volatile DateUtil instance;

	/* 1.This is Eager initialization , even before the getInstance is invoked , 
	 * this is helpful if you are sure that DateUtil class will be initialized at least once.
	 * private static DateUtil instance = new DateUtil() ;
	 */
	
	/* 
	 *  Use of static block - static blocks in java are executed when the class is loaded into memory
	 *  This is also eager initialization
	 *  static {
	 *  instance = new DateUtil() ;
	 *  }
	 */
	private DateUtil() {

	}

	// This is lazy initialization , which means that DateUtil class is initialized only when the getInstance method was first invoked
	// ***** This is preferred
	public static DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

/* MAKE THE SINGLETON CLASS AS THREAD SAFE
 * 1. Interview question, how to make a singleton class thread safe
 * 2. If multiple threads are trying to access the getInstance method we must make sure that only one instance of the class is created
 * 3. This is achieved by using synchronized keyword.
 * 4. another option is to put the if block inside the synchronized block and acquire a lock on the DateUti class. 
 * 5. Since the synchronized process is expensive , lets put a double check that if the instance is null , only then aquire the mutex lock else return
 * 6. add volatile to the filed declaration it means that no caching done by the local thread
 */

/* HANDLE SERIALIZATION AND DESERIALIZATION PROBLEM
 *  1. Problem is that on  de-serializing java objects , we dont get the same instance.
 *  2. the ObjectInputStream when it is de-serializing an object , it internally invokes readResolve method which we implement in your singleton class.
 *  3. Thus the OIS class will use the DateUtil instance by calling the readResolve() instead of creating a new instance.
 *  4. Mind the signature of the method, access type protected such that if the child classes want to override the method, not public as we dont want other classes
 *  to call this method , it can be made private also.
 *  
 */

/* Handle Clone Cases
 * 1. We dont want the client appalication to clone the singleton object of the class.
 * 2. The client application can try to clone the object of the singleton class by extending the Singleton class ,and then calling super.clone() from its overrided
 * clone()
 * 3. Solution is to throw CloneNotSupportedException()
 * 
 */


