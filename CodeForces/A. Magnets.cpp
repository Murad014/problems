#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#include <math.h>
#include <map>
#include <queue>

using namespace std;

int main(){
    stack<int> st;
    int n, a, ans = 0;

    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>a;
        if(i == 0){
            ans++;
            st.push(a);
            continue;
        }
        if(st.top() != a) {
            st.push(a);
            ans++;
        }
    }
    cout<<ans;
}

