class Solution {
    public int minTimeToType(String word) {
        int currentPointer = 0, result = 0;
	for(int i=0;i<word.length();i++) {
		int currentChar = word.charAt(i) - 'a', diff = Math.abs(currentPointer - currentChar);
		result += Math.min(27 - diff, diff + 1);
		currentPointer = currentChar;
	}
	return result;
    }
}