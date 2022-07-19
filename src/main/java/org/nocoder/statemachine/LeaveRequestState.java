package org.nocoder.statemachine;


/**
 * @author yangjl
 * @description LeaveRequestState
 * https://www.baeldung.com/java-enum-simple-state-machine
 * @date 2022-07-19 12:48
 **/
public enum LeaveRequestState {
    // employee submmited leave request
    Submmited {
        @Override
        public LeaveRequestState nextState() {
            return Escalated;
        }

        @Override
        public String responsiblePerson() {
            return "Employee";
        }
    },
    // team leader approve and sacalated
    Escalated {
        @Override
        public LeaveRequestState nextState() {
            return Approved;
        }

        @Override
        public String responsiblePerson() {
            return "Team Leader";
        }
    },
    // department manager approve the request
    Approved {
        @Override
        public LeaveRequestState nextState(){
            return this;
        }
        @Override
        public String responsiblePerson() {
            return "Department Manager";
        }
    };

    public abstract LeaveRequestState nextState();

    public abstract String responsiblePerson();
}
