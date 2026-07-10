#include <bits\stdc++.h>
using namespace std;
class countbit{
public:
    int countbits(int n){
        int count=0;
        while(n>0){
            if(n&1==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
};
int main(){
    int nt ;
    cin>>nt;
    int n;
    int k;
    for(int i =0 ; i<nt;i++){
        cin>>n;
        cin>>k;
        countbit bit;
        int ans=0;
        for(int a =0 ; a<=n;a++){
            for(int b =0 ; b<=n;b++){
                for(int c =0 ; c<=n;c++){
                    if(a+b+c<=n){
                        int total=bit.countbits(a)+bit.countbits(b)+bit.countbits(c);
                    ans=max(ans,total);
                    }
                }
            }
        }
        cout<<ans;
    }
}
