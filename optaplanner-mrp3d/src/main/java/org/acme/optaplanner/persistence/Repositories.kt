package org.acme.optaplanner.persistence

import io.quarkus.hibernate.orm.panache.PanacheRepository
import org.acme.optaplanner.domain.Job
import org.acme.optaplanner.domain.Material
import org.acme.optaplanner.domain.Technology
import org.acme.optaplanner.domain.Workcenter
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class TechnologyRepository : PanacheRepository<Technology> {
}

@ApplicationScoped
class WorkcenterRepository : PanacheRepository<Workcenter> {
}

@ApplicationScoped
class MaterialRepository : PanacheRepository<Material> {
}

@ApplicationScoped
class JobRepository : PanacheRepository<Job> {
}
