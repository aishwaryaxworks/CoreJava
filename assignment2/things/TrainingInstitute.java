package com.xworkz.assignment2.things;

public class TrainingInstitute {
    private int trainingId;
    private String trainingName;
    private double duration;
    private boolean isOnline;
    private Character level;
    private Float rating;
    private long startDate;
    private Integer participants;
    private String trainer;

    public TrainingInstitute() {
	}

    // Getters and Setters
    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(Character level) {
        this.level = level;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    // Overriding toString() method
    @Override
	public String toString() {
		return "TrainingInstitute [trainingId=" + trainingId + ", trainingName=" + trainingName + ", duration="
				+ duration + ", isOnline=" + isOnline + ", level=" + level + ", rating=" + rating + ", startDate="
				+ startDate + ", participants=" + participants + ", trainer=" + trainer + "]";
	}
    

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(duration);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isOnline ? 1231 : 1237);
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + ((participants == null) ? 0 : participants.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + (int) (startDate ^ (startDate >>> 32));
		result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
		result = prime * result + trainingId;
		result = prime * result + ((trainingName == null) ? 0 : trainingName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TrainingInstitute other = (TrainingInstitute) obj;
		if (Double.doubleToLongBits(duration) != Double.doubleToLongBits(other.duration)) {
			return false;
		}
		if (isOnline != other.isOnline) {
			return false;
		}
		if (level == null) {
			if (other.level != null) {
				return false;
			}
		} else if (!level.equals(other.level)) {
			return false;
		}
		if (participants == null) {
			if (other.participants != null) {
				return false;
			}
		} else if (!participants.equals(other.participants)) {
			return false;
		}
		if (rating == null) {
			if (other.rating != null) {
				return false;
			}
		} else if (!rating.equals(other.rating)) {
			return false;
		}
		if (startDate != other.startDate) {
			return false;
		}
		if (trainer == null) {
			if (other.trainer != null) {
				return false;
			}
		} else if (!trainer.equals(other.trainer)) {
			return false;
		}
		if (trainingId != other.trainingId) {
			return false;
		}
		if (trainingName == null) {
			if (other.trainingName != null) {
				return false;
			}
		} else if (!trainingName.equals(other.trainingName)) {
			return false;
		}
		return true;
	}

    

	

class Trainer {
    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                '}';
    }
}
}