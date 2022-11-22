#include <stdio.h>

/*void decypher(char *data, int size, int code) {
    for(int i = 0; i < size; i++) {
        data[i] = data[i] - code;
    }
}*/

int main() {
    FILE *fp = fopen("private.key", "r");
    //FILE *fp = fopen("notReadableKey", "r");
    int buffsz = 10;
    char buffer[buffsz];

    fread(buffer, buffsz, sizeof(char), fp);

    //decypher(buffer, buffsz, 1);

    printf("%s\n", buffer); 
}

