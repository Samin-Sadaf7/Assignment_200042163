package Assignment2.Data_Coupling;

/*
    Data coupling occurs when modules of the program communicate with themselves by passing
    data as a parameter.
    When two modules of software system interact only using data then we can say a data coupling
    has taken place.
    Here, we have two modules: PrintSum, PerformSum
    In IntegerValues class, PrintSum function is passing two parameters to PerformSum's sum function
    and retrieve the value
    So only connection between this two modules is the value has passed
    So it is Data Coupling
 */
public class IntegerValues {
        public int printSum(int a, int b){
            int sum;
            sum=this.PerformSum(a,b);
            return sum;
        }
        public int PerformSum(int a, int b){
            return a+b;
        }
}
