import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Concepts:
        //Inheritance, GUI with JOptionPane, ArrayLists & For-Each loops

        //Create a GUI program to enter the names of potential guests to a party, the food they usually bring,
        //and whether or not they’re actually invited.

        //Create proper constructors for each class, passing values via super() as required.

        //Your Main() class should run the program, doing the following:
        //Create an ArrayList that will hold all Friend objects entered by the user.
        ArrayList<String> friedns = new ArrayList<String>();

        //Display a welcome/instructions popup message when the program starts
        JOptionPane.showMessageDialog(null,"Welcome to the Party Picker.\n\n" +
                "Enter person's name and the type of food they're likely to bring,\n" +
                "then indicate whether they are actually invited to the party or not.",
                "Message", JOptionPane.INFORMATION_MESSAGE);

        //Continue to ask the user to enter names and foods until they decide to stop.
        String fNInput;
        String lNInput;
        String food;
        Object[] invitedBtn = {"Invited", "Not Invited"};


        fNInput = JOptionPane.showInputDialog(null,"Enter first name: ","Party Picker", JOptionPane.OK_CANCEL_OPTION);
        lNInput= JOptionPane.showInputDialog(null,"Enter last name: ","Party Picker", JOptionPane.OK_CANCEL_OPTION);
        food = JOptionPane.showInputDialog(null,"Enter the food they usually bring: ","Party Picker", JOptionPane.OK_CANCEL_OPTION);
        JOptionPane.showOptionDialog(null,"Choose the guest is invited or not invited: ","Party Picker", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null,invitedBtn,invitedBtn[0]);

        //When each potential guest’s data is entered, create and save a new Friend object.
        JOptionPane.showConfirmDialog(null,"Enter another guest?", "Party Picker", JOptionPane.YES_NO_OPTION);
        //After all guests are entered, use a for-each loop to retrieve each guest from the list and build a report to list each guest,
        // their food and whether they are invited.
        //Exercise Notes
        //Don’t worry about input validation unless you want to.
        //For the time being, you can ignore all Cancel buttons in the popups.
        //This exercise has you build classes using inheritance (Person, Friend).
        // It may seem a bit over-engineered to do so, since there’s only one subclass…
        // why not just put all the properties/methods in the Person class? A) We need lots of practice with inheritance, and B)
        // Building it this way allows much greater flexibility to our overall design. If we wanted to expand this program later,
        // to include other types of Person we might invite to our parties (Co-Worker, Family, etc.),
        // it’s far easier. Inherit from Person and you’re practically done.
    }
}