#include <iostream>
#include <vector>
#include <map>
#include <stack>
using namespace std;
int main(){
    stack<long long> maxs;
    stack<long long> mins;
    stack<long long> first;
    stack<long long> ind;
    map<long long, long long> ans;
    long long n, a, kk = 0, bb;

    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>a;
        if(maxs.empty()) {
            maxs.push(a);
            ind.push(i);
            continue;
        }
        while(true){
            while(!mins.empty() && a < mins.top()){
                if(a == 0){
                    bb = -2;
                }else{
                    bb = a;
                }
                ans[first.top()] = bb;
                mins.pop();
                first.pop();
            }
            if(a > maxs.top()){
                mins.push(a);
                first.push(ind.top());
                maxs.pop();
                ind.pop();

            }
            if(maxs.empty()){
                maxs.push(a);
                ind.push(i);
                break;
            }
            if(a <= maxs.top()){
                maxs.push(a);
                ind.push(i);
                break;
            }
        }
    }

    for(int ii = 0; ii < n; ii++){
        if(ans[ii] == -2){
            cout<<0<<" ";
        }
        else if (ans[ii] == 0){
            cout<<-1<<" ";
        }else{
            cout<<ans[ii]<<" ";
        }
    }

}
