🔢 Bit Manipulation in Java

A clean and practical collection of bit manipulation programs in Java designed to strengthen low-level programming skills and logical thinking.

This repository demonstrates how common bitwise operations can be used to solve computational problems efficiently.

📌 About the Project

- Bit manipulation is a powerful technique used in:

- Competitive Programming

- System-Level Programming

- Performance Optimization

- Cryptography

- Embedded Systems

=>This repository provides beginner-friendly and well-structured Java implementations of essential bit operations.

📂 Project Structure
File Name	Description
All_Operators.java	Demonstrates all basic bitwise operators in Java
Get_ith_bit.java	Finds the value of the i-th bit
set_update_ith_bit.java	Sets or updates the i-th bit
Clear_last_i_bits.java	Clears the last i bits
Clear_Range_of_bits.java	Clears bits in a given range
Count_set_bits.java	Counts number of set (1) bits
power_of_two.java	Checks whether a number is a power of 2
🧠 Concepts Covered

AND (&)

OR (|)

XOR (^)

NOT (~)

Left Shift (<<)

Right Shift (>>)

Bit Masking

Clearing & Updating Bits

Efficient Counting Techniques

🚀 How to Run

Clone the repository:

git clone https://github.com/your-username/Bit_Manipulation_in_Java.git

Open in IntelliJ IDEA / Eclipse / VS Code

Compile and run any file:

javac FileName.java
java FileName


📘 Sample Example
Check if a number is a power of 2
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}

💡 Time Complexity: O(1)
💡 Uses the property that powers of 2 have only one set bit.

🏆 Learning Outcome

After exploring this repository, you will:

Understand how numbers are stored in binary

Master bit masking techniques

Write optimized solutions using bitwise logic

Improve problem-solving speed

📈 Future Improvements

Add interactive user input versions

Add explanation comments for every line

Add practice problems

Add complexity comparison with normal approaches

🤝 Contributing

Contributions are welcome!
Feel free to fork the repository and improve implementations or add new bit manipulation problems.

📜 License

This project is open-source and free to use for educational purposes.
