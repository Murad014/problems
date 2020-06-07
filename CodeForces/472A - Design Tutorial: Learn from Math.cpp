#include <iostream>
#include <math.h>
#include <map>
#include <vector>
#include <set>
#include <sstream>
#include <string>
using namespace std;
bool check(int a){
    int kk = sqrt(a), x = 2;
    while(x != kk + 1){
        if(a % x == 0)
            return 1;
        x++;
    }
    return 0;
}

int main(){
    int n, res;
    cin>>n;
    res = n - 4;
    if(check(res)){
        cout<<res<<" "<<4;
        return 0;
    }
    res = n - 6;
    if(check(res)){
        cout<<res<<" "<<6;
        return 0;
    }
    res = n - 8;
    if(check(res)){
        cout<<res<<" "<<8;
        return 0;
    }
}




