CREATE TABLE T_program_type (
    program_type_id NUMBER,
    type VARCHAR2(255),
    CONSTRAINT program_type_pk PRIMARY KEY (program_type_id)
);

CREATE TABLE  t_delivery_format (
    delivery_format_id NUMBER,
    type VARCHAR2(50),
    CONSTRAINT delivery_format_pk PRIMARY KEY (delivery_format_id)
);

CREATE TABLE t_program (
    program_id NUMBER,
    name VARCHAR2(255),
    instruction_hours NUMBER,
    offsite_work_practicum CHAR(1),
    program_type_id NUMBER,
    delivery_format_id number,
    CONSTRAINT program_pk PRIMARY KEY (program_id),
    CONSTRAINT program_type_fk FOREIGN KEY (program_type_id) REFERENCES t_program_type (program_type_id),
    CONSTRAINT delivery_format_fk FOREIGN KEY (delivery_format_id) REFERENCES t_delivery_format (delivery_format_id)
);
