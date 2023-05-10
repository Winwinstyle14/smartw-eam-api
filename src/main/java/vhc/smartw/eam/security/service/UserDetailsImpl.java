package vhc.smartw.eam.security.service;

import vhc.smartw.eam.security.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

import java.util.Date;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(	name = "SYS_USERS")
public class UserDetailsImpl implements UserDetails {

    private static final long serialVersionUID = 1L;
    @Column(name = "ID")
    private Long id;
    @Column(name = "USERNAME")
    private String username;
    @JsonIgnore
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "FULLNAME")
    private String fullname;
    @Column(name = "SEX")
    private String sex;
    @Column(name = "POSITION")
    private String position;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "LOGIN_BY")
    private String loginBy;
    @Column(name = "RECEIVING_SMS")
    private String receivingSms;
    @Column(name = "RECEIVING_EMAIL")
    private String receivingEmail;
    @Column(name = "IS_ENABLE")
    private String isEnable;
    @Column(name = "ACTIVE_DATE")
    private Date activeDate;
    @Column(name = "EXPIRED")
    private Date expired;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Column(name = "MODIFIED_BY")
    private String modifiedBy;
    @Column(name = "MODIFY_DATE")
    private Date modifyDate;
    @Column(name = "MA_PHONG")
    private String maPhong;
    @Column(name = "ROLES_ADD_USERS")
    private String rolesAddUsers;
    @Column(name = "CC_EMAIL")
    private String ccEmail;
    @Column(name = "CC_SMS")
    private String ccSms;
    @Column(name = "TEAM")
    private String team;
    @Column(name = "SUB_TEAM")
    private String subTeam;
    @Column(name = "IS_ROLE_SYSTEM")
    private String isRoleSystem;
    @Column(name = "IS_ROLE_MANAGER")
    private String isRoleManger;
    @Column(name = "IS_SMS_LEASELINE")
    private String isSmsLeaseLine;
    @Column(name = "GROUP_CODE")
    private String groupCode;
    @Column(name = "TRUNG_TAM")
    private String trungTam;
    @Column(name = "FO_BO")
    private String foBo;
    @Column(name = "RECEIVE_NOTICE")
    private String receiveNotice;
    @Column(name = "DVT_NAME")
    private String dvtName;
    @Column(name = "NGUOI_DIEU_PHOI")
    private String nguoiDieuPhoi;
    @Column(name = "REGION")
    private String region;
    @Column(name = "TT_NAME")
    private String ttName;
    @Column(name = "TVT_NAME")
    private String tvtName;




    private Collection<? extends GrantedAuthority> authorities;

    public static UserDetailsImpl build(User user) {
        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName().name()))
                .collect(Collectors.toList());

        return new UserDetailsImpl(
                user.getId(),
                user.getUsername(),

                user.getPassword(),
                user.getFullname(),
                user.getSex(),
                user.getPosition(), user.getPhone(), user.getEmail(),
                user.getLoginBy(), user.getReceivingSms(), user.getReceivingEmail(),
                user.getIsEnable(), user.getActiveDate(),user.getExpired(),
                user.getDescription(),
                user.getCreatedBy(),
                user.getCreateDate(),
                user.getModifiedBy(),
                user.getModifyDate(),
                user.getMaPhong(),
                user.getRolesAddUsers(),
                user.getCcEmail(),
                user.getCcSms(),
                user.getTeam(),
                user.getSubTeam(),
                user.getIsRoleSystem(),
                user.getIsRoleManger(),
                user.getIsSmsLeaseLine(),
                user.getGroupCode(),
                user.getTrungTam(), user.getFoBo(), user.getReceiveNotice(),
                user.getDvtName(), user.getNguoiDieuPhoi(),
                user.getRegion(),
                user.getTtName(),
                user.getTvtName(),


                authorities);
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserDetailsImpl user = (UserDetailsImpl) o;
        return Objects.equals(id, user.id);
    }
}
