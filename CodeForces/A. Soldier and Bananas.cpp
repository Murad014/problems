#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
int main(){
    long long a, k, n, w, sum = 0, res = 0;
    cin>>k>>n>>w;
    for(int i = k; i <= w*k; i += k){
        sum += i;
    }
    res = sum-n;
    if(res <= 0 ){
        cout<<0;
        return 0;
    }
    cout<<res;
}

