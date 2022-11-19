package Assignment1;
import Assignment1.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestNextDateFinder{
    @Test
    public void NextDateOfSameMonth(){
        DateClass dummyDate= new DateClass(23,3,2004);
        IncrementDay incrementDay= new IncrementDay();
        DateClass nextDate= incrementDay.NextDay(dummyDate);
        assertEquals("24/3/2004",nextDate.DateToString());
    }
    @Test
    public void NextDateOfSameMonthinFebruary(){
        DateClass dummyDate= new DateClass(28,2,2004);
        IncrementDay incrementDay= new IncrementDay();
        DateClass nextDate= incrementDay.NextDay(dummyDate);
        assertEquals("29/2/2004",nextDate.DateToString());
    }
    @Test
    public void NewMonthComing(){
        DateClass dummyDate= new DateClass(28,2,2000);
        IncrementDay incrementDay= new IncrementDay();
        DateClass nextDate= incrementDay.NextDay(dummyDate);
        assertEquals("1/3/2000",nextDate.DateToString());
    }
    @Test
    public void NewYearComing(){
        DateClass dummyDate= new DateClass(31,12,2000);
        IncrementDay incrementDay= new IncrementDay();
        DateClass nextDate= incrementDay.NextDay(dummyDate);
        assertEquals("1/1/2001",nextDate.DateToString());
    }
}
