#include <stdio.h>
int main()
{
char plaintext[100];
int key,len;
printf("Enter the encrypted message: ");
scanf("%[^\n]s",plaintext);
printf("Enter key: ");
scanf("%d",&key);
for(len=0;plaintext[len];len++);
for(int i=0;i<len;i++){
plaintext[i]=plaintext[i]+key;
}
printf("Encrypted message: %s", plaintext);
return 0;
}