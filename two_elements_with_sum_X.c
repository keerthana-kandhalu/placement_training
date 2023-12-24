#include <stdio.h>

int hasPairWithSum(int arr[], int n, int X) {
    int hash[100000] = {0};
	int i;
    for ( i = 0; i < n; i++) {
        int complement = X - arr[i];
        if (hash[complement]) {
            return 1; // Pair found
        }
        hash[arr[i]] = 1;
    }

    return 0; // Pair not found
}

int main() {
    int N1 = 6, X1 = 16;
    int Arr1[] = {1, 4, 45, 6, 10, 8};
    printf(hasPairWithSum(Arr1, N1, X1) ? "Yes\n" : "No\n");

    int N2 = 5, X2 = 10;
    int Arr2[] = {1, 2, 4, 3, 6};
    printf(hasPairWithSum(Arr2, N2, X2) ? "Yes\n" : "No\n");

    return 0;
}

