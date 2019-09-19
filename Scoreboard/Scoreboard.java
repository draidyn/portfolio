import java.util.*;

public class Scoreboard {
    public static void main (String[] args) {
        //scores array holds the results of the matches
        String[] scores = new String[]{"Liverpool 3:2 PSG", "RedStar 0:0 Napoli", "PSG 6:1 RedStar", "Napoli 1:0 Liverpool"};
        
        //Holds the team name as the key and the points scored as the value
        Map<String, Integer> points = new TreeMap<String, Integer>(); // holds the points and name of team
        
        //goes through every element in the scores array n times. n = scores.length - 1
        for (int x = 0; x < scores.length; x++) {
            String name1, name2; //team names
            int score1, score2; //team scores.
            
            //uses the string split. regex are between [ and ] with + indicating either or
            String[] matchInfo = scores[x].split("[ :]+"); //array with the team names and scores
            
            name1 = matchInfo[0]; //0 is location on the name
            if (!points.containsKey(name1)) points.put(name1, 0);
            name2 = matchInfo[3]; //3 being the name of the other team
            if (!points.containsKey(name2)) points.put(name1, 0);
            score1 = Integer.parseInt(matchInfo[1]);
            score2 = Integer.parseInt(matchInfo[2]);
            
            if (score1 > score2) {
                points.put(name1, points.get(name1) + 3);
                points.put(name2, points.get(name1) + 1);
            }
            else if (score1 < score2) {
                points.put(name2, points.get(name1) + 3);
                points.put(name1, points.get(name1) + 1);
            }
            else {
                points.put(name1, 1);
                points.put(name2, 1);
            }
        }

        //LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
 
        //Use Comparator.reverseOrder() for reverse ordering
        points.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        
        //array being returned
        String[] results = new String[points.keySet().size()];
        int counter = 0; //counter used to parse the results array
        
        //adds the descending ordered linkedHashMap to the array to be returned
        for(String x : reverseSortedMap.keySet()) {
            results[counter] = x + " " + reverseSortedMap.get(x);
            counter++;
        }

        for (String x : results) System.out.println(x);
        
/*
        This prints out the scores in ascending order
        //LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        points.entrySet().stream().sorted(Map.Entry.comparingByValue())
            .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
 
        System.out.println("Ascending Order: \n" + sortedMap);
*/
    }
}