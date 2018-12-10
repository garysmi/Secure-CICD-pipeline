**1. Install jenkins**

Start Jenkins

```cd jenkins && docker-compose up -d```
 
Copy the default jenkins admin password

```docker-compose exec jenkins cat /var/jenkins_home/secrets/initialAdminPassword```

**2. Configure Jenkins** 

Open a browsers and navigate to http://<yourhost>:8080

Enter the password recored in step 1

Click on install recommended plugins. this takes around 15mins

install the following plugins
- Blue Ocean
- Generic Webhook Trigger

