#include <stdio.h>
int main()
{
    char str[100];
    int len;
    scanf("%s%n",str,&len);
    for(int i=len;i>=1;i--)
    {
        printf("%-*.*s%*.*s\n",len,i,str,len,i,str);
    }
    for(int i=2;i<=len;i++)
    {
        printf("%-*.*s%*.*s\n",len,i,str,len,i,str);
        
    }
    
    return 0;
}