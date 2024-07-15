CREATE TABLE topicos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    mensaje VARCHAR(1000) NOT NULL,
    fecha_creacion DATETIME DEFAULT NOW(),
    status VARCHAR(20) DEFAULT 'No resuelto',
    autor VARCHAR(30) NOT NULL,
    curso VARCHAR(50),
    respuestas BIGINT,

    PRIMARY KEY (id)
);