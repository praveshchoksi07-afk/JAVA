#include <bits/stdc++.h>
using namespace std;
class Solution{
public:
    bool checkIthbit(int n , int i){
        string binary="";
        while(n>0){
            binary+= (n%2==0)?'0':'1';
            n/=2;
        }
        if (i>=binary.size()){
            return false;
        }
        else{
            return binary[i]=='1';
        }
    }
};
int main(){
    Solution sol;
    int n;
    int i;
    cin>>n>>i;
    if (sol.checkIthbit(n,i)){
        cout<<"the index is set";
    }
    else{
        cout<<"the index is not set";
    }
}