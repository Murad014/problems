#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
int main(){
    int n, ans = 0, n2;
    int arr[5] = {5, 4, 3, 2, 1}, x = 4;
    cin>>n;
    n2 = n;
    for(int i = 0; i < 5; i++){
        n = n % arr[i];
        if(n == 0){
            ans += n2 / arr[i];
        }
        else if(n != 0){
            ans += n2 / arr[i];
        }
        n2 = n;
    }


    cout<<ans;
}

