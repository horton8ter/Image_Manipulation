import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.PriorityQueue;
import javax.imageio.ImageIO;

public class imageEater {
    PriorityQueue<Color> pq = new PriorityQueue(5, new colorComparator());
    PriorityQueue<Color> tributary = new PriorityQueue(5, new rgbComparator("RED"));
    BufferedImage image;
    int width;
    int height;

    public imageEater() {
        try {
            File input = new File("images.jpg");
            File output = new File("queueSortedPicture.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height =image.getHeight();

            int i;
            int j;
            for(i = 0; i < height; ++i) {
                for(j = 0; j < width; ++j) {
                    pq.add(new Color(image.getRGB(j, i)));
                }
            }

            for(i = 0; i < height; ++i) {
                for(j = 0; j <width; ++j) {
                    tributary.add(pq.remove());
                    if (j == width - 1) {
                        for(int k = j; k >= 0; --k) {
                            image.setRGB(k, i, tributary.remove().getRGB());
                        }
                    }
                }
            }

            ImageIO.write(image, "jpg", output);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public static void main(String[] args) throws Exception {
        new imageEater();
    }
}