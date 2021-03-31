package arrays;

import org.junit.Assert;
import org.junit.Test;


public class KthLargestUnitTest {
    
    @Test  
    public void testFind5(){  
        KthLargest kthLargest = new KthLargest();
        int[] nums = new int[] {3, 2, 1, 5, 6, 4};
        int value = kthLargest.findKthLargest(nums, 2);
        Assert.assertEquals(5,value);  
     }  

     @Test
     public void testFind8(){  
        KthLargest kthLargest = new KthLargest();
        int[] nums = new int[] {4, 7, 3, 9, 2, 8, 1, 6, 5, 10};
        int value = kthLargest.findKthLargest(nums, 7);
        Assert.assertEquals(8,value);  
     }  
}
