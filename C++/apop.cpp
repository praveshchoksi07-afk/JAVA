#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        long long n, k;
        cin >> n >> k;

        long long ans = 0;

        for (int i = 0; i < 60; i++) {
            long long cost = 1LL << i;

            long long take = min(k, n / cost);

            ans += take;
            n -= take * cost;
        }

        cout << ans << "\n";
    }

    return 0;
}