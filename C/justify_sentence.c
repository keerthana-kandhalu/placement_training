/*3. Given a sentence and screen length. Justify the sentence according to the screen length by replacing space with stars.


Sample Input 1:
Sentence = Welcome to Zoho Corporation
Screen length = 34
Sample Output 1:
Welcome****to***Zoho***Corporation


Sample Input 2:
Sentence = Welcome to Zoho Corporation
Screen length = 36
Sample Output 2:
Welcome****to****Zoho****Corporation*/

#include <stdio.h>
#include <string.h>

void justify_sentence(char sentence[], int screen_length) {
    int len = strlen(sentence);
    int words_count = 0;

    // Counting the number of words in the sentence
    for (int i = 0; i < len; i++) {
        if (sentence[i] == ' ') {
            words_count++;
        }
    }
    words_count++;  // Last word

    // Calculating spaces to insert
    int spaces_to_insert = screen_length - len;

    // If only one word, print the sentence as is
    if (words_count == 1) {
        printf("%s\n", sentence);
        return;
    }

    // If there are spaces to insert between words
    if (spaces_to_insert > 0) {
        int spaces_per_word = spaces_to_insert / (words_count - 1);
        int extra_spaces = spaces_to_insert % (words_count - 1);

        char *token = strtok(sentence, " ");

        // Print the first word with extra spaces
        printf("%s", token);
        for (int i = 0; i < extra_spaces; i++) {
            printf("*");
        }

        token = strtok(NULL, " ");
        
        // Print the rest of the words with equal spaces
        while (token != NULL) {
            for (int i = 0; i < spaces_per_word; i++) {
                printf("*");
            }
            printf("%s", token);
            token = strtok(NULL, " ");
        }
        printf("\n");
    } else {
        // If no spaces to insert, print the sentence as is
        printf("%s\n", sentence);
    }
}

int main() {
    // Sample Input 1
    justify_sentence("Welcome to Zoho Corporation", 34);

    // Sample Input 2
    justify_sentence("Welcome to Zoho Corporation", 36);

    return 0;
}
