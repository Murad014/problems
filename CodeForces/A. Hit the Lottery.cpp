#include <iostream>
#include <math.h>
#include <map>
#include <vector>
#include <set>
#include <sstream>
#include <string>
using namespace std;

int main(){
    vector<int> arr = {1, 5, 10, 20, 100};
    int n, res = 0;
    cin>>n;
    for(int i = arr.size() - 1; i >= 0; i--){
        if(arr[i] <= n){
            res += n / arr[i];
            n %= arr[i];
        }
    }
    cout<<res;
}




