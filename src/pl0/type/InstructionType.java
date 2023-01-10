package pl0.type;

/**
 * Represents all possible instructions in PL/0+.
 */
public enum InstructionType {

    /**
     * LEVEL PAR
     * 0     value
     * Pushes value to the top of the stack.
     */
    LIT,

    /**
     * LEVEL PAR
     * 0     value
     * Increases or decreases the stack pointer.
     * Increasing beyond already generated stack creates 0s.
     * Cannot decrease stack pointer under the current stack frame or under -1.
     */
    INT,

    /**
     * LEVEL PAR
     * 0     operation
     * Performs operation (logic or arithmetic). The instruction behaves just like the
     * reference interpreter (operations 1 - 13). If the operation uses two values from stack,
     * the first value is the one with the lower index and the second value is the one on top of the stack.
     */
    OPR,

    /**
     * LEVEL PAR
     * 0     address
     * Jumps to the instruction specified by address.
     * If the jump would end up on a non-existent instruction, an exception is thrown.
     */
    JMP,

    /**
     * LEVEL PAR
     * 0     address
     * If there is 0 on the top of the stack, jumps to the instruction specified by the address.
     * If the jump ended up on a non-existent instruction, an exception is thrown.
     */
    JMC,

    /**
     * LEVEL PAR
     * level address
     * Loads a value from level, address on the stack and pushes it into the stack.
     * If the level is too high (the target stack frame would end up under the first stack frame) an exception is thrown.
     */
    LOD,

    /**
     * LEVEL PAR
     * level address
     * Stores the value on top of the stack to level, address on stack.
     * If the level is too high (the target stack frame would end up
     * under the first stack frame) an exception is thrown.
     */
    STO,

    /**
     * LEVEL PAR
     * level address
     * Creates a new stack frame with static base (SB) at relative index 0,
     * dynamic base (DB) at relative index 1 and program counter at relative index 2 (PC).
     * The static base is set levels down, so when the level is 0, the static base is
     * set as the caller's current base, and when the level is 1 the static base is
     * set as the current caller's static base. Otherwise, the static base is resolved
     * by iterating over the static bases of the stack frames under the caller.
     * The dynamic base is set as the caller's current base. The program counter is
     * set as the next instruction to be executed (PC + 1).
     * Then a jump is made to the instruction specified by address.
     * The stack pointer has to be increased trough the INT instruction (same as the reference interpreter).
     */
    CAL,

    /**
     * LEVEL PAR
     * 0     0
     * Sets the program counter (PC) to the value stored on the stack frame's index 2.
     * Sets the stack pointer to current base - 1 (the top of previous stack frame).
     * Sets the current base to the dynamic base (DB) stored on the stack frame's index 1.
     * If the instruction is executed while the current base is 0 (aka the first stack frame), the program exits.
     */
    RET,

    /**
     * LEVEL PAR
     * 0     0
     * Reads one character from the input field, converts is to a number and pushes it into the stack.
     * The character is expected to be ASCII (or Extended ASCII, simply 8 byte value).
     * If there is no character in the input field or the character is not Extended ASCII character,
     * an exception is thrown.
     */
    REA,

    /**
     * LEVEL PAR
     * 0     0
     * Writes the value from the top of the stack into the output field as a character.
     * If the value is not in range <0, 255>, an exception is thrown.
     */
    WRI,

    /**
     * LEVEL PAR
     * 0     0
     * Takes the value on top of the stack as the number of heap cells to allocate.
     * Allocates that many cells continuously (in one continuous block) and pushes the address of the block onto the stack.
     * If the cells cannot be allocated, -1 is pushed onto the stack (e.g. not enough free cells, invalid value).
     */
    NEW,

    /**
     * LEVEL PAR
     * 0     0
     * Takes the value on top of the stack as the address of the heap block to deallocate.
     * The heap block is deallocated in its entirety. On failure throws an exception.
     */
    DEL,

    /**
     * LEVEL PAR
     * 0     0
     * Takes the value on top of the stack as the address of the heap cell.
     * Pushes the value in the heap cell onto the stack. Throws an exception on failure.
     */
    LDA,

    /**
     * LEVEL PAR
     * 0     0
     * Takes the value on top of the stack as the value to store and the value under it (SP - 1)
     * as the address to store it at. Stores the value at the address in heap. On failure throws an exception.
     */
    STA,

    /**
     * LEVEL PAR
     * 0     0
     * Essentially a dynamic LOD, where the level is the value on top of the stack and
     * the address the value under it (SP - 1). Pushes the value on level, address of the stack onto the stack.
     */
    PLD,

    /**
     * LEVEL PAR
     * 0     0
     * Essentially a dynamic STO, where the level is the value on top of the stack,
     * the address the value under it (SP - 1) and the value to be stored is on the index SP - 2.
     * Stores the value into level, address of the stack.
     */
    PST
}
