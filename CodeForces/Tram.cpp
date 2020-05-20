#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
int main(){
    int n, a, b, capacity = 0, max = 0;
    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>a>>b;
        capacity = (capacity - a) + b;
        if(capacity >= max)
            max = capacity;
    }
    cout<<max;

}

