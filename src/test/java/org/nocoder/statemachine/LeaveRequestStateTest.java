package org.nocoder.statemachine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeaveRequestStateTest {

    @Test
    public void testEscalated(){
        LeaveRequestState state = LeaveRequestState.Escalated;
        assertEquals("Team Leader", state.responsiblePerson());
    }

    @Test
    public void testApproved(){
        LeaveRequestState state = LeaveRequestState.Approved;
        assertEquals("Department Manager", state.responsiblePerson());
    }

    @Test
    public void testStateMachine(){
        LeaveRequestState state = LeaveRequestState.Submmited;

        state = state.nextState();
        assertEquals(LeaveRequestState.Escalated, state);

        state = state.nextState();
        assertEquals(LeaveRequestState.Approved, state);

        state = state.nextState();
        assertEquals(LeaveRequestState.Approved, state);
    }
}
