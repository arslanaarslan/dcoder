#include <iostream>
using namespace std;

//Compiler version g++ 6.3.0

int main()
{
    int a = 20;
    int *b = &a;  // Bir değişkenin adresini başka bir değişkene atamak için atanacak değerin bir pointer işaret etmesi gerekir. 
    cout << b << endl;
    cout << &a << endl;
    cout << *b;
}