package Assignment1;
public class IncrementDay {
        MonthChecker monthChecker= new MonthChecker();
        public DateClass NextDay(DateClass GivenDate){
                DateClass NextDate;
                if(GivenDate.day<monthChecker.MonthDays(GivenDate.month,GivenDate.year)){
                   NextDate= new DateClass(GivenDate.day+1,GivenDate.month,GivenDate.year);
                }
                else {
                    if(monthChecker.IsLastMonth(GivenDate.month)){
                        NextDate=new DateClass(1,1,GivenDate.year+1);
                    }
                    else{
                        NextDate= new DateClass(1,GivenDate.month+1,GivenDate.year);
                    }

                }
                return NextDate;
        }
}
