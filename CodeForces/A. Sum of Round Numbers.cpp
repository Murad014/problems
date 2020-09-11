#include <iostream>
#include <math.h>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

int main(){
    int t, a, cnt = 0, st, e=1, zero = 0;

    cin>>t;

    while(t != 0){
        cin>>a;
        int dg;
        vector <int> arr;
        cnt  = 0;
        zero = 0;
        e = 1;
        while(a != 0){
            dg = a % 10;

            if(dg == 0)
                zero++;

            st = dg * e;
            arr.push_back(st);
            e *= 10;
            cnt++;
            a /= 10;
        }
        zero = abs(cnt - zero);
        cout<<zero<<endl;
        for(int ii = 0; ii <  arr.size(); ii++){
            if(arr[ii] != 0)
                cout<<arr[ii]<<" ";
        }
        cout<<endl;
        t--;
    }

}
