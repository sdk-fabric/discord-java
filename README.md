
# discord-java

This [SDK](https://github.com/sdk-fabric/discord-java) is managed by the [SDK Fabric](https://sdk-fabric.org/) project, a global infrastructure to
automatically generate SDKs for every API.

You can find more information about this SDK at [TypeHub](https://typehub.cloud/):
https://app.typehub.cloud/d/sdkfabric/discord

## Usage

```java
import org.sdkfabric.discord.Client;

Client client = Client::build("[access_token]");

// Get a channel by ID.
Channel response = client.channel().get("channel_id");

// Update a channel's settings.
Channel response = client.channel().update("channel_id", new ChannelUpdate());

// Delete a channel, or close a private message.
Channel response = client.channel().delete("channel_id");

// Returns all pinned messages in the channel as an array of message objects.
List<Message> response = client.channel().getpins("channel_id");

// Create a new invite object for the channel.
ChannelInvite response = client.channel().createinvite("channel_id", new ChannelInvite());

// Retrieves the messages in a channel.
List<Message> response = client.message().getall("channel_id", "around", "before", "after", 1);

// Retrieves a specific message in the channel.
Message response = client.message().get("channel_id", "message_id");

// Post a message to a guild text or DM channel.
Message response = client.message().create("channel_id", new Message());

// Edit a previously sent message.
Message response = client.message().update("channel_id", "message_id", new Message());

// Delete a message.
Object response = client.message().remove("channel_id", "message_id");

// Crosspost a message in an Announcement Channel to following channels.
Message response = client.message().crosspost("channel_id", "message_id");

List<User> response = client.message().getreactionsbyemoji("channel_id", "message_id", "emoji", 1, "after", 1);

Object response = client.message().deleteallreactions("channel_id", "message_id");

// Returns the user object of the requester's account.
User response = client.user().getcurrent();

// Returns a user object for a given user ID.
User response = client.user().get("user_id");
```
