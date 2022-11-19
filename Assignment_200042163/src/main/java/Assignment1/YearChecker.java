package Assignment1;
public class YearChecker {
    private boolean DivByFourProperty(int year){
        if(year%4==0){
            return true;
        }
        else{
            return false;
        }
    }
    private  boolean NotDivByHundredProperty(int year){
        if(year%100==0){
            return false;
        }
        else{
            return  true;
        }
    }
    public boolean IsLeapYear(int year){
        if(DivByFourProperty(year) && NotDivByHundredProperty(year)){
            return true;
        }
        else{
            return false;
        }
    }

}
