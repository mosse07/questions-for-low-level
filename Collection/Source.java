package Collection;

import java.util.*;

import Regex.reg;

public class Source {
   public static Map<Integer, String> mapPlayerToId(String[] entries){


    Map   <  Integer, String> map = new HashMap<>();
   for (int i = 0; i < entries.length; i++) {
       
    map.put(  i , entries[i]);
   }
    return map;
    /*
       * TODO: Complete this function to create a map of player ids and player names from
       * the method argument string array of player entries.
       */

   }

   public static void main(String[] args) {
      String[] students = getPlayerEntries1();
      //uncomment below line and comment above line for testing sample test case 2
      // String[] students = getPlayerEntries2();
      Map<Integer, String> map = mapPlayerToId(students);
      for (Map.Entry<Integer, String> entry : map.entrySet()) {
         System.out.println(entry.getKey() + " -> " + entry.getValue());
      }
   }

   public static String[] getPlayerEntries1() {
      String[] entries = { "Bob,1", "Russell,2", "John,3", "Andrew,4", "David,5", 
               "Kevin,6", "Finch,7", "Alex,8", "Nathan,9", "Jason,10", "Glenn,11" };
      return entries;
   }

   public static String[] getPlayerEntries2() {
      String[] entries = { "Dwayne Bravo,1", "Andre Russell,2", "Darren Bravo,3", 
               "Lendl Simmons,4", "Shai Hope,5", "Sherman Lewis,6",
               "Sunil Ambris,7", "Jason Holder,8", "Kieron Pollard,9", 
               "Roston Chase,10", "Alzarri Joseph,11", "Febian Allen,12" };
      return entries;
   }
}
