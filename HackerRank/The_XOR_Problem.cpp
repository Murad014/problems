#include <bits/stdc++.h>
using namespace std;

int main(){
    string a, res = "";
    int t, k;
    cin>>t;

    while(t){
        cin>>a>>k;
        for(int i = 0; i < a.length(); i++){
            if(a[i] == '0' and k > 0){
                res += "1";
                k--;
            }else{
                res += "0";
            }
        }
        cout<<res<<endl;
        res = "";
        t--;
    }
}
