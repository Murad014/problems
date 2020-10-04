#include <iostream>
#include <math.h>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, a, min = 9999999, max = 0, x, ans = 0, i = 0;
    cin>>n;
    x = n;
    while(n != 0){
        cin>>a;

        if(a <= min) {
            if(x != n and a != min) 
                ans++;

            min = a;
        }
        if(a >= max) {
            if(x != n  and a != max)
                ans++;
            max = a;
        }

        n--;
    }

    cout<<ans;
}
