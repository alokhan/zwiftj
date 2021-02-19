package org.zwiftj.api.model;

@javax.annotation.Generated("profile.proto")
public final class Profile
        implements io.protostuff.Message<Profile> {

    private static final Profile DEFAULT_INSTANCE = newBuilder().build();

    private long id;

    private int isConnectedToStrava;

    private String email;

    private String firstName;

    private String lastName;

    private boolean isMale;

    private io.protostuff.ByteString f7;

    private int weightInGrams;

    private int ftp;

    private int f11;

    private int f12;

    private int f13;

    private int f14;

    private int f15;

    private int f16;

    private int f17;

    private int f18;

    private int f19;

    private int f20;

    private int f21;

    private int f22;

    private int f23;

    private int f24;

    private int f25;

    private int f26;

    private long f27;

    private long f28;

    private long f29;

    private long f30;

    private long f31;

    private long f32;

    private io.protostuff.ByteString f33;

    private int countryCode;

    private int totalDistanceInMeters;

    private int elevationGainInMeters;

    private int timeRiddenInMinutes;

    private int f38;

    private int f39;

    private int f40;

    private int totalWattHours;

    private int heightInMillimeters;

    private String dob;

    private int f44;

    private boolean f45;

    private int totalXp;

    private int f47;

    private int playerType;

    private int achievementLevel;

    private boolean f50;

    private boolean f51;

    private int f52;

    private int f53;

    private int f54;

    private int age;

    private int f56;

    private int f57;

    private io.protostuff.ByteString f58;

    private long f59;

    private java.util.List<io.protostuff.ByteString> f60;

    private org.zwiftj.api.model.Profile.ProfileSocialFacts socialFacts;

    private int f62;

    private boolean f63;

    private boolean f64;

    private int f65;

    private io.protostuff.ByteString f66;

    private int f67;

    private int f68;

    private int f69;

    private int f70;

    private int f71;

    private int f72;

    private int f73;

    private int f74;

    private int f75;

    private int f76;

    private int f77;

    private int f78;

    private int f79;

    private int f80;

    private int f81;

    private org.zwiftj.api.model.Subscription f82;

    private String mixPanelDistinctId;

    private int f84;

    private int f85;

    private int sport;

    private int f87;

    private boolean f88;

    private String preferredLanguage;

    private int f90;

    private int f91;

    private int f92;

    private int f93;

    private int f94;

    private int f95;

    private int f96;

    private int f97;

    private int f98;

    private int f99;

    private int f100;

    private int f101;

    private int f102;

    private int f103;

    private int f104;

    private boolean f105;

    private boolean f106;

    private java.util.List<io.protostuff.ByteString> f107;

    private String launchedGameClient;

    private long f109;

    private boolean f110;

    private java.util.List<org.zwiftj.api.model.PacerSetting> f114;

    private int f117;

    private int f118;

    private int f119;

    private int f120;

    private int f121;

    private int f125;

    private boolean __merge_lock = false;
    private int __bitField0;
    private int __bitField1;
    private int __bitField2;
    private int __bitField3;

    private Profile() {
        this.id = 0L;
        this.isConnectedToStrava = 0;
        this.email = "";
        this.firstName = "";
        this.lastName = "";
        this.isMale = false;
        this.f7 = io.protostuff.ByteString.EMPTY;
        this.weightInGrams = 0;
        this.ftp = 0;
        this.f11 = 0;
        this.f12 = 0;
        this.f13 = 0;
        this.f14 = 0;
        this.f15 = 0;
        this.f16 = 0;
        this.f17 = 0;
        this.f18 = 0;
        this.f19 = 0;
        this.f20 = 0;
        this.f21 = 0;
        this.f22 = 0;
        this.f23 = 0;
        this.f24 = 0;
        this.f25 = 0;
        this.f26 = 0;
        this.f27 = 0L;
        this.f28 = 0L;
        this.f29 = 0L;
        this.f30 = 0L;
        this.f31 = 0L;
        this.f32 = 0L;
        this.f33 = io.protostuff.ByteString.EMPTY;
        this.countryCode = 0;
        this.totalDistanceInMeters = 0;
        this.elevationGainInMeters = 0;
        this.timeRiddenInMinutes = 0;
        this.f38 = 0;
        this.f39 = 0;
        this.f40 = 0;
        this.totalWattHours = 0;
        this.heightInMillimeters = 0;
        this.dob = "";
        this.f44 = 0;
        this.f45 = false;
        this.totalXp = 0;
        this.f47 = 0;
        this.playerType = org.zwiftj.api.model.Profile.PlayerType.PLAYERTYPE0.getNumber();
        this.achievementLevel = 0;
        this.f50 = false;
        this.f51 = false;
        this.f52 = 0;
        this.f53 = 0;
        this.f54 = 0;
        this.age = 0;
        this.f56 = 0;
        this.f57 = 0;
        this.f58 = io.protostuff.ByteString.EMPTY;
        this.f59 = 0L;
        this.f60 = java.util.Collections.emptyList();
        this.socialFacts = org.zwiftj.api.model.Profile.ProfileSocialFacts.getDefaultInstance();
        this.f62 = org.zwiftj.api.model.ProfileFollowStatus.FOLLOWSTATUS0.getNumber();
        this.f63 = false;
        this.f64 = false;
        this.f65 = org.zwiftj.api.model.Profile.ProfileEnrolledProgram.ENROLLEDPROGRAM0.getNumber();
        this.f66 = io.protostuff.ByteString.EMPTY;
        this.f67 = 0;
        this.f68 = 0;
        this.f69 = 0;
        this.f70 = 0;
        this.f71 = 0;
        this.f72 = 0;
        this.f73 = 0;
        this.f74 = 0;
        this.f75 = 0;
        this.f76 = 0;
        this.f77 = 0;
        this.f78 = 0;
        this.f79 = 0;
        this.f80 = 0;
        this.f81 = 0;
        this.f82 = org.zwiftj.api.model.Subscription.getDefaultInstance();
        this.mixPanelDistinctId = "";
        this.f84 = 0;
        this.f85 = 0;
        this.sport = org.zwiftj.api.model.Profile.Sport.SPORT0.getNumber();
        this.f87 = 0;
        this.f88 = false;
        this.preferredLanguage = "";
        this.f90 = 0;
        this.f91 = 0;
        this.f92 = 0;
        this.f93 = 0;
        this.f94 = 0;
        this.f95 = 0;
        this.f96 = 0;
        this.f97 = 0;
        this.f98 = 0;
        this.f99 = 0;
        this.f100 = 0;
        this.f101 = 0;
        this.f102 = 0;
        this.f103 = 0;
        this.f104 = 0;
        this.f105 = false;
        this.f106 = false;
        this.f107 = java.util.Collections.emptyList();
        this.launchedGameClient = "";
        this.f109 = 0L;
        this.f110 = false;
        this.f114 = java.util.Collections.emptyList();
        this.f117 = 0;
        this.f118 = 0;
        this.f119 = 0;
        this.f120 = 0;
        this.f121 = 0;
        this.f125 = 0;
    }

    private Profile(Builder builder) {
        __merge_lock = true;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Profile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static io.protostuff.Schema<Profile> getSchema()
    {
    	return Schema.INSTANCE;
    }

    public long getId() {
        return id;
    }

    public boolean hasId() {
        return (__bitField0 & 1) == 1;
    }

    public Profile withId(long value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setId(value)
            .build();
    }

    public int getIsConnectedToStrava() {
        return isConnectedToStrava;
    }

    public boolean hasIsConnectedToStrava() {
        return (__bitField0 & 2) == 2;
    }

    public Profile withIsConnectedToStrava(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setIsConnectedToStrava(value)
            .build();
    }

    public String getEmail() {
        return email;
    }

    public boolean hasEmail() {
        return (__bitField0 & 4) == 4;
    }

    public Profile withEmail(String value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setEmail(value)
            .build();
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean hasFirstName() {
        return (__bitField0 & 8) == 8;
    }

    public Profile withFirstName(String value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setFirstName(value)
            .build();
    }

    public String getLastName() {
        return lastName;
    }

    public boolean hasLastName() {
        return (__bitField0 & 16) == 16;
    }

    public Profile withLastName(String value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setLastName(value)
            .build();
    }

    public boolean getIsMale() {
        return isMale;
    }

    public boolean hasIsMale() {
        return (__bitField0 & 32) == 32;
    }

    public Profile withIsMale(boolean value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setIsMale(value)
            .build();
    }

    public io.protostuff.ByteString getF7() {
        return f7;
    }

    public boolean hasF7() {
        return (__bitField0 & 64) == 64;
    }

    public Profile withF7(io.protostuff.ByteString value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF7(value)
            .build();
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public boolean hasWeightInGrams() {
        return (__bitField0 & 128) == 128;
    }

    public Profile withWeightInGrams(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setWeightInGrams(value)
            .build();
    }

    public int getFtp() {
        return ftp;
    }

    public boolean hasFtp() {
        return (__bitField0 & 256) == 256;
    }

    public Profile withFtp(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setFtp(value)
            .build();
    }

    public int getF11() {
        return f11;
    }

    public boolean hasF11() {
        return (__bitField0 & 512) == 512;
    }

    public Profile withF11(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF11(value)
            .build();
    }

    public int getF12() {
        return f12;
    }

    public boolean hasF12() {
        return (__bitField0 & 1024) == 1024;
    }

    public Profile withF12(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF12(value)
            .build();
    }

    public int getF13() {
        return f13;
    }

    public boolean hasF13() {
        return (__bitField0 & 2048) == 2048;
    }

    public Profile withF13(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF13(value)
            .build();
    }

    public int getF14() {
        return f14;
    }

    public boolean hasF14() {
        return (__bitField0 & 4096) == 4096;
    }

    public Profile withF14(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF14(value)
            .build();
    }

    public int getF15() {
        return f15;
    }

    public boolean hasF15() {
        return (__bitField0 & 8192) == 8192;
    }

    public Profile withF15(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF15(value)
            .build();
    }

    public int getF16() {
        return f16;
    }

    public boolean hasF16() {
        return (__bitField0 & 16384) == 16384;
    }

    public Profile withF16(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF16(value)
            .build();
    }

    public int getF17() {
        return f17;
    }

    public boolean hasF17() {
        return (__bitField0 & 32768) == 32768;
    }

    public Profile withF17(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF17(value)
            .build();
    }

    public int getF18() {
        return f18;
    }

    public boolean hasF18() {
        return (__bitField0 & 65536) == 65536;
    }

    public Profile withF18(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF18(value)
            .build();
    }

    public int getF19() {
        return f19;
    }

    public boolean hasF19() {
        return (__bitField0 & 131072) == 131072;
    }

    public Profile withF19(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF19(value)
            .build();
    }

    public int getF20() {
        return f20;
    }

    public boolean hasF20() {
        return (__bitField0 & 262144) == 262144;
    }

    public Profile withF20(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF20(value)
            .build();
    }

    public int getF21() {
        return f21;
    }

    public boolean hasF21() {
        return (__bitField0 & 524288) == 524288;
    }

    public Profile withF21(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF21(value)
            .build();
    }

    public int getF22() {
        return f22;
    }

    public boolean hasF22() {
        return (__bitField0 & 1048576) == 1048576;
    }

    public Profile withF22(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF22(value)
            .build();
    }

    public int getF23() {
        return f23;
    }

    public boolean hasF23() {
        return (__bitField0 & 2097152) == 2097152;
    }

    public Profile withF23(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF23(value)
            .build();
    }

    public int getF24() {
        return f24;
    }

    public boolean hasF24() {
        return (__bitField0 & 4194304) == 4194304;
    }

    public Profile withF24(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF24(value)
            .build();
    }

    public int getF25() {
        return f25;
    }

    public boolean hasF25() {
        return (__bitField0 & 8388608) == 8388608;
    }

    public Profile withF25(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF25(value)
            .build();
    }

    public int getF26() {
        return f26;
    }

    public boolean hasF26() {
        return (__bitField0 & 16777216) == 16777216;
    }

    public Profile withF26(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF26(value)
            .build();
    }

    public long getF27() {
        return f27;
    }

    public boolean hasF27() {
        return (__bitField0 & 33554432) == 33554432;
    }

    public Profile withF27(long value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF27(value)
            .build();
    }

    public long getF28() {
        return f28;
    }

    public boolean hasF28() {
        return (__bitField0 & 67108864) == 67108864;
    }

    public Profile withF28(long value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF28(value)
            .build();
    }

    public long getF29() {
        return f29;
    }

    public boolean hasF29() {
        return (__bitField0 & 134217728) == 134217728;
    }

    public Profile withF29(long value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF29(value)
            .build();
    }

    public long getF30() {
        return f30;
    }

    public boolean hasF30() {
        return (__bitField0 & 268435456) == 268435456;
    }

    public Profile withF30(long value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF30(value)
            .build();
    }

    public long getF31() {
        return f31;
    }

    public boolean hasF31() {
        return (__bitField0 & 536870912) == 536870912;
    }

    public Profile withF31(long value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF31(value)
            .build();
    }

    public long getF32() {
        return f32;
    }

    public boolean hasF32() {
        return (__bitField0 & 1073741824) == 1073741824;
    }

    public Profile withF32(long value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF32(value)
            .build();
    }

    public io.protostuff.ByteString getF33() {
        return f33;
    }

    public boolean hasF33() {
        return (__bitField0 & -2147483648) == -2147483648;
    }

    public Profile withF33(io.protostuff.ByteString value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF33(value)
            .build();
    }

    public int getCountryCode() {
        return countryCode;
    }

    public boolean hasCountryCode() {
        return (__bitField1 & 1) == 1;
    }

    public Profile withCountryCode(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setCountryCode(value)
            .build();
    }

    public int getTotalDistanceInMeters() {
        return totalDistanceInMeters;
    }

    public boolean hasTotalDistanceInMeters() {
        return (__bitField1 & 2) == 2;
    }

    public Profile withTotalDistanceInMeters(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setTotalDistanceInMeters(value)
            .build();
    }

    public int getElevationGainInMeters() {
        return elevationGainInMeters;
    }

    public boolean hasElevationGainInMeters() {
        return (__bitField1 & 4) == 4;
    }

    public Profile withElevationGainInMeters(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setElevationGainInMeters(value)
            .build();
    }

    public int getTimeRiddenInMinutes() {
        return timeRiddenInMinutes;
    }

    public boolean hasTimeRiddenInMinutes() {
        return (__bitField1 & 8) == 8;
    }

    public Profile withTimeRiddenInMinutes(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setTimeRiddenInMinutes(value)
            .build();
    }

    public int getF38() {
        return f38;
    }

    public boolean hasF38() {
        return (__bitField1 & 16) == 16;
    }

    public Profile withF38(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF38(value)
            .build();
    }

    public int getF39() {
        return f39;
    }

    public boolean hasF39() {
        return (__bitField1 & 32) == 32;
    }

    public Profile withF39(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF39(value)
            .build();
    }

    public int getF40() {
        return f40;
    }

    public boolean hasF40() {
        return (__bitField1 & 64) == 64;
    }

    public Profile withF40(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF40(value)
            .build();
    }

    public int getTotalWattHours() {
        return totalWattHours;
    }

    public boolean hasTotalWattHours() {
        return (__bitField1 & 128) == 128;
    }

    public Profile withTotalWattHours(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setTotalWattHours(value)
            .build();
    }

    public int getHeightInMillimeters() {
        return heightInMillimeters;
    }

    public boolean hasHeightInMillimeters() {
        return (__bitField1 & 256) == 256;
    }

    public Profile withHeightInMillimeters(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setHeightInMillimeters(value)
            .build();
    }

    public String getDob() {
        return dob;
    }

    public boolean hasDob() {
        return (__bitField1 & 512) == 512;
    }

    public Profile withDob(String value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setDob(value)
            .build();
    }

    public int getF44() {
        return f44;
    }

    public boolean hasF44() {
        return (__bitField1 & 1024) == 1024;
    }

    public Profile withF44(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF44(value)
            .build();
    }

    public boolean getF45() {
        return f45;
    }

    public boolean hasF45() {
        return (__bitField1 & 2048) == 2048;
    }

    public Profile withF45(boolean value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF45(value)
            .build();
    }

    public int getTotalXp() {
        return totalXp;
    }

    public boolean hasTotalXp() {
        return (__bitField1 & 4096) == 4096;
    }

    public Profile withTotalXp(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setTotalXp(value)
            .build();
    }

    public int getF47() {
        return f47;
    }

    public boolean hasF47() {
        return (__bitField1 & 8192) == 8192;
    }

    public Profile withF47(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF47(value)
            .build();
    }

    public org.zwiftj.api.model.Profile.PlayerType getPlayerType() {
        return org.zwiftj.api.model.Profile.PlayerType.valueOf(playerType);
    }

    public int getPlayerTypeValue() {
        return playerType;
    }

    public boolean hasPlayerType() {
        return (__bitField1 & 16384) == 16384;
    }

    public Profile withPlayerType(org.zwiftj.api.model.Profile.PlayerType value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setPlayerType(value)
            .build();
    }

    public int getAchievementLevel() {
        return achievementLevel;
    }

    public boolean hasAchievementLevel() {
        return (__bitField1 & 32768) == 32768;
    }

    public Profile withAchievementLevel(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setAchievementLevel(value)
            .build();
    }

    public boolean getF50() {
        return f50;
    }

    public boolean hasF50() {
        return (__bitField1 & 65536) == 65536;
    }

    public Profile withF50(boolean value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF50(value)
            .build();
    }

    public boolean getF51() {
        return f51;
    }

    public boolean hasF51() {
        return (__bitField1 & 131072) == 131072;
    }

    public Profile withF51(boolean value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF51(value)
            .build();
    }

    public int getF52() {
        return f52;
    }

    public boolean hasF52() {
        return (__bitField1 & 262144) == 262144;
    }

    public Profile withF52(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF52(value)
            .build();
    }

    public int getF53() {
        return f53;
    }

    public boolean hasF53() {
        return (__bitField1 & 524288) == 524288;
    }

    public Profile withF53(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF53(value)
            .build();
    }

    public int getF54() {
        return f54;
    }

    public boolean hasF54() {
        return (__bitField1 & 1048576) == 1048576;
    }

    public Profile withF54(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF54(value)
            .build();
    }

    public int getAge() {
        return age;
    }

    public boolean hasAge() {
        return (__bitField1 & 2097152) == 2097152;
    }

    public Profile withAge(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setAge(value)
            .build();
    }

    public int getF56() {
        return f56;
    }

    public boolean hasF56() {
        return (__bitField1 & 4194304) == 4194304;
    }

    public Profile withF56(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF56(value)
            .build();
    }

    public int getF57() {
        return f57;
    }

    public boolean hasF57() {
        return (__bitField1 & 8388608) == 8388608;
    }

    public Profile withF57(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF57(value)
            .build();
    }

    public io.protostuff.ByteString getF58() {
        return f58;
    }

    public boolean hasF58() {
        return (__bitField1 & 16777216) == 16777216;
    }

    public Profile withF58(io.protostuff.ByteString value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF58(value)
            .build();
    }

    public long getF59() {
        return f59;
    }

    public boolean hasF59() {
        return (__bitField1 & 33554432) == 33554432;
    }

    public Profile withF59(long value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF59(value)
            .build();
    }

    public java.util.List<io.protostuff.ByteString> getF60List() {
        return f60;
    }

    public int getF60Count() {
        return f60.size();
    }

    public io.protostuff.ByteString getF60(int index) {
        return f60.get(index);
    }

    public Profile withF60(java.util.List<io.protostuff.ByteString> value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .clearF60()
            .addAllF60(value)
            .build();
    }

    public org.zwiftj.api.model.Profile.ProfileSocialFacts getSocialFacts() {
        return socialFacts;
    }

    public boolean hasSocialFacts() {
        return (__bitField1 & 134217728) == 134217728;
    }

    public Profile withSocialFacts(org.zwiftj.api.model.Profile.ProfileSocialFacts value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setSocialFacts(value)
            .build();
    }

    public org.zwiftj.api.model.ProfileFollowStatus getF62() {
        return org.zwiftj.api.model.ProfileFollowStatus.valueOf(f62);
    }

    public int getF62Value() {
        return f62;
    }

    public boolean hasF62() {
        return (__bitField1 & 268435456) == 268435456;
    }

    public Profile withF62(org.zwiftj.api.model.ProfileFollowStatus value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF62(value)
            .build();
    }

    public boolean getF63() {
        return f63;
    }

    public boolean hasF63() {
        return (__bitField1 & 536870912) == 536870912;
    }

    public Profile withF63(boolean value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF63(value)
            .build();
    }

    public boolean getF64() {
        return f64;
    }

    public boolean hasF64() {
        return (__bitField1 & 1073741824) == 1073741824;
    }

    public Profile withF64(boolean value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF64(value)
            .build();
    }

    public org.zwiftj.api.model.Profile.ProfileEnrolledProgram getF65() {
        return org.zwiftj.api.model.Profile.ProfileEnrolledProgram.valueOf(f65);
    }

    public int getF65Value() {
        return f65;
    }

    public boolean hasF65() {
        return (__bitField1 & -2147483648) == -2147483648;
    }

    public Profile withF65(org.zwiftj.api.model.Profile.ProfileEnrolledProgram value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF65(value)
            .build();
    }

    public io.protostuff.ByteString getF66() {
        return f66;
    }

    public boolean hasF66() {
        return (__bitField2 & 1) == 1;
    }

    public Profile withF66(io.protostuff.ByteString value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF66(value)
            .build();
    }

    public int getF67() {
        return f67;
    }

    public boolean hasF67() {
        return (__bitField2 & 2) == 2;
    }

    public Profile withF67(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF67(value)
            .build();
    }

    public int getF68() {
        return f68;
    }

    public boolean hasF68() {
        return (__bitField2 & 4) == 4;
    }

    public Profile withF68(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF68(value)
            .build();
    }

    public int getF69() {
        return f69;
    }

    public boolean hasF69() {
        return (__bitField2 & 8) == 8;
    }

    public Profile withF69(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF69(value)
            .build();
    }

    public int getF70() {
        return f70;
    }

    public boolean hasF70() {
        return (__bitField2 & 16) == 16;
    }

    public Profile withF70(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF70(value)
            .build();
    }

    public int getF71() {
        return f71;
    }

    public boolean hasF71() {
        return (__bitField2 & 32) == 32;
    }

    public Profile withF71(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF71(value)
            .build();
    }

    public int getF72() {
        return f72;
    }

    public boolean hasF72() {
        return (__bitField2 & 64) == 64;
    }

    public Profile withF72(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF72(value)
            .build();
    }

    public int getF73() {
        return f73;
    }

    public boolean hasF73() {
        return (__bitField2 & 128) == 128;
    }

    public Profile withF73(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF73(value)
            .build();
    }

    public int getF74() {
        return f74;
    }

    public boolean hasF74() {
        return (__bitField2 & 256) == 256;
    }

    public Profile withF74(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF74(value)
            .build();
    }

    public int getF75() {
        return f75;
    }

    public boolean hasF75() {
        return (__bitField2 & 512) == 512;
    }

    public Profile withF75(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF75(value)
            .build();
    }

    public int getF76() {
        return f76;
    }

    public boolean hasF76() {
        return (__bitField2 & 1024) == 1024;
    }

    public Profile withF76(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF76(value)
            .build();
    }

    public int getF77() {
        return f77;
    }

    public boolean hasF77() {
        return (__bitField2 & 2048) == 2048;
    }

    public Profile withF77(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF77(value)
            .build();
    }

    public int getF78() {
        return f78;
    }

    public boolean hasF78() {
        return (__bitField2 & 4096) == 4096;
    }

    public Profile withF78(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF78(value)
            .build();
    }

    public int getF79() {
        return f79;
    }

    public boolean hasF79() {
        return (__bitField2 & 8192) == 8192;
    }

    public Profile withF79(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF79(value)
            .build();
    }

    public int getF80() {
        return f80;
    }

    public boolean hasF80() {
        return (__bitField2 & 16384) == 16384;
    }

    public Profile withF80(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF80(value)
            .build();
    }

    public int getF81() {
        return f81;
    }

    public boolean hasF81() {
        return (__bitField2 & 32768) == 32768;
    }

    public Profile withF81(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF81(value)
            .build();
    }

    public org.zwiftj.api.model.Subscription getF82() {
        return f82;
    }

    public boolean hasF82() {
        return (__bitField2 & 65536) == 65536;
    }

    public Profile withF82(org.zwiftj.api.model.Subscription value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF82(value)
            .build();
    }

    public String getMixPanelDistinctId() {
        return mixPanelDistinctId;
    }

    public boolean hasMixPanelDistinctId() {
        return (__bitField2 & 131072) == 131072;
    }

    public Profile withMixPanelDistinctId(String value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setMixPanelDistinctId(value)
            .build();
    }

    public int getF84() {
        return f84;
    }

    public boolean hasF84() {
        return (__bitField2 & 262144) == 262144;
    }

    public Profile withF84(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF84(value)
            .build();
    }

    public int getF85() {
        return f85;
    }

    public boolean hasF85() {
        return (__bitField2 & 524288) == 524288;
    }

    public Profile withF85(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF85(value)
            .build();
    }

    public org.zwiftj.api.model.Profile.Sport getSport() {
        return org.zwiftj.api.model.Profile.Sport.valueOf(sport);
    }

    public int getSportValue() {
        return sport;
    }

    public boolean hasSport() {
        return (__bitField2 & 1048576) == 1048576;
    }

    public Profile withSport(org.zwiftj.api.model.Profile.Sport value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setSport(value)
            .build();
    }

    public int getF87() {
        return f87;
    }

    public boolean hasF87() {
        return (__bitField2 & 2097152) == 2097152;
    }

    public Profile withF87(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF87(value)
            .build();
    }

    public boolean getF88() {
        return f88;
    }

    public boolean hasF88() {
        return (__bitField2 & 4194304) == 4194304;
    }

    public Profile withF88(boolean value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF88(value)
            .build();
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public boolean hasPreferredLanguage() {
        return (__bitField2 & 8388608) == 8388608;
    }

    public Profile withPreferredLanguage(String value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setPreferredLanguage(value)
            .build();
    }

    public int getF90() {
        return f90;
    }

    public boolean hasF90() {
        return (__bitField2 & 16777216) == 16777216;
    }

    public Profile withF90(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF90(value)
            .build();
    }

    public int getF91() {
        return f91;
    }

    public boolean hasF91() {
        return (__bitField2 & 33554432) == 33554432;
    }

    public Profile withF91(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF91(value)
            .build();
    }

    public int getF92() {
        return f92;
    }

    public boolean hasF92() {
        return (__bitField2 & 67108864) == 67108864;
    }

    public Profile withF92(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF92(value)
            .build();
    }

    public int getF93() {
        return f93;
    }

    public boolean hasF93() {
        return (__bitField2 & 134217728) == 134217728;
    }

    public Profile withF93(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF93(value)
            .build();
    }

    public int getF94() {
        return f94;
    }

    public boolean hasF94() {
        return (__bitField2 & 268435456) == 268435456;
    }

    public Profile withF94(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF94(value)
            .build();
    }

    public int getF95() {
        return f95;
    }

    public boolean hasF95() {
        return (__bitField2 & 536870912) == 536870912;
    }

    public Profile withF95(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF95(value)
            .build();
    }

    public int getF96() {
        return f96;
    }

    public boolean hasF96() {
        return (__bitField2 & 1073741824) == 1073741824;
    }

    public Profile withF96(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF96(value)
            .build();
    }

    public int getF97() {
        return f97;
    }

    public boolean hasF97() {
        return (__bitField2 & -2147483648) == -2147483648;
    }

    public Profile withF97(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF97(value)
            .build();
    }

    public int getF98() {
        return f98;
    }

    public boolean hasF98() {
        return (__bitField3 & 1) == 1;
    }

    public Profile withF98(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF98(value)
            .build();
    }

    public int getF99() {
        return f99;
    }

    public boolean hasF99() {
        return (__bitField3 & 2) == 2;
    }

    public Profile withF99(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF99(value)
            .build();
    }

    public int getF100() {
        return f100;
    }

    public boolean hasF100() {
        return (__bitField3 & 4) == 4;
    }

    public Profile withF100(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF100(value)
            .build();
    }

    public int getF101() {
        return f101;
    }

    public boolean hasF101() {
        return (__bitField3 & 8) == 8;
    }

    public Profile withF101(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF101(value)
            .build();
    }

    public int getF102() {
        return f102;
    }

    public boolean hasF102() {
        return (__bitField3 & 16) == 16;
    }

    public Profile withF102(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF102(value)
            .build();
    }

    public int getF103() {
        return f103;
    }

    public boolean hasF103() {
        return (__bitField3 & 32) == 32;
    }

    public Profile withF103(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF103(value)
            .build();
    }

    public int getF104() {
        return f104;
    }

    public boolean hasF104() {
        return (__bitField3 & 64) == 64;
    }

    public Profile withF104(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF104(value)
            .build();
    }

    public boolean getF105() {
        return f105;
    }

    public boolean hasF105() {
        return (__bitField3 & 128) == 128;
    }

    public Profile withF105(boolean value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF105(value)
            .build();
    }

    public boolean getF106() {
        return f106;
    }

    public boolean hasF106() {
        return (__bitField3 & 256) == 256;
    }

    public Profile withF106(boolean value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF106(value)
            .build();
    }

    public java.util.List<io.protostuff.ByteString> getF107List() {
        return f107;
    }

    public int getF107Count() {
        return f107.size();
    }

    public io.protostuff.ByteString getF107(int index) {
        return f107.get(index);
    }

    public Profile withF107(java.util.List<io.protostuff.ByteString> value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .clearF107()
            .addAllF107(value)
            .build();
    }

    public String getLaunchedGameClient() {
        return launchedGameClient;
    }

    public boolean hasLaunchedGameClient() {
        return (__bitField3 & 1024) == 1024;
    }

    public Profile withLaunchedGameClient(String value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setLaunchedGameClient(value)
            .build();
    }

    public long getF109() {
        return f109;
    }

    public boolean hasF109() {
        return (__bitField3 & 2048) == 2048;
    }

    public Profile withF109(long value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF109(value)
            .build();
    }

    public boolean getF110() {
        return f110;
    }

    public boolean hasF110() {
        return (__bitField3 & 4096) == 4096;
    }

    public Profile withF110(boolean value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF110(value)
            .build();
    }

    public java.util.List<org.zwiftj.api.model.PacerSetting> getF114List() {
        return f114;
    }

    public int getF114Count() {
        return f114.size();
    }

    public org.zwiftj.api.model.PacerSetting getF114(int index) {
        return f114.get(index);
    }

    public Profile withF114(java.util.List<org.zwiftj.api.model.PacerSetting> value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .clearF114()
            .addAllF114(value)
            .build();
    }

    public int getF117() {
        return f117;
    }

    public boolean hasF117() {
        return (__bitField3 & 16384) == 16384;
    }

    public Profile withF117(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF117(value)
            .build();
    }

    public int getF118() {
        return f118;
    }

    public boolean hasF118() {
        return (__bitField3 & 32768) == 32768;
    }

    public Profile withF118(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF118(value)
            .build();
    }

    public int getF119() {
        return f119;
    }

    public boolean hasF119() {
        return (__bitField3 & 65536) == 65536;
    }

    public Profile withF119(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF119(value)
            .build();
    }

    public int getF120() {
        return f120;
    }

    public boolean hasF120() {
        return (__bitField3 & 131072) == 131072;
    }

    public Profile withF120(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF120(value)
            .build();
    }

    public int getF121() {
        return f121;
    }

    public boolean hasF121() {
        return (__bitField3 & 262144) == 262144;
    }

    public Profile withF121(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF121(value)
            .build();
    }

    public int getF125() {
        return f125;
    }

    public boolean hasF125() {
        return (__bitField3 & 524288) == 524288;
    }

    public Profile withF125(int value) {
        return Profile.newBuilder()
            .mergeFrom(this)
            .setF125(value)
            .build();
    }



    @Override
    public io.protostuff.Schema<Profile> cachedSchema() {
        return Schema.INSTANCE;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Profile that = (Profile) obj;
        if (!java.util.Objects.equals(this.id, that.id)) {
            return false;
        }
        if (!java.util.Objects.equals(this.isConnectedToStrava, that.isConnectedToStrava)) {
            return false;
        }
        if (!java.util.Objects.equals(this.email, that.email)) {
            return false;
        }
        if (!java.util.Objects.equals(this.firstName, that.firstName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.lastName, that.lastName)) {
            return false;
        }
        if (!java.util.Objects.equals(this.isMale, that.isMale)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f7, that.f7)) {
            return false;
        }
        if (!java.util.Objects.equals(this.weightInGrams, that.weightInGrams)) {
            return false;
        }
        if (!java.util.Objects.equals(this.ftp, that.ftp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f11, that.f11)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f12, that.f12)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f13, that.f13)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f14, that.f14)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f15, that.f15)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f16, that.f16)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f17, that.f17)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f18, that.f18)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f19, that.f19)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f20, that.f20)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f21, that.f21)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f22, that.f22)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f23, that.f23)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f24, that.f24)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f25, that.f25)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f26, that.f26)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f27, that.f27)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f28, that.f28)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f29, that.f29)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f30, that.f30)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f31, that.f31)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f32, that.f32)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f33, that.f33)) {
            return false;
        }
        if (!java.util.Objects.equals(this.countryCode, that.countryCode)) {
            return false;
        }
        if (!java.util.Objects.equals(this.totalDistanceInMeters, that.totalDistanceInMeters)) {
            return false;
        }
        if (!java.util.Objects.equals(this.elevationGainInMeters, that.elevationGainInMeters)) {
            return false;
        }
        if (!java.util.Objects.equals(this.timeRiddenInMinutes, that.timeRiddenInMinutes)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f38, that.f38)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f39, that.f39)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f40, that.f40)) {
            return false;
        }
        if (!java.util.Objects.equals(this.totalWattHours, that.totalWattHours)) {
            return false;
        }
        if (!java.util.Objects.equals(this.heightInMillimeters, that.heightInMillimeters)) {
            return false;
        }
        if (!java.util.Objects.equals(this.dob, that.dob)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f44, that.f44)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f45, that.f45)) {
            return false;
        }
        if (!java.util.Objects.equals(this.totalXp, that.totalXp)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f47, that.f47)) {
            return false;
        }
        if (!java.util.Objects.equals(this.playerType, that.playerType)) {
            return false;
        }
        if (!java.util.Objects.equals(this.achievementLevel, that.achievementLevel)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f50, that.f50)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f51, that.f51)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f52, that.f52)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f53, that.f53)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f54, that.f54)) {
            return false;
        }
        if (!java.util.Objects.equals(this.age, that.age)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f56, that.f56)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f57, that.f57)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f58, that.f58)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f59, that.f59)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f60, that.f60)) {
            return false;
        }
        if (!java.util.Objects.equals(this.socialFacts, that.socialFacts)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f62, that.f62)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f63, that.f63)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f64, that.f64)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f65, that.f65)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f66, that.f66)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f67, that.f67)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f68, that.f68)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f69, that.f69)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f70, that.f70)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f71, that.f71)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f72, that.f72)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f73, that.f73)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f74, that.f74)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f75, that.f75)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f76, that.f76)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f77, that.f77)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f78, that.f78)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f79, that.f79)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f80, that.f80)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f81, that.f81)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f82, that.f82)) {
            return false;
        }
        if (!java.util.Objects.equals(this.mixPanelDistinctId, that.mixPanelDistinctId)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f84, that.f84)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f85, that.f85)) {
            return false;
        }
        if (!java.util.Objects.equals(this.sport, that.sport)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f87, that.f87)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f88, that.f88)) {
            return false;
        }
        if (!java.util.Objects.equals(this.preferredLanguage, that.preferredLanguage)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f90, that.f90)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f91, that.f91)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f92, that.f92)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f93, that.f93)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f94, that.f94)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f95, that.f95)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f96, that.f96)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f97, that.f97)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f98, that.f98)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f99, that.f99)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f100, that.f100)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f101, that.f101)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f102, that.f102)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f103, that.f103)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f104, that.f104)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f105, that.f105)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f106, that.f106)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f107, that.f107)) {
            return false;
        }
        if (!java.util.Objects.equals(this.launchedGameClient, that.launchedGameClient)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f109, that.f109)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f110, that.f110)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f114, that.f114)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f117, that.f117)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f118, that.f118)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f119, that.f119)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f120, that.f120)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f121, that.f121)) {
            return false;
        }
        if (!java.util.Objects.equals(this.f125, that.f125)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + Long.hashCode(this.id);
        result = 31 * result + Integer.hashCode(this.isConnectedToStrava);
        result = 31 * result + (this.email == null ? 0 : this.email.hashCode());
        result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
        result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
        result = 31 * result + Boolean.hashCode(this.isMale);
        result = 31 * result + (this.f7 == null ? 0 : this.f7.hashCode());
        result = 31 * result + Integer.hashCode(this.weightInGrams);
        result = 31 * result + Integer.hashCode(this.ftp);
        result = 31 * result + Integer.hashCode(this.f11);
        result = 31 * result + Integer.hashCode(this.f12);
        result = 31 * result + Integer.hashCode(this.f13);
        result = 31 * result + Integer.hashCode(this.f14);
        result = 31 * result + Integer.hashCode(this.f15);
        result = 31 * result + Integer.hashCode(this.f16);
        result = 31 * result + Integer.hashCode(this.f17);
        result = 31 * result + Integer.hashCode(this.f18);
        result = 31 * result + Integer.hashCode(this.f19);
        result = 31 * result + Integer.hashCode(this.f20);
        result = 31 * result + Integer.hashCode(this.f21);
        result = 31 * result + Integer.hashCode(this.f22);
        result = 31 * result + Integer.hashCode(this.f23);
        result = 31 * result + Integer.hashCode(this.f24);
        result = 31 * result + Integer.hashCode(this.f25);
        result = 31 * result + Integer.hashCode(this.f26);
        result = 31 * result + Long.hashCode(this.f27);
        result = 31 * result + Long.hashCode(this.f28);
        result = 31 * result + Long.hashCode(this.f29);
        result = 31 * result + Long.hashCode(this.f30);
        result = 31 * result + Long.hashCode(this.f31);
        result = 31 * result + Long.hashCode(this.f32);
        result = 31 * result + (this.f33 == null ? 0 : this.f33.hashCode());
        result = 31 * result + Integer.hashCode(this.countryCode);
        result = 31 * result + Integer.hashCode(this.totalDistanceInMeters);
        result = 31 * result + Integer.hashCode(this.elevationGainInMeters);
        result = 31 * result + Integer.hashCode(this.timeRiddenInMinutes);
        result = 31 * result + Integer.hashCode(this.f38);
        result = 31 * result + Integer.hashCode(this.f39);
        result = 31 * result + Integer.hashCode(this.f40);
        result = 31 * result + Integer.hashCode(this.totalWattHours);
        result = 31 * result + Integer.hashCode(this.heightInMillimeters);
        result = 31 * result + (this.dob == null ? 0 : this.dob.hashCode());
        result = 31 * result + Integer.hashCode(this.f44);
        result = 31 * result + Boolean.hashCode(this.f45);
        result = 31 * result + Integer.hashCode(this.totalXp);
        result = 31 * result + Integer.hashCode(this.f47);
        result = 31 * result + Integer.hashCode(this.playerType);
        result = 31 * result + Integer.hashCode(this.achievementLevel);
        result = 31 * result + Boolean.hashCode(this.f50);
        result = 31 * result + Boolean.hashCode(this.f51);
        result = 31 * result + Integer.hashCode(this.f52);
        result = 31 * result + Integer.hashCode(this.f53);
        result = 31 * result + Integer.hashCode(this.f54);
        result = 31 * result + Integer.hashCode(this.age);
        result = 31 * result + Integer.hashCode(this.f56);
        result = 31 * result + Integer.hashCode(this.f57);
        result = 31 * result + (this.f58 == null ? 0 : this.f58.hashCode());
        result = 31 * result + Long.hashCode(this.f59);
        result = 31 * result + (this.f60 == null ? 0 : this.f60.hashCode());
        result = 31 * result + (this.socialFacts == null ? 0 : this.socialFacts.hashCode());
        result = 31 * result + Integer.hashCode(this.f62);
        result = 31 * result + Boolean.hashCode(this.f63);
        result = 31 * result + Boolean.hashCode(this.f64);
        result = 31 * result + Integer.hashCode(this.f65);
        result = 31 * result + (this.f66 == null ? 0 : this.f66.hashCode());
        result = 31 * result + Integer.hashCode(this.f67);
        result = 31 * result + Integer.hashCode(this.f68);
        result = 31 * result + Integer.hashCode(this.f69);
        result = 31 * result + Integer.hashCode(this.f70);
        result = 31 * result + Integer.hashCode(this.f71);
        result = 31 * result + Integer.hashCode(this.f72);
        result = 31 * result + Integer.hashCode(this.f73);
        result = 31 * result + Integer.hashCode(this.f74);
        result = 31 * result + Integer.hashCode(this.f75);
        result = 31 * result + Integer.hashCode(this.f76);
        result = 31 * result + Integer.hashCode(this.f77);
        result = 31 * result + Integer.hashCode(this.f78);
        result = 31 * result + Integer.hashCode(this.f79);
        result = 31 * result + Integer.hashCode(this.f80);
        result = 31 * result + Integer.hashCode(this.f81);
        result = 31 * result + (this.f82 == null ? 0 : this.f82.hashCode());
        result = 31 * result + (this.mixPanelDistinctId == null ? 0 : this.mixPanelDistinctId.hashCode());
        result = 31 * result + Integer.hashCode(this.f84);
        result = 31 * result + Integer.hashCode(this.f85);
        result = 31 * result + Integer.hashCode(this.sport);
        result = 31 * result + Integer.hashCode(this.f87);
        result = 31 * result + Boolean.hashCode(this.f88);
        result = 31 * result + (this.preferredLanguage == null ? 0 : this.preferredLanguage.hashCode());
        result = 31 * result + Integer.hashCode(this.f90);
        result = 31 * result + Integer.hashCode(this.f91);
        result = 31 * result + Integer.hashCode(this.f92);
        result = 31 * result + Integer.hashCode(this.f93);
        result = 31 * result + Integer.hashCode(this.f94);
        result = 31 * result + Integer.hashCode(this.f95);
        result = 31 * result + Integer.hashCode(this.f96);
        result = 31 * result + Integer.hashCode(this.f97);
        result = 31 * result + Integer.hashCode(this.f98);
        result = 31 * result + Integer.hashCode(this.f99);
        result = 31 * result + Integer.hashCode(this.f100);
        result = 31 * result + Integer.hashCode(this.f101);
        result = 31 * result + Integer.hashCode(this.f102);
        result = 31 * result + Integer.hashCode(this.f103);
        result = 31 * result + Integer.hashCode(this.f104);
        result = 31 * result + Boolean.hashCode(this.f105);
        result = 31 * result + Boolean.hashCode(this.f106);
        result = 31 * result + (this.f107 == null ? 0 : this.f107.hashCode());
        result = 31 * result + (this.launchedGameClient == null ? 0 : this.launchedGameClient.hashCode());
        result = 31 * result + Long.hashCode(this.f109);
        result = 31 * result + Boolean.hashCode(this.f110);
        result = 31 * result + (this.f114 == null ? 0 : this.f114.hashCode());
        result = 31 * result + Integer.hashCode(this.f117);
        result = 31 * result + Integer.hashCode(this.f118);
        result = 31 * result + Integer.hashCode(this.f119);
        result = 31 * result + Integer.hashCode(this.f120);
        result = 31 * result + Integer.hashCode(this.f121);
        result = 31 * result + Integer.hashCode(this.f125);

        return result;
    }

    @Override
    public String toString() {
        java.util.List<String> parts = new java.util.ArrayList<>();
        if (hasId()) {
            parts.add("id=" + getId());
        }
        if (hasIsConnectedToStrava()) {
            parts.add("isConnectedToStrava=" + getIsConnectedToStrava());
        }
        if (hasEmail()) {
            parts.add("email=" + getEmail());
        }
        if (hasFirstName()) {
            parts.add("firstName=" + getFirstName());
        }
        if (hasLastName()) {
            parts.add("lastName=" + getLastName());
        }
        if (hasIsMale()) {
            parts.add("isMale=" + getIsMale());
        }
        if (hasF7()) {
            parts.add("f7=" + getF7());
        }
        if (hasWeightInGrams()) {
            parts.add("weightInGrams=" + getWeightInGrams());
        }
        if (hasFtp()) {
            parts.add("ftp=" + getFtp());
        }
        if (hasF11()) {
            parts.add("f11=" + getF11());
        }
        if (hasF12()) {
            parts.add("f12=" + getF12());
        }
        if (hasF13()) {
            parts.add("f13=" + getF13());
        }
        if (hasF14()) {
            parts.add("f14=" + getF14());
        }
        if (hasF15()) {
            parts.add("f15=" + getF15());
        }
        if (hasF16()) {
            parts.add("f16=" + getF16());
        }
        if (hasF17()) {
            parts.add("f17=" + getF17());
        }
        if (hasF18()) {
            parts.add("f18=" + getF18());
        }
        if (hasF19()) {
            parts.add("f19=" + getF19());
        }
        if (hasF20()) {
            parts.add("f20=" + getF20());
        }
        if (hasF21()) {
            parts.add("f21=" + getF21());
        }
        if (hasF22()) {
            parts.add("f22=" + getF22());
        }
        if (hasF23()) {
            parts.add("f23=" + getF23());
        }
        if (hasF24()) {
            parts.add("f24=" + getF24());
        }
        if (hasF25()) {
            parts.add("f25=" + getF25());
        }
        if (hasF26()) {
            parts.add("f26=" + getF26());
        }
        if (hasF27()) {
            parts.add("f27=" + getF27());
        }
        if (hasF28()) {
            parts.add("f28=" + getF28());
        }
        if (hasF29()) {
            parts.add("f29=" + getF29());
        }
        if (hasF30()) {
            parts.add("f30=" + getF30());
        }
        if (hasF31()) {
            parts.add("f31=" + getF31());
        }
        if (hasF32()) {
            parts.add("f32=" + getF32());
        }
        if (hasF33()) {
            parts.add("f33=" + getF33());
        }
        if (hasCountryCode()) {
            parts.add("countryCode=" + getCountryCode());
        }
        if (hasTotalDistanceInMeters()) {
            parts.add("totalDistanceInMeters=" + getTotalDistanceInMeters());
        }
        if (hasElevationGainInMeters()) {
            parts.add("elevationGainInMeters=" + getElevationGainInMeters());
        }
        if (hasTimeRiddenInMinutes()) {
            parts.add("timeRiddenInMinutes=" + getTimeRiddenInMinutes());
        }
        if (hasF38()) {
            parts.add("f38=" + getF38());
        }
        if (hasF39()) {
            parts.add("f39=" + getF39());
        }
        if (hasF40()) {
            parts.add("f40=" + getF40());
        }
        if (hasTotalWattHours()) {
            parts.add("totalWattHours=" + getTotalWattHours());
        }
        if (hasHeightInMillimeters()) {
            parts.add("heightInMillimeters=" + getHeightInMillimeters());
        }
        if (hasDob()) {
            parts.add("dob=" + getDob());
        }
        if (hasF44()) {
            parts.add("f44=" + getF44());
        }
        if (hasF45()) {
            parts.add("f45=" + getF45());
        }
        if (hasTotalXp()) {
            parts.add("totalXp=" + getTotalXp());
        }
        if (hasF47()) {
            parts.add("f47=" + getF47());
        }
        if (hasPlayerType()) {
            parts.add("playerType=" + getPlayerType() + '(' + getPlayerTypeValue() + ')');
        }
        if (hasAchievementLevel()) {
            parts.add("achievementLevel=" + getAchievementLevel());
        }
        if (hasF50()) {
            parts.add("f50=" + getF50());
        }
        if (hasF51()) {
            parts.add("f51=" + getF51());
        }
        if (hasF52()) {
            parts.add("f52=" + getF52());
        }
        if (hasF53()) {
            parts.add("f53=" + getF53());
        }
        if (hasF54()) {
            parts.add("f54=" + getF54());
        }
        if (hasAge()) {
            parts.add("age=" + getAge());
        }
        if (hasF56()) {
            parts.add("f56=" + getF56());
        }
        if (hasF57()) {
            parts.add("f57=" + getF57());
        }
        if (hasF58()) {
            parts.add("f58=" + getF58());
        }
        if (hasF59()) {
            parts.add("f59=" + getF59());
        }
        if (!f60.isEmpty()) {
            parts.add("f60=" + getF60List());
        }
        if (hasSocialFacts()) {
            parts.add("socialFacts=" + getSocialFacts());
        }
        if (hasF62()) {
            parts.add("f62=" + getF62() + '(' + getF62Value() + ')');
        }
        if (hasF63()) {
            parts.add("f63=" + getF63());
        }
        if (hasF64()) {
            parts.add("f64=" + getF64());
        }
        if (hasF65()) {
            parts.add("f65=" + getF65() + '(' + getF65Value() + ')');
        }
        if (hasF66()) {
            parts.add("f66=" + getF66());
        }
        if (hasF67()) {
            parts.add("f67=" + getF67());
        }
        if (hasF68()) {
            parts.add("f68=" + getF68());
        }
        if (hasF69()) {
            parts.add("f69=" + getF69());
        }
        if (hasF70()) {
            parts.add("f70=" + getF70());
        }
        if (hasF71()) {
            parts.add("f71=" + getF71());
        }
        if (hasF72()) {
            parts.add("f72=" + getF72());
        }
        if (hasF73()) {
            parts.add("f73=" + getF73());
        }
        if (hasF74()) {
            parts.add("f74=" + getF74());
        }
        if (hasF75()) {
            parts.add("f75=" + getF75());
        }
        if (hasF76()) {
            parts.add("f76=" + getF76());
        }
        if (hasF77()) {
            parts.add("f77=" + getF77());
        }
        if (hasF78()) {
            parts.add("f78=" + getF78());
        }
        if (hasF79()) {
            parts.add("f79=" + getF79());
        }
        if (hasF80()) {
            parts.add("f80=" + getF80());
        }
        if (hasF81()) {
            parts.add("f81=" + getF81());
        }
        if (hasF82()) {
            parts.add("f82=" + getF82());
        }
        if (hasMixPanelDistinctId()) {
            parts.add("mixPanelDistinctId=" + getMixPanelDistinctId());
        }
        if (hasF84()) {
            parts.add("f84=" + getF84());
        }
        if (hasF85()) {
            parts.add("f85=" + getF85());
        }
        if (hasSport()) {
            parts.add("sport=" + getSport() + '(' + getSportValue() + ')');
        }
        if (hasF87()) {
            parts.add("f87=" + getF87());
        }
        if (hasF88()) {
            parts.add("f88=" + getF88());
        }
        if (hasPreferredLanguage()) {
            parts.add("preferredLanguage=" + getPreferredLanguage());
        }
        if (hasF90()) {
            parts.add("f90=" + getF90());
        }
        if (hasF91()) {
            parts.add("f91=" + getF91());
        }
        if (hasF92()) {
            parts.add("f92=" + getF92());
        }
        if (hasF93()) {
            parts.add("f93=" + getF93());
        }
        if (hasF94()) {
            parts.add("f94=" + getF94());
        }
        if (hasF95()) {
            parts.add("f95=" + getF95());
        }
        if (hasF96()) {
            parts.add("f96=" + getF96());
        }
        if (hasF97()) {
            parts.add("f97=" + getF97());
        }
        if (hasF98()) {
            parts.add("f98=" + getF98());
        }
        if (hasF99()) {
            parts.add("f99=" + getF99());
        }
        if (hasF100()) {
            parts.add("f100=" + getF100());
        }
        if (hasF101()) {
            parts.add("f101=" + getF101());
        }
        if (hasF102()) {
            parts.add("f102=" + getF102());
        }
        if (hasF103()) {
            parts.add("f103=" + getF103());
        }
        if (hasF104()) {
            parts.add("f104=" + getF104());
        }
        if (hasF105()) {
            parts.add("f105=" + getF105());
        }
        if (hasF106()) {
            parts.add("f106=" + getF106());
        }
        if (!f107.isEmpty()) {
            parts.add("f107=" + getF107List());
        }
        if (hasLaunchedGameClient()) {
            parts.add("launchedGameClient=" + getLaunchedGameClient());
        }
        if (hasF109()) {
            parts.add("f109=" + getF109());
        }
        if (hasF110()) {
            parts.add("f110=" + getF110());
        }
        if (!f114.isEmpty()) {
            parts.add("f114=" + getF114List());
        }
        if (hasF117()) {
            parts.add("f117=" + getF117());
        }
        if (hasF118()) {
            parts.add("f118=" + getF118());
        }
        if (hasF119()) {
            parts.add("f119=" + getF119());
        }
        if (hasF120()) {
            parts.add("f120=" + getF120());
        }
        if (hasF121()) {
            parts.add("f121=" + getF121());
        }
        if (hasF125()) {
            parts.add("f125=" + getF125());
        }
        return "Profile{" + String.join(", ", parts) + "}";
    }

    public static final class Schema implements io.protostuff.Schema<Profile>{

        private static final Schema INSTANCE = new Schema();

        private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

        static {
        	__fieldMap.put("id", 1);
        	__fieldMap.put("isConnectedToStrava", 2);
        	__fieldMap.put("email", 3);
        	__fieldMap.put("firstName", 4);
        	__fieldMap.put("lastName", 5);
        	__fieldMap.put("isMale", 6);
        	__fieldMap.put("f7", 7);
        	__fieldMap.put("weightInGrams", 9);
        	__fieldMap.put("ftp", 10);
        	__fieldMap.put("f11", 11);
        	__fieldMap.put("f12", 12);
        	__fieldMap.put("f13", 13);
        	__fieldMap.put("f14", 14);
        	__fieldMap.put("f15", 15);
        	__fieldMap.put("f16", 16);
        	__fieldMap.put("f17", 17);
        	__fieldMap.put("f18", 18);
        	__fieldMap.put("f19", 19);
        	__fieldMap.put("f20", 20);
        	__fieldMap.put("f21", 21);
        	__fieldMap.put("f22", 22);
        	__fieldMap.put("f23", 23);
        	__fieldMap.put("f24", 24);
        	__fieldMap.put("f25", 25);
        	__fieldMap.put("f26", 26);
        	__fieldMap.put("f27", 27);
        	__fieldMap.put("f28", 28);
        	__fieldMap.put("f29", 29);
        	__fieldMap.put("f30", 30);
        	__fieldMap.put("f31", 31);
        	__fieldMap.put("f32", 32);
        	__fieldMap.put("f33", 33);
        	__fieldMap.put("countryCode", 34);
        	__fieldMap.put("totalDistanceInMeters", 35);
        	__fieldMap.put("elevationGainInMeters", 36);
        	__fieldMap.put("timeRiddenInMinutes", 37);
        	__fieldMap.put("f38", 38);
        	__fieldMap.put("f39", 39);
        	__fieldMap.put("f40", 40);
        	__fieldMap.put("totalWattHours", 41);
        	__fieldMap.put("heightInMillimeters", 42);
        	__fieldMap.put("dob", 43);
        	__fieldMap.put("f44", 44);
        	__fieldMap.put("f45", 45);
        	__fieldMap.put("totalXp", 46);
        	__fieldMap.put("f47", 47);
        	__fieldMap.put("playerType", 48);
        	__fieldMap.put("achievementLevel", 49);
        	__fieldMap.put("f50", 50);
        	__fieldMap.put("f51", 51);
        	__fieldMap.put("f52", 52);
        	__fieldMap.put("f53", 53);
        	__fieldMap.put("f54", 54);
        	__fieldMap.put("age", 55);
        	__fieldMap.put("f56", 56);
        	__fieldMap.put("f57", 57);
        	__fieldMap.put("f58", 58);
        	__fieldMap.put("f59", 59);
        	__fieldMap.put("f60", 60);
        	__fieldMap.put("socialFacts", 61);
        	__fieldMap.put("f62", 62);
        	__fieldMap.put("f63", 63);
        	__fieldMap.put("f64", 64);
        	__fieldMap.put("f65", 65);
        	__fieldMap.put("f66", 66);
        	__fieldMap.put("f67", 67);
        	__fieldMap.put("f68", 68);
        	__fieldMap.put("f69", 69);
        	__fieldMap.put("f70", 70);
        	__fieldMap.put("f71", 71);
        	__fieldMap.put("f72", 72);
        	__fieldMap.put("f73", 73);
        	__fieldMap.put("f74", 74);
        	__fieldMap.put("f75", 75);
        	__fieldMap.put("f76", 76);
        	__fieldMap.put("f77", 77);
        	__fieldMap.put("f78", 78);
        	__fieldMap.put("f79", 79);
        	__fieldMap.put("f80", 80);
        	__fieldMap.put("f81", 81);
        	__fieldMap.put("f82", 82);
        	__fieldMap.put("mixPanelDistinctId", 83);
        	__fieldMap.put("f84", 84);
        	__fieldMap.put("f85", 85);
        	__fieldMap.put("sport", 86);
        	__fieldMap.put("f87", 87);
        	__fieldMap.put("f88", 88);
        	__fieldMap.put("preferredLanguage", 89);
        	__fieldMap.put("f90", 90);
        	__fieldMap.put("f91", 91);
        	__fieldMap.put("f92", 92);
        	__fieldMap.put("f93", 93);
        	__fieldMap.put("f94", 94);
        	__fieldMap.put("f95", 95);
        	__fieldMap.put("f96", 96);
        	__fieldMap.put("f97", 97);
        	__fieldMap.put("f98", 98);
        	__fieldMap.put("f99", 99);
        	__fieldMap.put("f100", 100);
        	__fieldMap.put("f101", 101);
        	__fieldMap.put("f102", 102);
        	__fieldMap.put("f103", 103);
        	__fieldMap.put("f104", 104);
        	__fieldMap.put("f105", 105);
        	__fieldMap.put("f106", 106);
        	__fieldMap.put("f107", 107);
        	__fieldMap.put("launchedGameClient", 108);
        	__fieldMap.put("f109", 109);
        	__fieldMap.put("f110", 110);
        	__fieldMap.put("f114", 114);
        	__fieldMap.put("f117", 117);
        	__fieldMap.put("f118", 118);
        	__fieldMap.put("f119", 119);
        	__fieldMap.put("f120", 120);
        	__fieldMap.put("f121", 121);
        	__fieldMap.put("f125", 125);
        }

        @Override
        public Profile newMessage() {
            return new Profile();
        }

        @Override
        public Class<Profile> typeClass() {
            return Profile.class;
        }

        @Override
        public String messageName() {
            return Profile.class.getSimpleName();
        }

        @Override
        public String messageFullName() {
            return Profile.class.getName();
        }

        @Override
        @Deprecated
        public boolean isInitialized(Profile message) {
            return true;
        }

        @Override
        public void mergeFrom(io.protostuff.Input input, Profile instance) throws java.io.IOException {
        	if (instance.__merge_lock) {
        		throw new IllegalStateException("Cannot reuse message instance");
        	} else {
        		instance.__merge_lock = true;
        	}
        	while(true) {
        		int number = input.readFieldNumber(this);
                if (number == 0) {
                    break;
                }
                switch(number) {
                    case 1:
                    	instance.id = input.readInt64();
                    	instance.__bitField0 |= 1;
                    	break;
                    case 2:
                    	instance.isConnectedToStrava = input.readInt32();
                    	instance.__bitField0 |= 2;
                    	break;
                    case 3:
                    	instance.email = input.readString();
                    	instance.__bitField0 |= 4;
                    	break;
                    case 4:
                    	instance.firstName = input.readString();
                    	instance.__bitField0 |= 8;
                    	break;
                    case 5:
                    	instance.lastName = input.readString();
                    	instance.__bitField0 |= 16;
                    	break;
                    case 6:
                    	instance.isMale = input.readBool();
                    	instance.__bitField0 |= 32;
                    	break;
                    case 7:
                    	instance.f7 = input.readBytes();
                    	instance.__bitField0 |= 64;
                    	break;
                    case 9:
                    	instance.weightInGrams = input.readUInt32();
                    	instance.__bitField0 |= 128;
                    	break;
                    case 10:
                    	instance.ftp = input.readUInt32();
                    	instance.__bitField0 |= 256;
                    	break;
                    case 11:
                    	instance.f11 = input.readUInt32();
                    	instance.__bitField0 |= 512;
                    	break;
                    case 12:
                    	instance.f12 = input.readUInt32();
                    	instance.__bitField0 |= 1024;
                    	break;
                    case 13:
                    	instance.f13 = input.readUInt32();
                    	instance.__bitField0 |= 2048;
                    	break;
                    case 14:
                    	instance.f14 = input.readUInt32();
                    	instance.__bitField0 |= 4096;
                    	break;
                    case 15:
                    	instance.f15 = input.readUInt32();
                    	instance.__bitField0 |= 8192;
                    	break;
                    case 16:
                    	instance.f16 = input.readUInt32();
                    	instance.__bitField0 |= 16384;
                    	break;
                    case 17:
                    	instance.f17 = input.readUInt32();
                    	instance.__bitField0 |= 32768;
                    	break;
                    case 18:
                    	instance.f18 = input.readUInt32();
                    	instance.__bitField0 |= 65536;
                    	break;
                    case 19:
                    	instance.f19 = input.readUInt32();
                    	instance.__bitField0 |= 131072;
                    	break;
                    case 20:
                    	instance.f20 = input.readFixed32();
                    	instance.__bitField0 |= 262144;
                    	break;
                    case 21:
                    	instance.f21 = input.readFixed32();
                    	instance.__bitField0 |= 524288;
                    	break;
                    case 22:
                    	instance.f22 = input.readFixed32();
                    	instance.__bitField0 |= 1048576;
                    	break;
                    case 23:
                    	instance.f23 = input.readFixed32();
                    	instance.__bitField0 |= 2097152;
                    	break;
                    case 24:
                    	instance.f24 = input.readFixed32();
                    	instance.__bitField0 |= 4194304;
                    	break;
                    case 25:
                    	instance.f25 = input.readFixed32();
                    	instance.__bitField0 |= 8388608;
                    	break;
                    case 26:
                    	instance.f26 = input.readFixed32();
                    	instance.__bitField0 |= 16777216;
                    	break;
                    case 27:
                    	instance.f27 = input.readFixed64();
                    	instance.__bitField0 |= 33554432;
                    	break;
                    case 28:
                    	instance.f28 = input.readFixed64();
                    	instance.__bitField0 |= 67108864;
                    	break;
                    case 29:
                    	instance.f29 = input.readFixed64();
                    	instance.__bitField0 |= 134217728;
                    	break;
                    case 30:
                    	instance.f30 = input.readFixed64();
                    	instance.__bitField0 |= 268435456;
                    	break;
                    case 31:
                    	instance.f31 = input.readFixed64();
                    	instance.__bitField0 |= 536870912;
                    	break;
                    case 32:
                    	instance.f32 = input.readFixed64();
                    	instance.__bitField0 |= 1073741824;
                    	break;
                    case 33:
                    	instance.f33 = input.readBytes();
                    	instance.__bitField0 |= -2147483648;
                    	break;
                    case 34:
                    	instance.countryCode = input.readUInt32();
                    	instance.__bitField1 |= 1;
                    	break;
                    case 35:
                    	instance.totalDistanceInMeters = input.readUInt32();
                    	instance.__bitField1 |= 2;
                    	break;
                    case 36:
                    	instance.elevationGainInMeters = input.readUInt32();
                    	instance.__bitField1 |= 4;
                    	break;
                    case 37:
                    	instance.timeRiddenInMinutes = input.readUInt32();
                    	instance.__bitField1 |= 8;
                    	break;
                    case 38:
                    	instance.f38 = input.readUInt32();
                    	instance.__bitField1 |= 16;
                    	break;
                    case 39:
                    	instance.f39 = input.readUInt32();
                    	instance.__bitField1 |= 32;
                    	break;
                    case 40:
                    	instance.f40 = input.readUInt32();
                    	instance.__bitField1 |= 64;
                    	break;
                    case 41:
                    	instance.totalWattHours = input.readUInt32();
                    	instance.__bitField1 |= 128;
                    	break;
                    case 42:
                    	instance.heightInMillimeters = input.readUInt32();
                    	instance.__bitField1 |= 256;
                    	break;
                    case 43:
                    	instance.dob = input.readString();
                    	instance.__bitField1 |= 512;
                    	break;
                    case 44:
                    	instance.f44 = input.readUInt32();
                    	instance.__bitField1 |= 1024;
                    	break;
                    case 45:
                    	instance.f45 = input.readBool();
                    	instance.__bitField1 |= 2048;
                    	break;
                    case 46:
                    	instance.totalXp = input.readUInt32();
                    	instance.__bitField1 |= 4096;
                    	break;
                    case 47:
                    	instance.f47 = input.readUInt32();
                    	instance.__bitField1 |= 8192;
                    	break;
                    case 48:
                    	instance.playerType = input.readEnum();
                    	instance.__bitField1 |= 16384;
                    	break;
                    case 49:
                    	instance.achievementLevel = input.readUInt32();
                    	instance.__bitField1 |= 32768;
                    	break;
                    case 50:
                    	instance.f50 = input.readBool();
                    	instance.__bitField1 |= 65536;
                    	break;
                    case 51:
                    	instance.f51 = input.readBool();
                    	instance.__bitField1 |= 131072;
                    	break;
                    case 52:
                    	instance.f52 = input.readUInt32();
                    	instance.__bitField1 |= 262144;
                    	break;
                    case 53:
                    	instance.f53 = input.readUInt32();
                    	instance.__bitField1 |= 524288;
                    	break;
                    case 54:
                    	instance.f54 = input.readUInt32();
                    	instance.__bitField1 |= 1048576;
                    	break;
                    case 55:
                    	instance.age = input.readUInt32();
                    	instance.__bitField1 |= 2097152;
                    	break;
                    case 56:
                    	instance.f56 = input.readFixed32();
                    	instance.__bitField1 |= 4194304;
                    	break;
                    case 57:
                    	instance.f57 = input.readUInt32();
                    	instance.__bitField1 |= 8388608;
                    	break;
                    case 58:
                    	instance.f58 = input.readBytes();
                    	instance.__bitField1 |= 16777216;
                    	break;
                    case 59:
                    	instance.f59 = input.readFixed64();
                    	instance.__bitField1 |= 33554432;
                    	break;
                    case 60:
                    	if(!((instance.__bitField1 & 67108864) == 67108864)) {
                    	    instance.f60 = new java.util.ArrayList<>();
                    	    instance.__bitField1 |= 67108864;
                    	}
                    	instance.f60.add(input.readBytes());

                    	break;
                    case 61:
                    	instance.socialFacts = input.mergeObject(null, org.zwiftj.api.model.Profile.ProfileSocialFacts.getSchema());
                    	instance.__bitField1 |= 134217728;
                    	break;
                    case 62:
                    	instance.f62 = input.readEnum();
                    	instance.__bitField1 |= 268435456;
                    	break;
                    case 63:
                    	instance.f63 = input.readBool();
                    	instance.__bitField1 |= 536870912;
                    	break;
                    case 64:
                    	instance.f64 = input.readBool();
                    	instance.__bitField1 |= 1073741824;
                    	break;
                    case 65:
                    	instance.f65 = input.readEnum();
                    	instance.__bitField1 |= -2147483648;
                    	break;
                    case 66:
                    	instance.f66 = input.readBytes();
                    	instance.__bitField2 |= 1;
                    	break;
                    case 67:
                    	instance.f67 = input.readUInt32();
                    	instance.__bitField2 |= 2;
                    	break;
                    case 68:
                    	instance.f68 = input.readFixed32();
                    	instance.__bitField2 |= 4;
                    	break;
                    case 69:
                    	instance.f69 = input.readFixed32();
                    	instance.__bitField2 |= 8;
                    	break;
                    case 70:
                    	instance.f70 = input.readFixed32();
                    	instance.__bitField2 |= 16;
                    	break;
                    case 71:
                    	instance.f71 = input.readFixed32();
                    	instance.__bitField2 |= 32;
                    	break;
                    case 72:
                    	instance.f72 = input.readFixed32();
                    	instance.__bitField2 |= 64;
                    	break;
                    case 73:
                    	instance.f73 = input.readFixed32();
                    	instance.__bitField2 |= 128;
                    	break;
                    case 74:
                    	instance.f74 = input.readUInt32();
                    	instance.__bitField2 |= 256;
                    	break;
                    case 75:
                    	instance.f75 = input.readUInt32();
                    	instance.__bitField2 |= 512;
                    	break;
                    case 76:
                    	instance.f76 = input.readFixed32();
                    	instance.__bitField2 |= 1024;
                    	break;
                    case 77:
                    	instance.f77 = input.readFixed32();
                    	instance.__bitField2 |= 2048;
                    	break;
                    case 78:
                    	instance.f78 = input.readFixed32();
                    	instance.__bitField2 |= 4096;
                    	break;
                    case 79:
                    	instance.f79 = input.readFixed32();
                    	instance.__bitField2 |= 8192;
                    	break;
                    case 80:
                    	instance.f80 = input.readUInt32();
                    	instance.__bitField2 |= 16384;
                    	break;
                    case 81:
                    	instance.f81 = input.readUInt32();
                    	instance.__bitField2 |= 32768;
                    	break;
                    case 82:
                    	instance.f82 = input.mergeObject(null, org.zwiftj.api.model.Subscription.getSchema());
                    	instance.__bitField2 |= 65536;
                    	break;
                    case 83:
                    	instance.mixPanelDistinctId = input.readString();
                    	instance.__bitField2 |= 131072;
                    	break;
                    case 84:
                    	instance.f84 = input.readUInt32();
                    	instance.__bitField2 |= 262144;
                    	break;
                    case 85:
                    	instance.f85 = input.readUInt32();
                    	instance.__bitField2 |= 524288;
                    	break;
                    case 86:
                    	instance.sport = input.readEnum();
                    	instance.__bitField2 |= 1048576;
                    	break;
                    case 87:
                    	instance.f87 = input.readUInt32();
                    	instance.__bitField2 |= 2097152;
                    	break;
                    case 88:
                    	instance.f88 = input.readBool();
                    	instance.__bitField2 |= 4194304;
                    	break;
                    case 89:
                    	instance.preferredLanguage = input.readString();
                    	instance.__bitField2 |= 8388608;
                    	break;
                    case 90:
                    	instance.f90 = input.readUInt32();
                    	instance.__bitField2 |= 16777216;
                    	break;
                    case 91:
                    	instance.f91 = input.readUInt32();
                    	instance.__bitField2 |= 33554432;
                    	break;
                    case 92:
                    	instance.f92 = input.readUInt32();
                    	instance.__bitField2 |= 67108864;
                    	break;
                    case 93:
                    	instance.f93 = input.readUInt32();
                    	instance.__bitField2 |= 134217728;
                    	break;
                    case 94:
                    	instance.f94 = input.readUInt32();
                    	instance.__bitField2 |= 268435456;
                    	break;
                    case 95:
                    	instance.f95 = input.readUInt32();
                    	instance.__bitField2 |= 536870912;
                    	break;
                    case 96:
                    	instance.f96 = input.readUInt32();
                    	instance.__bitField2 |= 1073741824;
                    	break;
                    case 97:
                    	instance.f97 = input.readUInt32();
                    	instance.__bitField2 |= -2147483648;
                    	break;
                    case 98:
                    	instance.f98 = input.readUInt32();
                    	instance.__bitField3 |= 1;
                    	break;
                    case 99:
                    	instance.f99 = input.readUInt32();
                    	instance.__bitField3 |= 2;
                    	break;
                    case 100:
                    	instance.f100 = input.readUInt32();
                    	instance.__bitField3 |= 4;
                    	break;
                    case 101:
                    	instance.f101 = input.readUInt32();
                    	instance.__bitField3 |= 8;
                    	break;
                    case 102:
                    	instance.f102 = input.readUInt32();
                    	instance.__bitField3 |= 16;
                    	break;
                    case 103:
                    	instance.f103 = input.readUInt32();
                    	instance.__bitField3 |= 32;
                    	break;
                    case 104:
                    	instance.f104 = input.readUInt32();
                    	instance.__bitField3 |= 64;
                    	break;
                    case 105:
                    	instance.f105 = input.readBool();
                    	instance.__bitField3 |= 128;
                    	break;
                    case 106:
                    	instance.f106 = input.readBool();
                    	instance.__bitField3 |= 256;
                    	break;
                    case 107:
                    	if(!((instance.__bitField3 & 512) == 512)) {
                    	    instance.f107 = new java.util.ArrayList<>();
                    	    instance.__bitField3 |= 512;
                    	}
                    	instance.f107.add(input.readBytes());

                    	break;
                    case 108:
                    	instance.launchedGameClient = input.readString();
                    	instance.__bitField3 |= 1024;
                    	break;
                    case 109:
                    	instance.f109 = input.readInt64();
                    	instance.__bitField3 |= 2048;
                    	break;
                    case 110:
                    	instance.f110 = input.readBool();
                    	instance.__bitField3 |= 4096;
                    	break;
                    case 114:
                    	if(!((instance.__bitField3 & 8192) == 8192)) {
                    	    instance.f114 = new java.util.ArrayList<>();
                    	    instance.__bitField3 |= 8192;
                    	}
                    	instance.f114.add(input.mergeObject(null, org.zwiftj.api.model.PacerSetting.getSchema()));

                    	break;
                    case 117:
                    	instance.f117 = input.readInt32();
                    	instance.__bitField3 |= 16384;
                    	break;
                    case 118:
                    	instance.f118 = input.readInt32();
                    	instance.__bitField3 |= 32768;
                    	break;
                    case 119:
                    	instance.f119 = input.readInt32();
                    	instance.__bitField3 |= 65536;
                    	break;
                    case 120:
                    	instance.f120 = input.readInt32();
                    	instance.__bitField3 |= 131072;
                    	break;
                    case 121:
                    	instance.f121 = input.readInt32();
                    	instance.__bitField3 |= 262144;
                    	break;
                    case 125:
                    	instance.f125 = input.readInt32();
                    	instance.__bitField3 |= 524288;
                    	break;
                    default:
                        input.handleUnknownField(number, this);
                }
        	}
            if((instance.__bitField1 & 67108864) == 67108864) {
                instance.f60 = java.util.Collections.unmodifiableList(instance.f60);
            }















































            if((instance.__bitField3 & 512) == 512) {
                instance.f107 = java.util.Collections.unmodifiableList(instance.f107);
            }




            if((instance.__bitField3 & 8192) == 8192) {
                instance.f114 = java.util.Collections.unmodifiableList(instance.f114);
            }







        }

        @Override
        public void writeTo(io.protostuff.Output output, Profile instance) throws java.io.IOException {
            if((instance.__bitField0 & 1) == 1) {
                output.writeInt64(1, instance.id, false);
            }

            if((instance.__bitField0 & 2) == 2) {
                output.writeInt32(2, instance.isConnectedToStrava, false);
            }

            if((instance.__bitField0 & 4) == 4) {
                output.writeString(3, instance.email, false);
            }

            if((instance.__bitField0 & 8) == 8) {
                output.writeString(4, instance.firstName, false);
            }

            if((instance.__bitField0 & 16) == 16) {
                output.writeString(5, instance.lastName, false);
            }

            if((instance.__bitField0 & 32) == 32) {
                output.writeBool(6, instance.isMale, false);
            }

            if((instance.__bitField0 & 64) == 64) {
                output.writeBytes(7, instance.f7, false);
            }

            if((instance.__bitField0 & 128) == 128) {
                output.writeUInt32(9, instance.weightInGrams, false);
            }

            if((instance.__bitField0 & 256) == 256) {
                output.writeUInt32(10, instance.ftp, false);
            }

            if((instance.__bitField0 & 512) == 512) {
                output.writeUInt32(11, instance.f11, false);
            }

            if((instance.__bitField0 & 1024) == 1024) {
                output.writeUInt32(12, instance.f12, false);
            }

            if((instance.__bitField0 & 2048) == 2048) {
                output.writeUInt32(13, instance.f13, false);
            }

            if((instance.__bitField0 & 4096) == 4096) {
                output.writeUInt32(14, instance.f14, false);
            }

            if((instance.__bitField0 & 8192) == 8192) {
                output.writeUInt32(15, instance.f15, false);
            }

            if((instance.__bitField0 & 16384) == 16384) {
                output.writeUInt32(16, instance.f16, false);
            }

            if((instance.__bitField0 & 32768) == 32768) {
                output.writeUInt32(17, instance.f17, false);
            }

            if((instance.__bitField0 & 65536) == 65536) {
                output.writeUInt32(18, instance.f18, false);
            }

            if((instance.__bitField0 & 131072) == 131072) {
                output.writeUInt32(19, instance.f19, false);
            }

            if((instance.__bitField0 & 262144) == 262144) {
                output.writeFixed32(20, instance.f20, false);
            }

            if((instance.__bitField0 & 524288) == 524288) {
                output.writeFixed32(21, instance.f21, false);
            }

            if((instance.__bitField0 & 1048576) == 1048576) {
                output.writeFixed32(22, instance.f22, false);
            }

            if((instance.__bitField0 & 2097152) == 2097152) {
                output.writeFixed32(23, instance.f23, false);
            }

            if((instance.__bitField0 & 4194304) == 4194304) {
                output.writeFixed32(24, instance.f24, false);
            }

            if((instance.__bitField0 & 8388608) == 8388608) {
                output.writeFixed32(25, instance.f25, false);
            }

            if((instance.__bitField0 & 16777216) == 16777216) {
                output.writeFixed32(26, instance.f26, false);
            }

            if((instance.__bitField0 & 33554432) == 33554432) {
                output.writeFixed64(27, instance.f27, false);
            }

            if((instance.__bitField0 & 67108864) == 67108864) {
                output.writeFixed64(28, instance.f28, false);
            }

            if((instance.__bitField0 & 134217728) == 134217728) {
                output.writeFixed64(29, instance.f29, false);
            }

            if((instance.__bitField0 & 268435456) == 268435456) {
                output.writeFixed64(30, instance.f30, false);
            }

            if((instance.__bitField0 & 536870912) == 536870912) {
                output.writeFixed64(31, instance.f31, false);
            }

            if((instance.__bitField0 & 1073741824) == 1073741824) {
                output.writeFixed64(32, instance.f32, false);
            }

            if((instance.__bitField0 & -2147483648) == -2147483648) {
                output.writeBytes(33, instance.f33, false);
            }

            if((instance.__bitField1 & 1) == 1) {
                output.writeUInt32(34, instance.countryCode, false);
            }

            if((instance.__bitField1 & 2) == 2) {
                output.writeUInt32(35, instance.totalDistanceInMeters, false);
            }

            if((instance.__bitField1 & 4) == 4) {
                output.writeUInt32(36, instance.elevationGainInMeters, false);
            }

            if((instance.__bitField1 & 8) == 8) {
                output.writeUInt32(37, instance.timeRiddenInMinutes, false);
            }

            if((instance.__bitField1 & 16) == 16) {
                output.writeUInt32(38, instance.f38, false);
            }

            if((instance.__bitField1 & 32) == 32) {
                output.writeUInt32(39, instance.f39, false);
            }

            if((instance.__bitField1 & 64) == 64) {
                output.writeUInt32(40, instance.f40, false);
            }

            if((instance.__bitField1 & 128) == 128) {
                output.writeUInt32(41, instance.totalWattHours, false);
            }

            if((instance.__bitField1 & 256) == 256) {
                output.writeUInt32(42, instance.heightInMillimeters, false);
            }

            if((instance.__bitField1 & 512) == 512) {
                output.writeString(43, instance.dob, false);
            }

            if((instance.__bitField1 & 1024) == 1024) {
                output.writeUInt32(44, instance.f44, false);
            }

            if((instance.__bitField1 & 2048) == 2048) {
                output.writeBool(45, instance.f45, false);
            }

            if((instance.__bitField1 & 4096) == 4096) {
                output.writeUInt32(46, instance.totalXp, false);
            }

            if((instance.__bitField1 & 8192) == 8192) {
                output.writeUInt32(47, instance.f47, false);
            }

            if((instance.__bitField1 & 16384) == 16384) {
            	output.writeEnum(48, instance.playerType, false);
            }

            if((instance.__bitField1 & 32768) == 32768) {
                output.writeUInt32(49, instance.achievementLevel, false);
            }

            if((instance.__bitField1 & 65536) == 65536) {
                output.writeBool(50, instance.f50, false);
            }

            if((instance.__bitField1 & 131072) == 131072) {
                output.writeBool(51, instance.f51, false);
            }

            if((instance.__bitField1 & 262144) == 262144) {
                output.writeUInt32(52, instance.f52, false);
            }

            if((instance.__bitField1 & 524288) == 524288) {
                output.writeUInt32(53, instance.f53, false);
            }

            if((instance.__bitField1 & 1048576) == 1048576) {
                output.writeUInt32(54, instance.f54, false);
            }

            if((instance.__bitField1 & 2097152) == 2097152) {
                output.writeUInt32(55, instance.age, false);
            }

            if((instance.__bitField1 & 4194304) == 4194304) {
                output.writeFixed32(56, instance.f56, false);
            }

            if((instance.__bitField1 & 8388608) == 8388608) {
                output.writeUInt32(57, instance.f57, false);
            }

            if((instance.__bitField1 & 16777216) == 16777216) {
                output.writeBytes(58, instance.f58, false);
            }

            if((instance.__bitField1 & 33554432) == 33554432) {
                output.writeFixed64(59, instance.f59, false);
            }

            for(io.protostuff.ByteString f60 : instance.f60) {
                output.writeBytes(60, f60, true);
            }

            if((instance.__bitField1 & 134217728) == 134217728) {
            	output.writeObject(61, instance.socialFacts, org.zwiftj.api.model.Profile.ProfileSocialFacts.getSchema(), false);
            }

            if((instance.__bitField1 & 268435456) == 268435456) {
            	output.writeEnum(62, instance.f62, false);
            }

            if((instance.__bitField1 & 536870912) == 536870912) {
                output.writeBool(63, instance.f63, false);
            }

            if((instance.__bitField1 & 1073741824) == 1073741824) {
                output.writeBool(64, instance.f64, false);
            }

            if((instance.__bitField1 & -2147483648) == -2147483648) {
            	output.writeEnum(65, instance.f65, false);
            }

            if((instance.__bitField2 & 1) == 1) {
                output.writeBytes(66, instance.f66, false);
            }

            if((instance.__bitField2 & 2) == 2) {
                output.writeUInt32(67, instance.f67, false);
            }

            if((instance.__bitField2 & 4) == 4) {
                output.writeFixed32(68, instance.f68, false);
            }

            if((instance.__bitField2 & 8) == 8) {
                output.writeFixed32(69, instance.f69, false);
            }

            if((instance.__bitField2 & 16) == 16) {
                output.writeFixed32(70, instance.f70, false);
            }

            if((instance.__bitField2 & 32) == 32) {
                output.writeFixed32(71, instance.f71, false);
            }

            if((instance.__bitField2 & 64) == 64) {
                output.writeFixed32(72, instance.f72, false);
            }

            if((instance.__bitField2 & 128) == 128) {
                output.writeFixed32(73, instance.f73, false);
            }

            if((instance.__bitField2 & 256) == 256) {
                output.writeUInt32(74, instance.f74, false);
            }

            if((instance.__bitField2 & 512) == 512) {
                output.writeUInt32(75, instance.f75, false);
            }

            if((instance.__bitField2 & 1024) == 1024) {
                output.writeFixed32(76, instance.f76, false);
            }

            if((instance.__bitField2 & 2048) == 2048) {
                output.writeFixed32(77, instance.f77, false);
            }

            if((instance.__bitField2 & 4096) == 4096) {
                output.writeFixed32(78, instance.f78, false);
            }

            if((instance.__bitField2 & 8192) == 8192) {
                output.writeFixed32(79, instance.f79, false);
            }

            if((instance.__bitField2 & 16384) == 16384) {
                output.writeUInt32(80, instance.f80, false);
            }

            if((instance.__bitField2 & 32768) == 32768) {
                output.writeUInt32(81, instance.f81, false);
            }

            if((instance.__bitField2 & 65536) == 65536) {
            	output.writeObject(82, instance.f82, org.zwiftj.api.model.Subscription.getSchema(), false);
            }

            if((instance.__bitField2 & 131072) == 131072) {
                output.writeString(83, instance.mixPanelDistinctId, false);
            }

            if((instance.__bitField2 & 262144) == 262144) {
                output.writeUInt32(84, instance.f84, false);
            }

            if((instance.__bitField2 & 524288) == 524288) {
                output.writeUInt32(85, instance.f85, false);
            }

            if((instance.__bitField2 & 1048576) == 1048576) {
            	output.writeEnum(86, instance.sport, false);
            }

            if((instance.__bitField2 & 2097152) == 2097152) {
                output.writeUInt32(87, instance.f87, false);
            }

            if((instance.__bitField2 & 4194304) == 4194304) {
                output.writeBool(88, instance.f88, false);
            }

            if((instance.__bitField2 & 8388608) == 8388608) {
                output.writeString(89, instance.preferredLanguage, false);
            }

            if((instance.__bitField2 & 16777216) == 16777216) {
                output.writeUInt32(90, instance.f90, false);
            }

            if((instance.__bitField2 & 33554432) == 33554432) {
                output.writeUInt32(91, instance.f91, false);
            }

            if((instance.__bitField2 & 67108864) == 67108864) {
                output.writeUInt32(92, instance.f92, false);
            }

            if((instance.__bitField2 & 134217728) == 134217728) {
                output.writeUInt32(93, instance.f93, false);
            }

            if((instance.__bitField2 & 268435456) == 268435456) {
                output.writeUInt32(94, instance.f94, false);
            }

            if((instance.__bitField2 & 536870912) == 536870912) {
                output.writeUInt32(95, instance.f95, false);
            }

            if((instance.__bitField2 & 1073741824) == 1073741824) {
                output.writeUInt32(96, instance.f96, false);
            }

            if((instance.__bitField2 & -2147483648) == -2147483648) {
                output.writeUInt32(97, instance.f97, false);
            }

            if((instance.__bitField3 & 1) == 1) {
                output.writeUInt32(98, instance.f98, false);
            }

            if((instance.__bitField3 & 2) == 2) {
                output.writeUInt32(99, instance.f99, false);
            }

            if((instance.__bitField3 & 4) == 4) {
                output.writeUInt32(100, instance.f100, false);
            }

            if((instance.__bitField3 & 8) == 8) {
                output.writeUInt32(101, instance.f101, false);
            }

            if((instance.__bitField3 & 16) == 16) {
                output.writeUInt32(102, instance.f102, false);
            }

            if((instance.__bitField3 & 32) == 32) {
                output.writeUInt32(103, instance.f103, false);
            }

            if((instance.__bitField3 & 64) == 64) {
                output.writeUInt32(104, instance.f104, false);
            }

            if((instance.__bitField3 & 128) == 128) {
                output.writeBool(105, instance.f105, false);
            }

            if((instance.__bitField3 & 256) == 256) {
                output.writeBool(106, instance.f106, false);
            }

            for(io.protostuff.ByteString f107 : instance.f107) {
                output.writeBytes(107, f107, true);
            }

            if((instance.__bitField3 & 1024) == 1024) {
                output.writeString(108, instance.launchedGameClient, false);
            }

            if((instance.__bitField3 & 2048) == 2048) {
                output.writeInt64(109, instance.f109, false);
            }

            if((instance.__bitField3 & 4096) == 4096) {
                output.writeBool(110, instance.f110, false);
            }

            for(org.zwiftj.api.model.PacerSetting f114 : instance.f114) {
                output.writeObject(114, f114, org.zwiftj.api.model.PacerSetting.getSchema(), true);
            }

            if((instance.__bitField3 & 16384) == 16384) {
                output.writeInt32(117, instance.f117, false);
            }

            if((instance.__bitField3 & 32768) == 32768) {
                output.writeInt32(118, instance.f118, false);
            }

            if((instance.__bitField3 & 65536) == 65536) {
                output.writeInt32(119, instance.f119, false);
            }

            if((instance.__bitField3 & 131072) == 131072) {
                output.writeInt32(120, instance.f120, false);
            }

            if((instance.__bitField3 & 262144) == 262144) {
                output.writeInt32(121, instance.f121, false);
            }

            if((instance.__bitField3 & 524288) == 524288) {
                output.writeInt32(125, instance.f125, false);
            }

        }

        @Override
        public String getFieldName(int number) {
        	switch(number) {
        		case 1: return "id";
        		case 2: return "isConnectedToStrava";
        		case 3: return "email";
        		case 4: return "firstName";
        		case 5: return "lastName";
        		case 6: return "isMale";
        		case 7: return "f7";
        		case 9: return "weightInGrams";
        		case 10: return "ftp";
        		case 11: return "f11";
        		case 12: return "f12";
        		case 13: return "f13";
        		case 14: return "f14";
        		case 15: return "f15";
        		case 16: return "f16";
        		case 17: return "f17";
        		case 18: return "f18";
        		case 19: return "f19";
        		case 20: return "f20";
        		case 21: return "f21";
        		case 22: return "f22";
        		case 23: return "f23";
        		case 24: return "f24";
        		case 25: return "f25";
        		case 26: return "f26";
        		case 27: return "f27";
        		case 28: return "f28";
        		case 29: return "f29";
        		case 30: return "f30";
        		case 31: return "f31";
        		case 32: return "f32";
        		case 33: return "f33";
        		case 34: return "countryCode";
        		case 35: return "totalDistanceInMeters";
        		case 36: return "elevationGainInMeters";
        		case 37: return "timeRiddenInMinutes";
        		case 38: return "f38";
        		case 39: return "f39";
        		case 40: return "f40";
        		case 41: return "totalWattHours";
        		case 42: return "heightInMillimeters";
        		case 43: return "dob";
        		case 44: return "f44";
        		case 45: return "f45";
        		case 46: return "totalXp";
        		case 47: return "f47";
        		case 48: return "playerType";
        		case 49: return "achievementLevel";
        		case 50: return "f50";
        		case 51: return "f51";
        		case 52: return "f52";
        		case 53: return "f53";
        		case 54: return "f54";
        		case 55: return "age";
        		case 56: return "f56";
        		case 57: return "f57";
        		case 58: return "f58";
        		case 59: return "f59";
        		case 60: return "f60";
        		case 61: return "socialFacts";
        		case 62: return "f62";
        		case 63: return "f63";
        		case 64: return "f64";
        		case 65: return "f65";
        		case 66: return "f66";
        		case 67: return "f67";
        		case 68: return "f68";
        		case 69: return "f69";
        		case 70: return "f70";
        		case 71: return "f71";
        		case 72: return "f72";
        		case 73: return "f73";
        		case 74: return "f74";
        		case 75: return "f75";
        		case 76: return "f76";
        		case 77: return "f77";
        		case 78: return "f78";
        		case 79: return "f79";
        		case 80: return "f80";
        		case 81: return "f81";
        		case 82: return "f82";
        		case 83: return "mixPanelDistinctId";
        		case 84: return "f84";
        		case 85: return "f85";
        		case 86: return "sport";
        		case 87: return "f87";
        		case 88: return "f88";
        		case 89: return "preferredLanguage";
        		case 90: return "f90";
        		case 91: return "f91";
        		case 92: return "f92";
        		case 93: return "f93";
        		case 94: return "f94";
        		case 95: return "f95";
        		case 96: return "f96";
        		case 97: return "f97";
        		case 98: return "f98";
        		case 99: return "f99";
        		case 100: return "f100";
        		case 101: return "f101";
        		case 102: return "f102";
        		case 103: return "f103";
        		case 104: return "f104";
        		case 105: return "f105";
        		case 106: return "f106";
        		case 107: return "f107";
        		case 108: return "launchedGameClient";
        		case 109: return "f109";
        		case 110: return "f110";
        		case 114: return "f114";
        		case 117: return "f117";
        		case 118: return "f118";
        		case 119: return "f119";
        		case 120: return "f120";
        		case 121: return "f121";
        		case 125: return "f125";
        		default: return null;
        	}
        }

        @Override
        public int getFieldNumber(String name) {
        	final Integer number = __fieldMap.get(name);
        	return number == null ? 0 : number.intValue();
        }

    }

    public static final class Builder  {

        private long id;

        private int isConnectedToStrava;

        private String email;

        private String firstName;

        private String lastName;

        private boolean isMale;

        private io.protostuff.ByteString f7;

        private int weightInGrams;

        private int ftp;

        private int f11;

        private int f12;

        private int f13;

        private int f14;

        private int f15;

        private int f16;

        private int f17;

        private int f18;

        private int f19;

        private int f20;

        private int f21;

        private int f22;

        private int f23;

        private int f24;

        private int f25;

        private int f26;

        private long f27;

        private long f28;

        private long f29;

        private long f30;

        private long f31;

        private long f32;

        private io.protostuff.ByteString f33;

        private int countryCode;

        private int totalDistanceInMeters;

        private int elevationGainInMeters;

        private int timeRiddenInMinutes;

        private int f38;

        private int f39;

        private int f40;

        private int totalWattHours;

        private int heightInMillimeters;

        private String dob;

        private int f44;

        private boolean f45;

        private int totalXp;

        private int f47;

        private int playerType;

        private int achievementLevel;

        private boolean f50;

        private boolean f51;

        private int f52;

        private int f53;

        private int f54;

        private int age;

        private int f56;

        private int f57;

        private io.protostuff.ByteString f58;

        private long f59;

        private java.util.List<io.protostuff.ByteString> f60;

        private org.zwiftj.api.model.Profile.ProfileSocialFacts socialFacts;

        private int f62;

        private boolean f63;

        private boolean f64;

        private int f65;

        private io.protostuff.ByteString f66;

        private int f67;

        private int f68;

        private int f69;

        private int f70;

        private int f71;

        private int f72;

        private int f73;

        private int f74;

        private int f75;

        private int f76;

        private int f77;

        private int f78;

        private int f79;

        private int f80;

        private int f81;

        private org.zwiftj.api.model.Subscription f82;

        private String mixPanelDistinctId;

        private int f84;

        private int f85;

        private int sport;

        private int f87;

        private boolean f88;

        private String preferredLanguage;

        private int f90;

        private int f91;

        private int f92;

        private int f93;

        private int f94;

        private int f95;

        private int f96;

        private int f97;

        private int f98;

        private int f99;

        private int f100;

        private int f101;

        private int f102;

        private int f103;

        private int f104;

        private boolean f105;

        private boolean f106;

        private java.util.List<io.protostuff.ByteString> f107;

        private String launchedGameClient;

        private long f109;

        private boolean f110;

        private java.util.List<org.zwiftj.api.model.PacerSetting> f114;

        private int f117;

        private int f118;

        private int f119;

        private int f120;

        private int f121;

        private int f125;

        private int __bitField0;
        private int __bitField1;
        private int __bitField2;
        private int __bitField3;

        private Builder() {
            this.id = 0L;
            this.isConnectedToStrava = 0;
            this.email = "";
            this.firstName = "";
            this.lastName = "";
            this.isMale = false;
            this.f7 = io.protostuff.ByteString.EMPTY;
            this.weightInGrams = 0;
            this.ftp = 0;
            this.f11 = 0;
            this.f12 = 0;
            this.f13 = 0;
            this.f14 = 0;
            this.f15 = 0;
            this.f16 = 0;
            this.f17 = 0;
            this.f18 = 0;
            this.f19 = 0;
            this.f20 = 0;
            this.f21 = 0;
            this.f22 = 0;
            this.f23 = 0;
            this.f24 = 0;
            this.f25 = 0;
            this.f26 = 0;
            this.f27 = 0L;
            this.f28 = 0L;
            this.f29 = 0L;
            this.f30 = 0L;
            this.f31 = 0L;
            this.f32 = 0L;
            this.f33 = io.protostuff.ByteString.EMPTY;
            this.countryCode = 0;
            this.totalDistanceInMeters = 0;
            this.elevationGainInMeters = 0;
            this.timeRiddenInMinutes = 0;
            this.f38 = 0;
            this.f39 = 0;
            this.f40 = 0;
            this.totalWattHours = 0;
            this.heightInMillimeters = 0;
            this.dob = "";
            this.f44 = 0;
            this.f45 = false;
            this.totalXp = 0;
            this.f47 = 0;
            this.playerType = org.zwiftj.api.model.Profile.PlayerType.PLAYERTYPE0.getNumber();
            this.achievementLevel = 0;
            this.f50 = false;
            this.f51 = false;
            this.f52 = 0;
            this.f53 = 0;
            this.f54 = 0;
            this.age = 0;
            this.f56 = 0;
            this.f57 = 0;
            this.f58 = io.protostuff.ByteString.EMPTY;
            this.f59 = 0L;
            this.f60 = java.util.Collections.emptyList();
            this.socialFacts = org.zwiftj.api.model.Profile.ProfileSocialFacts.getDefaultInstance();
            this.f62 = org.zwiftj.api.model.ProfileFollowStatus.FOLLOWSTATUS0.getNumber();
            this.f63 = false;
            this.f64 = false;
            this.f65 = org.zwiftj.api.model.Profile.ProfileEnrolledProgram.ENROLLEDPROGRAM0.getNumber();
            this.f66 = io.protostuff.ByteString.EMPTY;
            this.f67 = 0;
            this.f68 = 0;
            this.f69 = 0;
            this.f70 = 0;
            this.f71 = 0;
            this.f72 = 0;
            this.f73 = 0;
            this.f74 = 0;
            this.f75 = 0;
            this.f76 = 0;
            this.f77 = 0;
            this.f78 = 0;
            this.f79 = 0;
            this.f80 = 0;
            this.f81 = 0;
            this.f82 = org.zwiftj.api.model.Subscription.getDefaultInstance();
            this.mixPanelDistinctId = "";
            this.f84 = 0;
            this.f85 = 0;
            this.sport = org.zwiftj.api.model.Profile.Sport.SPORT0.getNumber();
            this.f87 = 0;
            this.f88 = false;
            this.preferredLanguage = "";
            this.f90 = 0;
            this.f91 = 0;
            this.f92 = 0;
            this.f93 = 0;
            this.f94 = 0;
            this.f95 = 0;
            this.f96 = 0;
            this.f97 = 0;
            this.f98 = 0;
            this.f99 = 0;
            this.f100 = 0;
            this.f101 = 0;
            this.f102 = 0;
            this.f103 = 0;
            this.f104 = 0;
            this.f105 = false;
            this.f106 = false;
            this.f107 = java.util.Collections.emptyList();
            this.launchedGameClient = "";
            this.f109 = 0L;
            this.f110 = false;
            this.f114 = java.util.Collections.emptyList();
            this.f117 = 0;
            this.f118 = 0;
            this.f119 = 0;
            this.f120 = 0;
            this.f121 = 0;
            this.f125 = 0;
        }

        public Builder mergeFrom(Profile instance) {
            if (instance.hasId()) {
                this.setId(instance.getId());
            }

            if (instance.hasIsConnectedToStrava()) {
                this.setIsConnectedToStrava(instance.getIsConnectedToStrava());
            }

            if (instance.hasEmail()) {
                this.setEmail(instance.getEmail());
            }

            if (instance.hasFirstName()) {
                this.setFirstName(instance.getFirstName());
            }

            if (instance.hasLastName()) {
                this.setLastName(instance.getLastName());
            }

            if (instance.hasIsMale()) {
                this.setIsMale(instance.getIsMale());
            }

            if (instance.hasF7()) {
                this.setF7(instance.getF7());
            }

            if (instance.hasWeightInGrams()) {
                this.setWeightInGrams(instance.getWeightInGrams());
            }

            if (instance.hasFtp()) {
                this.setFtp(instance.getFtp());
            }

            if (instance.hasF11()) {
                this.setF11(instance.getF11());
            }

            if (instance.hasF12()) {
                this.setF12(instance.getF12());
            }

            if (instance.hasF13()) {
                this.setF13(instance.getF13());
            }

            if (instance.hasF14()) {
                this.setF14(instance.getF14());
            }

            if (instance.hasF15()) {
                this.setF15(instance.getF15());
            }

            if (instance.hasF16()) {
                this.setF16(instance.getF16());
            }

            if (instance.hasF17()) {
                this.setF17(instance.getF17());
            }

            if (instance.hasF18()) {
                this.setF18(instance.getF18());
            }

            if (instance.hasF19()) {
                this.setF19(instance.getF19());
            }

            if (instance.hasF20()) {
                this.setF20(instance.getF20());
            }

            if (instance.hasF21()) {
                this.setF21(instance.getF21());
            }

            if (instance.hasF22()) {
                this.setF22(instance.getF22());
            }

            if (instance.hasF23()) {
                this.setF23(instance.getF23());
            }

            if (instance.hasF24()) {
                this.setF24(instance.getF24());
            }

            if (instance.hasF25()) {
                this.setF25(instance.getF25());
            }

            if (instance.hasF26()) {
                this.setF26(instance.getF26());
            }

            if (instance.hasF27()) {
                this.setF27(instance.getF27());
            }

            if (instance.hasF28()) {
                this.setF28(instance.getF28());
            }

            if (instance.hasF29()) {
                this.setF29(instance.getF29());
            }

            if (instance.hasF30()) {
                this.setF30(instance.getF30());
            }

            if (instance.hasF31()) {
                this.setF31(instance.getF31());
            }

            if (instance.hasF32()) {
                this.setF32(instance.getF32());
            }

            if (instance.hasF33()) {
                this.setF33(instance.getF33());
            }

            if (instance.hasCountryCode()) {
                this.setCountryCode(instance.getCountryCode());
            }

            if (instance.hasTotalDistanceInMeters()) {
                this.setTotalDistanceInMeters(instance.getTotalDistanceInMeters());
            }

            if (instance.hasElevationGainInMeters()) {
                this.setElevationGainInMeters(instance.getElevationGainInMeters());
            }

            if (instance.hasTimeRiddenInMinutes()) {
                this.setTimeRiddenInMinutes(instance.getTimeRiddenInMinutes());
            }

            if (instance.hasF38()) {
                this.setF38(instance.getF38());
            }

            if (instance.hasF39()) {
                this.setF39(instance.getF39());
            }

            if (instance.hasF40()) {
                this.setF40(instance.getF40());
            }

            if (instance.hasTotalWattHours()) {
                this.setTotalWattHours(instance.getTotalWattHours());
            }

            if (instance.hasHeightInMillimeters()) {
                this.setHeightInMillimeters(instance.getHeightInMillimeters());
            }

            if (instance.hasDob()) {
                this.setDob(instance.getDob());
            }

            if (instance.hasF44()) {
                this.setF44(instance.getF44());
            }

            if (instance.hasF45()) {
                this.setF45(instance.getF45());
            }

            if (instance.hasTotalXp()) {
                this.setTotalXp(instance.getTotalXp());
            }

            if (instance.hasF47()) {
                this.setF47(instance.getF47());
            }

            if (instance.hasPlayerType()) {
                this.setPlayerType(instance.getPlayerType());
            }

            if (instance.hasAchievementLevel()) {
                this.setAchievementLevel(instance.getAchievementLevel());
            }

            if (instance.hasF50()) {
                this.setF50(instance.getF50());
            }

            if (instance.hasF51()) {
                this.setF51(instance.getF51());
            }

            if (instance.hasF52()) {
                this.setF52(instance.getF52());
            }

            if (instance.hasF53()) {
                this.setF53(instance.getF53());
            }

            if (instance.hasF54()) {
                this.setF54(instance.getF54());
            }

            if (instance.hasAge()) {
                this.setAge(instance.getAge());
            }

            if (instance.hasF56()) {
                this.setF56(instance.getF56());
            }

            if (instance.hasF57()) {
                this.setF57(instance.getF57());
            }

            if (instance.hasF58()) {
                this.setF58(instance.getF58());
            }

            if (instance.hasF59()) {
                this.setF59(instance.getF59());
            }

            this.addAllF60(instance.getF60List());

            if (instance.hasSocialFacts()) {
                this.setSocialFacts(instance.getSocialFacts());
            }

            if (instance.hasF62()) {
                this.setF62(instance.getF62());
            }

            if (instance.hasF63()) {
                this.setF63(instance.getF63());
            }

            if (instance.hasF64()) {
                this.setF64(instance.getF64());
            }

            if (instance.hasF65()) {
                this.setF65(instance.getF65());
            }

            if (instance.hasF66()) {
                this.setF66(instance.getF66());
            }

            if (instance.hasF67()) {
                this.setF67(instance.getF67());
            }

            if (instance.hasF68()) {
                this.setF68(instance.getF68());
            }

            if (instance.hasF69()) {
                this.setF69(instance.getF69());
            }

            if (instance.hasF70()) {
                this.setF70(instance.getF70());
            }

            if (instance.hasF71()) {
                this.setF71(instance.getF71());
            }

            if (instance.hasF72()) {
                this.setF72(instance.getF72());
            }

            if (instance.hasF73()) {
                this.setF73(instance.getF73());
            }

            if (instance.hasF74()) {
                this.setF74(instance.getF74());
            }

            if (instance.hasF75()) {
                this.setF75(instance.getF75());
            }

            if (instance.hasF76()) {
                this.setF76(instance.getF76());
            }

            if (instance.hasF77()) {
                this.setF77(instance.getF77());
            }

            if (instance.hasF78()) {
                this.setF78(instance.getF78());
            }

            if (instance.hasF79()) {
                this.setF79(instance.getF79());
            }

            if (instance.hasF80()) {
                this.setF80(instance.getF80());
            }

            if (instance.hasF81()) {
                this.setF81(instance.getF81());
            }

            if (instance.hasF82()) {
                this.setF82(instance.getF82());
            }

            if (instance.hasMixPanelDistinctId()) {
                this.setMixPanelDistinctId(instance.getMixPanelDistinctId());
            }

            if (instance.hasF84()) {
                this.setF84(instance.getF84());
            }

            if (instance.hasF85()) {
                this.setF85(instance.getF85());
            }

            if (instance.hasSport()) {
                this.setSport(instance.getSport());
            }

            if (instance.hasF87()) {
                this.setF87(instance.getF87());
            }

            if (instance.hasF88()) {
                this.setF88(instance.getF88());
            }

            if (instance.hasPreferredLanguage()) {
                this.setPreferredLanguage(instance.getPreferredLanguage());
            }

            if (instance.hasF90()) {
                this.setF90(instance.getF90());
            }

            if (instance.hasF91()) {
                this.setF91(instance.getF91());
            }

            if (instance.hasF92()) {
                this.setF92(instance.getF92());
            }

            if (instance.hasF93()) {
                this.setF93(instance.getF93());
            }

            if (instance.hasF94()) {
                this.setF94(instance.getF94());
            }

            if (instance.hasF95()) {
                this.setF95(instance.getF95());
            }

            if (instance.hasF96()) {
                this.setF96(instance.getF96());
            }

            if (instance.hasF97()) {
                this.setF97(instance.getF97());
            }

            if (instance.hasF98()) {
                this.setF98(instance.getF98());
            }

            if (instance.hasF99()) {
                this.setF99(instance.getF99());
            }

            if (instance.hasF100()) {
                this.setF100(instance.getF100());
            }

            if (instance.hasF101()) {
                this.setF101(instance.getF101());
            }

            if (instance.hasF102()) {
                this.setF102(instance.getF102());
            }

            if (instance.hasF103()) {
                this.setF103(instance.getF103());
            }

            if (instance.hasF104()) {
                this.setF104(instance.getF104());
            }

            if (instance.hasF105()) {
                this.setF105(instance.getF105());
            }

            if (instance.hasF106()) {
                this.setF106(instance.getF106());
            }

            this.addAllF107(instance.getF107List());

            if (instance.hasLaunchedGameClient()) {
                this.setLaunchedGameClient(instance.getLaunchedGameClient());
            }

            if (instance.hasF109()) {
                this.setF109(instance.getF109());
            }

            if (instance.hasF110()) {
                this.setF110(instance.getF110());
            }

            this.addAllF114(instance.getF114List());

            if (instance.hasF117()) {
                this.setF117(instance.getF117());
            }

            if (instance.hasF118()) {
                this.setF118(instance.getF118());
            }

            if (instance.hasF119()) {
                this.setF119(instance.getF119());
            }

            if (instance.hasF120()) {
                this.setF120(instance.getF120());
            }

            if (instance.hasF121()) {
                this.setF121(instance.getF121());
            }

            if (instance.hasF125()) {
                this.setF125(instance.getF125());
            }

            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long value) {
            this.id = value;
            __bitField0 |= 1;
            return this;
        }

        public Builder clearId() {
            this.id = 0L;
            __bitField0 &= ~1;
            return this;
        }

        public boolean hasId() {
            return (__bitField0 & 1) == 1;
        }

        public int getIsConnectedToStrava() {
            return isConnectedToStrava;
        }

        public Builder setIsConnectedToStrava(int value) {
            this.isConnectedToStrava = value;
            __bitField0 |= 2;
            return this;
        }

        public Builder clearIsConnectedToStrava() {
            this.isConnectedToStrava = 0;
            __bitField0 &= ~2;
            return this;
        }

        public boolean hasIsConnectedToStrava() {
            return (__bitField0 & 2) == 2;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#email to null");
            }

            this.email = value;
            __bitField0 |= 4;
            return this;
        }

        public Builder clearEmail() {
            this.email = "";
            __bitField0 &= ~4;
            return this;
        }

        public boolean hasEmail() {
            return (__bitField0 & 4) == 4;
        }

        public String getFirstName() {
            return firstName;
        }

        public Builder setFirstName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#firstName to null");
            }

            this.firstName = value;
            __bitField0 |= 8;
            return this;
        }

        public Builder clearFirstName() {
            this.firstName = "";
            __bitField0 &= ~8;
            return this;
        }

        public boolean hasFirstName() {
            return (__bitField0 & 8) == 8;
        }

        public String getLastName() {
            return lastName;
        }

        public Builder setLastName(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#lastName to null");
            }

            this.lastName = value;
            __bitField0 |= 16;
            return this;
        }

        public Builder clearLastName() {
            this.lastName = "";
            __bitField0 &= ~16;
            return this;
        }

        public boolean hasLastName() {
            return (__bitField0 & 16) == 16;
        }

        public boolean getIsMale() {
            return isMale;
        }

        public Builder setIsMale(boolean value) {
            this.isMale = value;
            __bitField0 |= 32;
            return this;
        }

        public Builder clearIsMale() {
            this.isMale = false;
            __bitField0 &= ~32;
            return this;
        }

        public boolean hasIsMale() {
            return (__bitField0 & 32) == 32;
        }

        public io.protostuff.ByteString getF7() {
            return f7;
        }

        public Builder setF7(io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f7 to null");
            }

            this.f7 = value;
            __bitField0 |= 64;
            return this;
        }

        public Builder clearF7() {
            this.f7 = io.protostuff.ByteString.EMPTY;
            __bitField0 &= ~64;
            return this;
        }

        public boolean hasF7() {
            return (__bitField0 & 64) == 64;
        }

        public int getWeightInGrams() {
            return weightInGrams;
        }

        public Builder setWeightInGrams(int value) {
            this.weightInGrams = value;
            __bitField0 |= 128;
            return this;
        }

        public Builder clearWeightInGrams() {
            this.weightInGrams = 0;
            __bitField0 &= ~128;
            return this;
        }

        public boolean hasWeightInGrams() {
            return (__bitField0 & 128) == 128;
        }

        public int getFtp() {
            return ftp;
        }

        public Builder setFtp(int value) {
            this.ftp = value;
            __bitField0 |= 256;
            return this;
        }

        public Builder clearFtp() {
            this.ftp = 0;
            __bitField0 &= ~256;
            return this;
        }

        public boolean hasFtp() {
            return (__bitField0 & 256) == 256;
        }

        public int getF11() {
            return f11;
        }

        public Builder setF11(int value) {
            this.f11 = value;
            __bitField0 |= 512;
            return this;
        }

        public Builder clearF11() {
            this.f11 = 0;
            __bitField0 &= ~512;
            return this;
        }

        public boolean hasF11() {
            return (__bitField0 & 512) == 512;
        }

        public int getF12() {
            return f12;
        }

        public Builder setF12(int value) {
            this.f12 = value;
            __bitField0 |= 1024;
            return this;
        }

        public Builder clearF12() {
            this.f12 = 0;
            __bitField0 &= ~1024;
            return this;
        }

        public boolean hasF12() {
            return (__bitField0 & 1024) == 1024;
        }

        public int getF13() {
            return f13;
        }

        public Builder setF13(int value) {
            this.f13 = value;
            __bitField0 |= 2048;
            return this;
        }

        public Builder clearF13() {
            this.f13 = 0;
            __bitField0 &= ~2048;
            return this;
        }

        public boolean hasF13() {
            return (__bitField0 & 2048) == 2048;
        }

        public int getF14() {
            return f14;
        }

        public Builder setF14(int value) {
            this.f14 = value;
            __bitField0 |= 4096;
            return this;
        }

        public Builder clearF14() {
            this.f14 = 0;
            __bitField0 &= ~4096;
            return this;
        }

        public boolean hasF14() {
            return (__bitField0 & 4096) == 4096;
        }

        public int getF15() {
            return f15;
        }

        public Builder setF15(int value) {
            this.f15 = value;
            __bitField0 |= 8192;
            return this;
        }

        public Builder clearF15() {
            this.f15 = 0;
            __bitField0 &= ~8192;
            return this;
        }

        public boolean hasF15() {
            return (__bitField0 & 8192) == 8192;
        }

        public int getF16() {
            return f16;
        }

        public Builder setF16(int value) {
            this.f16 = value;
            __bitField0 |= 16384;
            return this;
        }

        public Builder clearF16() {
            this.f16 = 0;
            __bitField0 &= ~16384;
            return this;
        }

        public boolean hasF16() {
            return (__bitField0 & 16384) == 16384;
        }

        public int getF17() {
            return f17;
        }

        public Builder setF17(int value) {
            this.f17 = value;
            __bitField0 |= 32768;
            return this;
        }

        public Builder clearF17() {
            this.f17 = 0;
            __bitField0 &= ~32768;
            return this;
        }

        public boolean hasF17() {
            return (__bitField0 & 32768) == 32768;
        }

        public int getF18() {
            return f18;
        }

        public Builder setF18(int value) {
            this.f18 = value;
            __bitField0 |= 65536;
            return this;
        }

        public Builder clearF18() {
            this.f18 = 0;
            __bitField0 &= ~65536;
            return this;
        }

        public boolean hasF18() {
            return (__bitField0 & 65536) == 65536;
        }

        public int getF19() {
            return f19;
        }

        public Builder setF19(int value) {
            this.f19 = value;
            __bitField0 |= 131072;
            return this;
        }

        public Builder clearF19() {
            this.f19 = 0;
            __bitField0 &= ~131072;
            return this;
        }

        public boolean hasF19() {
            return (__bitField0 & 131072) == 131072;
        }

        public int getF20() {
            return f20;
        }

        public Builder setF20(int value) {
            this.f20 = value;
            __bitField0 |= 262144;
            return this;
        }

        public Builder clearF20() {
            this.f20 = 0;
            __bitField0 &= ~262144;
            return this;
        }

        public boolean hasF20() {
            return (__bitField0 & 262144) == 262144;
        }

        public int getF21() {
            return f21;
        }

        public Builder setF21(int value) {
            this.f21 = value;
            __bitField0 |= 524288;
            return this;
        }

        public Builder clearF21() {
            this.f21 = 0;
            __bitField0 &= ~524288;
            return this;
        }

        public boolean hasF21() {
            return (__bitField0 & 524288) == 524288;
        }

        public int getF22() {
            return f22;
        }

        public Builder setF22(int value) {
            this.f22 = value;
            __bitField0 |= 1048576;
            return this;
        }

        public Builder clearF22() {
            this.f22 = 0;
            __bitField0 &= ~1048576;
            return this;
        }

        public boolean hasF22() {
            return (__bitField0 & 1048576) == 1048576;
        }

        public int getF23() {
            return f23;
        }

        public Builder setF23(int value) {
            this.f23 = value;
            __bitField0 |= 2097152;
            return this;
        }

        public Builder clearF23() {
            this.f23 = 0;
            __bitField0 &= ~2097152;
            return this;
        }

        public boolean hasF23() {
            return (__bitField0 & 2097152) == 2097152;
        }

        public int getF24() {
            return f24;
        }

        public Builder setF24(int value) {
            this.f24 = value;
            __bitField0 |= 4194304;
            return this;
        }

        public Builder clearF24() {
            this.f24 = 0;
            __bitField0 &= ~4194304;
            return this;
        }

        public boolean hasF24() {
            return (__bitField0 & 4194304) == 4194304;
        }

        public int getF25() {
            return f25;
        }

        public Builder setF25(int value) {
            this.f25 = value;
            __bitField0 |= 8388608;
            return this;
        }

        public Builder clearF25() {
            this.f25 = 0;
            __bitField0 &= ~8388608;
            return this;
        }

        public boolean hasF25() {
            return (__bitField0 & 8388608) == 8388608;
        }

        public int getF26() {
            return f26;
        }

        public Builder setF26(int value) {
            this.f26 = value;
            __bitField0 |= 16777216;
            return this;
        }

        public Builder clearF26() {
            this.f26 = 0;
            __bitField0 &= ~16777216;
            return this;
        }

        public boolean hasF26() {
            return (__bitField0 & 16777216) == 16777216;
        }

        public long getF27() {
            return f27;
        }

        public Builder setF27(long value) {
            this.f27 = value;
            __bitField0 |= 33554432;
            return this;
        }

        public Builder clearF27() {
            this.f27 = 0L;
            __bitField0 &= ~33554432;
            return this;
        }

        public boolean hasF27() {
            return (__bitField0 & 33554432) == 33554432;
        }

        public long getF28() {
            return f28;
        }

        public Builder setF28(long value) {
            this.f28 = value;
            __bitField0 |= 67108864;
            return this;
        }

        public Builder clearF28() {
            this.f28 = 0L;
            __bitField0 &= ~67108864;
            return this;
        }

        public boolean hasF28() {
            return (__bitField0 & 67108864) == 67108864;
        }

        public long getF29() {
            return f29;
        }

        public Builder setF29(long value) {
            this.f29 = value;
            __bitField0 |= 134217728;
            return this;
        }

        public Builder clearF29() {
            this.f29 = 0L;
            __bitField0 &= ~134217728;
            return this;
        }

        public boolean hasF29() {
            return (__bitField0 & 134217728) == 134217728;
        }

        public long getF30() {
            return f30;
        }

        public Builder setF30(long value) {
            this.f30 = value;
            __bitField0 |= 268435456;
            return this;
        }

        public Builder clearF30() {
            this.f30 = 0L;
            __bitField0 &= ~268435456;
            return this;
        }

        public boolean hasF30() {
            return (__bitField0 & 268435456) == 268435456;
        }

        public long getF31() {
            return f31;
        }

        public Builder setF31(long value) {
            this.f31 = value;
            __bitField0 |= 536870912;
            return this;
        }

        public Builder clearF31() {
            this.f31 = 0L;
            __bitField0 &= ~536870912;
            return this;
        }

        public boolean hasF31() {
            return (__bitField0 & 536870912) == 536870912;
        }

        public long getF32() {
            return f32;
        }

        public Builder setF32(long value) {
            this.f32 = value;
            __bitField0 |= 1073741824;
            return this;
        }

        public Builder clearF32() {
            this.f32 = 0L;
            __bitField0 &= ~1073741824;
            return this;
        }

        public boolean hasF32() {
            return (__bitField0 & 1073741824) == 1073741824;
        }

        public io.protostuff.ByteString getF33() {
            return f33;
        }

        public Builder setF33(io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f33 to null");
            }

            this.f33 = value;
            __bitField0 |= -2147483648;
            return this;
        }

        public Builder clearF33() {
            this.f33 = io.protostuff.ByteString.EMPTY;
            __bitField0 &= ~-2147483648;
            return this;
        }

        public boolean hasF33() {
            return (__bitField0 & -2147483648) == -2147483648;
        }

        public int getCountryCode() {
            return countryCode;
        }

        public Builder setCountryCode(int value) {
            this.countryCode = value;
            __bitField1 |= 1;
            return this;
        }

        public Builder clearCountryCode() {
            this.countryCode = 0;
            __bitField1 &= ~1;
            return this;
        }

        public boolean hasCountryCode() {
            return (__bitField1 & 1) == 1;
        }

        public int getTotalDistanceInMeters() {
            return totalDistanceInMeters;
        }

        public Builder setTotalDistanceInMeters(int value) {
            this.totalDistanceInMeters = value;
            __bitField1 |= 2;
            return this;
        }

        public Builder clearTotalDistanceInMeters() {
            this.totalDistanceInMeters = 0;
            __bitField1 &= ~2;
            return this;
        }

        public boolean hasTotalDistanceInMeters() {
            return (__bitField1 & 2) == 2;
        }

        public int getElevationGainInMeters() {
            return elevationGainInMeters;
        }

        public Builder setElevationGainInMeters(int value) {
            this.elevationGainInMeters = value;
            __bitField1 |= 4;
            return this;
        }

        public Builder clearElevationGainInMeters() {
            this.elevationGainInMeters = 0;
            __bitField1 &= ~4;
            return this;
        }

        public boolean hasElevationGainInMeters() {
            return (__bitField1 & 4) == 4;
        }

        public int getTimeRiddenInMinutes() {
            return timeRiddenInMinutes;
        }

        public Builder setTimeRiddenInMinutes(int value) {
            this.timeRiddenInMinutes = value;
            __bitField1 |= 8;
            return this;
        }

        public Builder clearTimeRiddenInMinutes() {
            this.timeRiddenInMinutes = 0;
            __bitField1 &= ~8;
            return this;
        }

        public boolean hasTimeRiddenInMinutes() {
            return (__bitField1 & 8) == 8;
        }

        public int getF38() {
            return f38;
        }

        public Builder setF38(int value) {
            this.f38 = value;
            __bitField1 |= 16;
            return this;
        }

        public Builder clearF38() {
            this.f38 = 0;
            __bitField1 &= ~16;
            return this;
        }

        public boolean hasF38() {
            return (__bitField1 & 16) == 16;
        }

        public int getF39() {
            return f39;
        }

        public Builder setF39(int value) {
            this.f39 = value;
            __bitField1 |= 32;
            return this;
        }

        public Builder clearF39() {
            this.f39 = 0;
            __bitField1 &= ~32;
            return this;
        }

        public boolean hasF39() {
            return (__bitField1 & 32) == 32;
        }

        public int getF40() {
            return f40;
        }

        public Builder setF40(int value) {
            this.f40 = value;
            __bitField1 |= 64;
            return this;
        }

        public Builder clearF40() {
            this.f40 = 0;
            __bitField1 &= ~64;
            return this;
        }

        public boolean hasF40() {
            return (__bitField1 & 64) == 64;
        }

        public int getTotalWattHours() {
            return totalWattHours;
        }

        public Builder setTotalWattHours(int value) {
            this.totalWattHours = value;
            __bitField1 |= 128;
            return this;
        }

        public Builder clearTotalWattHours() {
            this.totalWattHours = 0;
            __bitField1 &= ~128;
            return this;
        }

        public boolean hasTotalWattHours() {
            return (__bitField1 & 128) == 128;
        }

        public int getHeightInMillimeters() {
            return heightInMillimeters;
        }

        public Builder setHeightInMillimeters(int value) {
            this.heightInMillimeters = value;
            __bitField1 |= 256;
            return this;
        }

        public Builder clearHeightInMillimeters() {
            this.heightInMillimeters = 0;
            __bitField1 &= ~256;
            return this;
        }

        public boolean hasHeightInMillimeters() {
            return (__bitField1 & 256) == 256;
        }

        public String getDob() {
            return dob;
        }

        public Builder setDob(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#dob to null");
            }

            this.dob = value;
            __bitField1 |= 512;
            return this;
        }

        public Builder clearDob() {
            this.dob = "";
            __bitField1 &= ~512;
            return this;
        }

        public boolean hasDob() {
            return (__bitField1 & 512) == 512;
        }

        public int getF44() {
            return f44;
        }

        public Builder setF44(int value) {
            this.f44 = value;
            __bitField1 |= 1024;
            return this;
        }

        public Builder clearF44() {
            this.f44 = 0;
            __bitField1 &= ~1024;
            return this;
        }

        public boolean hasF44() {
            return (__bitField1 & 1024) == 1024;
        }

        public boolean getF45() {
            return f45;
        }

        public Builder setF45(boolean value) {
            this.f45 = value;
            __bitField1 |= 2048;
            return this;
        }

        public Builder clearF45() {
            this.f45 = false;
            __bitField1 &= ~2048;
            return this;
        }

        public boolean hasF45() {
            return (__bitField1 & 2048) == 2048;
        }

        public int getTotalXp() {
            return totalXp;
        }

        public Builder setTotalXp(int value) {
            this.totalXp = value;
            __bitField1 |= 4096;
            return this;
        }

        public Builder clearTotalXp() {
            this.totalXp = 0;
            __bitField1 &= ~4096;
            return this;
        }

        public boolean hasTotalXp() {
            return (__bitField1 & 4096) == 4096;
        }

        public int getF47() {
            return f47;
        }

        public Builder setF47(int value) {
            this.f47 = value;
            __bitField1 |= 8192;
            return this;
        }

        public Builder clearF47() {
            this.f47 = 0;
            __bitField1 &= ~8192;
            return this;
        }

        public boolean hasF47() {
            return (__bitField1 & 8192) == 8192;
        }

        public org.zwiftj.api.model.Profile.PlayerType getPlayerType() {
            return org.zwiftj.api.model.Profile.PlayerType.valueOf(playerType);
        }

        public int getPlayerTypeValue() {
            return playerType;
        }

        public Builder setPlayerType(org.zwiftj.api.model.Profile.PlayerType value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#playerType to null");
            }

            if (value == org.zwiftj.api.model.Profile.PlayerType.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set Profile#playerType to UNRECOGNIZED");
            }

            this.playerType = value.getNumber();
            __bitField1 |= 16384;
            return this;
        }

        public Builder setPlayerTypeValue(int value) {
            this.playerType = value;
            __bitField1 |= 16384;
            return this;
        }

        public Builder clearPlayerType() {
            this.playerType = 0;
            __bitField1 &= ~16384;
            return this;
        }

        public boolean hasPlayerType() {
            return (__bitField1 & 16384) == 16384;
        }

        public int getAchievementLevel() {
            return achievementLevel;
        }

        public Builder setAchievementLevel(int value) {
            this.achievementLevel = value;
            __bitField1 |= 32768;
            return this;
        }

        public Builder clearAchievementLevel() {
            this.achievementLevel = 0;
            __bitField1 &= ~32768;
            return this;
        }

        public boolean hasAchievementLevel() {
            return (__bitField1 & 32768) == 32768;
        }

        public boolean getF50() {
            return f50;
        }

        public Builder setF50(boolean value) {
            this.f50 = value;
            __bitField1 |= 65536;
            return this;
        }

        public Builder clearF50() {
            this.f50 = false;
            __bitField1 &= ~65536;
            return this;
        }

        public boolean hasF50() {
            return (__bitField1 & 65536) == 65536;
        }

        public boolean getF51() {
            return f51;
        }

        public Builder setF51(boolean value) {
            this.f51 = value;
            __bitField1 |= 131072;
            return this;
        }

        public Builder clearF51() {
            this.f51 = false;
            __bitField1 &= ~131072;
            return this;
        }

        public boolean hasF51() {
            return (__bitField1 & 131072) == 131072;
        }

        public int getF52() {
            return f52;
        }

        public Builder setF52(int value) {
            this.f52 = value;
            __bitField1 |= 262144;
            return this;
        }

        public Builder clearF52() {
            this.f52 = 0;
            __bitField1 &= ~262144;
            return this;
        }

        public boolean hasF52() {
            return (__bitField1 & 262144) == 262144;
        }

        public int getF53() {
            return f53;
        }

        public Builder setF53(int value) {
            this.f53 = value;
            __bitField1 |= 524288;
            return this;
        }

        public Builder clearF53() {
            this.f53 = 0;
            __bitField1 &= ~524288;
            return this;
        }

        public boolean hasF53() {
            return (__bitField1 & 524288) == 524288;
        }

        public int getF54() {
            return f54;
        }

        public Builder setF54(int value) {
            this.f54 = value;
            __bitField1 |= 1048576;
            return this;
        }

        public Builder clearF54() {
            this.f54 = 0;
            __bitField1 &= ~1048576;
            return this;
        }

        public boolean hasF54() {
            return (__bitField1 & 1048576) == 1048576;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int value) {
            this.age = value;
            __bitField1 |= 2097152;
            return this;
        }

        public Builder clearAge() {
            this.age = 0;
            __bitField1 &= ~2097152;
            return this;
        }

        public boolean hasAge() {
            return (__bitField1 & 2097152) == 2097152;
        }

        public int getF56() {
            return f56;
        }

        public Builder setF56(int value) {
            this.f56 = value;
            __bitField1 |= 4194304;
            return this;
        }

        public Builder clearF56() {
            this.f56 = 0;
            __bitField1 &= ~4194304;
            return this;
        }

        public boolean hasF56() {
            return (__bitField1 & 4194304) == 4194304;
        }

        public int getF57() {
            return f57;
        }

        public Builder setF57(int value) {
            this.f57 = value;
            __bitField1 |= 8388608;
            return this;
        }

        public Builder clearF57() {
            this.f57 = 0;
            __bitField1 &= ~8388608;
            return this;
        }

        public boolean hasF57() {
            return (__bitField1 & 8388608) == 8388608;
        }

        public io.protostuff.ByteString getF58() {
            return f58;
        }

        public Builder setF58(io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f58 to null");
            }

            this.f58 = value;
            __bitField1 |= 16777216;
            return this;
        }

        public Builder clearF58() {
            this.f58 = io.protostuff.ByteString.EMPTY;
            __bitField1 &= ~16777216;
            return this;
        }

        public boolean hasF58() {
            return (__bitField1 & 16777216) == 16777216;
        }

        public long getF59() {
            return f59;
        }

        public Builder setF59(long value) {
            this.f59 = value;
            __bitField1 |= 33554432;
            return this;
        }

        public Builder clearF59() {
            this.f59 = 0L;
            __bitField1 &= ~33554432;
            return this;
        }

        public boolean hasF59() {
            return (__bitField1 & 33554432) == 33554432;
        }

        public java.util.List<io.protostuff.ByteString> getF60List() {
            return f60;
        }

        public Builder setF60(int index, io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f60 to null");
            }

            if(!((__bitField1 & 67108864) == 67108864)) {
                this.f60 = new java.util.ArrayList<>();
                __bitField1 |= 67108864;
            }
            this.f60.set(index, value);
            return this;
        }

        public Builder addF60(io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f60 to null");
            }

            if(!((__bitField1 & 67108864) == 67108864)) {
                this.f60 = new java.util.ArrayList<>();
                __bitField1 |= 67108864;
            }
            this.f60.add(value);
            return this;
        }

        public Builder addAllF60(java.lang.Iterable<io.protostuff.ByteString> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Profile#f60 to null");
            }
            if(!((__bitField1 & 67108864) == 67108864)) {
                this.f60 = new java.util.ArrayList<>();
                __bitField1 |= 67108864;
            }
            for (final io.protostuff.ByteString value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Profile#f60 to null");
                }
                this.f60.add(value);
            }
            return this;
        }

        public Builder clearF60() {
            this.f60 = java.util.Collections.emptyList();
            __bitField1 &= ~67108864;
            return this;
        }

        public int getF60Count() {
            return f60.size();
        }

        public io.protostuff.ByteString getF60(int index) {
            return f60.get(index);
        }

        public org.zwiftj.api.model.Profile.ProfileSocialFacts getSocialFacts() {
            return socialFacts;
        }

        public Builder setSocialFacts(org.zwiftj.api.model.Profile.ProfileSocialFacts value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#socialFacts to null");
            }

            this.socialFacts = value;
            __bitField1 |= 134217728;
            return this;
        }

        public Builder clearSocialFacts() {
            this.socialFacts = org.zwiftj.api.model.Profile.ProfileSocialFacts.getDefaultInstance();
            __bitField1 &= ~134217728;
            return this;
        }

        public boolean hasSocialFacts() {
            return (__bitField1 & 134217728) == 134217728;
        }

        public org.zwiftj.api.model.ProfileFollowStatus getF62() {
            return org.zwiftj.api.model.ProfileFollowStatus.valueOf(f62);
        }

        public int getF62Value() {
            return f62;
        }

        public Builder setF62(org.zwiftj.api.model.ProfileFollowStatus value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f62 to null");
            }

            if (value == org.zwiftj.api.model.ProfileFollowStatus.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set Profile#f62 to UNRECOGNIZED");
            }

            this.f62 = value.getNumber();
            __bitField1 |= 268435456;
            return this;
        }

        public Builder setF62Value(int value) {
            this.f62 = value;
            __bitField1 |= 268435456;
            return this;
        }

        public Builder clearF62() {
            this.f62 = 0;
            __bitField1 &= ~268435456;
            return this;
        }

        public boolean hasF62() {
            return (__bitField1 & 268435456) == 268435456;
        }

        public boolean getF63() {
            return f63;
        }

        public Builder setF63(boolean value) {
            this.f63 = value;
            __bitField1 |= 536870912;
            return this;
        }

        public Builder clearF63() {
            this.f63 = false;
            __bitField1 &= ~536870912;
            return this;
        }

        public boolean hasF63() {
            return (__bitField1 & 536870912) == 536870912;
        }

        public boolean getF64() {
            return f64;
        }

        public Builder setF64(boolean value) {
            this.f64 = value;
            __bitField1 |= 1073741824;
            return this;
        }

        public Builder clearF64() {
            this.f64 = false;
            __bitField1 &= ~1073741824;
            return this;
        }

        public boolean hasF64() {
            return (__bitField1 & 1073741824) == 1073741824;
        }

        public org.zwiftj.api.model.Profile.ProfileEnrolledProgram getF65() {
            return org.zwiftj.api.model.Profile.ProfileEnrolledProgram.valueOf(f65);
        }

        public int getF65Value() {
            return f65;
        }

        public Builder setF65(org.zwiftj.api.model.Profile.ProfileEnrolledProgram value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f65 to null");
            }

            if (value == org.zwiftj.api.model.Profile.ProfileEnrolledProgram.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set Profile#f65 to UNRECOGNIZED");
            }

            this.f65 = value.getNumber();
            __bitField1 |= -2147483648;
            return this;
        }

        public Builder setF65Value(int value) {
            this.f65 = value;
            __bitField1 |= -2147483648;
            return this;
        }

        public Builder clearF65() {
            this.f65 = 0;
            __bitField1 &= ~-2147483648;
            return this;
        }

        public boolean hasF65() {
            return (__bitField1 & -2147483648) == -2147483648;
        }

        public io.protostuff.ByteString getF66() {
            return f66;
        }

        public Builder setF66(io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f66 to null");
            }

            this.f66 = value;
            __bitField2 |= 1;
            return this;
        }

        public Builder clearF66() {
            this.f66 = io.protostuff.ByteString.EMPTY;
            __bitField2 &= ~1;
            return this;
        }

        public boolean hasF66() {
            return (__bitField2 & 1) == 1;
        }

        public int getF67() {
            return f67;
        }

        public Builder setF67(int value) {
            this.f67 = value;
            __bitField2 |= 2;
            return this;
        }

        public Builder clearF67() {
            this.f67 = 0;
            __bitField2 &= ~2;
            return this;
        }

        public boolean hasF67() {
            return (__bitField2 & 2) == 2;
        }

        public int getF68() {
            return f68;
        }

        public Builder setF68(int value) {
            this.f68 = value;
            __bitField2 |= 4;
            return this;
        }

        public Builder clearF68() {
            this.f68 = 0;
            __bitField2 &= ~4;
            return this;
        }

        public boolean hasF68() {
            return (__bitField2 & 4) == 4;
        }

        public int getF69() {
            return f69;
        }

        public Builder setF69(int value) {
            this.f69 = value;
            __bitField2 |= 8;
            return this;
        }

        public Builder clearF69() {
            this.f69 = 0;
            __bitField2 &= ~8;
            return this;
        }

        public boolean hasF69() {
            return (__bitField2 & 8) == 8;
        }

        public int getF70() {
            return f70;
        }

        public Builder setF70(int value) {
            this.f70 = value;
            __bitField2 |= 16;
            return this;
        }

        public Builder clearF70() {
            this.f70 = 0;
            __bitField2 &= ~16;
            return this;
        }

        public boolean hasF70() {
            return (__bitField2 & 16) == 16;
        }

        public int getF71() {
            return f71;
        }

        public Builder setF71(int value) {
            this.f71 = value;
            __bitField2 |= 32;
            return this;
        }

        public Builder clearF71() {
            this.f71 = 0;
            __bitField2 &= ~32;
            return this;
        }

        public boolean hasF71() {
            return (__bitField2 & 32) == 32;
        }

        public int getF72() {
            return f72;
        }

        public Builder setF72(int value) {
            this.f72 = value;
            __bitField2 |= 64;
            return this;
        }

        public Builder clearF72() {
            this.f72 = 0;
            __bitField2 &= ~64;
            return this;
        }

        public boolean hasF72() {
            return (__bitField2 & 64) == 64;
        }

        public int getF73() {
            return f73;
        }

        public Builder setF73(int value) {
            this.f73 = value;
            __bitField2 |= 128;
            return this;
        }

        public Builder clearF73() {
            this.f73 = 0;
            __bitField2 &= ~128;
            return this;
        }

        public boolean hasF73() {
            return (__bitField2 & 128) == 128;
        }

        public int getF74() {
            return f74;
        }

        public Builder setF74(int value) {
            this.f74 = value;
            __bitField2 |= 256;
            return this;
        }

        public Builder clearF74() {
            this.f74 = 0;
            __bitField2 &= ~256;
            return this;
        }

        public boolean hasF74() {
            return (__bitField2 & 256) == 256;
        }

        public int getF75() {
            return f75;
        }

        public Builder setF75(int value) {
            this.f75 = value;
            __bitField2 |= 512;
            return this;
        }

        public Builder clearF75() {
            this.f75 = 0;
            __bitField2 &= ~512;
            return this;
        }

        public boolean hasF75() {
            return (__bitField2 & 512) == 512;
        }

        public int getF76() {
            return f76;
        }

        public Builder setF76(int value) {
            this.f76 = value;
            __bitField2 |= 1024;
            return this;
        }

        public Builder clearF76() {
            this.f76 = 0;
            __bitField2 &= ~1024;
            return this;
        }

        public boolean hasF76() {
            return (__bitField2 & 1024) == 1024;
        }

        public int getF77() {
            return f77;
        }

        public Builder setF77(int value) {
            this.f77 = value;
            __bitField2 |= 2048;
            return this;
        }

        public Builder clearF77() {
            this.f77 = 0;
            __bitField2 &= ~2048;
            return this;
        }

        public boolean hasF77() {
            return (__bitField2 & 2048) == 2048;
        }

        public int getF78() {
            return f78;
        }

        public Builder setF78(int value) {
            this.f78 = value;
            __bitField2 |= 4096;
            return this;
        }

        public Builder clearF78() {
            this.f78 = 0;
            __bitField2 &= ~4096;
            return this;
        }

        public boolean hasF78() {
            return (__bitField2 & 4096) == 4096;
        }

        public int getF79() {
            return f79;
        }

        public Builder setF79(int value) {
            this.f79 = value;
            __bitField2 |= 8192;
            return this;
        }

        public Builder clearF79() {
            this.f79 = 0;
            __bitField2 &= ~8192;
            return this;
        }

        public boolean hasF79() {
            return (__bitField2 & 8192) == 8192;
        }

        public int getF80() {
            return f80;
        }

        public Builder setF80(int value) {
            this.f80 = value;
            __bitField2 |= 16384;
            return this;
        }

        public Builder clearF80() {
            this.f80 = 0;
            __bitField2 &= ~16384;
            return this;
        }

        public boolean hasF80() {
            return (__bitField2 & 16384) == 16384;
        }

        public int getF81() {
            return f81;
        }

        public Builder setF81(int value) {
            this.f81 = value;
            __bitField2 |= 32768;
            return this;
        }

        public Builder clearF81() {
            this.f81 = 0;
            __bitField2 &= ~32768;
            return this;
        }

        public boolean hasF81() {
            return (__bitField2 & 32768) == 32768;
        }

        public org.zwiftj.api.model.Subscription getF82() {
            return f82;
        }

        public Builder setF82(org.zwiftj.api.model.Subscription value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f82 to null");
            }

            this.f82 = value;
            __bitField2 |= 65536;
            return this;
        }

        public Builder clearF82() {
            this.f82 = org.zwiftj.api.model.Subscription.getDefaultInstance();
            __bitField2 &= ~65536;
            return this;
        }

        public boolean hasF82() {
            return (__bitField2 & 65536) == 65536;
        }

        public String getMixPanelDistinctId() {
            return mixPanelDistinctId;
        }

        public Builder setMixPanelDistinctId(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#mixPanelDistinctId to null");
            }

            this.mixPanelDistinctId = value;
            __bitField2 |= 131072;
            return this;
        }

        public Builder clearMixPanelDistinctId() {
            this.mixPanelDistinctId = "";
            __bitField2 &= ~131072;
            return this;
        }

        public boolean hasMixPanelDistinctId() {
            return (__bitField2 & 131072) == 131072;
        }

        public int getF84() {
            return f84;
        }

        public Builder setF84(int value) {
            this.f84 = value;
            __bitField2 |= 262144;
            return this;
        }

        public Builder clearF84() {
            this.f84 = 0;
            __bitField2 &= ~262144;
            return this;
        }

        public boolean hasF84() {
            return (__bitField2 & 262144) == 262144;
        }

        public int getF85() {
            return f85;
        }

        public Builder setF85(int value) {
            this.f85 = value;
            __bitField2 |= 524288;
            return this;
        }

        public Builder clearF85() {
            this.f85 = 0;
            __bitField2 &= ~524288;
            return this;
        }

        public boolean hasF85() {
            return (__bitField2 & 524288) == 524288;
        }

        public org.zwiftj.api.model.Profile.Sport getSport() {
            return org.zwiftj.api.model.Profile.Sport.valueOf(sport);
        }

        public int getSportValue() {
            return sport;
        }

        public Builder setSport(org.zwiftj.api.model.Profile.Sport value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#sport to null");
            }

            if (value == org.zwiftj.api.model.Profile.Sport.UNRECOGNIZED) {
                throw new IllegalArgumentException("Cannot set Profile#sport to UNRECOGNIZED");
            }

            this.sport = value.getNumber();
            __bitField2 |= 1048576;
            return this;
        }

        public Builder setSportValue(int value) {
            this.sport = value;
            __bitField2 |= 1048576;
            return this;
        }

        public Builder clearSport() {
            this.sport = 0;
            __bitField2 &= ~1048576;
            return this;
        }

        public boolean hasSport() {
            return (__bitField2 & 1048576) == 1048576;
        }

        public int getF87() {
            return f87;
        }

        public Builder setF87(int value) {
            this.f87 = value;
            __bitField2 |= 2097152;
            return this;
        }

        public Builder clearF87() {
            this.f87 = 0;
            __bitField2 &= ~2097152;
            return this;
        }

        public boolean hasF87() {
            return (__bitField2 & 2097152) == 2097152;
        }

        public boolean getF88() {
            return f88;
        }

        public Builder setF88(boolean value) {
            this.f88 = value;
            __bitField2 |= 4194304;
            return this;
        }

        public Builder clearF88() {
            this.f88 = false;
            __bitField2 &= ~4194304;
            return this;
        }

        public boolean hasF88() {
            return (__bitField2 & 4194304) == 4194304;
        }

        public String getPreferredLanguage() {
            return preferredLanguage;
        }

        public Builder setPreferredLanguage(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#preferredLanguage to null");
            }

            this.preferredLanguage = value;
            __bitField2 |= 8388608;
            return this;
        }

        public Builder clearPreferredLanguage() {
            this.preferredLanguage = "";
            __bitField2 &= ~8388608;
            return this;
        }

        public boolean hasPreferredLanguage() {
            return (__bitField2 & 8388608) == 8388608;
        }

        public int getF90() {
            return f90;
        }

        public Builder setF90(int value) {
            this.f90 = value;
            __bitField2 |= 16777216;
            return this;
        }

        public Builder clearF90() {
            this.f90 = 0;
            __bitField2 &= ~16777216;
            return this;
        }

        public boolean hasF90() {
            return (__bitField2 & 16777216) == 16777216;
        }

        public int getF91() {
            return f91;
        }

        public Builder setF91(int value) {
            this.f91 = value;
            __bitField2 |= 33554432;
            return this;
        }

        public Builder clearF91() {
            this.f91 = 0;
            __bitField2 &= ~33554432;
            return this;
        }

        public boolean hasF91() {
            return (__bitField2 & 33554432) == 33554432;
        }

        public int getF92() {
            return f92;
        }

        public Builder setF92(int value) {
            this.f92 = value;
            __bitField2 |= 67108864;
            return this;
        }

        public Builder clearF92() {
            this.f92 = 0;
            __bitField2 &= ~67108864;
            return this;
        }

        public boolean hasF92() {
            return (__bitField2 & 67108864) == 67108864;
        }

        public int getF93() {
            return f93;
        }

        public Builder setF93(int value) {
            this.f93 = value;
            __bitField2 |= 134217728;
            return this;
        }

        public Builder clearF93() {
            this.f93 = 0;
            __bitField2 &= ~134217728;
            return this;
        }

        public boolean hasF93() {
            return (__bitField2 & 134217728) == 134217728;
        }

        public int getF94() {
            return f94;
        }

        public Builder setF94(int value) {
            this.f94 = value;
            __bitField2 |= 268435456;
            return this;
        }

        public Builder clearF94() {
            this.f94 = 0;
            __bitField2 &= ~268435456;
            return this;
        }

        public boolean hasF94() {
            return (__bitField2 & 268435456) == 268435456;
        }

        public int getF95() {
            return f95;
        }

        public Builder setF95(int value) {
            this.f95 = value;
            __bitField2 |= 536870912;
            return this;
        }

        public Builder clearF95() {
            this.f95 = 0;
            __bitField2 &= ~536870912;
            return this;
        }

        public boolean hasF95() {
            return (__bitField2 & 536870912) == 536870912;
        }

        public int getF96() {
            return f96;
        }

        public Builder setF96(int value) {
            this.f96 = value;
            __bitField2 |= 1073741824;
            return this;
        }

        public Builder clearF96() {
            this.f96 = 0;
            __bitField2 &= ~1073741824;
            return this;
        }

        public boolean hasF96() {
            return (__bitField2 & 1073741824) == 1073741824;
        }

        public int getF97() {
            return f97;
        }

        public Builder setF97(int value) {
            this.f97 = value;
            __bitField2 |= -2147483648;
            return this;
        }

        public Builder clearF97() {
            this.f97 = 0;
            __bitField2 &= ~-2147483648;
            return this;
        }

        public boolean hasF97() {
            return (__bitField2 & -2147483648) == -2147483648;
        }

        public int getF98() {
            return f98;
        }

        public Builder setF98(int value) {
            this.f98 = value;
            __bitField3 |= 1;
            return this;
        }

        public Builder clearF98() {
            this.f98 = 0;
            __bitField3 &= ~1;
            return this;
        }

        public boolean hasF98() {
            return (__bitField3 & 1) == 1;
        }

        public int getF99() {
            return f99;
        }

        public Builder setF99(int value) {
            this.f99 = value;
            __bitField3 |= 2;
            return this;
        }

        public Builder clearF99() {
            this.f99 = 0;
            __bitField3 &= ~2;
            return this;
        }

        public boolean hasF99() {
            return (__bitField3 & 2) == 2;
        }

        public int getF100() {
            return f100;
        }

        public Builder setF100(int value) {
            this.f100 = value;
            __bitField3 |= 4;
            return this;
        }

        public Builder clearF100() {
            this.f100 = 0;
            __bitField3 &= ~4;
            return this;
        }

        public boolean hasF100() {
            return (__bitField3 & 4) == 4;
        }

        public int getF101() {
            return f101;
        }

        public Builder setF101(int value) {
            this.f101 = value;
            __bitField3 |= 8;
            return this;
        }

        public Builder clearF101() {
            this.f101 = 0;
            __bitField3 &= ~8;
            return this;
        }

        public boolean hasF101() {
            return (__bitField3 & 8) == 8;
        }

        public int getF102() {
            return f102;
        }

        public Builder setF102(int value) {
            this.f102 = value;
            __bitField3 |= 16;
            return this;
        }

        public Builder clearF102() {
            this.f102 = 0;
            __bitField3 &= ~16;
            return this;
        }

        public boolean hasF102() {
            return (__bitField3 & 16) == 16;
        }

        public int getF103() {
            return f103;
        }

        public Builder setF103(int value) {
            this.f103 = value;
            __bitField3 |= 32;
            return this;
        }

        public Builder clearF103() {
            this.f103 = 0;
            __bitField3 &= ~32;
            return this;
        }

        public boolean hasF103() {
            return (__bitField3 & 32) == 32;
        }

        public int getF104() {
            return f104;
        }

        public Builder setF104(int value) {
            this.f104 = value;
            __bitField3 |= 64;
            return this;
        }

        public Builder clearF104() {
            this.f104 = 0;
            __bitField3 &= ~64;
            return this;
        }

        public boolean hasF104() {
            return (__bitField3 & 64) == 64;
        }

        public boolean getF105() {
            return f105;
        }

        public Builder setF105(boolean value) {
            this.f105 = value;
            __bitField3 |= 128;
            return this;
        }

        public Builder clearF105() {
            this.f105 = false;
            __bitField3 &= ~128;
            return this;
        }

        public boolean hasF105() {
            return (__bitField3 & 128) == 128;
        }

        public boolean getF106() {
            return f106;
        }

        public Builder setF106(boolean value) {
            this.f106 = value;
            __bitField3 |= 256;
            return this;
        }

        public Builder clearF106() {
            this.f106 = false;
            __bitField3 &= ~256;
            return this;
        }

        public boolean hasF106() {
            return (__bitField3 & 256) == 256;
        }

        public java.util.List<io.protostuff.ByteString> getF107List() {
            return f107;
        }

        public Builder setF107(int index, io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f107 to null");
            }

            if(!((__bitField3 & 512) == 512)) {
                this.f107 = new java.util.ArrayList<>();
                __bitField3 |= 512;
            }
            this.f107.set(index, value);
            return this;
        }

        public Builder addF107(io.protostuff.ByteString value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f107 to null");
            }

            if(!((__bitField3 & 512) == 512)) {
                this.f107 = new java.util.ArrayList<>();
                __bitField3 |= 512;
            }
            this.f107.add(value);
            return this;
        }

        public Builder addAllF107(java.lang.Iterable<io.protostuff.ByteString> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Profile#f107 to null");
            }
            if(!((__bitField3 & 512) == 512)) {
                this.f107 = new java.util.ArrayList<>();
                __bitField3 |= 512;
            }
            for (final io.protostuff.ByteString value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Profile#f107 to null");
                }
                this.f107.add(value);
            }
            return this;
        }

        public Builder clearF107() {
            this.f107 = java.util.Collections.emptyList();
            __bitField3 &= ~512;
            return this;
        }

        public int getF107Count() {
            return f107.size();
        }

        public io.protostuff.ByteString getF107(int index) {
            return f107.get(index);
        }

        public String getLaunchedGameClient() {
            return launchedGameClient;
        }

        public Builder setLaunchedGameClient(String value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#launchedGameClient to null");
            }

            this.launchedGameClient = value;
            __bitField3 |= 1024;
            return this;
        }

        public Builder clearLaunchedGameClient() {
            this.launchedGameClient = "";
            __bitField3 &= ~1024;
            return this;
        }

        public boolean hasLaunchedGameClient() {
            return (__bitField3 & 1024) == 1024;
        }

        public long getF109() {
            return f109;
        }

        public Builder setF109(long value) {
            this.f109 = value;
            __bitField3 |= 2048;
            return this;
        }

        public Builder clearF109() {
            this.f109 = 0L;
            __bitField3 &= ~2048;
            return this;
        }

        public boolean hasF109() {
            return (__bitField3 & 2048) == 2048;
        }

        public boolean getF110() {
            return f110;
        }

        public Builder setF110(boolean value) {
            this.f110 = value;
            __bitField3 |= 4096;
            return this;
        }

        public Builder clearF110() {
            this.f110 = false;
            __bitField3 &= ~4096;
            return this;
        }

        public boolean hasF110() {
            return (__bitField3 & 4096) == 4096;
        }

        public java.util.List<org.zwiftj.api.model.PacerSetting> getF114List() {
            return f114;
        }

        public Builder setF114(int index, org.zwiftj.api.model.PacerSetting value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f114 to null");
            }

            if(!((__bitField3 & 8192) == 8192)) {
                this.f114 = new java.util.ArrayList<>();
                __bitField3 |= 8192;
            }
            this.f114.set(index, value);
            return this;
        }

        public Builder addF114(org.zwiftj.api.model.PacerSetting value) {
            if (value == null) {
                throw new NullPointerException("Cannot set Profile#f114 to null");
            }

            if(!((__bitField3 & 8192) == 8192)) {
                this.f114 = new java.util.ArrayList<>();
                __bitField3 |= 8192;
            }
            this.f114.add(value);
            return this;
        }

        public Builder addAllF114(java.lang.Iterable<org.zwiftj.api.model.PacerSetting> values) {
            if (values == null) {
                throw new NullPointerException("Cannot set Profile#f114 to null");
            }
            if(!((__bitField3 & 8192) == 8192)) {
                this.f114 = new java.util.ArrayList<>();
                __bitField3 |= 8192;
            }
            for (final org.zwiftj.api.model.PacerSetting value : values) {
                if (value == null) {
                   throw new NullPointerException("Cannot set Profile#f114 to null");
                }
                this.f114.add(value);
            }
            return this;
        }

        public Builder clearF114() {
            this.f114 = java.util.Collections.emptyList();
            __bitField3 &= ~8192;
            return this;
        }

        public int getF114Count() {
            return f114.size();
        }

        public org.zwiftj.api.model.PacerSetting getF114(int index) {
            return f114.get(index);
        }

        public int getF117() {
            return f117;
        }

        public Builder setF117(int value) {
            this.f117 = value;
            __bitField3 |= 16384;
            return this;
        }

        public Builder clearF117() {
            this.f117 = 0;
            __bitField3 &= ~16384;
            return this;
        }

        public boolean hasF117() {
            return (__bitField3 & 16384) == 16384;
        }

        public int getF118() {
            return f118;
        }

        public Builder setF118(int value) {
            this.f118 = value;
            __bitField3 |= 32768;
            return this;
        }

        public Builder clearF118() {
            this.f118 = 0;
            __bitField3 &= ~32768;
            return this;
        }

        public boolean hasF118() {
            return (__bitField3 & 32768) == 32768;
        }

        public int getF119() {
            return f119;
        }

        public Builder setF119(int value) {
            this.f119 = value;
            __bitField3 |= 65536;
            return this;
        }

        public Builder clearF119() {
            this.f119 = 0;
            __bitField3 &= ~65536;
            return this;
        }

        public boolean hasF119() {
            return (__bitField3 & 65536) == 65536;
        }

        public int getF120() {
            return f120;
        }

        public Builder setF120(int value) {
            this.f120 = value;
            __bitField3 |= 131072;
            return this;
        }

        public Builder clearF120() {
            this.f120 = 0;
            __bitField3 &= ~131072;
            return this;
        }

        public boolean hasF120() {
            return (__bitField3 & 131072) == 131072;
        }

        public int getF121() {
            return f121;
        }

        public Builder setF121(int value) {
            this.f121 = value;
            __bitField3 |= 262144;
            return this;
        }

        public Builder clearF121() {
            this.f121 = 0;
            __bitField3 &= ~262144;
            return this;
        }

        public boolean hasF121() {
            return (__bitField3 & 262144) == 262144;
        }

        public int getF125() {
            return f125;
        }

        public Builder setF125(int value) {
            this.f125 = value;
            __bitField3 |= 524288;
            return this;
        }

        public Builder clearF125() {
            this.f125 = 0;
            __bitField3 &= ~524288;
            return this;
        }

        public boolean hasF125() {
            return (__bitField3 & 524288) == 524288;
        }




        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }
            Builder that = (Builder) obj;
            if (!java.util.Objects.equals(this.id, that.id)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isConnectedToStrava, that.isConnectedToStrava)) {
                return false;
            }
            if (!java.util.Objects.equals(this.email, that.email)) {
                return false;
            }
            if (!java.util.Objects.equals(this.firstName, that.firstName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.lastName, that.lastName)) {
                return false;
            }
            if (!java.util.Objects.equals(this.isMale, that.isMale)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f7, that.f7)) {
                return false;
            }
            if (!java.util.Objects.equals(this.weightInGrams, that.weightInGrams)) {
                return false;
            }
            if (!java.util.Objects.equals(this.ftp, that.ftp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f11, that.f11)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f12, that.f12)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f13, that.f13)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f14, that.f14)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f15, that.f15)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f16, that.f16)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f17, that.f17)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f18, that.f18)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f19, that.f19)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f20, that.f20)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f21, that.f21)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f22, that.f22)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f23, that.f23)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f24, that.f24)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f25, that.f25)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f26, that.f26)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f27, that.f27)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f28, that.f28)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f29, that.f29)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f30, that.f30)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f31, that.f31)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f32, that.f32)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f33, that.f33)) {
                return false;
            }
            if (!java.util.Objects.equals(this.countryCode, that.countryCode)) {
                return false;
            }
            if (!java.util.Objects.equals(this.totalDistanceInMeters, that.totalDistanceInMeters)) {
                return false;
            }
            if (!java.util.Objects.equals(this.elevationGainInMeters, that.elevationGainInMeters)) {
                return false;
            }
            if (!java.util.Objects.equals(this.timeRiddenInMinutes, that.timeRiddenInMinutes)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f38, that.f38)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f39, that.f39)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f40, that.f40)) {
                return false;
            }
            if (!java.util.Objects.equals(this.totalWattHours, that.totalWattHours)) {
                return false;
            }
            if (!java.util.Objects.equals(this.heightInMillimeters, that.heightInMillimeters)) {
                return false;
            }
            if (!java.util.Objects.equals(this.dob, that.dob)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f44, that.f44)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f45, that.f45)) {
                return false;
            }
            if (!java.util.Objects.equals(this.totalXp, that.totalXp)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f47, that.f47)) {
                return false;
            }
            if (!java.util.Objects.equals(this.playerType, that.playerType)) {
                return false;
            }
            if (!java.util.Objects.equals(this.achievementLevel, that.achievementLevel)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f50, that.f50)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f51, that.f51)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f52, that.f52)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f53, that.f53)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f54, that.f54)) {
                return false;
            }
            if (!java.util.Objects.equals(this.age, that.age)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f56, that.f56)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f57, that.f57)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f58, that.f58)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f59, that.f59)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f60, that.f60)) {
                return false;
            }
            if (!java.util.Objects.equals(this.socialFacts, that.socialFacts)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f62, that.f62)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f63, that.f63)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f64, that.f64)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f65, that.f65)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f66, that.f66)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f67, that.f67)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f68, that.f68)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f69, that.f69)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f70, that.f70)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f71, that.f71)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f72, that.f72)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f73, that.f73)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f74, that.f74)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f75, that.f75)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f76, that.f76)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f77, that.f77)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f78, that.f78)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f79, that.f79)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f80, that.f80)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f81, that.f81)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f82, that.f82)) {
                return false;
            }
            if (!java.util.Objects.equals(this.mixPanelDistinctId, that.mixPanelDistinctId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f84, that.f84)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f85, that.f85)) {
                return false;
            }
            if (!java.util.Objects.equals(this.sport, that.sport)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f87, that.f87)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f88, that.f88)) {
                return false;
            }
            if (!java.util.Objects.equals(this.preferredLanguage, that.preferredLanguage)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f90, that.f90)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f91, that.f91)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f92, that.f92)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f93, that.f93)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f94, that.f94)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f95, that.f95)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f96, that.f96)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f97, that.f97)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f98, that.f98)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f99, that.f99)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f100, that.f100)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f101, that.f101)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f102, that.f102)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f103, that.f103)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f104, that.f104)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f105, that.f105)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f106, that.f106)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f107, that.f107)) {
                return false;
            }
            if (!java.util.Objects.equals(this.launchedGameClient, that.launchedGameClient)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f109, that.f109)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f110, that.f110)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f114, that.f114)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f117, that.f117)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f118, that.f118)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f119, that.f119)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f120, that.f120)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f121, that.f121)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f125, that.f125)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.id);
            result = 31 * result + Integer.hashCode(this.isConnectedToStrava);
            result = 31 * result + (this.email == null ? 0 : this.email.hashCode());
            result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
            result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
            result = 31 * result + Boolean.hashCode(this.isMale);
            result = 31 * result + (this.f7 == null ? 0 : this.f7.hashCode());
            result = 31 * result + Integer.hashCode(this.weightInGrams);
            result = 31 * result + Integer.hashCode(this.ftp);
            result = 31 * result + Integer.hashCode(this.f11);
            result = 31 * result + Integer.hashCode(this.f12);
            result = 31 * result + Integer.hashCode(this.f13);
            result = 31 * result + Integer.hashCode(this.f14);
            result = 31 * result + Integer.hashCode(this.f15);
            result = 31 * result + Integer.hashCode(this.f16);
            result = 31 * result + Integer.hashCode(this.f17);
            result = 31 * result + Integer.hashCode(this.f18);
            result = 31 * result + Integer.hashCode(this.f19);
            result = 31 * result + Integer.hashCode(this.f20);
            result = 31 * result + Integer.hashCode(this.f21);
            result = 31 * result + Integer.hashCode(this.f22);
            result = 31 * result + Integer.hashCode(this.f23);
            result = 31 * result + Integer.hashCode(this.f24);
            result = 31 * result + Integer.hashCode(this.f25);
            result = 31 * result + Integer.hashCode(this.f26);
            result = 31 * result + Long.hashCode(this.f27);
            result = 31 * result + Long.hashCode(this.f28);
            result = 31 * result + Long.hashCode(this.f29);
            result = 31 * result + Long.hashCode(this.f30);
            result = 31 * result + Long.hashCode(this.f31);
            result = 31 * result + Long.hashCode(this.f32);
            result = 31 * result + (this.f33 == null ? 0 : this.f33.hashCode());
            result = 31 * result + Integer.hashCode(this.countryCode);
            result = 31 * result + Integer.hashCode(this.totalDistanceInMeters);
            result = 31 * result + Integer.hashCode(this.elevationGainInMeters);
            result = 31 * result + Integer.hashCode(this.timeRiddenInMinutes);
            result = 31 * result + Integer.hashCode(this.f38);
            result = 31 * result + Integer.hashCode(this.f39);
            result = 31 * result + Integer.hashCode(this.f40);
            result = 31 * result + Integer.hashCode(this.totalWattHours);
            result = 31 * result + Integer.hashCode(this.heightInMillimeters);
            result = 31 * result + (this.dob == null ? 0 : this.dob.hashCode());
            result = 31 * result + Integer.hashCode(this.f44);
            result = 31 * result + Boolean.hashCode(this.f45);
            result = 31 * result + Integer.hashCode(this.totalXp);
            result = 31 * result + Integer.hashCode(this.f47);
            result = 31 * result + Integer.hashCode(this.playerType);
            result = 31 * result + Integer.hashCode(this.achievementLevel);
            result = 31 * result + Boolean.hashCode(this.f50);
            result = 31 * result + Boolean.hashCode(this.f51);
            result = 31 * result + Integer.hashCode(this.f52);
            result = 31 * result + Integer.hashCode(this.f53);
            result = 31 * result + Integer.hashCode(this.f54);
            result = 31 * result + Integer.hashCode(this.age);
            result = 31 * result + Integer.hashCode(this.f56);
            result = 31 * result + Integer.hashCode(this.f57);
            result = 31 * result + (this.f58 == null ? 0 : this.f58.hashCode());
            result = 31 * result + Long.hashCode(this.f59);
            result = 31 * result + (this.f60 == null ? 0 : this.f60.hashCode());
            result = 31 * result + (this.socialFacts == null ? 0 : this.socialFacts.hashCode());
            result = 31 * result + Integer.hashCode(this.f62);
            result = 31 * result + Boolean.hashCode(this.f63);
            result = 31 * result + Boolean.hashCode(this.f64);
            result = 31 * result + Integer.hashCode(this.f65);
            result = 31 * result + (this.f66 == null ? 0 : this.f66.hashCode());
            result = 31 * result + Integer.hashCode(this.f67);
            result = 31 * result + Integer.hashCode(this.f68);
            result = 31 * result + Integer.hashCode(this.f69);
            result = 31 * result + Integer.hashCode(this.f70);
            result = 31 * result + Integer.hashCode(this.f71);
            result = 31 * result + Integer.hashCode(this.f72);
            result = 31 * result + Integer.hashCode(this.f73);
            result = 31 * result + Integer.hashCode(this.f74);
            result = 31 * result + Integer.hashCode(this.f75);
            result = 31 * result + Integer.hashCode(this.f76);
            result = 31 * result + Integer.hashCode(this.f77);
            result = 31 * result + Integer.hashCode(this.f78);
            result = 31 * result + Integer.hashCode(this.f79);
            result = 31 * result + Integer.hashCode(this.f80);
            result = 31 * result + Integer.hashCode(this.f81);
            result = 31 * result + (this.f82 == null ? 0 : this.f82.hashCode());
            result = 31 * result + (this.mixPanelDistinctId == null ? 0 : this.mixPanelDistinctId.hashCode());
            result = 31 * result + Integer.hashCode(this.f84);
            result = 31 * result + Integer.hashCode(this.f85);
            result = 31 * result + Integer.hashCode(this.sport);
            result = 31 * result + Integer.hashCode(this.f87);
            result = 31 * result + Boolean.hashCode(this.f88);
            result = 31 * result + (this.preferredLanguage == null ? 0 : this.preferredLanguage.hashCode());
            result = 31 * result + Integer.hashCode(this.f90);
            result = 31 * result + Integer.hashCode(this.f91);
            result = 31 * result + Integer.hashCode(this.f92);
            result = 31 * result + Integer.hashCode(this.f93);
            result = 31 * result + Integer.hashCode(this.f94);
            result = 31 * result + Integer.hashCode(this.f95);
            result = 31 * result + Integer.hashCode(this.f96);
            result = 31 * result + Integer.hashCode(this.f97);
            result = 31 * result + Integer.hashCode(this.f98);
            result = 31 * result + Integer.hashCode(this.f99);
            result = 31 * result + Integer.hashCode(this.f100);
            result = 31 * result + Integer.hashCode(this.f101);
            result = 31 * result + Integer.hashCode(this.f102);
            result = 31 * result + Integer.hashCode(this.f103);
            result = 31 * result + Integer.hashCode(this.f104);
            result = 31 * result + Boolean.hashCode(this.f105);
            result = 31 * result + Boolean.hashCode(this.f106);
            result = 31 * result + (this.f107 == null ? 0 : this.f107.hashCode());
            result = 31 * result + (this.launchedGameClient == null ? 0 : this.launchedGameClient.hashCode());
            result = 31 * result + Long.hashCode(this.f109);
            result = 31 * result + Boolean.hashCode(this.f110);
            result = 31 * result + (this.f114 == null ? 0 : this.f114.hashCode());
            result = 31 * result + Integer.hashCode(this.f117);
            result = 31 * result + Integer.hashCode(this.f118);
            result = 31 * result + Integer.hashCode(this.f119);
            result = 31 * result + Integer.hashCode(this.f120);
            result = 31 * result + Integer.hashCode(this.f121);
            result = 31 * result + Integer.hashCode(this.f125);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasId()) {
                parts.add("id=" + getId());
            }
            if (hasIsConnectedToStrava()) {
                parts.add("isConnectedToStrava=" + getIsConnectedToStrava());
            }
            if (hasEmail()) {
                parts.add("email=" + getEmail());
            }
            if (hasFirstName()) {
                parts.add("firstName=" + getFirstName());
            }
            if (hasLastName()) {
                parts.add("lastName=" + getLastName());
            }
            if (hasIsMale()) {
                parts.add("isMale=" + getIsMale());
            }
            if (hasF7()) {
                parts.add("f7=" + getF7());
            }
            if (hasWeightInGrams()) {
                parts.add("weightInGrams=" + getWeightInGrams());
            }
            if (hasFtp()) {
                parts.add("ftp=" + getFtp());
            }
            if (hasF11()) {
                parts.add("f11=" + getF11());
            }
            if (hasF12()) {
                parts.add("f12=" + getF12());
            }
            if (hasF13()) {
                parts.add("f13=" + getF13());
            }
            if (hasF14()) {
                parts.add("f14=" + getF14());
            }
            if (hasF15()) {
                parts.add("f15=" + getF15());
            }
            if (hasF16()) {
                parts.add("f16=" + getF16());
            }
            if (hasF17()) {
                parts.add("f17=" + getF17());
            }
            if (hasF18()) {
                parts.add("f18=" + getF18());
            }
            if (hasF19()) {
                parts.add("f19=" + getF19());
            }
            if (hasF20()) {
                parts.add("f20=" + getF20());
            }
            if (hasF21()) {
                parts.add("f21=" + getF21());
            }
            if (hasF22()) {
                parts.add("f22=" + getF22());
            }
            if (hasF23()) {
                parts.add("f23=" + getF23());
            }
            if (hasF24()) {
                parts.add("f24=" + getF24());
            }
            if (hasF25()) {
                parts.add("f25=" + getF25());
            }
            if (hasF26()) {
                parts.add("f26=" + getF26());
            }
            if (hasF27()) {
                parts.add("f27=" + getF27());
            }
            if (hasF28()) {
                parts.add("f28=" + getF28());
            }
            if (hasF29()) {
                parts.add("f29=" + getF29());
            }
            if (hasF30()) {
                parts.add("f30=" + getF30());
            }
            if (hasF31()) {
                parts.add("f31=" + getF31());
            }
            if (hasF32()) {
                parts.add("f32=" + getF32());
            }
            if (hasF33()) {
                parts.add("f33=" + getF33());
            }
            if (hasCountryCode()) {
                parts.add("countryCode=" + getCountryCode());
            }
            if (hasTotalDistanceInMeters()) {
                parts.add("totalDistanceInMeters=" + getTotalDistanceInMeters());
            }
            if (hasElevationGainInMeters()) {
                parts.add("elevationGainInMeters=" + getElevationGainInMeters());
            }
            if (hasTimeRiddenInMinutes()) {
                parts.add("timeRiddenInMinutes=" + getTimeRiddenInMinutes());
            }
            if (hasF38()) {
                parts.add("f38=" + getF38());
            }
            if (hasF39()) {
                parts.add("f39=" + getF39());
            }
            if (hasF40()) {
                parts.add("f40=" + getF40());
            }
            if (hasTotalWattHours()) {
                parts.add("totalWattHours=" + getTotalWattHours());
            }
            if (hasHeightInMillimeters()) {
                parts.add("heightInMillimeters=" + getHeightInMillimeters());
            }
            if (hasDob()) {
                parts.add("dob=" + getDob());
            }
            if (hasF44()) {
                parts.add("f44=" + getF44());
            }
            if (hasF45()) {
                parts.add("f45=" + getF45());
            }
            if (hasTotalXp()) {
                parts.add("totalXp=" + getTotalXp());
            }
            if (hasF47()) {
                parts.add("f47=" + getF47());
            }
            if (hasPlayerType()) {
                parts.add("playerType=" + getPlayerType() + '(' + getPlayerTypeValue() + ')');
            }
            if (hasAchievementLevel()) {
                parts.add("achievementLevel=" + getAchievementLevel());
            }
            if (hasF50()) {
                parts.add("f50=" + getF50());
            }
            if (hasF51()) {
                parts.add("f51=" + getF51());
            }
            if (hasF52()) {
                parts.add("f52=" + getF52());
            }
            if (hasF53()) {
                parts.add("f53=" + getF53());
            }
            if (hasF54()) {
                parts.add("f54=" + getF54());
            }
            if (hasAge()) {
                parts.add("age=" + getAge());
            }
            if (hasF56()) {
                parts.add("f56=" + getF56());
            }
            if (hasF57()) {
                parts.add("f57=" + getF57());
            }
            if (hasF58()) {
                parts.add("f58=" + getF58());
            }
            if (hasF59()) {
                parts.add("f59=" + getF59());
            }
            if (!f60.isEmpty()) {
                parts.add("f60=" + getF60List());
            }
            if (hasSocialFacts()) {
                parts.add("socialFacts=" + getSocialFacts());
            }
            if (hasF62()) {
                parts.add("f62=" + getF62() + '(' + getF62Value() + ')');
            }
            if (hasF63()) {
                parts.add("f63=" + getF63());
            }
            if (hasF64()) {
                parts.add("f64=" + getF64());
            }
            if (hasF65()) {
                parts.add("f65=" + getF65() + '(' + getF65Value() + ')');
            }
            if (hasF66()) {
                parts.add("f66=" + getF66());
            }
            if (hasF67()) {
                parts.add("f67=" + getF67());
            }
            if (hasF68()) {
                parts.add("f68=" + getF68());
            }
            if (hasF69()) {
                parts.add("f69=" + getF69());
            }
            if (hasF70()) {
                parts.add("f70=" + getF70());
            }
            if (hasF71()) {
                parts.add("f71=" + getF71());
            }
            if (hasF72()) {
                parts.add("f72=" + getF72());
            }
            if (hasF73()) {
                parts.add("f73=" + getF73());
            }
            if (hasF74()) {
                parts.add("f74=" + getF74());
            }
            if (hasF75()) {
                parts.add("f75=" + getF75());
            }
            if (hasF76()) {
                parts.add("f76=" + getF76());
            }
            if (hasF77()) {
                parts.add("f77=" + getF77());
            }
            if (hasF78()) {
                parts.add("f78=" + getF78());
            }
            if (hasF79()) {
                parts.add("f79=" + getF79());
            }
            if (hasF80()) {
                parts.add("f80=" + getF80());
            }
            if (hasF81()) {
                parts.add("f81=" + getF81());
            }
            if (hasF82()) {
                parts.add("f82=" + getF82());
            }
            if (hasMixPanelDistinctId()) {
                parts.add("mixPanelDistinctId=" + getMixPanelDistinctId());
            }
            if (hasF84()) {
                parts.add("f84=" + getF84());
            }
            if (hasF85()) {
                parts.add("f85=" + getF85());
            }
            if (hasSport()) {
                parts.add("sport=" + getSport() + '(' + getSportValue() + ')');
            }
            if (hasF87()) {
                parts.add("f87=" + getF87());
            }
            if (hasF88()) {
                parts.add("f88=" + getF88());
            }
            if (hasPreferredLanguage()) {
                parts.add("preferredLanguage=" + getPreferredLanguage());
            }
            if (hasF90()) {
                parts.add("f90=" + getF90());
            }
            if (hasF91()) {
                parts.add("f91=" + getF91());
            }
            if (hasF92()) {
                parts.add("f92=" + getF92());
            }
            if (hasF93()) {
                parts.add("f93=" + getF93());
            }
            if (hasF94()) {
                parts.add("f94=" + getF94());
            }
            if (hasF95()) {
                parts.add("f95=" + getF95());
            }
            if (hasF96()) {
                parts.add("f96=" + getF96());
            }
            if (hasF97()) {
                parts.add("f97=" + getF97());
            }
            if (hasF98()) {
                parts.add("f98=" + getF98());
            }
            if (hasF99()) {
                parts.add("f99=" + getF99());
            }
            if (hasF100()) {
                parts.add("f100=" + getF100());
            }
            if (hasF101()) {
                parts.add("f101=" + getF101());
            }
            if (hasF102()) {
                parts.add("f102=" + getF102());
            }
            if (hasF103()) {
                parts.add("f103=" + getF103());
            }
            if (hasF104()) {
                parts.add("f104=" + getF104());
            }
            if (hasF105()) {
                parts.add("f105=" + getF105());
            }
            if (hasF106()) {
                parts.add("f106=" + getF106());
            }
            if (!f107.isEmpty()) {
                parts.add("f107=" + getF107List());
            }
            if (hasLaunchedGameClient()) {
                parts.add("launchedGameClient=" + getLaunchedGameClient());
            }
            if (hasF109()) {
                parts.add("f109=" + getF109());
            }
            if (hasF110()) {
                parts.add("f110=" + getF110());
            }
            if (!f114.isEmpty()) {
                parts.add("f114=" + getF114List());
            }
            if (hasF117()) {
                parts.add("f117=" + getF117());
            }
            if (hasF118()) {
                parts.add("f118=" + getF118());
            }
            if (hasF119()) {
                parts.add("f119=" + getF119());
            }
            if (hasF120()) {
                parts.add("f120=" + getF120());
            }
            if (hasF121()) {
                parts.add("f121=" + getF121());
            }
            if (hasF125()) {
                parts.add("f125=" + getF125());
            }
            return "Profile{" + String.join(", ", parts) + "}";
        }

        public Profile build() {
            org.zwiftj.api.model.Profile result = new org.zwiftj.api.model.Profile();
            result.__bitField0 = __bitField0;
            result.__bitField1 = __bitField1;
            result.__bitField2 = __bitField2;
            result.__bitField3 = __bitField3;
            result.id = this.id;
            result.isConnectedToStrava = this.isConnectedToStrava;
            result.email = this.email;
            result.firstName = this.firstName;
            result.lastName = this.lastName;
            result.isMale = this.isMale;
            result.f7 = this.f7;
            result.weightInGrams = this.weightInGrams;
            result.ftp = this.ftp;
            result.f11 = this.f11;
            result.f12 = this.f12;
            result.f13 = this.f13;
            result.f14 = this.f14;
            result.f15 = this.f15;
            result.f16 = this.f16;
            result.f17 = this.f17;
            result.f18 = this.f18;
            result.f19 = this.f19;
            result.f20 = this.f20;
            result.f21 = this.f21;
            result.f22 = this.f22;
            result.f23 = this.f23;
            result.f24 = this.f24;
            result.f25 = this.f25;
            result.f26 = this.f26;
            result.f27 = this.f27;
            result.f28 = this.f28;
            result.f29 = this.f29;
            result.f30 = this.f30;
            result.f31 = this.f31;
            result.f32 = this.f32;
            result.f33 = this.f33;
            result.countryCode = this.countryCode;
            result.totalDistanceInMeters = this.totalDistanceInMeters;
            result.elevationGainInMeters = this.elevationGainInMeters;
            result.timeRiddenInMinutes = this.timeRiddenInMinutes;
            result.f38 = this.f38;
            result.f39 = this.f39;
            result.f40 = this.f40;
            result.totalWattHours = this.totalWattHours;
            result.heightInMillimeters = this.heightInMillimeters;
            result.dob = this.dob;
            result.f44 = this.f44;
            result.f45 = this.f45;
            result.totalXp = this.totalXp;
            result.f47 = this.f47;
            result.playerType = this.playerType;
            result.achievementLevel = this.achievementLevel;
            result.f50 = this.f50;
            result.f51 = this.f51;
            result.f52 = this.f52;
            result.f53 = this.f53;
            result.f54 = this.f54;
            result.age = this.age;
            result.f56 = this.f56;
            result.f57 = this.f57;
            result.f58 = this.f58;
            result.f59 = this.f59;
            result.f60 = java.util.Collections.unmodifiableList(this.f60);
            result.socialFacts = this.socialFacts;
            result.f62 = this.f62;
            result.f63 = this.f63;
            result.f64 = this.f64;
            result.f65 = this.f65;
            result.f66 = this.f66;
            result.f67 = this.f67;
            result.f68 = this.f68;
            result.f69 = this.f69;
            result.f70 = this.f70;
            result.f71 = this.f71;
            result.f72 = this.f72;
            result.f73 = this.f73;
            result.f74 = this.f74;
            result.f75 = this.f75;
            result.f76 = this.f76;
            result.f77 = this.f77;
            result.f78 = this.f78;
            result.f79 = this.f79;
            result.f80 = this.f80;
            result.f81 = this.f81;
            result.f82 = this.f82;
            result.mixPanelDistinctId = this.mixPanelDistinctId;
            result.f84 = this.f84;
            result.f85 = this.f85;
            result.sport = this.sport;
            result.f87 = this.f87;
            result.f88 = this.f88;
            result.preferredLanguage = this.preferredLanguage;
            result.f90 = this.f90;
            result.f91 = this.f91;
            result.f92 = this.f92;
            result.f93 = this.f93;
            result.f94 = this.f94;
            result.f95 = this.f95;
            result.f96 = this.f96;
            result.f97 = this.f97;
            result.f98 = this.f98;
            result.f99 = this.f99;
            result.f100 = this.f100;
            result.f101 = this.f101;
            result.f102 = this.f102;
            result.f103 = this.f103;
            result.f104 = this.f104;
            result.f105 = this.f105;
            result.f106 = this.f106;
            result.f107 = java.util.Collections.unmodifiableList(this.f107);
            result.launchedGameClient = this.launchedGameClient;
            result.f109 = this.f109;
            result.f110 = this.f110;
            result.f114 = java.util.Collections.unmodifiableList(this.f114);
            result.f117 = this.f117;
            result.f118 = this.f118;
            result.f119 = this.f119;
            result.f120 = this.f120;
            result.f121 = this.f121;
            result.f125 = this.f125;
            return result;
        }

    }

    public static final class ProfileSocialFacts
            implements io.protostuff.Message<ProfileSocialFacts> {

        private static final ProfileSocialFacts DEFAULT_INSTANCE = newBuilder().build();

        private long profileId;

        private long f2;

        private long f3;

        private long f4;

        private int f5;

        private int f6;

        private boolean f7;

        private boolean __merge_lock = false;
        private int __bitField0;

        private ProfileSocialFacts() {
            this.profileId = 0L;
            this.f2 = 0L;
            this.f3 = 0L;
            this.f4 = 0L;
            this.f5 = org.zwiftj.api.model.ProfileFollowStatus.FOLLOWSTATUS0.getNumber();
            this.f6 = org.zwiftj.api.model.ProfileFollowStatus.FOLLOWSTATUS0.getNumber();
            this.f7 = false;
        }

        private ProfileSocialFacts(Builder builder) {
            __merge_lock = true;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static ProfileSocialFacts getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static io.protostuff.Schema<ProfileSocialFacts> getSchema()
        {
        	return Schema.INSTANCE;
        }

        public long getProfileId() {
            return profileId;
        }

        public boolean hasProfileId() {
            return (__bitField0 & 1) == 1;
        }

        public ProfileSocialFacts withProfileId(long value) {
            return ProfileSocialFacts.newBuilder()
                .mergeFrom(this)
                .setProfileId(value)
                .build();
        }

        public long getF2() {
            return f2;
        }

        public boolean hasF2() {
            return (__bitField0 & 2) == 2;
        }

        public ProfileSocialFacts withF2(long value) {
            return ProfileSocialFacts.newBuilder()
                .mergeFrom(this)
                .setF2(value)
                .build();
        }

        public long getF3() {
            return f3;
        }

        public boolean hasF3() {
            return (__bitField0 & 4) == 4;
        }

        public ProfileSocialFacts withF3(long value) {
            return ProfileSocialFacts.newBuilder()
                .mergeFrom(this)
                .setF3(value)
                .build();
        }

        public long getF4() {
            return f4;
        }

        public boolean hasF4() {
            return (__bitField0 & 8) == 8;
        }

        public ProfileSocialFacts withF4(long value) {
            return ProfileSocialFacts.newBuilder()
                .mergeFrom(this)
                .setF4(value)
                .build();
        }

        public org.zwiftj.api.model.ProfileFollowStatus getF5() {
            return org.zwiftj.api.model.ProfileFollowStatus.valueOf(f5);
        }

        public int getF5Value() {
            return f5;
        }

        public boolean hasF5() {
            return (__bitField0 & 16) == 16;
        }

        public ProfileSocialFacts withF5(org.zwiftj.api.model.ProfileFollowStatus value) {
            return ProfileSocialFacts.newBuilder()
                .mergeFrom(this)
                .setF5(value)
                .build();
        }

        public org.zwiftj.api.model.ProfileFollowStatus getF6() {
            return org.zwiftj.api.model.ProfileFollowStatus.valueOf(f6);
        }

        public int getF6Value() {
            return f6;
        }

        public boolean hasF6() {
            return (__bitField0 & 32) == 32;
        }

        public ProfileSocialFacts withF6(org.zwiftj.api.model.ProfileFollowStatus value) {
            return ProfileSocialFacts.newBuilder()
                .mergeFrom(this)
                .setF6(value)
                .build();
        }

        public boolean getF7() {
            return f7;
        }

        public boolean hasF7() {
            return (__bitField0 & 64) == 64;
        }

        public ProfileSocialFacts withF7(boolean value) {
            return ProfileSocialFacts.newBuilder()
                .mergeFrom(this)
                .setF7(value)
                .build();
        }



        @Override
        public io.protostuff.Schema<ProfileSocialFacts> cachedSchema() {
            return Schema.INSTANCE;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            }
            ProfileSocialFacts that = (ProfileSocialFacts) obj;
            if (!java.util.Objects.equals(this.profileId, that.profileId)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f2, that.f2)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f3, that.f3)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f4, that.f4)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f5, that.f5)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f6, that.f6)) {
                return false;
            }
            if (!java.util.Objects.equals(this.f7, that.f7)) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            result = 31 * result + Long.hashCode(this.profileId);
            result = 31 * result + Long.hashCode(this.f2);
            result = 31 * result + Long.hashCode(this.f3);
            result = 31 * result + Long.hashCode(this.f4);
            result = 31 * result + Integer.hashCode(this.f5);
            result = 31 * result + Integer.hashCode(this.f6);
            result = 31 * result + Boolean.hashCode(this.f7);

            return result;
        }

        @Override
        public String toString() {
            java.util.List<String> parts = new java.util.ArrayList<>();
            if (hasProfileId()) {
                parts.add("profileId=" + getProfileId());
            }
            if (hasF2()) {
                parts.add("f2=" + getF2());
            }
            if (hasF3()) {
                parts.add("f3=" + getF3());
            }
            if (hasF4()) {
                parts.add("f4=" + getF4());
            }
            if (hasF5()) {
                parts.add("f5=" + getF5() + '(' + getF5Value() + ')');
            }
            if (hasF6()) {
                parts.add("f6=" + getF6() + '(' + getF6Value() + ')');
            }
            if (hasF7()) {
                parts.add("f7=" + getF7());
            }
            return "ProfileSocialFacts{" + String.join(", ", parts) + "}";
        }

        public static final class Schema implements io.protostuff.Schema<ProfileSocialFacts>{

            private static final Schema INSTANCE = new Schema();

            private static final java.util.Map<String,Integer> __fieldMap = new java.util.HashMap<>();

            static {
            	__fieldMap.put("profileId", 1);
            	__fieldMap.put("f2", 2);
            	__fieldMap.put("f3", 3);
            	__fieldMap.put("f4", 4);
            	__fieldMap.put("f5", 5);
            	__fieldMap.put("f6", 6);
            	__fieldMap.put("f7", 7);
            }

            @Override
            public ProfileSocialFacts newMessage() {
                return new ProfileSocialFacts();
            }

            @Override
            public Class<ProfileSocialFacts> typeClass() {
                return ProfileSocialFacts.class;
            }

            @Override
            public String messageName() {
                return ProfileSocialFacts.class.getSimpleName();
            }

            @Override
            public String messageFullName() {
                return ProfileSocialFacts.class.getName();
            }

            @Override
            @Deprecated
            public boolean isInitialized(ProfileSocialFacts message) {
                return true;
            }

            @Override
            public void mergeFrom(io.protostuff.Input input, ProfileSocialFacts instance) throws java.io.IOException {
            	if (instance.__merge_lock) {
            		throw new IllegalStateException("Cannot reuse message instance");
            	} else {
            		instance.__merge_lock = true;
            	}
            	while(true) {
            		int number = input.readFieldNumber(this);
                    if (number == 0) {
                        break;
                    }
                    switch(number) {
                        case 1:
                        	instance.profileId = input.readInt64();
                        	instance.__bitField0 |= 1;
                        	break;
                        case 2:
                        	instance.f2 = input.readInt64();
                        	instance.__bitField0 |= 2;
                        	break;
                        case 3:
                        	instance.f3 = input.readInt64();
                        	instance.__bitField0 |= 4;
                        	break;
                        case 4:
                        	instance.f4 = input.readInt64();
                        	instance.__bitField0 |= 8;
                        	break;
                        case 5:
                        	instance.f5 = input.readEnum();
                        	instance.__bitField0 |= 16;
                        	break;
                        case 6:
                        	instance.f6 = input.readEnum();
                        	instance.__bitField0 |= 32;
                        	break;
                        case 7:
                        	instance.f7 = input.readBool();
                        	instance.__bitField0 |= 64;
                        	break;
                        default:
                            input.handleUnknownField(number, this);
                    }
            	}
            }

            @Override
            public void writeTo(io.protostuff.Output output, ProfileSocialFacts instance) throws java.io.IOException {
                if((instance.__bitField0 & 1) == 1) {
                    output.writeInt64(1, instance.profileId, false);
                }

                if((instance.__bitField0 & 2) == 2) {
                    output.writeInt64(2, instance.f2, false);
                }

                if((instance.__bitField0 & 4) == 4) {
                    output.writeInt64(3, instance.f3, false);
                }

                if((instance.__bitField0 & 8) == 8) {
                    output.writeInt64(4, instance.f4, false);
                }

                if((instance.__bitField0 & 16) == 16) {
                	output.writeEnum(5, instance.f5, false);
                }

                if((instance.__bitField0 & 32) == 32) {
                	output.writeEnum(6, instance.f6, false);
                }

                if((instance.__bitField0 & 64) == 64) {
                    output.writeBool(7, instance.f7, false);
                }

            }

            @Override
            public String getFieldName(int number) {
            	switch(number) {
            		case 1: return "profileId";
            		case 2: return "f2";
            		case 3: return "f3";
            		case 4: return "f4";
            		case 5: return "f5";
            		case 6: return "f6";
            		case 7: return "f7";
            		default: return null;
            	}
            }

            @Override
            public int getFieldNumber(String name) {
            	final Integer number = __fieldMap.get(name);
            	return number == null ? 0 : number.intValue();
            }

        }

        public static final class Builder  {

            private long profileId;

            private long f2;

            private long f3;

            private long f4;

            private int f5;

            private int f6;

            private boolean f7;

            private int __bitField0;

            private Builder() {
                this.profileId = 0L;
                this.f2 = 0L;
                this.f3 = 0L;
                this.f4 = 0L;
                this.f5 = org.zwiftj.api.model.ProfileFollowStatus.FOLLOWSTATUS0.getNumber();
                this.f6 = org.zwiftj.api.model.ProfileFollowStatus.FOLLOWSTATUS0.getNumber();
                this.f7 = false;
            }

            public Builder mergeFrom(ProfileSocialFacts instance) {
                if (instance.hasProfileId()) {
                    this.setProfileId(instance.getProfileId());
                }

                if (instance.hasF2()) {
                    this.setF2(instance.getF2());
                }

                if (instance.hasF3()) {
                    this.setF3(instance.getF3());
                }

                if (instance.hasF4()) {
                    this.setF4(instance.getF4());
                }

                if (instance.hasF5()) {
                    this.setF5(instance.getF5());
                }

                if (instance.hasF6()) {
                    this.setF6(instance.getF6());
                }

                if (instance.hasF7()) {
                    this.setF7(instance.getF7());
                }

                return this;
            }

            public long getProfileId() {
                return profileId;
            }

            public Builder setProfileId(long value) {
                this.profileId = value;
                __bitField0 |= 1;
                return this;
            }

            public Builder clearProfileId() {
                this.profileId = 0L;
                __bitField0 &= ~1;
                return this;
            }

            public boolean hasProfileId() {
                return (__bitField0 & 1) == 1;
            }

            public long getF2() {
                return f2;
            }

            public Builder setF2(long value) {
                this.f2 = value;
                __bitField0 |= 2;
                return this;
            }

            public Builder clearF2() {
                this.f2 = 0L;
                __bitField0 &= ~2;
                return this;
            }

            public boolean hasF2() {
                return (__bitField0 & 2) == 2;
            }

            public long getF3() {
                return f3;
            }

            public Builder setF3(long value) {
                this.f3 = value;
                __bitField0 |= 4;
                return this;
            }

            public Builder clearF3() {
                this.f3 = 0L;
                __bitField0 &= ~4;
                return this;
            }

            public boolean hasF3() {
                return (__bitField0 & 4) == 4;
            }

            public long getF4() {
                return f4;
            }

            public Builder setF4(long value) {
                this.f4 = value;
                __bitField0 |= 8;
                return this;
            }

            public Builder clearF4() {
                this.f4 = 0L;
                __bitField0 &= ~8;
                return this;
            }

            public boolean hasF4() {
                return (__bitField0 & 8) == 8;
            }

            public org.zwiftj.api.model.ProfileFollowStatus getF5() {
                return org.zwiftj.api.model.ProfileFollowStatus.valueOf(f5);
            }

            public int getF5Value() {
                return f5;
            }

            public Builder setF5(org.zwiftj.api.model.ProfileFollowStatus value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set ProfileSocialFacts#f5 to null");
                }

                if (value == org.zwiftj.api.model.ProfileFollowStatus.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Cannot set ProfileSocialFacts#f5 to UNRECOGNIZED");
                }

                this.f5 = value.getNumber();
                __bitField0 |= 16;
                return this;
            }

            public Builder setF5Value(int value) {
                this.f5 = value;
                __bitField0 |= 16;
                return this;
            }

            public Builder clearF5() {
                this.f5 = 0;
                __bitField0 &= ~16;
                return this;
            }

            public boolean hasF5() {
                return (__bitField0 & 16) == 16;
            }

            public org.zwiftj.api.model.ProfileFollowStatus getF6() {
                return org.zwiftj.api.model.ProfileFollowStatus.valueOf(f6);
            }

            public int getF6Value() {
                return f6;
            }

            public Builder setF6(org.zwiftj.api.model.ProfileFollowStatus value) {
                if (value == null) {
                    throw new NullPointerException("Cannot set ProfileSocialFacts#f6 to null");
                }

                if (value == org.zwiftj.api.model.ProfileFollowStatus.UNRECOGNIZED) {
                    throw new IllegalArgumentException("Cannot set ProfileSocialFacts#f6 to UNRECOGNIZED");
                }

                this.f6 = value.getNumber();
                __bitField0 |= 32;
                return this;
            }

            public Builder setF6Value(int value) {
                this.f6 = value;
                __bitField0 |= 32;
                return this;
            }

            public Builder clearF6() {
                this.f6 = 0;
                __bitField0 &= ~32;
                return this;
            }

            public boolean hasF6() {
                return (__bitField0 & 32) == 32;
            }

            public boolean getF7() {
                return f7;
            }

            public Builder setF7(boolean value) {
                this.f7 = value;
                __bitField0 |= 64;
                return this;
            }

            public Builder clearF7() {
                this.f7 = false;
                __bitField0 &= ~64;
                return this;
            }

            public boolean hasF7() {
                return (__bitField0 & 64) == 64;
            }




            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || this.getClass() != obj.getClass()) {
                    return false;
                }
                Builder that = (Builder) obj;
                if (!java.util.Objects.equals(this.profileId, that.profileId)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.f2, that.f2)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.f3, that.f3)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.f4, that.f4)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.f5, that.f5)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.f6, that.f6)) {
                    return false;
                }
                if (!java.util.Objects.equals(this.f7, that.f7)) {
                    return false;
                }

                return true;
            }

            @Override
            public int hashCode() {
                int result = 1;
                result = 31 * result + Long.hashCode(this.profileId);
                result = 31 * result + Long.hashCode(this.f2);
                result = 31 * result + Long.hashCode(this.f3);
                result = 31 * result + Long.hashCode(this.f4);
                result = 31 * result + Integer.hashCode(this.f5);
                result = 31 * result + Integer.hashCode(this.f6);
                result = 31 * result + Boolean.hashCode(this.f7);

                return result;
            }

            @Override
            public String toString() {
                java.util.List<String> parts = new java.util.ArrayList<>();
                if (hasProfileId()) {
                    parts.add("profileId=" + getProfileId());
                }
                if (hasF2()) {
                    parts.add("f2=" + getF2());
                }
                if (hasF3()) {
                    parts.add("f3=" + getF3());
                }
                if (hasF4()) {
                    parts.add("f4=" + getF4());
                }
                if (hasF5()) {
                    parts.add("f5=" + getF5() + '(' + getF5Value() + ')');
                }
                if (hasF6()) {
                    parts.add("f6=" + getF6() + '(' + getF6Value() + ')');
                }
                if (hasF7()) {
                    parts.add("f7=" + getF7());
                }
                return "ProfileSocialFacts{" + String.join(", ", parts) + "}";
            }

            public ProfileSocialFacts build() {
                org.zwiftj.api.model.Profile.ProfileSocialFacts result = new org.zwiftj.api.model.Profile.ProfileSocialFacts();
                result.__bitField0 = __bitField0;
                result.profileId = this.profileId;
                result.f2 = this.f2;
                result.f3 = this.f3;
                result.f4 = this.f4;
                result.f5 = this.f5;
                result.f6 = this.f6;
                result.f7 = this.f7;
                return result;
            }

        }



    }

    public enum PlayerType implements io.protostuff.EnumLite<PlayerType>{

        PLAYERTYPE0(0),
        NORMAL(1),
        PLAYERTYPE2(2),
        PLAYERTYPE3(3),
        PLAYERTYPE4(4),
        UNRECOGNIZED(-1);

        private final int value;

        private PlayerType(int n) {
            this.value = n;
        }

        @Override
        public int getNumber() {
            if (value == -1) {
              throw new java.lang.IllegalStateException(
                  "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public static final PlayerType valueOf(int tag) {
            switch(tag) {
                case 0: return PLAYERTYPE0;
                case 1: return NORMAL;
                case 2: return PLAYERTYPE2;
                case 3: return PLAYERTYPE3;
                case 4: return PLAYERTYPE4;
                default: return UNRECOGNIZED;
            }
        }
    }

    public enum ProfileEnrolledProgram implements io.protostuff.EnumLite<ProfileEnrolledProgram>{

        ENROLLEDPROGRAM0(0),
        ENROLLEDPROGRAM1(1),
        ENROLLEDPROGRAM2(2),
        ENROLLEDPROGRAM3(3),
        ENROLLEDPROGRAM4(4),
        UNRECOGNIZED(-1);

        private final int value;

        private ProfileEnrolledProgram(int n) {
            this.value = n;
        }

        @Override
        public int getNumber() {
            if (value == -1) {
              throw new java.lang.IllegalStateException(
                  "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public static final ProfileEnrolledProgram valueOf(int tag) {
            switch(tag) {
                case 0: return ENROLLEDPROGRAM0;
                case 1: return ENROLLEDPROGRAM1;
                case 2: return ENROLLEDPROGRAM2;
                case 3: return ENROLLEDPROGRAM3;
                case 4: return ENROLLEDPROGRAM4;
                default: return UNRECOGNIZED;
            }
        }
    }

    public enum Sport implements io.protostuff.EnumLite<Sport>{

        SPORT0(0),
        SPORT1(1),
        SPORT2(2),
        SPORT3(3),
        SPORT4(4),
        UNRECOGNIZED(-1);

        private final int value;

        private Sport(int n) {
            this.value = n;
        }

        @Override
        public int getNumber() {
            if (value == -1) {
              throw new java.lang.IllegalStateException(
                  "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        public static final Sport valueOf(int tag) {
            switch(tag) {
                case 0: return SPORT0;
                case 1: return SPORT1;
                case 2: return SPORT2;
                case 3: return SPORT3;
                case 4: return SPORT4;
                default: return UNRECOGNIZED;
            }
        }
    }

}