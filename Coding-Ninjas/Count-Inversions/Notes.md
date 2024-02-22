### Bruteforce
* run a nested loop, such that <code>j</code> starts at <code>i+1</code>
* if <code>arr[i] > arr[j]</code> then <code>cnt++</code>
* return <code>cnt</code>

#### Time complexity: O($N^2$), Space complexity: O(1)

### Optimal
* Basically apply merge sort algorithm, with a slight change
* in the <code>merge()</code> function of the merge sort, run a loop such that <code>left<=mid && right<=high</code>
* if <code>arr[left] &ge; arr[right]</code> <code>cnt += (mid-left)+1</code> and store <code>arr[right]</code> in temp array
* else store <code>arr[left]</code> in temp array
* return <code>cnt</code>

#### Time complexity: O($N\times log{_2}{N}$), Space complexity: O(N)
