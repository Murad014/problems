#include <iostream>
#include <vector>
using namespace std;

int main(){
    int arr[10] = {}, x = 0, maxs = 0;
    int a;
    cin>>a;
    while(a != 0){
        arr[a]++;
        if(arr[a] >= maxs)
            maxs = arr[a];
        cin>>a;
    }
    for(int i = 1; i < 10; i++){
        if(arr[i] == maxs)
            cout<<i<<endl<<arr[i];
    }
}
