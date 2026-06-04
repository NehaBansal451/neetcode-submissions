class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start =0;
        int end =weights.length -1;
    for(int i =0 ; i < weights.length; i++){
        start = Math.max(start,weights[i]); //in the end of the loop this will contain the max item
        end += weights[i];
    }
    while(start < end){
        int mid = start + (end - start) / 2;
        int sum = 0;
        int d = 1;
        for(int num : weights){
            if(sum + num > mid){
                sum = num;
                d++;
            }
            else{
                sum+=num;
            }
        }
        if(d > days){
            start = mid + 1;
        }
        else{
            end = mid ;
        }
    }
    return end;
    }
}