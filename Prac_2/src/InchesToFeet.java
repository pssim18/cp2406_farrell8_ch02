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

        System.out.println(inchesNum + " inches becomes " + (inchesNum / feet) + " feet and " + (inchesNum % feet) + " inches.");
    }

}
