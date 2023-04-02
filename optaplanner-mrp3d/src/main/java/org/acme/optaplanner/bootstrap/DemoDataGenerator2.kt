package org.acme.optaplanner.bootstrap

import io.quarkus.runtime.StartupEvent
import org.acme.optaplanner.persistence.LessonRepository
import org.acme.optaplanner.persistence.RoomRepository
import org.eclipse.microprofile.config.inject.ConfigProperty
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.event.Observes
import javax.inject.Inject
import javax.transaction.Transactional

enum class DemoData {
    NONE, SMALL, LARGE
}
@ApplicationScoped
class DemoDataGenerator2 (

        @ConfigProperty(name = "mrp3d.demoData", defaultValue = "SMALL")
        var demoData: DemoData? = null,

        @Inject
        var roomRepository: RoomRepository? = null,

        @Inject
        var lessonRepository: LessonRepository? = null
)
{

    @Transactional
    fun generateData(@Observes startupEvent: StartupEvent){

        if (demoData == DemoData.NONE) { return }

        // TODO : Technology, Setups, SetupChanges, Workcenters, Calendars, Workdays, Materials, Jobs

    }


}