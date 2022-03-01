package com.api.parkingcontrol.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.api.parkingcontrol.dtos.input.ParkingSpotInsertDto;
import com.api.parkingcontrol.dtos.input.ParkingSpotUpdateDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.services.ParkingSpotService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {ParkingSpotControllerImpl.class})
@ExtendWith(SpringExtension.class)
class ParkingSpotControllerImplTest {
    @Autowired
    private ParkingSpotControllerImpl parkingSpotControllerImpl;

    @MockBean
    private ParkingSpotService parkingSpotService;

    @Test
    void testSaveParkingSpot() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: No primary or single unique constructor found for interface org.springframework.data.domain.Pageable
        //       at org.springframework.beans.BeanUtils.getResolvableConstructor(BeanUtils.java:267)
        //       at org.springframework.web.method.annotation.ModelAttributeMethodProcessor.createAttribute(ModelAttributeMethodProcessor.java:219)
        //       at org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor.createAttribute(ServletModelAttributeMethodProcessor.java:85)
        //       at org.springframework.web.method.annotation.ModelAttributeMethodProcessor.resolveArgument(ModelAttributeMethodProcessor.java:147)
        //       at org.springframework.web.method.support.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:122)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:179)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:146)
        //       at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808)
        //       at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1067)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent saveParkingSpot(ParkingSpotInsertDto)
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   saveParkingSpot(ParkingSpotInsertDto).
        //   See https://diff.blue/R013 to resolve this issue.

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
        ParkingSpotRepository parkingSpotRepository = mock(ParkingSpotRepository.class);
        when(parkingSpotRepository.save((ParkingSpotModel) any())).thenReturn(parkingSpotModel);
        ParkingSpotControllerImpl parkingSpotControllerImpl = new ParkingSpotControllerImpl(
                new ParkingSpotService(parkingSpotRepository));

        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");
        ResponseEntity<Object> actualSaveParkingSpotResult = parkingSpotControllerImpl
                .saveParkingSpot(parkingSpotInsertDto);
        assertTrue(actualSaveParkingSpotResult.hasBody());
        assertTrue(actualSaveParkingSpotResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.CREATED, actualSaveParkingSpotResult.getStatusCode());
        verify(parkingSpotRepository).save((ParkingSpotModel) any());
    }

    @Test
    void testSaveParkingSpot2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: No primary or single unique constructor found for interface org.springframework.data.domain.Pageable
        //       at org.springframework.beans.BeanUtils.getResolvableConstructor(BeanUtils.java:267)
        //       at org.springframework.web.method.annotation.ModelAttributeMethodProcessor.createAttribute(ModelAttributeMethodProcessor.java:219)
        //       at org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor.createAttribute(ServletModelAttributeMethodProcessor.java:85)
        //       at org.springframework.web.method.annotation.ModelAttributeMethodProcessor.resolveArgument(ModelAttributeMethodProcessor.java:147)
        //       at org.springframework.web.method.support.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:122)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:179)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:146)
        //       at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808)
        //       at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1067)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent saveParkingSpot(ParkingSpotInsertDto)
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   saveParkingSpot(ParkingSpotInsertDto).
        //   See https://diff.blue/R013 to resolve this issue.

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
        ParkingSpotService parkingSpotService = mock(ParkingSpotService.class);
        when(parkingSpotService.save((ParkingSpotModel) any())).thenReturn(parkingSpotModel);
        ParkingSpotControllerImpl parkingSpotControllerImpl = new ParkingSpotControllerImpl(parkingSpotService);

        ParkingSpotInsertDto parkingSpotInsertDto = new ParkingSpotInsertDto();
        parkingSpotInsertDto.setApartment("Apartment");
        parkingSpotInsertDto.setBlock("Block");
        parkingSpotInsertDto.setBrandCar("Brand Car");
        parkingSpotInsertDto.setColorCar("Color Car");
        parkingSpotInsertDto.setLicensePlateCar("License Plate Car");
        parkingSpotInsertDto.setModelCar("Model Car");
        parkingSpotInsertDto.setParkingSpotNumber("42");
        parkingSpotInsertDto.setResponsibleName("Responsible Name");
        ResponseEntity<Object> actualSaveParkingSpotResult = parkingSpotControllerImpl
                .saveParkingSpot(parkingSpotInsertDto);
        assertTrue(actualSaveParkingSpotResult.hasBody());
        assertTrue(actualSaveParkingSpotResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.CREATED, actualSaveParkingSpotResult.getStatusCode());
        verify(parkingSpotService).save((ParkingSpotModel) any());
    }

    @Test
    void testDeleteParkingSpotModelById() throws Exception {
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
        when(this.parkingSpotService.findById((UUID) any())).thenReturn(parkingSpotModel);
        doNothing().when(this.parkingSpotService).delete((ParkingSpotModel) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/parking-spot/{id}",
                UUID.randomUUID());
        MockMvcBuilders.standaloneSetup(this.parkingSpotControllerImpl)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string(""));
    }

    @Test
    void testGetAllParkingSpots() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: No primary or single unique constructor found for interface org.springframework.data.domain.Pageable
        //       at org.springframework.beans.BeanUtils.getResolvableConstructor(BeanUtils.java:267)
        //       at org.springframework.web.method.annotation.ModelAttributeMethodProcessor.createAttribute(ModelAttributeMethodProcessor.java:219)
        //       at org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor.createAttribute(ServletModelAttributeMethodProcessor.java:85)
        //       at org.springframework.web.method.annotation.ModelAttributeMethodProcessor.resolveArgument(ModelAttributeMethodProcessor.java:147)
        //       at org.springframework.web.method.support.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:122)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:179)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:146)
        //       at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808)
        //       at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1067)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent getAllParkingSpots(Pageable)
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getAllParkingSpots(Pageable).
        //   See https://diff.blue/R013 to resolve this issue.

        ParkingSpotRepository parkingSpotRepository = mock(ParkingSpotRepository.class);
        when(parkingSpotRepository.findAll((org.springframework.data.domain.Pageable) any()))
                .thenReturn(new PageImpl<>(new ArrayList<>()));
        ResponseEntity<Page<ParkingSpotModel>> actualAllParkingSpots = (new ParkingSpotControllerImpl(
                new ParkingSpotService(parkingSpotRepository))).getAllParkingSpots(null);
        assertEquals("<200 OK OK,Page 1 of 1 containing UNKNOWN instances,[]>", actualAllParkingSpots.toString());
        assertTrue(actualAllParkingSpots.getBody().toList().isEmpty());
        assertTrue(actualAllParkingSpots.hasBody());
        assertEquals(HttpStatus.OK, actualAllParkingSpots.getStatusCode());
        assertTrue(actualAllParkingSpots.getHeaders().isEmpty());
        verify(parkingSpotRepository).findAll((org.springframework.data.domain.Pageable) any());
    }

    @Test
    void testGetAllParkingSpots2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: No primary or single unique constructor found for interface org.springframework.data.domain.Pageable
        //       at org.springframework.beans.BeanUtils.getResolvableConstructor(BeanUtils.java:267)
        //       at org.springframework.web.method.annotation.ModelAttributeMethodProcessor.createAttribute(ModelAttributeMethodProcessor.java:219)
        //       at org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor.createAttribute(ServletModelAttributeMethodProcessor.java:85)
        //       at org.springframework.web.method.annotation.ModelAttributeMethodProcessor.resolveArgument(ModelAttributeMethodProcessor.java:147)
        //       at org.springframework.web.method.support.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:122)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:179)
        //       at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:146)
        //       at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)
        //       at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808)
        //       at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1067)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent getAllParkingSpots(Pageable)
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getAllParkingSpots(Pageable).
        //   See https://diff.blue/R013 to resolve this issue.

        ParkingSpotService parkingSpotService = mock(ParkingSpotService.class);
        when(parkingSpotService.findAll((org.springframework.data.domain.Pageable) any()))
                .thenReturn(new PageImpl<>(new ArrayList<>()));
        ResponseEntity<Page<ParkingSpotModel>> actualAllParkingSpots = (new ParkingSpotControllerImpl(parkingSpotService))
                .getAllParkingSpots(null);
        assertEquals("<200 OK OK,Page 1 of 1 containing UNKNOWN instances,[]>", actualAllParkingSpots.toString());
        assertTrue(actualAllParkingSpots.getBody().toList().isEmpty());
        assertTrue(actualAllParkingSpots.hasBody());
        assertEquals(HttpStatus.OK, actualAllParkingSpots.getStatusCode());
        assertTrue(actualAllParkingSpots.getHeaders().isEmpty());
        verify(parkingSpotService).findAll((org.springframework.data.domain.Pageable) any());
    }

    @Test
    void testGetParkingSpotModelById() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R015 Method may be nondeterministic.
        //   Diffblue Cover tried to run the created test twice, but it first passed the
        //   assertions and then failed.
        //   See https://diff.blue/R015 to resolve this issue.

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
        ParkingSpotRepository parkingSpotRepository = mock(ParkingSpotRepository.class);
        when(parkingSpotRepository.findById((UUID) any())).thenReturn(Optional.of(parkingSpotModel));
        ParkingSpotControllerImpl parkingSpotControllerImpl = new ParkingSpotControllerImpl(
                new ParkingSpotService(parkingSpotRepository));
        ResponseEntity<Object> actualParkingSpotModelById = parkingSpotControllerImpl
                .getParkingSpotModelById(UUID.randomUUID());
        assertTrue(actualParkingSpotModelById.hasBody());
        assertTrue(actualParkingSpotModelById.getHeaders().isEmpty());
        assertEquals(HttpStatus.OK, actualParkingSpotModelById.getStatusCode());
        verify(parkingSpotRepository).findById((UUID) any());
    }

    @Test
    void testGetParkingSpotModelById2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R015 Method may be nondeterministic.
        //   Diffblue Cover tried to run the created test twice, but it first passed the
        //   assertions and then failed.
        //   See https://diff.blue/R015 to resolve this issue.

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
        ParkingSpotService parkingSpotService = mock(ParkingSpotService.class);
        when(parkingSpotService.findById((UUID) any())).thenReturn(parkingSpotModel);
        ParkingSpotControllerImpl parkingSpotControllerImpl = new ParkingSpotControllerImpl(parkingSpotService);
        ResponseEntity<Object> actualParkingSpotModelById = parkingSpotControllerImpl
                .getParkingSpotModelById(UUID.randomUUID());
        assertTrue(actualParkingSpotModelById.hasBody());
        assertTrue(actualParkingSpotModelById.getHeaders().isEmpty());
        assertEquals(HttpStatus.OK, actualParkingSpotModelById.getStatusCode());
        verify(parkingSpotService).findById((UUID) any());
    }

    @Test
    void testUpdateParkingSpotModelById() throws Exception {
        UUID.randomUUID();

        ParkingSpotUpdateDto parkingSpotUpdateDto = new ParkingSpotUpdateDto();
        parkingSpotUpdateDto.setBrandCar("Brand Car");
        parkingSpotUpdateDto.setColorCar("Color Car");
        parkingSpotUpdateDto.setId(UUID.randomUUID());
        parkingSpotUpdateDto.setLicensePlateCar("License Plate Car");
        parkingSpotUpdateDto.setModelCar("Model Car");
        String content = (new ObjectMapper()).writeValueAsString(parkingSpotUpdateDto);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .put("/parking-spot/{id}", "Uri Vars", "Uri Vars")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.parkingSpotControllerImpl)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400));
    }
}

