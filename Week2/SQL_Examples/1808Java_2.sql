CREATE OR REPLACE FUNCTION insert_into_employee()
RETURNS trigger AS $$
  BEGIN
  IF(TG_OP = 'INSERT') THEN
    NEW."EmployeeId" = (select nextval('EMPLOYEE_ID_SEQ'));
  END IF;
  RETURN NEW;
  END;
$$ LANGUAGE plpgsql;
/

CREATE TRIGGER employee_insert
  BEFORE INSERT ON ."Employee"
  FOR EACH ROW
  EXECUTE PROCEDURE insert_into_employee();
  /
  insert into "Employee" values(1, 'Jurczak', 'Nick');
  
  SELECT * FROM "Employee";
  
  UPDATE "Employee" SET "EmployeeId" = 35 WHERE "EmployeeId" = 20;
  
  Select * from "Track" where "AlbumId" in 
  (Select "AlbumId" from "Album" where "ArtistId" = 
  (Select "ArtistId" from "Artist" where "Name" = 'AC/DC'));
  
  Select * from "Track" where "TrackId" in 
  (Select "TrackId" from "PlaylistTrack" where "PlaylistId" in 
  (Select "PlaylistId" from "PlaylistTrack" where "TrackId" in 
  (Select "TrackId" from "Track" where "AlbumId" in 
  (Select "AlbumId" from "Album" where "ArtistId" = 
  (Select "ArtistId" from "Artist" where "Name" = 'AC/DC'))))) 
  and "TrackId" not in 
  (Select "TrackId" from "Track" where "AlbumId" in 
  (Select "AlbumId" from "Album" where "ArtistId" = 
  (Select "ArtistId" from "Artist" where "Name" = 'AC/DC')));
  
  create or replace view acdc_songs as Select * from "Track" where "AlbumId" in 
  (Select "AlbumId" from "Album" where "ArtistId" = 
  (Select "ArtistId" from "Artist" where "Name" = 'AC/DC'));
  
  create view non_acdc_songs as Select * from "Track" where "TrackId"
  not in (Select "TrackId" from acdc_songs);
  
  create view acdc_playlists as
  select * from "Playlist" where "PlaylistId" in 
  (select "PlaylistId" from "PlaylistTrack" where "TrackId" in 
  (select "TrackId" from acdc_songs));
  
  select * from "Track" where "TrackId" in 
  (select "TrackId" from "PlaylistTrack" where "PlaylistId" in 
  (select "PlaylistId" from acdc_playlists))
  and "TrackId" in
  (select "TrackId" from non_acdc_songs);
  
  