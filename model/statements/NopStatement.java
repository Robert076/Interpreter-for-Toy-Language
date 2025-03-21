package model.statements;

import MyException.MyException;
import model.programState.*;

public class NopStatement implements IStatement {

    /*
     * Constructor (empty)
     */
    public NopStatement() {
    }

    /*
     * Overriding toString()
     */
    @Override
    public String toString() {
        return "{nop}";
    }

    /*
     * Overriding execute(), the method inherited from the implemented interface
     * IStatement
     * Return null because this statement is supposed to do nothing (works the same
     * if we return state);
     */
    @Override
    public ProgramState execute(ProgramState state) throws MyException {
        return null;
    }

    @Override
    public IStatement deepCopy() {
        return new NopStatement();
    }
}