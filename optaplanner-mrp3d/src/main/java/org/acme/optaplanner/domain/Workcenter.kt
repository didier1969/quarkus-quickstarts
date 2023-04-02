package org.acme.optaplanner.domain

import java.time.Duration

class Workcenter (val code: String, val technology: Technology, val calendar: Calendar, val avblHrsPerDay: Duration) {}