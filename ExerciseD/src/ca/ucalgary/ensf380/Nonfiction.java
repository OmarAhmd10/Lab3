package ca.ucalgary.ensf380;

public class Nonfiction extends Paperback {
    private Category deweyClassification;

    public Nonfiction() {
        super();
    }

    public Nonfiction(String isbn, int pages) {
        super(isbn, pages);
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Paperback";
    }

    public String topic() {
        return "Method topic called from Nonfiction";
    }

    public Category getDeweyClassification() {
        return deweyClassification;
    }

    public void setDeweyClassification(Category deweyClassification) {
        this.deweyClassification = deweyClassification;
    }
}

