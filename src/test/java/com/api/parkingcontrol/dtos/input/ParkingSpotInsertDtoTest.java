package com.api.parkingcontrol.dtos.input;

import com.api.parkingcontrol.dtos.input.ParkingSpotInsertDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSpotInsertDtoTest {
    @Test
    void testCanEqual() {
        assertFalse((new ParkingSpotInsertDto()).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertTrue(parkingSpotInsertDto.canEqual(parkingSpotInsertDto1));
    }

    @Test
    void testConstructor() {
        ParkingSpotInsertDto actualParkingSpotInsertDto = new ParkingSpotInsertDto();
        actualParkingSpotInsertDto.setApartment("Apartment");
        actualParkingSpotInsertDto.setBlock("Block");
        actualParkingSpotInsertDto.setBrandCar("Brand Car");
        actualParkingSpotInsertDto.setColorCar("Color Car");
        actualParkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        actualParkingSpotInsertDto.setModelCar("Model Car");
        actualParkingSpotInsertDto.setParkingSpotNumber("42");
        actualParkingSpotInsertDto.setResponsibleName("Responsible Name");
        assertEquals("Apartment", actualParkingSpotInsertDto.getApartment());
        assertEquals("Block", actualParkingSpotInsertDto.getBlock());
        assertEquals("Brand Car", actualParkingSpotInsertDto.getBrandCar());
        assertEquals("Color Car", actualParkingSpotInsertDto.getColorCar());
        assertEquals("License Plate Car", actualParkingSpotInsertDto.getLicensePlateCar());
        assertEquals("Model Car", actualParkingSpotInsertDto.getModelCar());
        assertEquals("42", actualParkingSpotInsertDto.getParkingSpotNumber());
        assertEquals("Responsible Name", actualParkingSpotInsertDto.getResponsibleName());
        assertEquals("ParkingSpotInsertDto(parkingSpotNumber=42, licensePlateCar=License Plate Car, brandCar=Brand Car,"
                + " modelCar=Model Car, colorCar=Color Car, responsibleName=Responsible Name, apartment=Apartment,"
                + " block=Block)", actualParkingSpotInsertDto.toString());
    }

    @Test
    void testEquals() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");
        assertNotEquals(null, parkingSpotInsertDto);
    }

    @Test
    void testEquals2() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");
        assertNotEquals(null, parkingSpotInsertDto);
    }

    @Test
    void testEquals3() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");
        assertEquals(parkingSpotInsertDto, parkingSpotInsertDto);
        int expectedHashCodeResult = parkingSpotInsertDto.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotInsertDto.hashCode());
    }

    @Test
    void testEquals4() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
        int expectedHashCodeResult = parkingSpotInsertDto.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotInsertDto1.hashCode());
    }

    @Test
    void testEquals5() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("42");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals6() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment(null);
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals7() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("42");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals8() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock(null);
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals9() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("42");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals10() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar(null);
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals11() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("42");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals12() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar(null);
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals13() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("42");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals14() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar(null);
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals15() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("42");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals16() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar(null);
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals17() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("License Plate Car");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals18() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber(null);
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals19() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("42");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals20() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName(null);

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertNotEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
    }

    @Test
    void testEquals21() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment(null);
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment(null);
        parkingSpotInsertDto1.setBlock("Block");
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
        int expectedHashCodeResult = parkingSpotInsertDto.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotInsertDto1.hashCode());
    }

    @Test
    void testEquals22() {
        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock(null);
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");

        ParkingSpotInsertDto parkingSpotInsertDto1 = new ParkingSpotInsertDto();
        parkingSpotInsertDto1.setApartment("Apartment");
        parkingSpotInsertDto1.setBlock(null);
        parkingSpotInsertDto1.setBrandCar("Brand Car");
        parkingSpotInsertDto1.setColorCar("Color Car");
        parkingSpotInsertDto1.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto1.setModelCar("Model Car");
        parkingSpotInsertDto1.setParkingSpotNumber("42");
        parkingSpotInsertDto1.setResponsibleName("Responsible Name");
        assertEquals(parkingSpotInsertDto, parkingSpotInsertDto1);
        int expectedHashCodeResult = parkingSpotInsertDto.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotInsertDto1.hashCode());
    }
}

