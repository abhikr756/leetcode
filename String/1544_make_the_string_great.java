class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
	st.push(s.charAt(0));
	for ( int i = 1; i < s.length(); i++ )
    {
		if ( !st.isEmpty() && Math.abs(s.charAt(i) - st.peek()) == 32)
            st.pop();
		else 
            st.push(s.charAt(i));
	}
	char[] ch = new char[st.size()];
	for ( int i = ch.length - 1; i >= 0; i-- )
        ch[i] = st.pop();
	return new String(ch);
    }
}