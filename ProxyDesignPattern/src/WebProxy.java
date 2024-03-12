public class WebProxy implements WebInterface{
    WebPageImp wpi;

    public WebProxy(WebPageImp wpi) {
        this.wpi = wpi;
    }

    public void render(String url){
        if(url.contains("youtube")){
            System.out.println("Youtube is not available for your country");
        }
        else
            wpi.render(url);
    }
}
