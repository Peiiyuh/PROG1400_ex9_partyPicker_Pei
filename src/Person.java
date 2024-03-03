public class Person {
    private String firstName;
    private String lastName;
    private boolean isInvited;

    public Person(String firstName, String lastName, boolean isInvited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;
    }

    //Getter
    public boolean isInvited() {
        return isInvited;
    }
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
