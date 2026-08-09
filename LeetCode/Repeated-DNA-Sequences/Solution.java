1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        
4
5        Set<String> seen = new HashSet<>();
6        Set<String> result = new HashSet<>();
7
8        for(int i = 0; i<= s.length() - 10; i++) {
9            String dna = s.substring(i, i+10);
10            if(seen.contains(dna)){
11                result.add(dna);
12            } 
13            seen.add(dna);
14
15        }
16        return new ArrayList<String>(result);
17    }
18}