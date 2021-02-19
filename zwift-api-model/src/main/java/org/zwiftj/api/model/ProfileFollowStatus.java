package org.zwiftj.api.model;

@javax.annotation.Generated("profile.proto")
public enum ProfileFollowStatus implements io.protostuff.EnumLite<ProfileFollowStatus>{

    FOLLOWSTATUS0(0),
    SELF(1),
    FOLLOWSTATUS2(2),
    FOLLOWSTATUS3(3),
    FOLLOWSTATUS4(4),
    UNRECOGNIZED(-1);

    private final int value;

    private ProfileFollowStatus(int n) {
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

    public static final ProfileFollowStatus valueOf(int tag) {
        switch(tag) {
            case 0: return FOLLOWSTATUS0;
            case 1: return SELF;
            case 2: return FOLLOWSTATUS2;
            case 3: return FOLLOWSTATUS3;
            case 4: return FOLLOWSTATUS4;
            default: return UNRECOGNIZED;
        }
    }
}