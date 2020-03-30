package com.java.microsoft.conference;

import java.util.*;

public class ConferenceScheduler {

    private final int firstSlot = 180;
    private final int secondSlot = 240;

    public Conference scheduleTalks(List<TalkDetails> talkDetailsList){
        /*
                numberOfLargeTalksToPick = (numberOfSlots, durationLeft)
                listOfLongTalks  = Pick_long_duration_talks(talkDetailsList, numberOfLargeTalksToPick)
                scheduleTheTalks(SlotDetails, listOfLongTalks)
                numberOfMediumTalksToPick = (numberOfSlots, durationLeft)
                listOfMediumTalks  = Pick_long_duration_talks(talkDetailsList, numberOfMediumTalksToPick)
                scheduleTheTalks(SlotDetails, listOfLongTalks)
                numberOfSmallTalksToPick = (numberOfSlots, durationLeft)
                listOfSmallTalks  = Pick_long_duration_talks(talkDetailsList, numberOfSmallTalksToPick)
                scheduleTheTalks(SlotDetails, listOfLongTalks)

         */
        return null;
    }

    public static void main(String[] args) {

        /*

            60, 30, 45, 60, 45, 30,

            First duration -> 180  -> 135
            Second duration -> 240 ->

            slot 1 -day 1- > 60

            slot 2 -day 1- > 60

            slot 1 -day 2 -> 60

            slot 2 -day 1- > 60

            Day -1 ->
                    morning -> 60 -> 45-> 30
                    Evening -> 60 -> 45-> 30
           Day - 2 ->
                    morning -> 60 -> 45 -> 30
                    Evening -> 60 -> 45 -> 30

         */
    }
}
