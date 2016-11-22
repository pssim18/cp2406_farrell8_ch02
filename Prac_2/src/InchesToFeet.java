/**
 * Created by pohsheng on 22/11/2016.
 */
public class InchesToFeet
{
    public static void main(String[] args)
    {
        InchesToFeetInterative in = new InchesToFeetInterative();
        int inchesNum = in.getNum();
        int feet = 12;
        int inches = 86;

        System.out.println(inches + " inches becomes " + (inches / feet) + " feet and " + (inches % feet) + " inches.");
    }

}
