public class Client {
    public static void main(String[] args) {
        Employees emps = new Employees();
        emps.addEmployee(new Employee("tapti",30000.0));
        emps.addEmployee(new Employee("tapti2",35000.0));

        Iterator iterator = emps.getIterator();

        while (iterator.hasNext()){
            Object e = iterator.current();
            System.out.println(e);
        }

    }

}
