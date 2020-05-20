#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
int main(){
    string s, s2;
    int x = 0;
    cin>>s;
    cin>>s2;
    if(s.length() != s2.length()){
        cout<<"NO";
        return 0;
    }
    for(int i = s.length() - 1; i >= 0; i--){
        if(s[i] != s2[x]){
            cout<<"NO";
            return 0;
        }
        x++;
    }
    cout<<"YES";

}

