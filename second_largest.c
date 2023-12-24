#include <stdio.h>

void findSecondLargestDistinct(int arr[], int n) {
    int first, second;
    first = second = -1;
	int i;
    for ( i = 0; i < n; i++) {
        if (arr[i] > first) {
            second = first;
            first = arr[i];
        } else if (arr[i] > second && arr[i] != first) {
            second = arr[i];
        }
    }

    if (second == -1) {
        printf("No second largest distinct element found.\n");
    } else {
        printf("Second largest distinct element: %d\n", second);
    }
}

int main() {
    int N1 = 6;
    int Arr1[] = {12, 35, 1, 10, 34, 1};
    findSecondLargestDistinct(Arr1, N1);

    int N2 = 3;
    int Arr2[] = {10, 5, 10};
    findSecondLargestDistinct(Arr2, N2);

    return 0;
}

