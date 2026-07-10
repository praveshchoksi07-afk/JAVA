#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while(t--) {
        int sum = 0;
        int mx = -100;

        for(int i = 0; i < 7; i++) {
            int x;
            cin >> x;

            sum += x;
            mx = max(mx, x);
        }

        cout << 2 * mx - sum << endl;
    }

    return 0;
}