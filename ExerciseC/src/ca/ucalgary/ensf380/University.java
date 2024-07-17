package ca.ucalgary.ensf380;

public class University {
    public static void main(String[] args) {
        // Step 1: Create Address objects
        Address address1 = new Address("873 Greenwood Ave", "Calgary", "AB", "T2A 1B4", "Canada");
        Address address2 = new Address("91 Parkway St", "Calgary", "AB", "T2A 6N9", "Canada");
        Address address3 = new Address("1087 Pinewood Cl", "Calgary", "AB", "T2B 3J7", "Canada");

        // Step 2: Create a Professor
        Professor prof = new Professor("Dr. Messi", "403-123-4567", "dr.messi@ucalgary.ca", address1, "30167654", 120000);

        // Step 3: Create Students
        Student student1 = new Student("Omar Ahmed", "403-234-5678", "omar.ahmed@ucalgary.ca", address2, "21358967", prof, 85);
        Student student2 = new Student("Jacelynn Doan", "403-345-6789", "jacelynn.doan@ucalgary.ca", address3, "45871359", prof, 72);

        // Display roles
        prof.displayRole();
        student1.displayRole();
        student2.displayRole();

        // Example scenario
        System.out.println(prof.getName() + " supervises " + student1.getName() + " and " + student2.getName() + ".");
        
        System.out.println(student1.getName() + " is eligible to enroll: " + student1.isEligibleToEnroll());
        System.out.println(student2.getName() + " is eligible to enroll: " + student2.isEligibleToEnroll());

        // Display address labels
        System.out.println("Dr.Messi's address: " + prof.getAddress().outputAsLabel());
        System.out.println("Omar Ahmed's address: " + student1.getAddress().outputAsLabel());
        System.out.println("Jacelynn Doan's address: " + student2.getAddress().outputAsLabel());
    }
}


