package org.acme.optaplanner.domain

import java.util.*

class Simulation (
        val technologies: ArrayList<Technology>
        , val workcenters: ArrayList<Workcenter>
        , val setupMatrix: ArrayList<SetupChange>
        , val jobs: ArrayList<Job>
        , val materials: ArrayList<Material>
) {
}