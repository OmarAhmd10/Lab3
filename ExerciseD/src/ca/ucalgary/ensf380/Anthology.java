package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    private Story[] story;

    public Anthology() {
        super();
    }

    public Anthology(String isbn, int pages) {
        super(isbn, pages);
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Anthology";
    }

    public String storyOrder() {
        return "Method storyOrder called from Anthology";
    }

    public Story[] getStory() {
        return story;
    }

    public void setStory(Story[] story) {
        this.story = story;
    }
}


