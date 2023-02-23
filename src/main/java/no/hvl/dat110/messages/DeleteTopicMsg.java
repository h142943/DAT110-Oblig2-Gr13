package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {
	
	private String topic;

	//sent by the client in order to have a topic deleted.

    public DeleteTopicMsg(String user, String topic) {
    	super(MessageType.DELETETOPIC, user);
    	this.topic = topic;
    }
    
    public void setTopic(String topic) {
    	this.topic = topic;
    }
    
    public String getTopic() {
    	return this.topic;
    }
    
    @Override
    public String toString() {
    	return "DeleteTopicMsg [topic =" + topic + "]";
    }
    
}