/*1. Calculate the area of square or circle based on the shape ‘S’ for Square and ‘C’ for Circle.


Sample Input 1:
Shape = ‘S’
Size = 4
Sample Output 1:
Area of Square = 16


Sample Input 2:
Shape = ‘C’
Size = 4
Sample Output 2:
Area of Circle = 50.24*/


#include <stdio.h>

void calculate_area(char shape, double size) {
    if (shape == 'S') {
        double area = size * size;
        printf("Area of Square = %.2lf\n", area);
    } else if (shape == 'C') {
        double area = 3.14 * size * size;
        printf("Area of Circle = %.2lf\n", area);
    } else {
        printf("Invalid shape\n");
    }
}

int main() {
    // Sample Input 1
    calculate_area('S', 4);

    // Sample Input 2
    calculate_area('C', 4);

    return 0;
}
