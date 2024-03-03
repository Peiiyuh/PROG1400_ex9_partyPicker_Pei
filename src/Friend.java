public class Friend extends Person{
    //Friend (foodToBring).
    private String foodToBring;

    //Constructor
    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    //The Friend subclass should have a toString() method which builds a string describing the person,
    // their food and whether they are invited or not.
    // It should call the super’s getFullName() method and include some basic logic to use the super’s isInvited
    // to build an appropriate message about each potential guest. The method should return something like:
//“Jane Doe is bringing pizza. They are invited to the party.” OR
//“John Doe is bringing broccoli. They are NOT invited to the party.”

    public java.lang.String toString(String firstName, String lastName, boolean isInvited, String foodToBring) {
        if (this.isInvited())
        {
            return Person.getFullName(firstName,lastName)+ " is bringing " + this.foodToBring+ ". They are invited to the party.";
        }
        else
        {
            return Person.getFullName(firstName,lastName)+ " is bringing " + this.foodToBring+ ". They are not invited to the party.";
        }

    }

}
