package Lab_05.ThirdPartyFilters;

import Lab_05.Camera.Filter;
import Lab_05.Camera.Image;

public class SnapChatFilterAdapter implements Filter {
    SnapChatFilter snapChatFilter;

    public SnapChatFilterAdapter(SnapChatFilter snapChatFilter) {
        this.snapChatFilter = snapChatFilter;
    }

    @Override
    public void apply(Image image) {
        snapChatFilter.applySnapChatFilter(image);
    }
}
