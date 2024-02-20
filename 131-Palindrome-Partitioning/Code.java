class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        
        palSub(ans, new ArrayList<String>(), s, 0);

        return ans;
    }

    private void palSub(List<List<String>> ans, List<String> set, String s, int ind){
        if(ind == s.length()){
            ans.add(new ArrayList<>(set));
            return;
        }
        for(int i = ind; i<s.length();i++){
            String str = s.substring(ind,i+1);
            if(checkPal(str)){
                set.add(str);
                palSub(ans, set, s, i+1);
                set.remove(set.size()-1);
            }
        }
    }

    private boolean checkPal(String s){
        if(s.length() == 0) return false;
        int i = 0, j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))    return false;
            i++;
            j--;
        }

        return true;
    }
}
