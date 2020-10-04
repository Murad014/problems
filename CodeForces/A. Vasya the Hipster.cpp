#include <iostream>
#include <math.h>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int main(){
    int a, b, mn, mx, ans1, ans2;
    cin>>a>>b;
    mn = min(a, b);
    mx = max(a, b);
    ans1 = mn;
    ans2 = (mx - ans1) / 2;
    cout<<ans1<<" "<<ans2;


}
