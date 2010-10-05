package com.youdevise.fbplugins.jmock.benchmarks;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class TestThatIsRunWithJMock {

    @Test public void
    testSomething() {
        Mockery context = new Mockery();
        
        final MyMockedClass mocked = context.mock(MyMockedClass.class);
        context.checking(new Expectations() {{
            oneOf(mocked).meh();
            
        }});
    }
    
}
