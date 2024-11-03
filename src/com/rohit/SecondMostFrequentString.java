package src.com.rohit;
import java.util.*;
import java.util.stream.Collectors;

public class SecondMostFrequentString {

    public static void main(String[] args) {
        String[] s = {"AA", "BB", "AA", "SS", "SS", "CC", "AA", "BB", "CC", "AA", "CC", "BB"};

        Integer[] array = {12,122,33,21,2,45,4,99};

        List<Integer> list = Arrays.asList(array);

        // Step 1: Count the frequency of each string
        Map<String,Integer> frequencyMap = new HashMap<>();
        for(String value : s) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value,0) + 1);
        }

        System.out.println(frequencyMap);
        // Sorting by value in ascending order
        Map<String, Integer> sortedMap = frequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()) // Ascending order
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // Merge function (not needed here)
                        LinkedHashMap::new // Preserve order
                ));

        // Sorting by value in descending order
        Map<String, Integer> sortedMapDesc = frequencyMap.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // Handling duplicate keys (not needed here)
                        LinkedHashMap::new // Maintain insertion order
                ));


        // Step 2: Sort entries by their values (frequencies) in descending order
        List<Map.Entry<String, Integer>> sortedEntries = frequencyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());

        System.out.println(sortedEntries);
        // Step 3: Find the second largest occurring string
        if (sortedEntries.size() < 2) {
            System.out.println("No second most frequent string found.");
        } else {
            Map.Entry<String, Integer> secondMostFrequent = sortedEntries.get(1);
            System.out.println("Second most frequent string: "
                    + secondMostFrequent.getKey() + " with count "
                    + secondMostFrequent.getValue());
        }
    }

    public static void main1(String[] args) {
        //2324DTR1002068515

        Map<String,Integer> map = new HashMap<>();

        String[] s = {"AA", "BB", "AA", "SS", "SS", "CC", "AA", "BB", "CC", "AA", "CC", "BB"};

        int[] array = {1,22,2,4,56,7,89,3,25,11,90} ;

        List<Integer> listInteger =  Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> listInt =  Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());



            int[] sortedArrayAscending = Arrays.stream(array).sorted().toArray();   //
        int[] descendingArray =
                Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortedArrayAscending));

        for(String value: s) {
            map.put(value, map.getOrDefault(value,0)+ 1);
        }

        List<Map.Entry<String,Integer>> list =
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());

       // System.out.println(list);
    }
}
