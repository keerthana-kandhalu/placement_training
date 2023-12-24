#include <stdio.h>

int main() {
    int n = 5; // Number of rows
	int i,k,space;
    for ( i = 1, k = 0; i <= n; ++i, k = 0) {
        // Print spaces before the numbers
        for ( space = 1; space <= n - i; ++space) {
            printf("   ");
        }

        // Print increasing numbers
        while (k != 2 * i - 1) {
            printf("%d  ", i + k);
            ++k;
        }

        printf("\n");
    }

    return 0;
}

