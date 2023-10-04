package edu.hillel.Homework15_Threads;

public class ValueCalculator {
    private final double[] nums;
    private final int numsLength;
    private final int halfLength;

    public ValueCalculator(int numsLength) {
        this.nums = new double[numsLength];
        this.numsLength = numsLength;
        this.halfLength = numsLength / 2;
    }

    public void calculateValues() throws InterruptedException {
        long start = System.currentTimeMillis();

        for (int i = 0; i < numsLength; i++) {
            nums[i] = 1.0;
        }

        double[] nums1 = new double[halfLength];
        double[] nums2 = new double[halfLength];

        System.arraycopy(nums, 0, nums1, 0, halfLength);
        System.arraycopy(nums, halfLength, nums2, 0, halfLength);

        Thread thread1 = new Thread(() -> calculateArrayValues(nums1, 0));
        Thread thread2 = new Thread(() -> calculateArrayValues(nums2, halfLength));

        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();


        System.arraycopy(nums1, 0, nums, 0, halfLength);
        System.arraycopy(nums2, 0, nums, halfLength, halfLength);

        long end = System.currentTimeMillis();
        long timeSpent = end - start;

        System.out.println("Time taken: " + timeSpent + " ms.");
    }

    public void calculateArrayValues(double[] nums, int startIndex) {
        for (int i = 0; i < nums.length; i++) {
            int index = startIndex + i;
            nums[i] = (float) (nums[i] * Math.sin(0.2f + index / 5.0) * Math.cos(0.2f + index / 5.0)
                    * Math.cos(0.4f + index / 2.0));
        }
    }
}
