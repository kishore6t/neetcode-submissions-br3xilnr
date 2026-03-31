class Solution {
    public boolean hasDuplicate(int[] nums) {
        
     

// best method for sorted nad unsorted arrays 
        Set<Integer> hasSet= new HashSet<>();

        for(int n:nums)
        {
           if(hasSet.contains(n))
           {
             return true;
           }

           hasSet.add(n);
        }
 
        return false;
     
    }
}