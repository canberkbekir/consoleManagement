
create trigger user_updated_date
    before update
    on users
    for each row
execute procedure set_updated_date();

create trigger user_created_date
    before insert
    on users
    for each row
execute procedure set_created_date();

create trigger user_set_default_role
    before insert
    on users
    for each row
execute procedure set_default_role();

create trigger role_set_rank
    before insert
    on roles
    for each row
execute procedure set_role_rank();

create trigger rank_set_rank
    before insert
    on ranks
    for each row
execute procedure set_rank_rank();

create trigger role_updated_date
    before update
    on roles
    for each row
execute procedure set_updated_date();

create trigger role_created_date
    before insert
    on roles
    for each row
execute procedure set_created_date();

create trigger rank_updated_date
    before update
    on ranks
    for each row
execute procedure set_updated_date();

create trigger rank_created_date
    before insert
    on ranks
    for each row
execute procedure set_created_date();

create trigger permission_updated_date
    before update
    on permissions
    for each row
execute procedure set_updated_date();

create trigger permission_created_date
    before insert
    on permissions
    for each row
execute procedure set_created_date();

--------------------------------------

CREATE OR REPLACE FUNCTION set_role_rank()
    RETURNS TRIGGER AS $$
BEGIN
    NEW.rank_id = (SELECT id FROM ranks HAVING rank = MAX(rank));
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION set_rank_rank()
    RETURNS TRIGGER AS $$
BEGIN
    NEW.rank = (SELECT rank FROM ranks HAVING rank = MAX(rank));
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION set_user_default_role()
    RETURNS TRIGGER AS $$
BEGIN
    NEW.role_id :=(SELECT id FROM roles WHERE name = 'default-user');
        RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION set__created_date()
    RETURNS TRIGGER AS $$
BEGIN
    NEW.created_at = NOW();
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION set_updated_date()
    RETURNS TRIGGER AS $$
BEGIN
    NEW.updated_at = NOW();
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

