import javax.swing.*;

public class Window{
    public static void main(String[] args){
        //This is just a window to let the user know the rules of the game and
        JOptionPane.showMessageDialog(null, "I am thinking of a number between 1 and 1000," +
                "\n" +"guess my number win the game. " +
                "\n" +"Blue means you are getting Colder," +
                "\n" + "Red window means you are getting Warmer," +
                "\n"+ "Green is correct." +
                "\n" + "Exit the window to begin!");

        Create newGuess = new Create(); //instantiate window
        newGuess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //how to close window
        newGuess.setSize(400,400); //dimensions of the frame
        newGuess.setVisible(true);
    }
}//

