import java.util.*;
class Solution{
    public int atMost(int[] nums,int k){
        int count=0,l=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)map.remove(nums[l]);
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums,int k){
        return atMost(nums,k)-atMost(nums,k-1);
    }
}
public class subarraysWithKDistinct{
    public static void main(String[] args){
        Solution sol=new Solution();
        int[] nums={1,2,1,2,3,4};
        int k=2;
        System.out.println(sol.subarraysWithKDistinct(nums,k));
    }
}

