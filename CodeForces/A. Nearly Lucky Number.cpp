#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
int main(){
    long long n, d, cn = 0;
    cin>>n;
    while(n != 0){
        d = n % 10;
        if(d == 7 || d == 4)
            cn++;
        n /= 10;
    }
    if(cn == 7 || cn == 4)
        cout<<"YES";
    else
        cout<<"NO";

}

