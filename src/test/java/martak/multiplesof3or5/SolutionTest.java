package martak.multiplesof3or5;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }

}