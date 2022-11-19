package Assignment1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonthChecker {
    private YearChecker YearChecker= new YearChecker();
    private static final ArrayList<Integer>MonthOf_31=new ArrayList<Integer>(
            Arrays.asList(1,3,5,7,8,10,12)
    );

    public int  MonthDays(int month,int year){
        if(MonthOf_31.contains(month)){
            return 31;
        }
        else if(month !=2){
            return 30;
        }
        else{
            if(this.YearChecker.IsLeapYear(year))
                return 29;
            else
                return 28;
        }
    }
    public boolean IsLastMonth(int month){
        if(month ==12 )return true;
        else return false;
    }
}
