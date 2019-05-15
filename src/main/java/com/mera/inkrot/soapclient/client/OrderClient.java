package com.mera.inkrot.soapclient.client;

import com.mera.inkrot.soapclient.wsdl.order.GetById;
import com.mera.inkrot.soapclient.wsdl.order.GetByIdResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/*import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;*/

public class OrderClient extends WebServiceGatewaySupport {

    public GetByIdResponse getOrder(Long id) {

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
        GetById request = new GetById();
        request.setId(id);
        JAXBElement<GetByIdResponse> response = (JAXBElement<GetByIdResponse>) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/soap/order", new JAXBElement<>(new QName("http://service.carshowroom.inkrot.mera.com/", "getById"),GetById.class,request));
                        //, new SoapActionCallback("http://impl.service.carshowroom.inkrot.mera.com/OrderService"));
        return response.getValue();
    }
}
