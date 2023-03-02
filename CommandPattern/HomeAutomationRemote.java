package CommandPattern;

/**
* Remote Control for Home automation where it will accept the command *andexecute. This is the invoker in terms of command pattern *terminology
8
**/
public class HomeAutomationRemote {

 //Command Holder
 ICommand command;
 //Set the command in runtime to trigger.
 public void setCommand(ICommand command) {
 this.command = command;
 }
 //Will call the command interface method so that particular command
 //can be invoked.
 public void buttonPressed() {
 command.execute();
 }
}
