#include <stdio.h>

void findOccurrences(int arr[], int n, int x) {
    int first = -1, last = -1;
	int i;
    for ( i = 0; i < n; i++) {
        if (arr[i] == x) {
            if (first == -1) {
                first = last = i;
            } else {
                last = i;
            }
        }
    }

    if (first == -1) {
        printf("-1 -1\n");
    } else {
        printf("%d %d\n", first, last);
    }
}

int main() {
    int n1 = 9, x1 = 5;
    int arr1[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
    findOccurrences(arr1, n1, x1);

    int n2 = 9, x2 = 7;
    int arr2[] = {1, 3, 5, 5, 5, 5, 7, 123, 125};
    findOccurrences(arr2, n2, x2);

    return 0;
}

