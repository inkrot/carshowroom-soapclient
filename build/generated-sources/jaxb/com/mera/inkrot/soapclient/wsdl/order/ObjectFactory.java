//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.15 at 06:53:15 PM MSK 
//


package com.mera.inkrot.soapclient.wsdl.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mera.inkrot.soapclient.wsdl.order package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Customer_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "customer");
    private final static QName _Option_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "option");
    private final static QName _Status_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "status");
    private final static QName _SaveResponse_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "saveResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "updateResponse");
    private final static QName _GetAllByStatusAndCustomer_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "getAllByStatusAndCustomer");
    private final static QName _GetOptions_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "getOptions");
    private final static QName _AddOptionResponse_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "addOptionResponse");
    private final static QName _GetById_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "getById");
    private final static QName _AddOption_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "addOption");
    private final static QName _GetAllResponse_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "getAllResponse");
    private final static QName _GetAll_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "getAll");
    private final static QName _GetByIdResponse_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "getByIdResponse");
    private final static QName _Order_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "order");
    private final static QName _Dto_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "dto");
    private final static QName _SetOptionsResponse_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "setOptionsResponse");
    private final static QName _GetOptionsResponse_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "getOptionsResponse");
    private final static QName _SetOptions_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "setOptions");
    private final static QName _GetAllByStatusAndCustomerResponse_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "getAllByStatusAndCustomerResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "deleteResponse");
    private final static QName _RemoveOption_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "removeOption");
    private final static QName _Delete_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "delete");
    private final static QName _Update_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "update");
    private final static QName _Save_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "save");
    private final static QName _RemoveOptionResponse_QNAME = new QName("http://service.carshowroom.inkrot.mera.com/", "removeOptionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mera.inkrot.soapclient.wsdl.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetOptions }
     * 
     */
    public SetOptions createSetOptions() {
        return new SetOptions();
    }

    /**
     * Create an instance of {@link GetAllByStatusAndCustomer }
     * 
     */
    public GetAllByStatusAndCustomer createGetAllByStatusAndCustomer() {
        return new GetAllByStatusAndCustomer();
    }

    /**
     * Create an instance of {@link OrderDto }
     * 
     */
    public OrderDto createOrderDto() {
        return new OrderDto();
    }

    /**
     * Create an instance of {@link AddOptionResponse }
     * 
     */
    public AddOptionResponse createAddOptionResponse() {
        return new AddOptionResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link OptionDto }
     * 
     */
    public OptionDto createOptionDto() {
        return new OptionDto();
    }

    /**
     * Create an instance of {@link GetById }
     * 
     */
    public GetById createGetById() {
        return new GetById();
    }

    /**
     * Create an instance of {@link RemoveOptionResponse }
     * 
     */
    public RemoveOptionResponse createRemoveOptionResponse() {
        return new RemoveOptionResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link GetAllByStatusAndCustomerResponse }
     * 
     */
    public GetAllByStatusAndCustomerResponse createGetAllByStatusAndCustomerResponse() {
        return new GetAllByStatusAndCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetAllResponse.Orders }
     * 
     */
    public GetAllResponse.Orders createGetAllResponseOrders() {
        return new GetAllResponse.Orders();
    }

    /**
     * Create an instance of {@link SetOptionsResponse }
     * 
     */
    public SetOptionsResponse createSetOptionsResponse() {
        return new SetOptionsResponse();
    }

    /**
     * Create an instance of {@link CustomerDto }
     * 
     */
    public CustomerDto createCustomerDto() {
        return new CustomerDto();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link OrderDto.Options }
     * 
     */
    public OrderDto.Options createOrderDtoOptions() {
        return new OrderDto.Options();
    }

    /**
     * Create an instance of {@link Brand }
     * 
     */
    public Brand createBrand() {
        return new Brand();
    }

    /**
     * Create an instance of {@link Order.Options }
     * 
     */
    public Order.Options createOrderOptions() {
        return new Order.Options();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     * 
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link AddOption }
     * 
     */
    public AddOption createAddOption() {
        return new AddOption();
    }

    /**
     * Create an instance of {@link GetOptionsResponse }
     * 
     */
    public GetOptionsResponse createGetOptionsResponse() {
        return new GetOptionsResponse();
    }

    /**
     * Create an instance of {@link StatusDto }
     * 
     */
    public StatusDto createStatusDto() {
        return new StatusDto();
    }

    /**
     * Create an instance of {@link RemoveOption }
     * 
     */
    public RemoveOption createRemoveOption() {
        return new RemoveOption();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link GetOptions }
     * 
     */
    public GetOptions createGetOptions() {
        return new GetOptions();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link BaseEntity }
     * 
     */
    public BaseEntity createBaseEntity() {
        return new BaseEntity();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link GetAllByStatusAndCustomerResponse.Orders }
     * 
     */
    public GetAllByStatusAndCustomerResponse.Orders createGetAllByStatusAndCustomerResponseOrders() {
        return new GetAllByStatusAndCustomerResponse.Orders();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "customer")
    public JAXBElement<CustomerDto> createCustomer(CustomerDto value) {
        return new JAXBElement<CustomerDto>(_Customer_QNAME, CustomerDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Option }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "option")
    public JAXBElement<Option> createOption(Option value) {
        return new JAXBElement<Option>(_Option_QNAME, Option.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "status")
    public JAXBElement<StatusDto> createStatus(StatusDto value) {
        return new JAXBElement<StatusDto>(_Status_QNAME, StatusDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllByStatusAndCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "getAllByStatusAndCustomer")
    public JAXBElement<GetAllByStatusAndCustomer> createGetAllByStatusAndCustomer(GetAllByStatusAndCustomer value) {
        return new JAXBElement<GetAllByStatusAndCustomer>(_GetAllByStatusAndCustomer_QNAME, GetAllByStatusAndCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "getOptions")
    public JAXBElement<GetOptions> createGetOptions(GetOptions value) {
        return new JAXBElement<GetOptions>(_GetOptions_QNAME, GetOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "addOptionResponse")
    public JAXBElement<AddOptionResponse> createAddOptionResponse(AddOptionResponse value) {
        return new JAXBElement<AddOptionResponse>(_AddOptionResponse_QNAME, AddOptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "getById")
    public JAXBElement<GetById> createGetById(GetById value) {
        return new JAXBElement<GetById>(_GetById_QNAME, GetById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "addOption")
    public JAXBElement<AddOption> createAddOption(AddOption value) {
        return new JAXBElement<AddOption>(_AddOption_QNAME, AddOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "getByIdResponse")
    public JAXBElement<GetByIdResponse> createGetByIdResponse(GetByIdResponse value) {
        return new JAXBElement<GetByIdResponse>(_GetByIdResponse_QNAME, GetByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "order")
    public JAXBElement<Object> createOrder(Object value) {
        return new JAXBElement<Object>(_Order_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "dto")
    public JAXBElement<Dto> createDto(Dto value) {
        return new JAXBElement<Dto>(_Dto_QNAME, Dto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "setOptionsResponse")
    public JAXBElement<SetOptionsResponse> createSetOptionsResponse(SetOptionsResponse value) {
        return new JAXBElement<SetOptionsResponse>(_SetOptionsResponse_QNAME, SetOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "getOptionsResponse")
    public JAXBElement<GetOptionsResponse> createGetOptionsResponse(GetOptionsResponse value) {
        return new JAXBElement<GetOptionsResponse>(_GetOptionsResponse_QNAME, GetOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "setOptions")
    public JAXBElement<SetOptions> createSetOptions(SetOptions value) {
        return new JAXBElement<SetOptions>(_SetOptions_QNAME, SetOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllByStatusAndCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "getAllByStatusAndCustomerResponse")
    public JAXBElement<GetAllByStatusAndCustomerResponse> createGetAllByStatusAndCustomerResponse(GetAllByStatusAndCustomerResponse value) {
        return new JAXBElement<GetAllByStatusAndCustomerResponse>(_GetAllByStatusAndCustomerResponse_QNAME, GetAllByStatusAndCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "removeOption")
    public JAXBElement<RemoveOption> createRemoveOption(RemoveOption value) {
        return new JAXBElement<RemoveOption>(_RemoveOption_QNAME, RemoveOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveOptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.carshowroom.inkrot.mera.com/", name = "removeOptionResponse")
    public JAXBElement<RemoveOptionResponse> createRemoveOptionResponse(RemoveOptionResponse value) {
        return new JAXBElement<RemoveOptionResponse>(_RemoveOptionResponse_QNAME, RemoveOptionResponse.class, null, value);
    }

}
