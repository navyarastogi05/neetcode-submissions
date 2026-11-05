class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> r = new HashMap<>();

        for (String s :strs)
        {
            int count[]= new int[26];
            for(char c : s.toCharArray())
            {
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            r.putIfAbsent(key, new ArrayList<>());
            r.get(key).add(s);
        }
        return new ArrayList<>(r.values());
    }

}
