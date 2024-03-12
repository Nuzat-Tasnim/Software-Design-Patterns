import java.util.ArrayList;

public class Employees implements Container{
    ArrayList<Employee> empList = new ArrayList<Employee>();

    public void addEmployee(Employee employee){
        empList.add(employee);
    }


    @Override
    public Iterator getIterator() {
        return new employeeIterator();
    }

    public class employeeIterator implements Iterator{

        int index=0;

        @Override
        public Boolean hasNext() {
            if(index<empList.size())
                return true;
            else
                return false;
        }

        @Override
        public Employee current() {
            return empList.get(index++);
        }
    }
}
