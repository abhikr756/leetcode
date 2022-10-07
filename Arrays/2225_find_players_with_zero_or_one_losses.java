class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<matches.length;i++){
            int winner = matches[i][0];
            int looser = matches[i][1];
            map.put(looser,map.getOrDefault(looser,0)+1);
            set.add(winner);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Iterator<Integer> i = set.iterator();
        while(i.hasNext()){
            int num = i.next();
            if(!map.containsKey(num))
                list1.add(num);
        }
        for(Map.Entry m: map.entrySet()){
            if((int)m.getValue()==1)
                list2.add((int)m.getKey());
        }
        Collections.sort(list1);
        Collections.sort(list2);
        list.add(list1);
        list.add(list2);
        return list;
    }
}