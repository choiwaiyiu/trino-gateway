package io.trino.gateway.ha.config;

import java.util.Objects;

public class BackendStateConfiguration
{
    private String username;
    private String password = "";
    private Boolean ssl = false;

    public BackendStateConfiguration() {}

    public String getUsername()
    {
        return this.username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Boolean getSsl()
    {
        return this.ssl;
    }

    public void setSsl(Boolean ssl)
    {
        this.ssl = ssl;
    }

    public boolean equals(final Object o)
    {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BackendStateConfiguration other)) {
            return false;
        }
        if (!other.canEqual(this)) {
            return false;
        }
        final Object username = this.getUsername();
        final Object otherUsername = other.getUsername();
        if (!Objects.equals(username, otherUsername)) {
            return false;
        }
        final Object password = this.getPassword();
        final Object otherPassword = other.getPassword();
        if (!Objects.equals(password, otherPassword)) {
            return false;
        }
        final Object ssl = this.getSsl();
        final Object otherSsl = other.getSsl();
        return Objects.equals(ssl, otherSsl);
    }

    protected boolean canEqual(final Object other)
    {
        return other instanceof BackendStateConfiguration;
    }

    public int hashCode()
    {
        final int prime = 59;
        int result = 1;
        final Object username = this.getUsername();
        result = result * prime + (username == null ? 43 : username.hashCode());
        final Object password = this.getPassword();
        result = result * prime + (password == null ? 43 : password.hashCode());
        final Object ssl = this.getSsl();
        result = result * prime + (ssl == null ? 43 : ssl.hashCode());
        return result;
    }

    @Override
    public String toString()
    {
        return "BackendStateConfiguration{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ssl=" + ssl +
                '}';
    }
}
