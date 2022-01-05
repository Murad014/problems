#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;


int main(){
    int l, r, maxs = 0, ans;
    cin>>l;
    cin>>r;

    for(int i = l; i <= r; i++){
        for(int j = i; j <= r; j++){
            ans = i ^ j;
            if(ans >= maxs){
                maxs = ans;
            }
        }
    }
    cout<<maxs;


}

