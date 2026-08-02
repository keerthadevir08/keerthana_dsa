#include <iostream>
#include <list>
using namespace std;

class Stack {
private:
    list<int> stack;

public:

    // Push
    void push(int data) {
        stack.push_back(data);
        cout << data << " pushed" << endl;
    }

    // Pop
    void pop() {
        if (isEmpty()) {
            cout << "Stack Underflow" << endl;
        }
        else {
            cout << stack.back() << " popped" << endl;
            stack.pop_back();
        }
    }

    // Top
    void top() {
        if (isEmpty()) {
            cout << "Stack is Empty" << endl;
        }
        else {
            cout << "Top Element = " << stack.back() << endl;
        }
    }

    // isEmpty
    bool isEmpty() {
        return stack.empty();
    }

    // isFull
    bool isFull() {
        return false;
    }

    // Size
    int size() {
        return stack.size();
    }
};

int main() {

    Stack s;

    s.push(10);
    s.push(20);
    s.push(30);

    s.top();

    s.pop();

    s.top();

    cout << "Size = " << s.size() << endl;
    cout << "Is Empty = " << s.isEmpty() << endl;
    cout << "Is Full = " << s.isFull() << endl;

    return 0;
}