#include<iostream>

using namespace std;

int main(){
    int n,eve=0,od=0;
    cin>>n;
    while(n!=0){
        
    int  x=n%10;
     if(x%2==0){
         eve=eve+x;
     }
     else{
      od=od+x;
     }

    n=n/10;
    }
    cout<<eve<<" "<<od<<endl;
    return 0;
}
