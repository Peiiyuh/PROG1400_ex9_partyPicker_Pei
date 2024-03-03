public class Person {
    private String firstName;
    private String lastName;
    private boolean isInvited;

    public Person () {}   //Default construction
    public Person(String firstName, String lastName, boolean isInvited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;
    }

    //Getter
    public boolean isInvited() {
        return isInvited;
    }
    public static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}
