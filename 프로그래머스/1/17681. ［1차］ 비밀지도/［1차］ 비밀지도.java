class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            int temp = arr1[i] | arr2[i];
            int w = n;
            while(w-- != 0) {
                str.insert(0, (temp % 2) == 1 ? "#" : " ");
                temp >>= 1;
            }
            answer[i] = String.valueOf(str);
        }
        return answer;
    }
}