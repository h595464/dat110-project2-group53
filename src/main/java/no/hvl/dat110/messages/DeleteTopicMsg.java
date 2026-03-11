package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

    // message sent from client to create topic on the broker
    private String topic;
    private String user;

    public DeleteTopicMsg(String user, String topic) {
        this.user = user;
        this.topic = topic;

    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "DeleteTopicMsg{" +
                "topic='" + topic + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
