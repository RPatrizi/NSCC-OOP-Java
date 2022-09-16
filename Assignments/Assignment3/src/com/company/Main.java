package com.company;

import javax.swing.*;           //For use of JOptionPane
import java.util.ArrayList;     //For use of ArrayLists

public class Main {

    public static void main(String[] args) {

        // Create variables
        int isInvited = 0;
        int notInvited = 0;
        double valueInvited = 99.99;
        double valueNotInvited = 399.99;
        double totalValueInv = 0;
        double totalValueNotInv = 0;

        //Create an arraylist of Friend objects
        ArrayList<Friend> guests = new ArrayList<Friend>();

        //Welcome/instructions message
        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker.\n\nEnter " +
                "person's name and the type of food they're likely to bring,\n" +
                "then indicate whether they are actually invited to the party or not.");

        //Loop to allow the user to continue entering guests as long as they wish
        do {
            //Use a separate Input dialog to get each user input (names, food)
            String first = JOptionPane.showInputDialog(null, "Enter first name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String last = JOptionPane.showInputDialog(null, "Enter last name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String food = JOptionPane.showInputDialog(null, "Enter the food they usually bring", "Party Picker", JOptionPane.QUESTION_MESSAGE);

            //Use an Option dialog to show custom Invited/Not buttons
            boolean invited = false;
            Object[] choices = {"Invited", "Not Invited"};
            int result = JOptionPane.showOptionDialog(null, "Choose if this guested is Invited or Not Invited", "Party Picker",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);

            //If user clicked Invited, set boolean flag to true
            if (result == 0) {
                invited = true;
                isInvited += 1;
                totalValueInv += valueInvited;
            }
            else {
                notInvited += 1;
                totalValueNotInv += valueNotInvited;
            }
            //Create a new Friend object, passing all user values to its constructor, and add to arraylist
            guests.add(new Friend(first, last, invited, food));
            //Use a Confirm dialog to see if the user wants to enter another guest. Continue if yes (0), otherwise, stop looping
        } while (JOptionPane.showConfirmDialog(null, "Enter another guest?", "Party Picker", JOptionPane.YES_NO_OPTION) == 0);

        //Build a string for the final report
        String report = "Guests:\n";
        String financial = ("Total Guests are: " + (isInvited + notInvited) + "\n- " + isInvited + " invited. \n- " + notInvited + " not invited\n- Total Expenses: $" + totalValueInv + "\n- Total Earned: $" + totalValueNotInv + "\n- Gross Profit: $" + (totalValueNotInv - totalValueInv) + "\n- Done by: Rodrigo Borges");

        //For-each loop to iterate through each Friend in arraylist, call its toString() method and add it to the final report string
        for (Friend currFriend : guests) {
            report += "\n" + currFriend.toString();
        }

        //Print the final report in a Message dialog.
        JOptionPane.showMessageDialog(null, "\n" + report + "\n" + financial);
    }
}