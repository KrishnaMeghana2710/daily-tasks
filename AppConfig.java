package seneca.jammer.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;



@Configuration
public class AppConfig {

    @Value("$AKIATO5SLDJ6LBMWIXW7")
    private String awsAccessKey;

    @Value("$b37cmy9nNM9IoyFI+6e3zVk5tasWmxO+caR85+Ne")
    private String awsSecretKey;

    @Value("$us-east-1")
    private String awsRegion;

    @Bean
    public final AmazonS3Client amazonS3Client() {
        AWSCredentials credentials = new BasicAWSCredentials(awsAccessKey, awsSecretKey);
        return (AmazonS3Client) AmazonS3ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(awsRegion)
                .build();
    }
}
