# FateHistory-SpringRESTApi
Java backend for the FateHistory mobile app using Spring and OAuth

# Fate / History

This product builds the backend for the Fate/History mobile app. This project full implements the REST API Web services to retrieve Fate characters along with their associated historical figures and support the favoriting/history track process for users of the app. The REST API will be fully documented using Swagger and the front end will be a fully functional mobile app. The main takeaway from this project is to highlight my rudimentary knowledge of Spring and Authentication. 

## Database design:
* User interface for setting up favorites and recently viewed - name, password, email, favorites hashset, past viewed hashset
* Fate Character - name, bio, imageURL, map markers specificially for this fate character. 
* Historical Figure - name, bio, sizzler text, imageURL, map markers
* Map Markers - name, longtitude, latitude
* Tags - tag name, people associate with tag

##Relationships
* @OnetoOne - Fate Character / Historical Figure
* @ManytoMany - Tags / Fate&Hist
* @ManytoOne -  Map Markers / Fate&Hist 
* @ManytoOne - Favorite FateHist / User
* @ManytoOne - Past Viewed FateHist / User

## Front end needed:
* Refer to https://github.com/vespertineSiren/Fate_History

* Admin interface to update user accounts. This system does not need to work with individual user accounts (although that would a great stretch goal).

## Notes
* the system must implement full unit testing
* the system must include swagger documentation
* the system must use Java, Spring, Maven for the back end - for the front end, your choice
* the system must include some form of authentication
* the system must include at least 5 tables, at least 1 many to many relationship, at least 1 many to one relationship, and at least 4 front end screens.

