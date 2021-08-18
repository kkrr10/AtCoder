#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define rep(i,n) for(ll i = 0; i < n; i++)
#define FOR(i, m, n) for(ll i = m; i < n; i++)
const long long INF = 1LL << 60;
template<class T> inline bool chmin(T& a, T b) { if(a > b) { a = b; return true; } return false; }
template<class T> inline bool chmax(T& a, T b) { if(a < b) { a = b; return true; } return false; }

ll dp[100010];

// 貰うDP
int main() {
    ll n; cin >> n;
    vector<ll> v(n);
    rep(i, n) cin >> v[i];

    rep(i, 100010) dp[i] = INF;
    dp[0] = 0;
    dp[1] = dp[0] + abs(v[1] - v[0]);
    FOR(i, 2, n) {
        chmin(dp[i], dp[i-1] + abs(v[i] - v[i-1]));
        chmin(dp[i], dp[i-2] + abs(v[i] - v[i-2]));
    }
    cout << dp[n-1] << endl;
}
