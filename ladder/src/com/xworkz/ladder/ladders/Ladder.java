package com.xworkz.ladder.ladders;

    public class Ladder {
        private int ladderHeight;
        private String ladderMaterial;
        private boolean isFoldable;
        private int maxWeightCapacity;
        private String ladderUsageType;
        private String ladderColor;

        public void setLadderHeight(int ladderHeight) {
            this.ladderHeight = ladderHeight;
        }

        public int getLadderHeight() {
            return ladderHeight;
        }

        public void setLadderMaterial(String ladderMaterial) {
            this.ladderMaterial = ladderMaterial;
        }

        public String getLadderMaterial() {
            return ladderMaterial;
        }

        public void setFoldable(boolean isFoldable) {
            this.isFoldable = isFoldable;
        }

        public boolean getFoldable() {
            return isFoldable;
        }

        public void setMaxWeightCapacity(int maxWeightCapacity) {
            this.maxWeightCapacity = maxWeightCapacity;
        }

        public int getMaxWeightCapacity() {
            return maxWeightCapacity;
        }

        public void setLadderUsageType(String ladderUsageType) {
            this.ladderUsageType = ladderUsageType;
        }

        public String getLadderUsageType() {
            return ladderUsageType;
        }

        public void setLadderColor(String ladderColor) {
            this.ladderColor = ladderColor;
        }

        public String getLadderColor() {
            return ladderColor;
        }
}
