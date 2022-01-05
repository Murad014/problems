#include <iostream>
#include <math.h>
#include <stack>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    vector<int> arr, maxs;
    stack<int> st;
    int n, a, b, top, area = 0;
    
    cin>>n;
    
    for(int i = 0; i < n; i++){
        cin>>a;
        arr.push_back(a);
    }
    
    for(int i = 0; i < n; i++){
        if(st.empty()){
            st.push(i);
            continue;
        }
        
        
        if(arr[i] >= arr[st.top()]){
            st.push(i);
        }else{

            top = st.top();
            st.pop();
            area = arr[top] * (st.empty() ? i : (i - st.top() - 1));
            maxs.push_back(area);

            i--;
        }
    }

    int i = arr.size();
    
    while(!st.empty()){
        top = st.top();
        st.pop();
        area = arr[top] * (st.empty() ? i : (i - st.top() - 1));
        maxs.push_back(area);
    }
    
    sort(maxs.begin(), maxs.end());
    cout<<maxs[maxs.size() - 1];
    
}
