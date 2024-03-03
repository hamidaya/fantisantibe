DROP TABLE IF EXISTS events CASCADE;
DROP TABLE IF EXISTS festivals CASCADE;
DROP TABLE IF EXISTS partys CASCADE;

CREATE TABLE events
(
   event_id SERIAL PRIMARY KEY,
   event_name VARCHAR(100),
   event_location VARCHAR(50),
   event_price DOUBLE PRECISION,
   available_tickets INT,
   event_start_date DATE
);