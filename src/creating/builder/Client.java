package creating.builder;

public class Client {
    public static void main(String[] args) {
        IphoneBuilder builder = new Iphone6sBuilder();
        IphoneDirector director = new Iphone6sDirector(builder);
        Iphone iphone = director.directIphone();
        iphone.photo();
    }
}
