#include <bits/stdc++.h>
using namespace std;
class Bitt{
public:
    bool checkithbit(int num , int index){
        if(num&(1<<index)!=0){
            return true;
        }
        else{
            return false;
        }

    }

};
int main(){
    Bitt bit;
    int num =5;
    int index=2;
    if(bit.checkithbit(num , index)){
        cout<<"index is set";
    }
    else{
        cout<<"index is not set";
    }
}