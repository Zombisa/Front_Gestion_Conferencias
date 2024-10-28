package mapper;

import models.Conference;
import models.ConferenceDTO;
import models.OrganizerDTO;

public class MapperConference {
    public MapperConference() {

    }

    public static ConferenceDTO conferenceToDTO(Conference conference, OrganizerDTO organizerDTO) {
        return new ConferenceDTO( conference.getIdConference(),
                conference.getName(),
                conference.getStartDate(),
                conference.getFinishDate(),
                conference.getPlace(),
                conference.getTopic(),
                organizerDTO,
                conference.getDescription() );
    }
    public static Conference DTOToConference(ConferenceDTO DTO) {
        return new Conference(
                DTO.getName(),
                DTO.getDescription(),
                DTO.getStartDate(),
                DTO.getFinishDate(),
                DTO.getPlace(),
                DTO.getTopic(),
                DTO.getId(),
                DTO.getOrganizer().getId()
        );
    }
}
