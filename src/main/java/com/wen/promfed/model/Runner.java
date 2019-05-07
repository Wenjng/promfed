package com.wen.promfed.model;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor(staticName = "of")
public class Runner {
    String fname;
    String lname;
    String mname;
    Integer bib;
    Integer pace;
    String contact;
}