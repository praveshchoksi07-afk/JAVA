#include <bits\stdc++.h>
using namespace std;
class Assign{
public:
    int findmaxnumberofcookies(vector<int>Student , vector <int>Cookie){
        sort(Student.begin(), Student.end());
        sort(Cookie.begin() , Cookie.end());
        int i =0;
        int j =0;
        int ans=0;
         while(i < Student.size() && j < Cookie.size()) {
            if(Cookie[i]>=Student[j]){
                i++;
                j++;
                ans++;
            }
            else{
                j++;
            }
        }
        return ans;
        
    }
};
int main(){
    vector<int> Student={1,2,3};
    vector<int> Cookie={2,3,4,};
    Assign cookie;
    int answer=cookie.findmaxnumberofcookies(Student,Cookie);
    cout<<"Maximum number of cookies are "<<answer;
    return 0;
}