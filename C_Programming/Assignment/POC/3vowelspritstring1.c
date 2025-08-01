#include <stdio.h>
#include <string.h>
#include <ctype.h>

int countVowels(char str[]) {
    int count = 0;
    for (int i = 0; str[i] != '\0'; i++) {
        char ch = tolower(str[i]);  // make it case-insensitive
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
            count++;
        }
    }
    return count;
}

int main() {
    char str[100];

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);  // safer than gets()

    // remove newline character if present
    str[strcspn(str, "\n")] = '\0';

    int vowelCount = countVowels(str);

    if (vowelCount > 3) {
        printf("The string with more than 3 vowels: %s\n", str);
    } else {
        printf("The string does not have more than 3 vowels.\n");
    }

    return 0;
}
