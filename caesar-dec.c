#include <stdio.h>
int main()
{
char cipher[100];
int key,len;
printf("Enter the encrypted message: ");
scanf("%[^\n]s",cipher);
printf("Enter key: ");
scanf("%d",&key);
for(len=0;cipher[len];len++);
for(int i=0;i<len;i++){
cipher[i]=cipher[i]-key;
}
printf("Encrypted message: %s", cipher);
return 0;
}