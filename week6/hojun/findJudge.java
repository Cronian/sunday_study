class Solution {
    public int findJudge(int N, int[][] trust) {
        // trust의 index: 1 부분의 내역의 합을 구하자
        // trust 받은자와 주는자를 구분
        // 1명인 경우..?
        if(N <= 1){
            return 1;
        }
        
        int[] people = new int[N+1];
		int[] haveTrust = new int[N+1];
		for(int i=0;i<trust.length;i++) {
            haveTrust[trust[i][0]]++;
			people[trust[i][1]]++;
		}
		
		
		for(int i=0;i<people.length;i++) {
			if((N-1)==people[i] && haveTrust[i] == 0) {
				return i;
			}
		}
        
        return -1;
    }
}
