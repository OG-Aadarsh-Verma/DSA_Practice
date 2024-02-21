### Approach
* Iterate through the both the arrays in reverse
* Since, both the arrays are sorted in an ascending order
* store the bigger number between <code>nums1</code> and <code>nums2</code> at the end of <code>nums1</code> array
* <code>p1--</code> or <code>p2--</code>, depending on which array was chosen above
* <code>i--</code>, to iterate the end of <code>nums1</code>

#### Time complexity: ($N+M$), Space complexity: O(1)
