#include <bits\stdc++.h>
using namespace std;
class FractionalKnapsack{
public:
    double findmaxcapacity(vector<double> weight , vector<double> value , int capacity){
        double totalweight=0;
        double output=0;
        vector<pair<double, int>> ratio;
        for(int i=0;i<weight.size();i++){
            ratio.push_back({(double)value[i]/weight[i], i});
        }
        sort(ratio.rbegin(), ratio.rend());

        for(int i=0;i<weight.size();i++){
            int index=ratio[i].second;
            if(totalweight+weight[index]<=capacity){
                totalweight+=weight[index];
                output+=value[index];
            }
            else{
                int remainingcap=capacity-totalweight;
                output+=value[index]*(double(remainingcap)/weight[index]);
            }
        }
        return output;  
    }
};
int main(){
    int n;
    cin>>n;
    int capacity;
    cin>>capacity;
    vector<double> weight(n);
    vector <double> value(n);
    for(int i =0 ; i<n ; i++){
        cin>>weight[i];
        cin>>value[i];
    }
    FractionalKnapsack fac;
    double result = fac.findmaxcapacity(weight,value,capacity);
    cout<<"the maximized value is:"<<result;
}