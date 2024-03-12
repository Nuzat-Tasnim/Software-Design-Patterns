public class Laptop {
    String company;
    String ram;
    String processor;
    String graphicscard;
    String harddrive;
    String port;

    public Laptop(String company, String ram, String processor, String graphicscard, String harddrive, String port) {
        this.company = company;
        this.ram = ram;
        this.processor = processor;
        this.graphicscard = graphicscard;
        this.harddrive = harddrive;
        this.port = port;
    }

    public void view(){
        System.out.println(company+" "+ram+" "+processor+" "+graphicscard+" "+harddrive+" "+port);
    }

}
