package enummy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Subscription subscription = new Subscription();
        subscription.state = State.SUSPENDED;
        System.out.println(State.valueOf("NONE"));
        System.out.println(State.NONE.toString().getClass().getSimpleName());
        System.out.println(State.ACTIVE.name().getClass().getSimpleName());
        System.out.println(State.NONE.getClass().getSimpleName());
        System.out.println(State.SUSPENDED.ordinal());
        System.out.println(State.values()[2]);
        System.out.println(Arrays.toString(State.values()));
        Notifications notifications = new Notifications();
        Channels.email.setChannelEnabled(notifications, true);
        System.out.println(Arrays.toString(Channels.values()));
    }
    static class Notifications{
        boolean isPushEnabled;
        boolean isEmailEnabled;
        boolean isSmsEnabled;
    }
    enum Channels{
        push{
            boolean isChannelEnabled(Notifications notifications){return notifications.isPushEnabled;}
            boolean setChannelEnabled(Notifications notifications, boolean isEnabled)
            {return notifications.isPushEnabled = isEnabled;}
        },
        email{
            boolean isChannelEnabled(Notifications notifications){return notifications.isEmailEnabled;}
            boolean setChannelEnabled(Notifications notifications, boolean isEnabled)
            {return notifications.isEmailEnabled = isEnabled;}
        },
        sms{
            boolean isChannelEnabled(Notifications notifications){return notifications.isSmsEnabled;}
            boolean setChannelEnabled(Notifications notifications, boolean isEnabled)
            {return notifications.isSmsEnabled = isEnabled;}
        };
        abstract boolean  isChannelEnabled(Notifications notifications);
        abstract boolean setChannelEnabled(Notifications notifications, boolean isEnabled);
    }
}
class Subscription{
    String name;
    String description;
    State state;
}
