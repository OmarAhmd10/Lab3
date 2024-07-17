package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        // Step 1: Create Author objects
        Author janeAusten = new Author("Jane Austen", "Steventon, Hampshire, England", 41);
        Author hermanMelville = new Author("Herman Melville", "New York City, New York, USA", 72);

        // Step 2: Create Publisher object
        Publisher harperCollins = new Publisher("Harper Collins", "New York City, New York, USA");

        // Step 3: Create Classic book objects
        Classic prideAndPrejudice = new Classic();
        prideAndPrejudice.setTheAuthor(janeAusten);
        prideAndPrejudice.setOrigPubYear(1813);
        prideAndPrejudice.setBookPublisher(new Publisher[]{harperCollins});

        Classic mobyDick = new Classic();
        mobyDick.setTheAuthor(hermanMelville);
        mobyDick.setOrigPubYear(1851);
        mobyDick.setBookPublisher(new Publisher[]{harperCollins});

        // Step 4: Print details
        System.out.println("Book: Pride and Prejudice");
        System.out.println("Author: " + prideAndPrejudice.getTheAuthor().getName());
        System.out.println("Original Publication Year: " + prideAndPrejudice.getOrigPubYear());
        System.out.println("Publisher: " + prideAndPrejudice.getBookPublisher()[0].getName());
        System.out.println();

        System.out.println("Book: Moby Dick");
        System.out.println("Author: " + mobyDick.getTheAuthor().getName());
        System.out.println("Original Publication Year: " + mobyDick.getOrigPubYear());
        System.out.println("Publisher: " + mobyDick.getBookPublisher()[0].getName());
        System.out.println();
    }
}
