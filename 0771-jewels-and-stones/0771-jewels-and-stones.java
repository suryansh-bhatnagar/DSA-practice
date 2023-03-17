class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            characterSet.add(jewels.charAt(i));
        }

        int result = 0;
        char[] chars = stones.toCharArray();
        for (char aChar : chars) {
            if (characterSet.contains(aChar)) {
                result++;
            }
        }

        return result;
    }
}