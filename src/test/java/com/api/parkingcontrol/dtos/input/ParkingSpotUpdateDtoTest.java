package com.api.parkingcontrol.dtos.input;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import com.api.parkingcontrol.dtos.input.ParkingSpotUpdateDto;
import org.junit.jupiter.api.Test;

class ParkingSpotUpdateDtoTest {
    @Test
    void testCanEqual() {
        assertFalse((new ParkingSpotUpdateDto()).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(UUID.randomUUID());
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertTrue(parkingSpotUpdateDto.canEqual(parkingSpotUpdateDto1));
    }

    @Test
    void testConstructor() {
        ParkingSpotUpdateDto actualParkingSpotUpdateDto = new ParkingSpotUpdateDto();
        actualParkingSpotUpdateDto.setBrandCar("Brand Car");
        actualParkingSpotUpdateDto.setColorCar("Color Car");
        UUID randomUUIDResult = UUID.randomUUID();
        actualParkingSpotUpdateDto.setId(randomUUIDResult);
        actualParkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        actualParkingSpotUpdateDto.setModelCar("Model Car");
        assertEquals("Brand Car", actualParkingSpotUpdateDto.getBrandCar());
        assertEquals("Color Car", actualParkingSpotUpdateDto.getColorCar());
        assertSame(randomUUIDResult, actualParkingSpotUpdateDto.getId());
        assertEquals("License Plate Car", actualParkingSpotUpdateDto.getLicensePlateCar());
        assertEquals("Model Car", actualParkingSpotUpdateDto.getModelCar());
    }

    @Test
    void testEquals() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(UUID.randomUUID());
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(null));
    }

    @Test
    void testEquals2() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(UUID.randomUUID());
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals("Different type to ParkingSpotUpdateDto"));
    }

    @Test
    void testEquals3() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(UUID.randomUUID());
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");
        assertTrue(parkingSpotUpdateDto.equals(parkingSpotUpdateDto));
        int expectedHashCodeResult = parkingSpotUpdateDto.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotUpdateDto.hashCode());
    }

    @Test
    void testEquals4() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(UUID.randomUUID());
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(UUID.randomUUID());
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
    }

    @Test
    void testEquals5() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(UUID.randomUUID());
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
    }

    @Test
    void testEquals6() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertTrue(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
        int expectedHashCodeResult = parkingSpotUpdateDto.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotUpdateDto1.hashCode());
    }

    @Test
    void testEquals7() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("License Plate Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
    }

    @Test
    void testEquals8() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar(null);
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
    }

    @Test
    void testEquals9() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("License Plate Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
    }

    @Test
    void testEquals10() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar(null);
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
    }

    @Test
    void testEquals11() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("Brand Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
    }

    @Test
    void testEquals12() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar(null);
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
    }

    @Test
    void testEquals13() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("License Plate Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
    }

    @Test
    void testEquals14() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar(null);

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertFalse(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
    }

    @Test
    void testEquals15() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar(null);
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar(null);
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertTrue(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
        int expectedHashCodeResult = parkingSpotUpdateDto.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotUpdateDto1.hashCode());
    }

    @Test
    void testEquals16() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar(null);
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar(null);
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertTrue(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
        int expectedHashCodeResult = parkingSpotUpdateDto.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotUpdateDto1.hashCode());
    }

    @Test
    void testEquals17() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar(null);
        parkingSpotUpdateDto.setModelCar("Model Car");

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar(null);
        parkingSpotUpdateDto1.setModelCar("Model Car");
        assertTrue(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
        int expectedHashCodeResult = parkingSpotUpdateDto.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotUpdateDto1.hashCode());
    }

    @Test
    void testEquals18() {
        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(null);
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar(null);

        ParkingSpotUpdateDto parkingSpotUpdateDto1 = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto1.setBrandCar("Brand Car");
        parkingSpotUpdateDto1.setColorCar("Color Car");
        parkingSpotUpdateDto1.setId(null);
        parkingSpotUpdateDto1.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto1.setModelCar(null);
        assertTrue(parkingSpotUpdateDto.equals(parkingSpotUpdateDto1));
        int expectedHashCodeResult = parkingSpotUpdateDto.hashCode();
        assertEquals(expectedHashCodeResult, parkingSpotUpdateDto1.hashCode());
    }
}

