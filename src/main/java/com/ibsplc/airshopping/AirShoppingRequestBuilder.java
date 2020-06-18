package com.ibsplc.airshopping;

import org.iata.iata.edist.*;

import java.math.BigInteger;

public class AirShoppingRequestBuilder {

    public AirShoppingRQ buildAirShoppingRequest() {
        AirShoppingRQ airShoppingRQ = new AirShoppingRQ();

        //Building Airshopping Request -> passing values direclty
        //PointofSale
        Location location = new Location();
        location.setCityCode(null);
        location.setCountryCode(null);
        AugPoint augPoint = new AugPoint();
        augPoint.setKey("ISOCurrency");
        augPoint.setValue("EUR");
        AugPoint augPoint1 = new AugPoint();
        augPoint1.setKey("RequestorType");
        augPoint1.setValue("BUSINESSUSER");
        AugPoint augPoint2 = new AugPoint();
        augPoint2.setKey("RequestorID");
        augPoint2.setValue("HRG");
        AugPoint augPoint3 = new AugPoint();
        augPoint3.setKey("RequestingUserID");
        augPoint3.setValue("XQAdmin");
        AugPoint augPoint4 = new AugPoint();
        augPoint4.setKey("BookingChannelType");
        augPoint4.setValue("B2E");
        AugPoint augPoint5 = new AugPoint();
        augPoint5.setKey("Market");
        augPoint5.setValue("NO");
        AugPoint augPoint6 = new AugPoint();
        augPoint6.setKey("AgencyConsortium");
        augPoint6.setValue(null);
        AugPoint augPoint7 = new AugPoint();
        augPoint7.setKey("OrganizationalUnitCode");
        augPoint7.setValue("HRGAS");
        AugPoint augPoint8 = new AugPoint();
        augPoint8.setKey("Role");
        augPoint8.setValue(null);
        AugPoint augPoint9 = new AugPoint();
        augPoint9.setKey("ProfileID");
        augPoint9.setValue(null);
        AugPoint augPoint10 = new AugPoint();
        augPoint10.setKey("Primary_FirstName");
        augPoint10.setValue(null);
        AugPoint augPoint11 = new AugPoint();
        augPoint11.setKey("Primary_LastName");
        augPoint11.setValue(null);
        AugPoint augPoint12 = new AugPoint();
        augPoint12.setKey("Primary_Email");
        augPoint12.setValue(null);
        AugPoint augPoint13 = new AugPoint();
        augPoint13.setKey("Primary_PhoneNumber");
        augPoint13.setValue(null);
        AugPoint augPoint14 = new AugPoint();
        augPoint14.setKey("Primary_Language");
        augPoint14.setValue(null);
        AugPoint augPoint15 = new AugPoint();
        augPoint15.setKey("Primary_Address");
        augPoint15.setValue(null);
        AugPoint augPoint16 = new AugPoint();
        augPoint16.setKey("Primary_Street");
        augPoint16.setValue(null);
        AugPoint augPoint17 = new AugPoint();
        augPoint17.setKey("Primary_StateProv");
        augPoint17.setValue(null);
        AugPoint augPoint18 = new AugPoint();
        augPoint18.setKey("Primary_ZipCode");
        augPoint18.setValue(null);
        AugPoint augPoint19 = new AugPoint();
        augPoint19.setKey("Consortium");
        augPoint19.setValue(null);
        AugPoint augPoint20 = new AugPoint();
        augPoint20.setKey("AgencyGroup");
        augPoint20.setValue(null);
        AugPoint augPoint21 = new AugPoint();
        augPoint21.setKey("AgencyType");
        augPoint21.setValue(null);
        AugPoint augPoint22 = new AugPoint();
        augPoint22.setKey("AgencyClass");
        augPoint22.setValue(null);
        AugPoint augPoint23 = new AugPoint();
        augPoint23.setKey("AgencyCategory");
        augPoint23.setValue(null);
        AugmentationPoint augmentationPoint = new AugmentationPoint();
        augmentationPoint.getAugPoint().add(augPoint);
        augmentationPoint.getAugPoint().add(augPoint1);
        augmentationPoint.getAugPoint().add(augPoint2);
        augmentationPoint.getAugPoint().add(augPoint3);
        augmentationPoint.getAugPoint().add(augPoint4);
        augmentationPoint.getAugPoint().add(augPoint5);
        augmentationPoint.getAugPoint().add(augPoint6);
        augmentationPoint.getAugPoint().add(augPoint7);
        augmentationPoint.getAugPoint().add(augPoint8);
        augmentationPoint.getAugPoint().add(augPoint9);
        augmentationPoint.getAugPoint().add(augPoint10);
        augmentationPoint.getAugPoint().add(augPoint11);
        augmentationPoint.getAugPoint().add(augPoint12);
        augmentationPoint.getAugPoint().add(augPoint13);
        augmentationPoint.getAugPoint().add(augPoint14);
        augmentationPoint.getAugPoint().add(augPoint15);
        augmentationPoint.getAugPoint().add(augPoint16);
        augmentationPoint.getAugPoint().add(augPoint17);
        augmentationPoint.getAugPoint().add(augPoint18);
        augmentationPoint.getAugPoint().add(augPoint19);
        augmentationPoint.getAugPoint().add(augPoint20);
        augmentationPoint.getAugPoint().add(augPoint21);
        augmentationPoint.getAugPoint().add(augPoint22);
        augmentationPoint.getAugPoint().add(augPoint23);

        PointOfSale pointOfSale = new PointOfSale();
        pointOfSale.setLocation(location);
        pointOfSale.setAugmentationPoint(augmentationPoint);

        //Parameters
        Parameters parameters = new Parameters();
        CurrCodes currCodes = new CurrCodes();
        currCodes.setCurrCode("NOK");
        parameters.setCurrCodes(currCodes);

        //Travelers
        PTC ptc = new PTC();
        ptc.setQuantity(BigInteger.valueOf(2));
        ptc.setValue("ADT");
        AnonymousTraveler anonymousTraveler = new AnonymousTraveler();
        anonymousTraveler.setPTC(ptc);
        Traveler traveler = new Traveler();
        traveler.setAnonymousTraveler(anonymousTraveler);
        Travelers travelers = new Travelers();
        travelers.setTraveler(traveler);

        //CoreQuery
        AirportCode airportCode = new AirportCode();
        airportCode.setAirportCode("OSL");
        Departure departure = new Departure();
        departure.setDate("2020-09-27");
        departure.setAirportCode("LHR");
        AirportCode airportCode1 = new AirportCode();
        airportCode1.setAirportCode("OSL");
        Departure departure1 = new Departure();
        departure1.setAirportCode("LHR");
        departure1.setDate("2020-09-30");

        OriginDestination originDestination = new OriginDestination();
        originDestination.setOriginDestinationKey("OD1");
        originDestination.setArrival(airportCode);
        originDestination.setDeparture(departure);

        OriginDestination originDestination1 = new OriginDestination();
        originDestination1.setOriginDestinationKey("OD2");
        originDestination1.setDeparture(departure1);
        originDestination1.setArrival(airportCode1);

        OriginDestinations originDestinations = new OriginDestinations();
        originDestinations.getOriginDestination().add(originDestination);
        originDestinations.getOriginDestination().add(originDestination1);
        CoreQuery coreQuery = new CoreQuery();
        coreQuery.setOriginDestinations(originDestinations);

        //Preferences
        CabinType cabinType = new CabinType();
        cabinType.setRefs("OD1");
        cabinType.setCode("M");
        CabinPreferences cabinPreferences = new CabinPreferences();
        cabinPreferences.setCabinType(cabinType);
        Preference preference = new Preference();
        preference.setCabinPreferences(cabinPreferences);
        Preferences preferences = new Preferences();
        preferences.getPreference().add(preference);

        CabinType cabinType1 = new CabinType();
        cabinType1.setRefs("OD2");
        cabinType1.setCode("M");
        CabinPreferences cabinPreferences1 = new CabinPreferences();
        cabinPreferences1.setCabinType(cabinType);
        Preference preference1 = new Preference();
        preference1.setCabinPreferences(cabinPreferences);
        preferences.getPreference().add(preference1);

        Type type = new Type();
        type.setPreferencesLevel("Required");
        type.setCode("70J");
        Types types = new Types();
        types.setType(type);
        FarePreferences farePreferences = new FarePreferences();
        farePreferences.setTypes(types);
        Preference preference2 = new Preference();
        preference2.setFarePreferences(farePreferences);
       preferences.getPreference().add(preference2);


        //MetaData

        //MetaData - Shopping tag
        AugPoint augPoint24 = new AugPoint();
        augPoint24.setKey("IsAdvanceSearch");
        augPoint24.setValue("false");
        AugmentationPoint augmentationPoint1 = new AugmentationPoint();
        augmentationPoint1.getAugPoint().add(augPoint24);
        FlightMetadata flightMetadata = new FlightMetadata();
        flightMetadata.setAugmentationPoint(augmentationPoint1);
        FlightMetadatas flightMetadatas = new FlightMetadatas();
        flightMetadatas.setFlightMetadata(flightMetadata);
        Flight flight = new Flight();
        flight.setFlightMetadatas(flightMetadatas);
        ShopMetadataGroup shopMetadataGroup = new ShopMetadataGroup();
        shopMetadataGroup.setFlight(flight);
        Shopping shopping = new Shopping();
        shopping.setShopMetadataGroup(shopMetadataGroup);
        Metadata metadata = new Metadata();
        metadata.setShopping(shopping);

        //Metadata Other tag
        //Airportmetadata 1
        List list = new List();
        list.getContent().add("A3");
        list.getContent().add("UK");
        list.getContent().add("LON");
        list.getContent().add("LHR");
        list.getContent().add("GB");
        AugPoint augPoint25 = new AugPoint();
        augPoint25.setValue("LHR");
        AugPointAssoc augPointAssoc = new AugPointAssoc();
        augPointAssoc.setRefs(BigInteger.valueOf(1));
        NamedAssoc namedAssoc = new NamedAssoc();
        namedAssoc.getList().add(list);
        NamedAssocs namedAssocs = new NamedAssocs();
        namedAssocs.setNamedAssoc(namedAssoc);
        List list1 = new List();
        list1.getContent().add(augPointAssoc);
        list1.getContent().add(namedAssocs);
        Lists lists = new Lists();
        lists.setList(list1);
        AugmentationPoint augmentationPoint2 = new AugmentationPoint();
        augmentationPoint2.getAugPoint().add(augPoint25);
        augmentationPoint2.setLists(lists);
        AirportMetadata airportMetadata = new AirportMetadata();
        airportMetadata.setAugmentationPoint(augmentationPoint2);




        //Airportmetadata 2
        List list2 = new List();
        list2.getContent().add("A3");
        list2.getContent().add("UK");
        list2.getContent().add("OSL");
        list2.getContent().add("OSL");
        list2.getContent().add("NO");
        AugPoint augPoint26 = new AugPoint();
        augPoint26.setValue("OSL");
        AugPointAssoc augPointAssoc1 = new AugPointAssoc();
        augPointAssoc1.setRefs(BigInteger.valueOf(1));
        NamedAssoc namedAssoc1 = new NamedAssoc();
        namedAssoc1.getList().add(list2);
        NamedAssocs namedAssocs1 = new NamedAssocs();
        namedAssocs1.setNamedAssoc(namedAssoc1);
        List list3 = new List();
        list3.getContent().add(augPointAssoc1);
        list3.getContent().add(namedAssocs1);
        Lists lists1 = new Lists();
        lists1.setList(list3);
        AugmentationPoint augmentationPoint3 = new AugmentationPoint();
        augmentationPoint3.getAugPoint().add(augPoint26);
        augmentationPoint3.setLists(lists1);
        AirportMetadata airportMetadata1 = new AirportMetadata();
        airportMetadata1.setAugmentationPoint(augmentationPoint3);


        AirportMetadatas airportMetadatas = new AirportMetadatas();
        airportMetadatas.getAirportMetadata().add(airportMetadata);
        airportMetadatas.getAirportMetadata().add(airportMetadata1);
        OtherMetadata otherMetadata = new OtherMetadata();
        otherMetadata.setAirportMetadatas(airportMetadatas);
        Other other = new Other();
        other.setOtherMetadata(otherMetadata);
        metadata.setOther(other);


        //Building airShopping Request
        airShoppingRQ.setPointOfSale(pointOfSale);
        airShoppingRQ.setParameters(parameters);
        airShoppingRQ.setTravelers(travelers);
        airShoppingRQ.setCoreQuery(coreQuery);
        airShoppingRQ.setPreferences(preferences);
        airShoppingRQ.setMetadata(metadata);

        return airShoppingRQ;
    }
}

