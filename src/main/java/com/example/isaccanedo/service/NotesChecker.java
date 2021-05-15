package com.example.isaccanedo.service;

import com.example.isaccanedo.exception.ResourceNotFoundException;
import com.example.isaccanedo.model.Note;
import com.example.isaccanedo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class NotesChecker {

    @Autowired
    NoteRepository noteRepository;


    public Note getNoteById(Long noteId) {
        System.out.println("access from db...................................");
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
    }

    public static void main(String[] args) {
        new NotesChecker().getNoteById(1L);
    }

//    @Cacheable(value = "note-single")
    public void test() {
            getNoteById(1L);
    }



}
