package Lab_05.ThirdPartyFilters;

import Lab_05.Camera.Filter;
import Lab_05.Camera.Image;

public class InstagramFilterAdapter implements Filter {
    InstagramFilter instagramFilter;

    public InstagramFilterAdapter(InstagramFilter instagramFilter) {
        this.instagramFilter = instagramFilter;
    }

    @Override
    public void apply(Image image) {
        instagramFilter.applyInstagramFilter(image);
    }
}