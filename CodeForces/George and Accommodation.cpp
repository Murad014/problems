#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
int main(){
    int t, p, q, emp, res = 0;
    cin>>t;

    for(int i = 0; i < t; i++){
        cin>>p>>q;
        emp = q - p;
        if(emp >= 2)
            res += 1;
    }
    cout<<res;
}

