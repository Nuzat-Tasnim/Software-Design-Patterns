package com.company;

import java.util.ArrayList;

public class Employees {
    public ArrayList<Employee> emps = new ArrayList<Employee>();
    public void addEmployee(Employee e)
    {
        emps.add(e);
    }

    public ArrayList<Employee> getEmps() {
        return emps;
    }

    public void setEmps(ArrayList<Employee> emps) {
        this.emps = emps;
    }

    public EmpIterator getIterator()
    {
        return new EmpIterator();
    }

    public class EmpIterator{
        int index=0;
        boolean hasnext()
        {
            if(index<emps.size()) return true;
            return false;
        }
        Employee next()
        {
            return emps.get(index++);
        }
    }
}
