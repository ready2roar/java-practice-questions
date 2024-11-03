package src.com.rohit;
public class LongestRepeatingSequence {

    // Method to find the longest repeating sequence in a string
    public static String findLongestRepeatingSequence(String str) {
        int n = str.length();
        String longestSeq = "";

        // Iterate over all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Get current substring
                String subStr = str.substring(i, j);
                String tillJ = str.substring(j);
                // Check if this substring appears again in the string
                if (str.substring(j).contains(subStr)) {
                    // Update longest sequence if found a longer one
                    if (subStr.length() > longestSeq.length()) {
                        longestSeq = subStr;
                    }
                }
            }
        }



        return longestSeq;
    }

    // Main method to test the function
    public static void main(String[] args) {
        String str = "a1zabebhbb2zabe";
        String result = findLongestRepeatingSequence(str);

        if (!result.isEmpty()) {
            System.out.println("The longest repeating sequence is: " + result);
        } else {
            System.out.println("No repeating sequence found.");
        }
    }
}

