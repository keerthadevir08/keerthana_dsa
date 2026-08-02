class Stack:

    def __init__(self):
        self.stack = []

    # Push
    def push(self, data):
        self.stack.append(data)
        print(data, "pushed")

    # Pop
    def pop(self):
        if self.isEmpty():
            print("Stack Underflow")
        else:
            print(self.stack.pop(), "popped")

    # Top
    def top(self):
        if self.isEmpty():
            print("Stack is Empty")
        else:
            print("Top Element =", self.stack[-1])

    # isEmpty
    def isEmpty(self):
        return len(self.stack) == 0

    # isFull
    def isFull(self):
        return False

    # Size
    def size(self):
        return len(self.stack)


# Main Program
s = Stack()

s.push(10)
s.push(20)
s.push(30)

s.top()

s.pop()

s.top()

print("Size =", s.size())
print("Is Empty =", s.isEmpty())
print("Is Full =", s.isFull())