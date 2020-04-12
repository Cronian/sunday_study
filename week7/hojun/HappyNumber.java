class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(n);
        
        while(n != 1) {
			n = sumr(n);
			if(set.contains(n) == true) {
				return false;
			}else {
				set.add(n);
			}
		}
        
        return true;
    }
    
    public static int sumr(int num) {
		String numb = num + "";
		int result = 0;
		
		for(int i=0;i<numb.length();i++) {
			result += Math.pow(numb.charAt(i) - 48, 2);
		}
		
		return result;
	}
}
