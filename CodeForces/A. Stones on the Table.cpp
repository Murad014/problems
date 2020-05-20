#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
int main(){
    string s, a, b;
    stack<string> arr;
    int res = 0;
    int n;
    cin>>n;
    cin>>s;
    a = s[0];
    arr.push(a);

    for(int i = 1; i < s.length(); i++){
        a = s[i];
        if(a != arr.top())
            arr.push(a);
    }
    res =  s.length() - arr.size() ;
    cout<<res;

}

