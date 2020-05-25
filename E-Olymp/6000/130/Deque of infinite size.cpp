#include <iostream>
#include <math.h>
#include <stack>
#include <queue>
#include <deque>
#include <vector>
#include <algorithm>
#include <iomanip>
#include <set>
using namespace std;

int main(){
    deque<int> qu;
    int b;
	string a;
	
	while(true){
		cin>>a;
		if(a == "exit")
			break;
		else if(a == "push_front"){
			cin>>b;
			qu.push_front(b);
			cout<<"ok\n";
		}
		else if(a == "push_back"){
			cin>>b;
			qu.push_back(b);
			cout<<"ok\n";
		}
		else if(a == "pop_front"){
			if(!qu.empty()){
				cout<<qu.front()<<endl;
				qu.pop_front();
			}else{
				cout<<"error\n";
			}
		}
		else if(a == "pop_back"){
			if(!qu.empty()){
				cout<<qu.back()<<endl;
				qu.pop_back();
			}else{
				cout<<"error\n";
			}			
		}
		else if(a == "back"){
			if(!qu.empty()){
				cout<<qu.back()<<endl;
			}else{
				cout<<"error\n";
			}			
		}
		else if(a == "front"){
			if(!qu.empty()){
				cout<<qu.front()<<endl;
			}else{
				cout<<"error\n";
			}			
		}
		else if(a == "clear"){
			qu.clear();
			cout<<"ok\n";
		}
		else if(a == "size"){
			cout<<qu.size()<<endl;			
		}

		
	}
	
	cout<<"bye";
}
