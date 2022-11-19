package Assignment1;
public class DateClass {
    public  int day;
    public  int month;
    public  int year;
    public DateClass(int day, int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public DateClass(){

    }
    public String DateToString(){
        return this.day+"/"+this.month+"/"+this.year;
    }
}
