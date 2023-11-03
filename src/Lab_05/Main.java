package Lab_05;

import Lab_05.Camera.*;
import Lab_05.ThirdPartyFilters.*;

public class Main {
    public static void main(String[] args) {
        Image image = new Image();

        ImageView imageView = new ImageView(image, new bwFilter());
        imageView.applyFilter();

        System.out.println("----------------------------------");

        Filter snapchatFilter = new SnapChatFilterAdapter(new SnapChatFilter());
        ImageView snapchatView = new ImageView(image, snapchatFilter);
        snapchatView.applyFilter();

        System.out.println("----------------------------------");

        Filter instagramFilter = new InstagramFilterAdapter(new InstagramFilter());
        ImageView instagramView = new ImageView(image, instagramFilter);
        instagramView.applyFilter();
    }
}
