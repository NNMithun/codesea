package com.LearnJavaCollections;

import java.util.HashSet;

public class EqualsNHashCode {
    public static void main(String args[]){
        HashSet<Employee> empHashSet=new HashSet<Employee>();
        empHashSet.add(new Employee("David", 32));
        empHashSet.add(new Employee("John", 45));
        for(Employee emp:empHashSet){System.out.println(emp);}
        boolean isRemoved=empHashSet.remove(new Employee("David", 32));
        System.out.println("David is removed: "+isRemoved);
        for(Employee emp:empHashSet){System.out.println(emp);}

    }

}
