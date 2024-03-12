public class Browser {
    public static void main(String[] args) {
        WebProxy wpi = new WebProxy(new WebPageImp());
        wpi.render("www.facebook.com");
        wpi.render("www.youtube.com");
    }
}
