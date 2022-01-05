#include <bits/stdc++.h>
using namespace std;

int main(){
    vector<string> end;
    vector<string> home;

    string text, num = "on", temp = "", a, txt = "";
    string h_e = "end";
    cin>>text;
    for(int i = 0; i < text.length(); i++){
        if(text[i] == '#'){
            if(num == "off")
                num = "on";
            else
                num = "off";
        }

        if(isdigit(text[i]) && num == "on"){
            txt += text[i];
        }
        else if(isalpha(text[i]) or text[i] == '*' or text[i] == '_'){
            txt += text[i];
        }

        else if(text[i] == '<'){
            if(h_e == "end"){
                end.push_back(txt);
            }
            else{
                home.push_back(txt);
            }
            txt = "";
            h_e = "home";
        }

        else if(text[i] == '>'){
            if(h_e == "end"){
                end.push_back(txt);
            }
            else{
                home.push_back(txt);
            }
            txt = "";
            h_e = "end";
        }
    }
    if(h_e == "end"){
        end.push_back(txt);
    }
    else{
        home.push_back(txt);
    }



    string ans = "";
// Filter Home
    vector<string> home2;
    for(int r = 0; r < home.size(); r++){
        string ss = home[r];

        vector<char> my_stack;
        for(int ii = 0; ii < ss.length(); ii++){
            if(ss[ii] == '*'){
                if(!my_stack.empty()){
                    my_stack.pop_back();
                }
            }
            else{
                my_stack.push_back(ss[ii]);
            }
        }
        string kkk = "";
        for(int rr = 0; rr < my_stack.size(); rr++) {
            kkk += my_stack[rr];
        }
        home2.push_back(kkk);


    }/*
    for(int r = 0; r < home2.size(); r++){
        cout<<home2[r];
    }
    return 0;*/

// Filter Home (End)

    for(int r = home2.size() - 1; r >= 0; r--){
        ans += home2[r];
    }
    for(int r = 0; r < end.size(); r++){
        ans += end[r];
    }

    stack<char> res;
    string ans2 = "";
    for(int r = 0; r < ans.length(); r++){

        if(ans[r] == '*'){
            if(!res.empty())
                res.pop();

        }else {
            res.push(ans[r]);
        }
    }

    vector<char> endd;
    while(!res.empty()){
        endd.push_back(res.top());
        res.pop();
    }
    string ha = "";
    for(int  r = endd.size()-1; r >= 0; r--){
        ha += endd[r];
    }
    cout<<ha;

}
