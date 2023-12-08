package lk.ijse.dep11.edupanel;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Bucket;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.StorageClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;
import java.io.InputStream;

@EnableWebMvc
@ComponentScan
@Configuration
public class WebAppConfig {
    // Configures and provides a Bean representing the default Google Cloud Storage bucket for the application.
    @Bean
    public Bucket defaultBucket() throws IOException {
        InputStream serviceAccount = getClass()
                .getResourceAsStream("/edu-panel-59338-firebase-adminsdk-mv4ok-2d6cff1cf3.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setStorageBucket("edu-panel-59338.appspot.com")
                .build();

        FirebaseApp.initializeApp(options);
        return StorageClient.getInstance().bucket();
    }

    // Configure a StandardServletMultipartResolver bean to handle multipart requests
    @Bean
    public StandardServletMultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }
}