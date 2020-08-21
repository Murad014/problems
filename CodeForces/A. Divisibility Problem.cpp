#include <iostream>
#include <vector>

using namespace std;


int main(){
    int t, a, b, res;
    
    cin>>t;
    for(int i = 0; i < t; i++){
        cin>>a>>b;
        if(a % b == 0){
            cout<<0<<endl;
            continue;
        }
        res = b - (a % b);
        cout<<res<<endl;

    }
}
