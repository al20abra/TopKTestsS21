
import java.util.Comparator;

/**
Sample test case implementation for TopK.

@author Jim Teresco
@version Spring 2021
 */   

public class TestsALAJTC {

    /**
    main method to try out the TopK

    @param args not used
     */
    public static void main(String args[]) {
        TopK<String> test1 =
            new TopKJDTRefSol<String>(5, Comparator.naturalOrder());

        TopK<Integer> test2 =
            new TopKJDTRefSol<Integer>(5, Comparator.reverseOrder()); 

        //TopK<Athlete> test3 =
       //     new TopKJDTRefSol<Athlete>(5, new AthleteCompare());

        TopK<Integer> test4 =
            new TopKJDTRefSol<Integer>(5, Comparator.naturalOrder());   

        TopK<Integer> test5 =
            new TopKJDTRefSol<Integer>(5, Comparator.naturalOrder());

        TopK<Integer> test6 =
            new TopKJDTRefSol<Integer>(5, Comparator.naturalOrder());

        TopK<Integer> test7 =
            new TopKJDTRefSol<Integer>(5, Comparator.naturalOrder());

        test1.add("a");
        test1.add("abbbb");
        test1.add("fghdrgs");
        System.out.println("With 3 entries: " + test1);
        
        test2.add(4);
        test2.add(1);
        test2.add(9);
        test2.clear();
        test2.add(7);
        test2.add(6);
        test2.add(0);
        test2.add(3);

        System.out.println("After adding 7 entries: " + test2);
        Athlete john = new Athlete(15);
        //test3.add(john);
        Athlete paul = new Athlete(1);
        //test3.add(paul);
        Athlete lebron = new Athlete(105);
        //test3.add(lebron);
        Athlete harry = new Athlete(55);
        //test3.add(harry);
        Athlete mike = new Athlete(85);
        //test3.add(mike);
        Athlete kobe = new Athlete(6);
        //test3.add(kobe);
    }
}

class Athlete{
    private int ppg;
    public Athlete(int ppg){
        this.ppg = ppg;
    }
    
    public void setPpg(int newPpg){
        ppg = newPpg;
    }
    
    public int getPpg(){
        return ppg;
    }
}

class AthleteCompare{
    public int compare(Athlete a,Athlete b){
        return a.getPpg()-b.getPpg();
    }
}