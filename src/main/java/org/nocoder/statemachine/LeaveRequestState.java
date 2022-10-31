package org.nocoder.statemachine;


/**
 * @description LeaveRequestState
 * @author yangjl
 * @date 2022-07-19 12:48
 **/
public enum LeaveRequestState {
    // employee submmite leave request
    Submmited {
        @Override
        public LeaveRequestState nextState() {
            System.out.println("员工向组长发起请假申请");
            return Escalated;
        }

        @Override
        public String responsiblePerson() {
            return "Employee";
        }
    },
    // team leader approve and esacalate
    Escalated {
        @Override
        public LeaveRequestState nextState() {
            System.out.println("组长审批然后提交到部门主管");
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
            System.out.println("部门主管审批通过，状态不再变更");
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
