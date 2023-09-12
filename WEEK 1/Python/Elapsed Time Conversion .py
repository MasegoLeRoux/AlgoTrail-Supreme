
total_seconds = int(input("Enter the elapsed time in seconds: "))

hours = total_seconds // 3600
minutes = (total_seconds % 3600) // 60
seconds = total_seconds % 60

time_components = []

if hours > 0:
    time_components.append(f"{hours} hour{'s' if hours > 1 else ''}")

if minutes > 0:
    time_components.append(f"{minutes} minute{'s' if minutes > 1 else ''}")

if seconds > 0:
    time_components.append(f"{seconds} second{'s' if seconds > 1 else ''}")


if time_components:
    elapsed_time_str = ", ".join(time_components)
    print(f"Elapsed time: {elapsed_time_str}")
else:
    print("Elapsed time is less than one second.")
