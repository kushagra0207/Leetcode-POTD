-18-03-2024


  452. Minimum Number of Arrows to Burst Balloons
Solved
Medium
Topics
Companies
There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.

Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

Given the array points, return the minimum number of arrows that must be shot to burst all balloons.

class Solution {
    public int findMinArrowShots(int[][] points) {
        // Sort the balloons by the end position of the arrow
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        
        // Initialize the number of arrows needed to 1
        int result = 1;
        // Set the index of the previously burst balloon to 0
        int previous = 0;
        
        // Iterate through all balloons
        for(int current = 1; current < points.length; current++){
            // If the start position of the current balloon is after the end position of the arrow that burst the previous balloon,
            // then a new arrow is needed to burst the current balloon
            if(points[current][0] > points[previous][1]){
                result++;
                // Update the index of the previously burst balloon
                previous = current;
            }
        }
        return result;  
    }
