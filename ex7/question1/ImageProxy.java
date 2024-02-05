public class ImageProxy implements IImage {
    private String fileName;
    private Image realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new Image(fileName);
        }
        realImage.display();
    }
}
