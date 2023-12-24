#include <stdio.h>
#include <string.h>

int isAnagram(char *s, char *t) {
    int count[26] = {0};
    int i;
    while (*s != '\0') {
        count[*s - 'a']++;
        s++;
    }
    
    while (*t != '\0') {
        count[*t - 'a']--;
        t++;
    }
    
    for ( i = 0; i < 26; i++) {
        if (count[i] != 0) {
            return 0; 
        }
    }
    
    return 1; 
}

int main() {
    char s[100], t[100];
    
    printf("Enter the first string: ");
    scanf("%s", s);
    
    printf("Enter the second string: ");
    scanf("%s", t);
    
    if (isAnagram(s, t)) {
        printf("true\n");
    } else {
        printf("false\n");
    }
    
    return 0;
}

