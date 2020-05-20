#include <iostream>
#include <queue>

using namespace std;
int main(){
    queue<int> fifo;
    int n, q, a;
    cin>>n;
    for(int i = 0; i < n; i++){
        cin>>q;
        if(q == 1){
            cin>>a;
            fifo.push(a);
        }
        else if(q == 2){
            fifo.pop();
        }
        else if(q == 3){
            cout<<fifo.front()<<endl;
        }

    }

}

