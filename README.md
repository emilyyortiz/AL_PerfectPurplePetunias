# AL_PerfectPurplePetunias

### Perfect Purple Petunias
* John Gupta-She
* Lauren Lee
* Emily Ortiz

### ALTester

* Creates an array isSor with values 0-22.
* Creates an array notSor with values 0-22, and changes the 0 to 2 so that the array is [2, 1, 2, ... , 22]
* Runs each array through the method isSorted

#### isSorted
* if length of the array is 1, return true
* iterate through each item in the array and if an item is greater than the one after it, return false
* otherwise return true


### OrderedArrayList

#### Helper Method: FindIndex

* Takes an int and returns which index it should be added into to maintain ascending order.
* Will help keep order so that we do not need a complicated "Sort" method (and if we end up needing one, it will be more easily creatable with this helper)

#### Add

* Takes an int and edits the superarray to include that int.
* A modified add-at-index with its index at the appropriate "FindIndex" of the arg so that it maintains ascending order.

#### Remove

* Takes an int index and edits the value of the superarray to remove the value at that index.
* Should be a direct replica of Remove from superarray.

#### Get

* Takes an int index and returns the value of the superarray at that index.
* Should be a direct replica of Get from superarray.

#### IsSorted

* Returns whether or not the superarray is sorted.
