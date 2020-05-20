#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;
int main(){
    queue<int> A;
    stack<int> B;
    int n, a;
    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>a;
        A.push(a);
        B.push(a);
    }
    while(!A.empty() && !B.empty()){
        if(B.top() > A.front()){
            cout<<2<<" ";
            A.pop();
        }
        else if(B.top() < A.front()){
            cout<<1<<" ";
            B.pop();
        }else{
            cout<<0<<" ";
            A.pop();
            B.pop();
        }
    }

}

