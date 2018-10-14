create table applications
(
  id bigint auto_increment
    primary key,
  name varchar(255) null,
  site int null,
  constraint applications_id_uindex
  unique (id)
)
;

create table hibernate_sequence
(
  next_val bigint null
)
;

create table orders
(
  id bigint auto_increment
    primary key,
  name varchar(255) not null,
  date varchar(255) not null,
  address varchar(255) not null,
  phone_id bigint not null,
  constraint orders_id_uindex
  unique (id)
)
;

create index orders_phones_id_fk
  on orders (phone_id)
;

create table phones
(
  id bigint auto_increment
    primary key,
  name varchar(255) null,
  os varchar(255) null,
  price int null,
  constraint phones_id_uindex
  unique (id)
)
;

alter table orders
  add constraint orders_phones_id_fk
foreign key (phone_id) references phones (id)
;

create table users
(
  id bigint auto_increment
    primary key,
  email varchar(255) null,
  name varchar(255) null,
  constraint users_id_uindex
  unique (id),
  constraint users_email_uindex
  unique (email)
)
;

create table users_orders
(
  id bigint auto_increment
    primary key,
  user_id bigint not null,
  order_id bigint not null,
  constraint users_orders_id_uindex
  unique (id),
  constraint users_orders_users_id_fk
  foreign key (user_id) references users (id),
  constraint users_orders_orders_id_fk
  foreign key (order_id) references orders (id)
)
;

create index users_orders_orders_id_fk
  on users_orders (order_id)
;

create index users_orders_users_id_fk
  on users_orders (user_id)
;
