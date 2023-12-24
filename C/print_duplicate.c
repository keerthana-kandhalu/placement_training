/*2. Given a sorted array having duplicate elements. Print the elements with its frequency having more than one appearance.


Sample Input:
N = 12
Array = {1,1,1,2,4,4,4,4,5,6,9,9}
Sample Output:
1- >3,4->4,9->2*/

#include <stdio.h>

void print_duplicates(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        int count = 1;
        while (i < n - 1 && arr[i] == arr[i + 1]) {
            count++;
            i++;
        }
        if (count > 1) {
            printf("%d->%d, ", arr[i], count);
        }
    }
}

int main() {
    // Sample Input
    int arr[] = {1, 1, 1, 2, 4, 4, 4, 4, 5, 6, 9, 9};
    int n = sizeof(arr) / sizeof(arr[0]);

    print_duplicates(arr, n);

    return 0;
}
