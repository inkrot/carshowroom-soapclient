package com.mera.inkrot.soapclient.client;

import com.mera.inkrot.soapclient.wsdl.order.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.List;

public class OrderClient extends WebServiceGatewaySupport {

    public static final String NAMESPACE_URI = "http://service.carshowroom.inkrot.mera.com/";

    @SuppressWarnings("unchecked")
    public JAXBElement<?> getResponse(String methodName, Class declaredType, Object value) {
        return ((JAXBElement<GetByIdResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(getDefaultUri(), new JAXBElement<>(new QName(NAMESPACE_URI, methodName), declaredType, value)));
    }

    @SuppressWarnings("unchecked")
    public OrderDto saveOrder(OrderDto order) {
        Save request = new Save();
        request.setOrder(order);
        return ((JAXBElement<SaveResponse>) getResponse("save", Save.class, request)).getValue().getOrder();
    }

    @SuppressWarnings("unchecked")
    public OrderDto updateOrder(Long id, OrderDto order) {
        Update request = new Update();
        request.setId(id);
        request.setOrder(order);
        return ((JAXBElement<UpdateResponse>) getResponse("update", Update.class, request)).getValue().getOrder();
    }

    @SuppressWarnings("unchecked")
    public String deleteOrder(Long id) {
        Delete request = new Delete();
        request.setId(id);
        return ((JAXBElement<DeleteResponse>) getResponse("delete", Delete.class, request)).getValue().getReturn();
    }

    @SuppressWarnings("unchecked")
    public List<OrderDto> getAllOrders() {
        GetAll request = new GetAll();
        return ((JAXBElement<GetAllResponse>) getResponse("getAll", GetAll.class, request)).getValue().getOrders().getOrder();
    }

    @SuppressWarnings("unchecked")
    public List<OrderDto> getAllOrdersByStatusAndCustomer(StatusDto status, CustomerDto customer) {
        GetAllByStatusAndCustomer request = new GetAllByStatusAndCustomer();
        request.setStatus(status);
        request.setCustomer(customer);
        return ((JAXBElement<GetAllByStatusAndCustomerResponse>) getResponse("getAllByStatusAndCustomer", GetAllByStatusAndCustomer.class, request)).getValue().getOrders().getOrder();
    }

    @SuppressWarnings("unchecked")
    public OrderDto getOrder(Long id) {
        GetById request = new GetById();
        request.setId(id);
        return ((JAXBElement<GetByIdResponse>) getResponse("getById", GetById.class, request)).getValue().getOrder();
    }
}



/*import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;*/

/*try {
    GetById request = new GetById();
    request.setId(id);
    JAXBContext jaxbContext = JAXBContext.newInstance(GetById.class);
    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    QName qName = new QName("http://service.carshowroom.inkrot.mera.com/", "getById");
    JAXBElement<GetById> root = new JAXBElement<>(qName, GetById.class, request);
    StringWriter stringWriter = new StringWriter();
    jaxbMarshaller.marshal(root, stringWriter);
    System.out.println(stringWriter.toString());
} catch (JAXBException e) {
}*/

/*
GetById request = new GetById();
request.setId(id);
JAXBElement<GetByIdResponse> response = (JAXBElement<GetByIdResponse>) getWebServiceTemplate()
        .marshalSendAndReceive("http://localhost:8080/soap/order", new JAXBElement<>(new QName("http://service.carshowroom.inkrot.mera.com/", "getById"), GetById.class, request));
                //, new SoapActionCallback("http://impl.service.carshowroom.inkrot.mera.com/OrderService"));*/