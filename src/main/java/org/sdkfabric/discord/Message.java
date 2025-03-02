/**
 * Message automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.discord;

import com.fasterxml.jackson.annotation.*;

public class Message {
    @JsonPropertyDescription("Message contents (up to 2000 characters)")
    private String content;
    @JsonPropertyDescription("Can be used to verify a message was sent (up to 25 characters)")
    private String nonce;
    @JsonPropertyDescription("true if this is a TTS message")
    private Boolean tts;
    @JsonPropertyDescription("Up to 10 rich embeds (up to 6000 characters)")
    private java.util.List<MessageEmbed> embeds;
    private MessageAllowedMentions allowedMentions;
    private String messageReference;
    private Integer flags;
    private Boolean enforceNonce;

    @JsonSetter("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonGetter("content")
    public String getContent() {
        return this.content;
    }

    @JsonSetter("nonce")
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    @JsonGetter("nonce")
    public String getNonce() {
        return this.nonce;
    }

    @JsonSetter("tts")
    public void setTts(Boolean tts) {
        this.tts = tts;
    }

    @JsonGetter("tts")
    public Boolean getTts() {
        return this.tts;
    }

    @JsonSetter("embeds")
    public void setEmbeds(java.util.List<MessageEmbed> embeds) {
        this.embeds = embeds;
    }

    @JsonGetter("embeds")
    public java.util.List<MessageEmbed> getEmbeds() {
        return this.embeds;
    }

    @JsonSetter("allowed_mentions")
    public void setAllowedMentions(MessageAllowedMentions allowedMentions) {
        this.allowedMentions = allowedMentions;
    }

    @JsonGetter("allowed_mentions")
    public MessageAllowedMentions getAllowedMentions() {
        return this.allowedMentions;
    }

    @JsonSetter("message_reference")
    public void setMessageReference(String messageReference) {
        this.messageReference = messageReference;
    }

    @JsonGetter("message_reference")
    public String getMessageReference() {
        return this.messageReference;
    }

    @JsonSetter("flags")
    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    @JsonGetter("flags")
    public Integer getFlags() {
        return this.flags;
    }

    @JsonSetter("enforce_nonce")
    public void setEnforceNonce(Boolean enforceNonce) {
        this.enforceNonce = enforceNonce;
    }

    @JsonGetter("enforce_nonce")
    public Boolean getEnforceNonce() {
        return this.enforceNonce;
    }
}

