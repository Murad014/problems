#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
using namespace std;

bool solve(string a){
    stack<string> st;
    string aa;

    for(int r = 0; r < a.length(); r++){
        aa = a[r];

        if(aa == "(" || aa == "[" || aa == "{")
            st.push(aa);
        if(st.empty())
            return false;
        if((aa == "]" && st.top() != "[") or (aa == "}" && st.top() != "{") or (aa == ")" && st.top() != "("))
            return false;
            
        
        if(st.top() == "{" && aa == "}"){
            st.pop();
        }

        else if(st.top() == "[" && aa == "]"){
            st.pop();
        }

        else if(st.top() == "(" && aa == ")"){
            st.pop();
        }

    }


    if(st.empty())
        return true;
    return false;

}
int main(){
    string a;
    int t;

    cin>>t;
    for(int i = 0; i < t; i++){
        cin>>a;
        if(solve(a)){
            cout<<"YES"<<endl;
        }else{
            cout<<"NO"<<endl;
        }
    }
}

