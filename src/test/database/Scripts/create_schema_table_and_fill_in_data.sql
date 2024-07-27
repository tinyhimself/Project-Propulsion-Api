-- Create a new database
CREATE DATABASE propulsionapi;
GO

-- Use the newly created database
USE propulsionapi;
GO

-- Create a new table
CREATE TABLE [dbo].[User](
    [id] [int] IDENTITY(1,1) NOT NULL,
    [name] [varchar](500) NULL,
    [surname] [varchar](500) NULL,
    CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
    ) ON [PRIMARY]
GO

-- Insert sample data into the table
INSERT INTO [User] (name, surname)
VALUES 
('John', 'Doe'),
('Jane', 'Smith'),
('Michael', 'Brown');
GO
