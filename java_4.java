import java.lang.reflect.Array;
import java.util.Arrays;

public class java_4 {
    public static void main(String[] args) {
        int rollNo = 43452;
        int maths = 97;
        int phy = 88;
        int chem = 87;

        int[] studDetail = new int[4]; // arrays are non premetive data type
        studDetail[0] = rollNo;
        studDetail[1] = maths;
        studDetail[2] = phy;
        studDetail[3] = chem;

        System.out.println(studDetail); // some class code will be printed as output

        System.out.println(studDetail.length);

        System.out.println(studDetail[1]);
        Arrays.sort(studDetail);
        //after sorting
        System.out.println(studDetail[1]);
    }
}