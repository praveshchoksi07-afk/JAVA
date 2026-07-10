#include <bits\stdc++.h>
using namespace std;
class lemonadechange{
public:
    bool canprovidechange(vector<int> bills){
        int five=0;
        int ten=0;
        for(int i =0 ; i<bills.size();i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                if(five>0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else if(bills[i]==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
            }
            return true;
        }
    };
    int main(){
        int n;
        cin>>n;
        vector<int> bills(n);
        for(int i =0 ; i<n;i++){
            cin>>bills[i];
        }
        lemonadechange change;
        bool result=change.canprovidechange(bills);
        if(result==true){
            cout<<"true";
        }
        else{
            cout<<"false";
        }
    }