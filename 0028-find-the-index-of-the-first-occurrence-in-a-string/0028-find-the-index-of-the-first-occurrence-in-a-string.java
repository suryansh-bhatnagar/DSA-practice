class Solution {
    public int strStr(String haystack, String needle) {
        int res = -1; // Initialize the result to -1, which means the needle is not found in the haystack
        int temp = 0; // Initialize a temporary counter to 0
        for (int i = 0; i < haystack.length(); i++) { // Loop through each character in the haystack
            temp=0; // Reset the temporary counter to 0
            if(i<=haystack.length() - needle.length()){ // Check if there are enough characters left in the haystack to match the needle
            for (int j = 0; j < needle.length(); j++) { // Loop through each character in the needle
                if(haystack.toCharArray()[i+j] == needle.toCharArray()[j]){ // Check if the character in the haystack matches the character in the needle
                    temp++; // If there is a match, increment the temporary counter
                     } else {
                     j = needle.length(); // If there is no match, break out of the loop
                 }
              }
                if (temp==needle.length()){ // Check if the temporary counter equals the length of the needle
                    res = i; // If it does, set the result to the current index in the haystack
                    break; // Break out of the loop since the needle has been found
                 }
              }
        }
        return res; // Return the result
    }
}