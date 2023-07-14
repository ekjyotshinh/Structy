# Structy

Data Struct and algo

Array and String

1. Uncompress----->The uncompress method takes a compressed string as input and returns the uncompressed string. If a character is a digit, it increments j to continue scanning the number. If a non-digit character is encountered, it extracts the number from the substring. For ex, 3a2b4c --> aaabbcccc

2) Compress--------> The compress meathod takes in a uncompressed string and then converts that into a compresseed string, if the number appears only once then instead of 1 we just write the alphabet

3) Anagrams---------> Anagrams, takes in two strings as arguments. The funtion returns a boolean indicatring weather or not it is an anagram or not. Anagrams are strings that contain the same character, but in any order.

4) Most frequent Character------------> MostFrequentChar takes in a string as an argument. The function returns the most frequent character of the string. If there are ties, return the character that appears earlier in the string.

5) Pair Sum----------> PairSum takes in a list and a target sum as arguments. The function returns a tuple containing a pair of indices whose elements sum to the given target. The indices returned are unique and there is guaranteed to be one such pair that sums to the target.

6) Pair Product----------> Pairproduct takes in a list and a target product as arguments. The function returns a tuple containing a pair of indices whose elements multiply to the given target. The indices returned must be unique. There is guaranteed to be one such pair whose product is the target.

7) Intersection-----------> Intersection takes in two arrays and then returs an array of the common elements of those lists, input lists do not contain duplicate elements.

8) FiveSort-----------> FiveSort takes in an array and it rearranges the array such that all the 5s appear at the end, the funtion performs these operartions in placeby mutaion the original list instead of creating a new one.

Linked List

1. LinkedListValues-----------> LinkedListValues takes in the head of a linked list and returns a array containing all values of the nodes in the linked list.

2) SumList-----------> Sum Lst takes in a head of linked list and then returns the sum of the list.

3) LinkedListFind----------> Linked List Find takes in the head of a linked list and a target value. The function returns a boolean indicating wheather the llinked list contains it or not.

4)GetNodeValue--------> Get Node Value takes in the head of a linked list and an index value and returns the value of the index in the linked list, if not in the bounds then return -1.

5. ReverselinkedList---------> Reverse linked list takes in the head of a liniked list and then returns the head of the reversed linked list.

6. ZipperList -------> Zippper list function takes in two list and then zipper merge them together and returns the new head node

7) MergeLists ----------> MergeLists takes in the head of two sorted linked lists as arguments. The function should merge the two lists together into single sorted linked list. The function should return the head of the merged linked list.

8) LongestStreak -------------> LongestStreak takes in the head of a linked list as an argument. The function should return the length of the longest consecutive streak of the same value within the list.

9) RemoveNode -------------> RemoveNode takes in the head of a linked list and a target value as arguments. The function should delete the node containing the target value from the linked list and return the head of the resulting linked list. If the target appears multiple times in the linked list, only remove the first instance of the target in the list.

10) InsertNode -------------> InsertNode takes in the head of a linked list, a value, and an index. The function should insert a new node with the value into the list at the specified index. Consider the head of the linked list as index 0. The function should return the head of the resulting linked list.

11) CreateLinkedList ------------> CreateLinkedList takes in a list of values as an argument. The function should create a linked list containing each item of the list as the values of the nodes. The function should return the head of the linked list.

12) AddLists ------------> AddLists takes in the head of two linked lists, each representing a number. The nodes of the linked lists contain digits as values. The nodes in the input lists are reversed; this means that the least significant digit of the number is the head. The function should return the head of a new linked listed representing the sum of the input lists. The output list should have its digits reversed as well.
