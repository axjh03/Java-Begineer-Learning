#include <stdio.h>
#define SIZEOFARRAY 5

int main() {
    char OneDArray[SIZEOFARRAY] = {'a', 'b', 'c', 'd', 'e'};
    
    for (int i = 0; i < SIZEOFARRAY; i++) {
        printf("%c\n", OneDArray[i]);
    }
    
    return 0;
}
