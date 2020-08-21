#include <iostream>

using namespace std;

int solve(string a){
    int n = a.length();
    string m;
    for(int i=0; i < n - 1; i++){

        if(i % 2 == 0)
            cout<<a[i];
    }
    cout<<a[n-1]<<endl;
    return 0;
}

int main(){
    int t;
    string a;
    cin>>t;

    for(int i=0; i<t; i++){
        cin>>a;
        solve(a);
    }



}
