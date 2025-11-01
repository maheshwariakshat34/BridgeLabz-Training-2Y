package com.access.two;
import com.access.one.Base;

public class Derived extends Base {
    public void showAccess() {
        System.out.println("Inside Derived (subclass in different package):");
        publicMethod();
        protectedMethod();
        // defaultMethod(); // not accessible
        // privateMethod(); // not accessible
    }
}
