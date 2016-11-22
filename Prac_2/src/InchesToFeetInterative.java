import javax.swing.JOptionPane;
/**
 * Created by pohsheng on 22/11/2016.
 */
public class InchesToFeetInterative
{
    public int getNum()
    {
        String num;
        int num2;
        num = JOptionPane.showInputDialog("Enter inches");
        num2 = Integer.parseInt(num);
        return num2;
    }
}
