public class Client {
    public static void main(String[] args) throws Exception {
        DatabaseProxy dp = new DatabaseProxy("Admin","admin");
        dp.ExecuteQuery("DELETE");

    }
}
