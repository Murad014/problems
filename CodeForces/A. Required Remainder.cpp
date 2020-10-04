#include <iostream>
#include <math.h>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int solve(int x, int y, int n){
    int k = n, k2;
    if(k % x == y)
        return k;
    k = k - (k % x);
    k2 = k;
    while(true){
        k2 += y;
        if(k2 <= n && k2 % x == y) {
            return k2;
        }
        k -= x;
        k2 = k;
    }

    return 0;

}


int main(){
    int t, x, y, n, ans;
    cin>>t;

    while(t != 0){
        cin>>x>>y>>n;
        ans = solve(x, y, n);
        cout<<ans<<endl;
        t--;
    }



}
