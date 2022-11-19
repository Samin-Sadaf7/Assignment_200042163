package Assignment2.Control_Coupling;

import Assignment2.Stamp_Coupling.Book;
import Assignment2.Stamp_Coupling.BookStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

/*
       If two modules are communicating with each other with the control flow, then we call it control
       coupling. In here , one module controls the flow of another by passing the information of dos
       and don'ts.
       An example of control coupling is sorting function. If we have a function which sorts the elements
       passed inside it. Also,there is another  function which will decide whether it will do it in ascending
       or descending order.
 */
public class SortClass {

        public void callSort(){
                ArrayList<Integer>values=new ArrayList<Integer>(
                    Arrays.asList(21,31,15,17,8,10,12)
                );
                String sortType="Ascending";
                values=SortIt(values,sortType);
                for(Integer i:values){
                    System.out.println(i);
                }
                sortType="Descending";
                values=SortIt(values,sortType);
                for(Integer i:values){
                    System.out.println(i);
                }

        }
        public ArrayList<Integer> SortIt(ArrayList<Integer>values,String sortType){
                if(sortType=="Ascending"){
                    Collections.sort(values);
                }
                else{
                    Collections.sort(values);
                    Collections.reverse(values);
                }
                return values;
        }
         public static void main(String[] args) {
                SortClass sortClass= new SortClass();
                sortClass.callSort();
         }
}
