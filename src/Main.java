import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Arraylist Friend to store each friend info
        ArrayList<Friend> friedns = new ArrayList<Friend>();

        //Display a welcome/instructions popup message when the program starts
        JOptionPane.showMessageDialog(null,"Welcome to the Party Picker.\n\n" +
                "Enter person's name and the type of food they're likely to bring,\n" +
                "then indicate whether they are actually invited to the party or not.",
                "Message", JOptionPane.INFORMATION_MESSAGE);

        //Continue to ask the user to enter names and foods until they decide to stop.
        boolean tempForInvited;   // bc isInvited will return int, can't use boolean, store result after converted
        Object[] invitedBtn = {"Invited", "Not Invited"};  //create two btn for invited question
        boolean isAnotherguest = true;  //Decide if the loop keep going or break down
        do{
            String fNInput = JOptionPane.showInputDialog(null,"Enter first name: ","Party Picker", JOptionPane.OK_CANCEL_OPTION);
            String lNInput= JOptionPane.showInputDialog(null,"Enter last name: ","Party Picker", JOptionPane.OK_CANCEL_OPTION);
            String food = JOptionPane.showInputDialog(null,"Enter the food they usually bring: ","Party Picker", JOptionPane.OK_CANCEL_OPTION);
            int isInvited = JOptionPane.showOptionDialog(null,"Choose the guest is invited or not invited: ","Party Picker",
                                                         JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,invitedBtn,invitedBtn[0]);
            if (isInvited == 0)
            {
                tempForInvited=true;  //make int into boolean to match the required datatype
            }
            else
            {
                tempForInvited=false; //make int into boolean to match the required datatype
            }
            //When each potential guest’s data is entered, create and save a new Friend object.
            friedns.add(new Friend(fNInput,lNInput,tempForInvited,food));  //add each friend into 'friends'

            int result = JOptionPane.showConfirmDialog(null,"Enter another guest?", "Party Picker", JOptionPane.YES_NO_OPTION);
            if (result == 0)  //yes
            {
                isAnotherguest = true;
            }
            else   //no
            {
                isAnotherguest = false;
            }
        }while(isAnotherguest);

        //After all guests are entered, use a for-each loop to retrieve each guest from the list and build a report to list each guest,
        // their food and whether they are invited.
        String report = "Guests:\n\n";
        for(Friend i:friedns)
        {
            report += i.toString()+"\n";
        }
        JOptionPane.showMessageDialog(null,report);

    }
}