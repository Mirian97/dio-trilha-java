package com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        subscribedContents.addAll(bootcamp.getContents());
    }

    public void progress(){
        Optional<Content> content = subscribedContents.stream().findFirst();
        
        if(content.isPresent()){
            this.subscribedContents.remove(content.get());
            this.finishedContents.add(content.get());
        }else{
            System.out.println("There're no contents to finished!");
        }
    }

    public double calculateTotalXp(){
        return finishedContents.stream().mapToDouble(Content::calculateXp).sum();
    }

    public void printCourseList(){
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Developer dev = (Developer) obj;
        return Objects.equals(getName(), dev.getName()) && Objects.equals(getSubscribedContents(), dev.getSubscribedContents()) && Objects.equals(getFinishedContents(), dev.getFinishedContents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSubscribedContents(), getFinishedContents());
    }
}
