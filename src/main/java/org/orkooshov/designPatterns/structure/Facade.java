package org.orkooshov.designPatterns.structure;

public class Facade {
    static class VeryLowLevelApi {
        public static int getX() { return 1; }
        public static int getY() { return 1; }
        public static int getZ() { return 1; }
    }
    static class FacadeOverApi {
        public static int getSum() {
            return VeryLowLevelApi.getX() + VeryLowLevelApi.getY() + VeryLowLevelApi.getZ();
        }
    }
}
