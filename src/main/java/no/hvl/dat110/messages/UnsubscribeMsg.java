package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

    // message sent from client to create topic on the broker
    private String topic;

    public UnsubscribeMsg(String user, String topic) {
        super(MessageType.UNSUBSCRIBE, user);
        this.topic = topic;

    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "UnsubscribeMsg{" +
                "type= '" + getType() + '\'' +
                "topic='" + topic + '\'' +
                '}';
    }
}
