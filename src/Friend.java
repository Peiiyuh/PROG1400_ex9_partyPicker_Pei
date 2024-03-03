public class Friend extends Person{
    //Friend (foodToBring).
    private String foodToBring;

    //Constructor
    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    //Method
    @Override
    public String toString() {
        String invited;
        if(!super.isInvited())
        {
            invited = "NOT invited";
        }
        else
        {
            invited = "invited";
        }
        return super.getFullName() + " is bringing " + foodToBring + ". They are " + invited + " to the party.";
        //MUST use super instead the actual name of parent class.
    }
}
