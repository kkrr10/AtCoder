#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define rep(i, n) for(ll i = 0; i < n; i++)


int main(){
    ll n, all = 0; cin >> n;
    vector<ll> A(n), cnt(n+1);
    rep(i, n){
        cin >> A[i];
        all += cnt[A[i]];
        cnt[A[i]]++;
    }

    rep(i, n){
        cout << all - (cnt[A[i]] - 1) << endl;
    }

}
