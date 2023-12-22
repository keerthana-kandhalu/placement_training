#include <stdio.h>
#include <ctype.h>

int main() {
    char input[50];
int i,j;
    // Get input string from the user
    printf("Enter input string: ");
    scanf("%s", input);

    // Process the input and generate the output
    printf("Output: ");
    for (i = 0; input[i] != '\0'; ++i) {
        if (isalpha(input[i])) {
            char currentChar = input[i];
            int repeatCount = 0;

            // Calculate the repeat count if the next character is a digit
            while (isdigit(input[i + 1])) {
                repeatCount = repeatCount * 10 + (input[++i] - '0');
            }

            // Output the repeated characters
            for ( j = 0; j < (repeatCount == 0 ? 1 : repeatCount); ++j) {
                printf("%c", currentChar);
            }
        }
    }

    printf("\n");

    return 0;
}

