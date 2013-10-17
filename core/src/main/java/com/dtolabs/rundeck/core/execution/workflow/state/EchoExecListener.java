package com.dtolabs.rundeck.core.execution.workflow.state;

import com.dtolabs.rundeck.core.common.INodeEntry;
import com.dtolabs.rundeck.core.execution.ExecutionContext;
import com.dtolabs.rundeck.core.execution.StatusResult;
import com.dtolabs.rundeck.core.execution.StepExecutionItem;
import com.dtolabs.rundeck.core.execution.workflow.StepExecutionContext;
import com.dtolabs.rundeck.core.execution.workflow.WorkflowExecutionItem;
import com.dtolabs.rundeck.core.execution.workflow.WorkflowExecutionListener;
import com.dtolabs.rundeck.core.execution.workflow.WorkflowExecutionResult;
import com.dtolabs.rundeck.core.execution.workflow.steps.node.NodeStepExecutionItem;
import com.dtolabs.rundeck.core.execution.workflow.steps.node.NodeStepResult;

/**
 * $INTERFACE is ... User: greg Date: 10/17/13 Time: 10:32 AM
 */
public class EchoExecListener implements WorkflowExecutionListener {
    public void beginWorkflowExecution(StepExecutionContext executionContext, WorkflowExecutionItem item) {
        System.err.println(String.format("beginWorkflowExecution(%s,%s)", executionContext, item));
    }

    public void finishWorkflowExecution(WorkflowExecutionResult result, StepExecutionContext executionContext,
            WorkflowExecutionItem item) {
        System.err.println(String.format("finishWorkflowExecution(%s,%s,%s)", result,executionContext, item));
    }

    public void beginWorkflowItem(int step, StepExecutionItem node) {
        System.err.println(String.format("beginWorkflowItem(%s,%s)", step, node));
    }

    public void finishWorkflowItem(int step, StepExecutionItem node, boolean success) {
        System.err.println(String.format("finishWorkflowItem(%s,%s,%s)", step,node, success));
    }

    public void beginStepExecution(StepExecutionContext context, StepExecutionItem item) {
        System.err.println(String.format("beginStepExecution(%s,%s)", context, item));
    }

    public void finishStepExecution(StatusResult result, StepExecutionContext context, StepExecutionItem item) {
        System.err.println(String.format("finishStepExecution(%s,%s)", result,context, item));
    }

    public void beginExecuteNodeStep(ExecutionContext context, NodeStepExecutionItem item, INodeEntry node) {
        System.err.println(String.format("beginExecuteNodeStep(%s,%s,%s)", context, item,node));
    }

    public void finishExecuteNodeStep(NodeStepResult result, ExecutionContext context, StepExecutionItem item, INodeEntry node) {
        System.err.println(String.format("finishExecuteNodeStep(%s,%s,%s,%s)",result, context, item,node));
    }
}
