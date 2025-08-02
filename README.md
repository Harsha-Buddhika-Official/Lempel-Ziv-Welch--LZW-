# Lempel-Ziv-Welch (LZW) Compression Algorithm

A Java implementation of the Lempel-Ziv-Welch (LZW) compression algorithm, providing both compression and decompression functionality.

## Overview

The Lempel-Ziv-Welch (LZW) algorithm is a lossless data compression algorithm created by Abraham Lempel, Jacob Ziv, and Terry Welch. It works by building a dictionary of frequently occurring sequences of characters and replacing them with shorter codes.

## Features

- **Compression**: Convert text strings into compressed integer codes
- **Decompression**: Restore original text from compressed codes
- **Interactive Mode**: User input interface for real-time compression
- **Demo Mode**: Pre-configured examples for testing

## Project Structure

```
LZW/
├── Compressor/
│   ├── LZWCompressor.java    # Core compression algorithm
│   ├── LZWMain.java          # Demo with predefined input
│   └── LZWMainUser.java      # Interactive user input interface
└── Decompressor/
    ├── LZWDecompression.java # Core decompression algorithm
    └── Main.java             # Demo decompression example
```

## How It Works

### Compression Algorithm
1. Initialize dictionary with all single characters (ASCII 0-255)
2. Read input string character by character
3. Find the longest match in the dictionary
4. Output the code for the match
5. Add the match + next character to the dictionary
6. Continue until the entire string is processed

### Decompression Algorithm
1. Initialize dictionary with all single characters (ASCII 0-255)
2. Read compressed codes one by one
3. Look up each code in the dictionary
4. Output the corresponding string
5. Add new entries to the dictionary based on the pattern
6. Continue until all codes are processed

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java IDE or command line compiler

### Compilation

Navigate to the project directory and compile the Java files:

```bash
# Compile compressor
javac LZW/Compressor/*.java

# Compile decompressor
javac LZW/Decompressor/*.java
```

### Running the Examples

#### Compression Demo
```bash
cd LZW/Compressor
java LZWMain
```
This will compress the string "TOBEORNOTTOBEORTOBEORNOT" and display the compressed codes.

#### Interactive Compression
```bash
cd LZW/Compressor
java LZWMainUser
```
This allows you to enter your own string for compression.

#### Decompression Demo
```bash
cd LZW/Decompressor
java Main
```
This will decompress a predefined set of codes back to the original string.

## Example Usage

### Compression Example
**Input:** `TOBEORNOTTOBEORTOBEORNOT`

**Output:** `84 79 66 69 79 82 78 79 84 256 258 260 262 77`

### Decompression Example
**Input:** `[84, 79, 66, 69, 79, 82, 78, 79, 84, 256, 258, 260, 262, 77]`

**Output:** `TOBEORNOTTOBEORTOBEORNOT`

## Algorithm Details

- **Dictionary Size**: 4096 entries maximum
- **Initial Dictionary**: ASCII characters 0-255
- **Code Range**: 0-4095
- **Compression Ratio**: Varies based on input text repetition patterns

## Key Features of Implementation

1. **Dynamic Dictionary Building**: The dictionary grows during compression/decompression
2. **Efficient String Matching**: Uses linear search for dictionary lookups
3. **Memory Management**: Fixed-size dictionary prevents memory overflow
4. **Error Handling**: Graceful handling of edge cases in decompression

## Limitations

- Fixed dictionary size (4096 entries)
- No dictionary reset mechanism
- Suitable for text data with repetitive patterns
- Memory usage grows with dictionary size

## Contributing

Feel free to contribute to this project by:
- Improving algorithm efficiency
- Adding file I/O capabilities
- Implementing dictionary reset mechanisms
- Adding more comprehensive error handling
- Creating unit tests

## License

This project is open source and available under the MIT License.

## References

- Welch, Terry A. "A Technique for High-Performance Data Compression." Computer 17.6 (1984): 8-19.
- Lempel, Abraham, and Jacob Ziv. "A universal algorithm for sequential data compression." IEEE Transactions on information theory 23.3 (1977): 337-343.

## Author

This implementation was created as an educational project to demonstrate the LZW compression algorithm in Java.

created by harsha buddhika