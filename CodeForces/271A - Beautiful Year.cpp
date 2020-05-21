#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
bool check(int y){
    int arr[10]= {}, dig;
    while(y != 0){
        dig = y % 10;
        if(arr[dig] != 0)
            return false;
        arr[dig] = 1;
        y /= 10;
    }
    return true;

}
int main(){
    int n;
    cin>>n;
    for(int i = n+1; i <= 9000; i++){
        if(check(i)) {
            cout << i;
            break;
        }
    }

}

