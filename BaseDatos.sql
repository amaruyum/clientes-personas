-- ======================
-- Script: BaseDatos.sql
-- ======================

-- 1. Tabla cliente
CREATE TABLE cliente (
    identificacion VARCHAR(15) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    genero VARCHAR(20),
    edad INT,
    direccion VARCHAR(150),
    telefono VARCHAR(20),
    contraseña VARCHAR(100),
    estado BOOLEAN
);

-- 2. Tabla cuenta
CREATE TABLE cuenta (
    numero_cuenta VARCHAR(20) PRIMARY KEY,
    tipo_cuenta VARCHAR(50) NOT NULL,
    saldo_inicial DECIMAL(10,2) NOT NULL,
    estado BOOLEAN,
    cliente_identificacion VARCHAR(15),
    FOREIGN KEY (cliente_identificacion) REFERENCES cliente(identificacion)
);

-- 3. Tabla movimiento
CREATE TABLE movimiento (
    id SERIAL PRIMARY KEY,
    fecha DATE NOT NULL,
    tipo_movimiento VARCHAR(20),
    valor DECIMAL(10,2),
    saldo DECIMAL(10,2),
    numero_cuenta VARCHAR(20),
    FOREIGN KEY (numero_cuenta) REFERENCES cuenta(numero_cuenta)
);

-- ====================
-- Insertar datos demo
-- ====================

-- Clientes
INSERT INTO cliente VALUES
('0102030405', 'Jose Lema', 'Masculino', 30, 'Otavalo sn y principal', '098254785', '1234', true),
('0607080910', 'Marianela Montalvo', 'Femenino', 28, 'Amazonas y NNUU', '097548965', '5678', true),
('1122334455', 'Juan Osorio', 'Masculino', 40, '13 junio y Equinoccial', '098874587', '1245', true);

-- Cuentas
INSERT INTO cuenta VALUES
('478758', 'Ahorro', 1425.00, true, '0102030405'),
('225487', 'Corriente', 700.00, true, '0607080910'),
('495878', 'Ahorros', 150.00, true, '1122334455'),
('496825', 'Ahorros', 0.00, true, '0607080910'),
('585545', 'Corriente', 1000.00, true, '0102030405');

-- Movimientos (fechas simuladas)
INSERT INTO movimiento (fecha, tipo_movimiento, valor, saldo, numero_cuenta) VALUES
('2025-08-01', 'Retiro', 575.00, 1425.00, '478758'),
('2025-08-01', 'Depósito', 600.00, 700.00, '225487'),
('2025-08-01', 'Depósito', 150.00, 150.00, '495878'),
('2025-08-01', 'Retiro', 540.00, 0.00, '496825');
