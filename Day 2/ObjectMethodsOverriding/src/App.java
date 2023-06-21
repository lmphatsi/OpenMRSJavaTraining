import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        //Part 1 - HashSet
        System.out.println("--------------- PART 1 ----------------------");
        HashSet <Mountain> aHashSet = new HashSet<Mountain>();
        Mountain aMountain1 = new Mountain("Thaba-Bosiu", 75);
        Mountain aMountain2 = new Mountain("Thaba-Bosiu", 45);
        Mountain aMountain3 = new Mountain("Qeme", 5);
        
        aHashSet.add(aMountain1);
        aHashSet.add(aMountain2);
        aHashSet.add(aMountain3);
        System.out.println("\nPrinting items in a HasSet");
        System.out.println("HashSet :"+aHashSet);

        //Part 2 - TreeSet
        System.out.println("--------------- PART 2 ----------------------");
        TreeSet <Mountain> aTreeSet = new TreeSet<Mountain>();
        Mountain aMountain4 = new Mountain("Thaba-Telle", 10);
        Mountain aMountain5 = new Mountain("Machache", 35);

        aTreeSet.add(aMountain1);
        aTreeSet.add(aMountain2);
        aTreeSet.add(aMountain3);
        aTreeSet.add(aMountain4);
        aTreeSet.add(aMountain5);
        
        System.out.println("\nPrinting items in a TreeSet (ordered)");
        System.out.println("Treeset :"+aTreeSet);

        //Part 3 - HashMaps
        System.out.println("--------------- PART 3 ----------------------");
        HashMap <Mountain,Integer> aHashMap = new HashMap<Mountain,Integer>();
        Mountain aMountain6 = new Mountain("Killi", 345);
        aHashMap.put(aMountain6, aMountain6.hashCode());
        System.out.println(aHashMap.get(aMountain6));

        Mountain aMountain7 = new Mountain("Killi", 345);
        aHashMap.put(aMountain7, aMountain6.hashCode());
        System.out.println(aHashMap.get(aMountain7));

        System.out.println(aHashMap.size());


    }
}
