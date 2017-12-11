package com.avs.bootstrap;

import com.avs.models.Partner;
import com.avs.models.User;
import com.avs.models.user.Address;
import com.avs.models.user.CreditCards;
import com.avs.repositories.AddressRepository;
import com.avs.repositories.CreditCardRepository;
import com.avs.repositories.PartnerRepository;
import com.avs.repositories.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private PartnerRepository partnerRepository;
    private UserRepository userRepository;
    private CreditCardRepository creditCard;
    private AddressRepository addressRepository;

    public DevBootstrap(PartnerRepository partnerRepository, UserRepository userRepository, CreditCardRepository creditCard, AddressRepository addressRepository) {
        this.partnerRepository = partnerRepository;
        this.userRepository = userRepository;
        this.creditCard = creditCard;
        this.addressRepository = addressRepository;
    }

    private void initData() {
        Address address = new Address("test address");
        addressRepository.save(address);
        User testuser = new User();
        testuser.setAddress(address);
        testuser.setEmail("alsmaldone@yahoo.com");
        testuser.setFirstName("al");
        testuser.setUserName("al");
        testuser.setLastName("s");
        testuser.setPassword("welcome");
        testuser.setUserName("test");
        CreditCards cc = new CreditCards(123456, "visa", testuser);
        CreditCards ccmaster = new CreditCards(4444444, "master", testuser);
        //cc.setUser(testuser);

        testuser.getCreditCards().add(cc);
        testuser.getCreditCards().add(ccmaster);
        Partner partner = new Partner("AVS");
        partner.getUsers().add(testuser);

        testuser.setPartner(partner);
        //userRepository.save(testuser);
        partnerRepository.save(partner);


    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
