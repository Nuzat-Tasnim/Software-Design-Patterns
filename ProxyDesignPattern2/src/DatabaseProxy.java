public class DatabaseProxy implements DatabaseExecutor{
    String name,password;

    public DatabaseProxy(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public void ExecuteQuery(String query) throws Exception{
        DatabaseOriginal dbo = new DatabaseOriginal();
        if(name=="Admin" && password=="admin"){
            dbo.ExecuteQuery(query);
        }
        else{
            if(query=="DELETE"){
                throw new Exception("Delete not permitted");
            }
            else{
                dbo.ExecuteQuery(query);
            }
        }
    }
}
