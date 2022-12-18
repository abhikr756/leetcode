class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] res = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            if(deque.size()==0){
               deque.offerFirst(i); 
               res[i] = 0;
            }else{
               while(deque.size()!=0 && temperatures[i]>=temperatures[deque.peekFirst()]){
                      deque.pollFirst();
               }
               if(deque.size()==0){
                   res[i]=0;
               }else{
                   res[i] = deque.peekFirst()-i;
               }
               deque.offerFirst(i);
            }
        }
        return res;
    }
}