package ru.mirea.task30;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mirea.task1.opt1.TaskFive;

public class Testing {
    @Test
    void shouldShowSimpleAssertion(){
        TaskFive indomitableWill= new TaskFive();
        Assertions.assertEquals(120,  indomitableWill.fak(5));
    }
}
