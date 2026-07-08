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
    countbit bit;
    int n =5;
    cout<<"the number of set bits are "<<bit.countbits(n);
}