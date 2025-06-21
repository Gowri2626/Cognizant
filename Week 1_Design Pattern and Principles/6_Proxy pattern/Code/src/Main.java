public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature.jpg");
        Image image2 = new ProxyImage("sunset.jpg");

        image1.display(); 
        image1.display(); 
        image2.display(); 
    }
}

