#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
int main(){
    int n, a;
    cin>>n;
    int arr[n] = {};
    for(int i = 0; i < n; i++){
        cin>>a;
        arr[a] = i + 1;
    }
    for(int i = 0; i < n; i++){
        cout<<arr[i+1]<<" ";
    }

}

