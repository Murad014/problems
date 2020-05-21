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
    for(int i = 1; i <= n; i++){
        cin>>a;
        if(a == 1){
            cout<<"HARD";
            return 0;
        }
    }
    cout<<"EASY";
}

