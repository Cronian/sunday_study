class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			Integer tmp = map.get(nums[i]);
			if(tmp == null) {
				map.put(nums[i], 1);
			}else {
				map.put(nums[i], tmp+1);
			}
		}
		
		return (Integer) getKey(map, 1);
    }
    
    public static Object getKey(HashMap<Integer, Integer> m, Object value) {
		for(Object o: m.keySet()) {
			if(m.get(o).equals(value)) {
				return o;
			}
		}
		return null;
		
	}
}
