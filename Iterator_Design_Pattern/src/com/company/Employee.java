package com.company;

public class Employee {
    private int id, salary;
    Employee(int i,int s)
    {
        id=i;
        salary=s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
