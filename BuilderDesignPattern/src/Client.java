public class Client {
    public static void main(String[] args) {
        LaptopBuilder lb = new LaptopBuilder();

        lb.setCompany("ASUS");
        lb.setHarddrive("HDD");
        lb.setPort("HDMI");
        lb.setProcessor("intel core 5");
        lb.setRam("4GB");

        Laptop lp = lb.build();
        lp.view();
    }
}
