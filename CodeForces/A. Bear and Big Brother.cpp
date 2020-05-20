#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
int main(){
    int a, b, w = 1, w2 = 1, ans = 0;
    cin>>a>>b;
    w = a;
    w2 = b;
    while(w <= w2){
        w *= 3;
        w2 *= 2;
        ans++;
    }
    cout<<ans;

}

