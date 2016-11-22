import javax.swing.JOptionPane;
/**
 * Created by pohsheng on 22/11/2016.
 */
public class Eggs
{
    public static void main(String[] args)
    {
        String amountString;
        double dozenEgg = 3.25;
        double indivEgg = 0.45;
        int amount;
        amountString = JOptionPane.showInputDialog("Enter amount of egg", JOptionPane.INFORMATION_MESSAGE);
        amount = Integer.parseInt(amountString);
        JOptionPane.showMessageDialog(null, "You ordered " + amount + " eggs. That's " + (amount / 12) + " dozen at $3.25 per dozen and " + (amount % 12) + " loose egg at $0.45 each for a total of $"+ ((amount / 12 * 3.25)+(amount % 12 * 0.45)));
    }
}
