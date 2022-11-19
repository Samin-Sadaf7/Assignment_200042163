package Assignment2.Common_Coupling;
/*
   Multiple modules show common coupling when all of them share same information through global data.
   When we think a certain data is present in one class, we need it in multiple classes , therefore,
   making the attribute static may look like an option. Doing it causes common coupling/global coupling.
   Also, making attribute static is against encapsulation.

   In this example, MovieTheatre class has a static attribute total_tickets which represents the total
   number of tickets available for that movie. There is another class call booking class which accessing
   this global variable of movie theatre and changing it .
   So, we can see multiple modules have access to this global attribute which may cause problem when
   other functionalities will be implemented .
 */
public class MovieTheatre {
    public static int total_tickets;
    public void setTotal_tickets(int total_tickets){
        MovieTheatre.total_tickets=total_tickets;
    }
    public int getTotal_tickets(){
        return MovieTheatre.total_tickets;
    }
}
