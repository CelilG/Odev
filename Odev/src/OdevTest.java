public class OdevTest {
    public static void main(String[] args) {
        String[] katılanlar = {"Nikola", "Tesla"," Draganic" , "George" , "WestingHouse" , "Thomas" , "Edison" , "Adolf" , "Hitler"} ;
        int[] zamanlar = {250 , 301 ,300 , 350 ,  500 , 429 , 358 , 369 , 527 } ;
        Main myOdev = new Main("Sivas Marotonu" , katılanlar , zamanlar);
        myOdev.displayMessage();
        myOdev.processMaroton();
    }
}