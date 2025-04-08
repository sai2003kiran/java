package com.xworkz.youtubeApp;

import com.xworkz.youtubeApp.Constants.Subcribtion;
import com.xworkz.youtubeApp.youtube.YouTube;
import com.xworkz.youtubeApp.youtubedto.YouTubeDto;

public class YouTubeRunner {
    public static void main(String arg[]){

        YouTubeDto youTubeDto = new YouTubeDto();
        youTubeDto.setEmail("bgsu335");
        youTubeDto.setName("mjutes");
        youTubeDto.setPhnNo(5638298643l);
        youTubeDto.setSubcribtion(Subcribtion.monthly);
        youTubeDto.setPassword("hufsetyj");

        YouTube youTube = new YouTube();
        if(youTube.User(youTubeDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }
}
