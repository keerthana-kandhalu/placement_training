#include <stdio.h>

int main() {
    int matrix[3][3];
	int i,j,l,m;
    // Get values from the user for a 3x3 matrix
    printf("Enter values for a 3x3 matrix:\n");
    for ( i = 0; i < 3; ++i) {
        for (j = 0; j < 3; ++j) {
            scanf("%d", &matrix[i][j]);
        }
    }

    // Display the matrix
    printf("Matrix:\n");
    for (l = 0; l < 3; ++l) {
        for ( m = 0; m < 3; ++m) {
            printf("%d ", matrix[l][m]);
        }
        printf("\n");
    }

    return 0;
}

