package com.api.parkingcontrol.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

class ParkingSpotModelTest {
    @Test
    void testCanEqual() {
        assertFalse((new ParkingSpotModel()).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(UUID.randomUUID());
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(3, 3, 3, 3, 3));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertTrue(parkingSpotModel.canEqual(parkingSpotModel1));
    }

    @Test
    void testConstructor() {
        ParkingSpotModel actualParkingSpotModel = new ParkingSpotModel();
        actualParkingSpotModel.setApartment("Apartment");
        actualParkingSpotModel.setBlock("Block");
        actualParkingSpotModel.setBrandCar("Brand Car");
        actualParkingSpotModel.setColorCar("Color Car");
        UUID randomUUIDResult = UUID.randomUUID();
        actualParkingSpotModel.setId(randomUUIDResult);
        actualParkingSpotModel.setLicensePlateCar("License Plate Car");
        actualParkingSpotModel.setModelCar("Model Car");
        actualParkingSpotModel.setParkingSpotNumber("42");
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualParkingSpotModel.setRegistrationDate(ofResult);
        actualParkingSpotModel.setResponsibleName("Responsible Name");
        assertEquals("Apartment", actualParkingSpotModel.getApartment());
        assertEquals("Block", actualParkingSpotModel.getBlock());
        assertEquals("Brand Car", actualParkingSpotModel.getBrandCar());
        assertEquals("Color Car", actualParkingSpotModel.getColorCar());
        assertSame(randomUUIDResult, actualParkingSpotModel.getId());
        assertEquals("License Plate Car", actualParkingSpotModel.getLicensePlateCar());
        assertEquals("Model Car", actualParkingSpotModel.getModelCar());
        assertEquals("42", actualParkingSpotModel.getParkingSpotNumber());
        assertSame(ofResult, actualParkingSpotModel.getRegistrationDate());
        assertEquals("Responsible Name", actualParkingSpotModel.getResponsibleName());
    }

    @Test
    void testConstructor2() {
        UUID id = UUID.randomUUID();
        ParkingSpotModel actualParkingSpotModel = new ParkingSpotModel(id, "42", "License Plate Car", "Brand Car",
                "Model Car", "Color Car", LocalDateTime.of(1, 1, 1, 1, 1), "Responsible Name", "Apartment", "Block");
        actualParkingSpotModel.setApartment("Apartment");
        actualParkingSpotModel.setBlock("Block");
        actualParkingSpotModel.setBrandCar("Brand Car");
        actualParkingSpotModel.setColorCar("Color Car");
        UUID randomUUIDResult = UUID.randomUUID();
        actualParkingSpotModel.setId(randomUUIDResult);
        actualParkingSpotModel.setLicensePlateCar("License Plate Car");
        actualParkingSpotModel.setModelCar("Model Car");
        actualParkingSpotModel.setParkingSpotNumber("42");
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualParkingSpotModel.setRegistrationDate(ofResult);
        actualParkingSpotModel.setResponsibleName("Responsible Name");
        assertEquals("Apartment", actualParkingSpotModel.getApartment());
        assertEquals("Block", actualParkingSpotModel.getBlock());
        assertEquals("Brand Car", actualParkingSpotModel.getBrandCar());
        assertEquals("Color Car", actualParkingSpotModel.getColorCar());
        assertSame(randomUUIDResult, actualParkingSpotModel.getId());
        assertEquals("License Plate Car", actualParkingSpotModel.getLicensePlateCar());
        assertEquals("Model Car", actualParkingSpotModel.getModelCar());
        assertEquals("42", actualParkingSpotModel.getParkingSpotNumber());
        assertSame(ofResult, actualParkingSpotModel.getRegistrationDate());
        assertEquals("Responsible Name", actualParkingSpotModel.getResponsibleName());
    }

    @Test
    void testEquals() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(null));
    }

    @Test
    void testEquals2() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals("Different type to ParkingSpotModel"));
    }

    @Test
    void testEquals3() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");
        assertTrue(parkingSpotModel.equals(parkingSpotModel));
        int expectedHashCodeResult = parkingSpotModel.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotModel.hashCode());
    }

    @Test
    void testEquals4() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(UUID.randomUUID());
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(UUID.randomUUID());
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals5() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(UUID.randomUUID());
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals6() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertTrue(parkingSpotModel.equals(parkingSpotModel1));
        int expectedHashCodeResult = parkingSpotModel.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotModel1.hashCode());
    }

    @Test
    void testEquals7() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("42");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals8() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment(null);
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals9() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("42");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals10() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock(null);
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals11() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("42");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals12() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar(null);
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals13() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("42");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals14() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar(null);
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals15() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("42");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals16() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar(null);
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals17() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("42");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals18() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar(null);
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals19() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("License Plate Car");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals20() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber(null);
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals21() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(3, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals22() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(null);
        parkingSpotModel.setResponsibleName("Responsible Name");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals23() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName("42");

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }

    @Test
    void testEquals24() {
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setApartment("Apartment");
        parkingSpotModel.setBlock("Block");
        parkingSpotModel.setBrandCar("Brand Car");
        parkingSpotModel.setColorCar("Color Car");
        parkingSpotModel.setId(null);
        parkingSpotModel.setLicensePlateCar("License Plate Car");
        parkingSpotModel.setModelCar("Model Car");
        parkingSpotModel.setParkingSpotNumber("42");
        parkingSpotModel.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel.setResponsibleName(null);

        ParkingSpotModel parkingSpotModel1 = new ParkingSpotModel();
        parkingSpotModel1.setApartment("Apartment");
        parkingSpotModel1.setBlock("Block");
        parkingSpotModel1.setBrandCar("Brand Car");
        parkingSpotModel1.setColorCar("Color Car");
        parkingSpotModel1.setId(null);
        parkingSpotModel1.setLicensePlateCar("License Plate Car");
        parkingSpotModel1.setModelCar("Model Car");
        parkingSpotModel1.setParkingSpotNumber("42");
        parkingSpotModel1.setRegistrationDate(LocalDateTime.of(1, 1, 1, 1, 1));
        parkingSpotModel1.setResponsibleName("Responsible Name");
        assertFalse(parkingSpotModel.equals(parkingSpotModel1));
    }
}

