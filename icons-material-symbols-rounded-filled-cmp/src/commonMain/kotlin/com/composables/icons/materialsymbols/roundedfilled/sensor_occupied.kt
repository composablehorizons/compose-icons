package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sensor_occupied: ImageVector
    get() {
        if (_Sensor_occupied != null) return _Sensor_occupied!!
        
        _Sensor_occupied = ImageVector.Builder(
            name = "sensor_occupied",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 440f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(240f, 604f)
                quadToRelative(0f, -21f, 10.5f, -39.5f)
                reflectiveQuadTo(279f, 535f)
                quadToRelative(45f, -26f, 95f, -40.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(56f, 0f, 106f, 14.5f)
                reflectiveQuadToRelative(95f, 40.5f)
                quadToRelative(18f, 11f, 28.5f, 29.5f)
                reflectiveQuadTo(720f, 604f)
                quadToRelative(0f, 32f, -22f, 54f)
                reflectiveQuadToRelative(-54f, 22f)
                horizontalLineTo(316f)
                quadToRelative(-32f, 0f, -54f, -22f)
                reflectiveQuadToRelative(-22f, -54f)
                close()
                moveToRelative(431f, -475f)
                quadToRelative(-15f, -8f, -21.5f, -23.5f)
                reflectiveQuadToRelative(0.5f, -31.5f)
                quadToRelative(7f, -16f, 22f, -22f)
                reflectiveQuadToRelative(30f, 2f)
                quadToRelative(65f, 34f, 116f, 85.5f)
                reflectiveQuadTo(904f, 256f)
                quadToRelative(8f, 15f, 3f, 31f)
                reflectiveQuadToRelative(-21f, 23f)
                quadToRelative(-16f, 7f, -31.5f, 0.5f)
                reflectiveQuadTo(831f, 289f)
                quadToRelative(-28f, -51f, -68.5f, -91.5f)
                reflectiveQuadTo(671f, 129f)
                close()
                moveToRelative(-382f, 0f)
                quadToRelative(-51f, 28f, -91.5f, 68.5f)
                reflectiveQuadTo(129f, 289f)
                quadToRelative(-8f, 15f, -23.5f, 21.5f)
                reflectiveQuadTo(74f, 310f)
                quadToRelative(-16f, -7f, -21f, -23f)
                reflectiveQuadToRelative(3f, -31f)
                quadToRelative(35f, -64f, 86f, -115.5f)
                reflectiveQuadTo(258f, 55f)
                quadToRelative(15f, -8f, 30.5f, -2.5f)
                reflectiveQuadTo(311f, 74f)
                quadToRelative(7f, 16f, 0f, 31.5f)
                reflectiveQuadTo(289f, 129f)
                close()
                moveTo(129f, 671f)
                quadToRelative(28f, 51f, 68.5f, 91.5f)
                reflectiveQuadTo(289f, 831f)
                quadToRelative(15f, 8f, 22f, 23.5f)
                reflectiveQuadToRelative(0f, 31.5f)
                quadToRelative(-7f, 16f, -23f, 21.5f)
                reflectiveQuadTo(256f, 905f)
                quadToRelative(-64f, -34f, -115.5f, -86f)
                reflectiveQuadTo(55f, 702f)
                quadToRelative(-8f, -15f, -2.5f, -30.5f)
                reflectiveQuadTo(74f, 649f)
                quadToRelative(16f, -7f, 31.5f, 0f)
                reflectiveQuadToRelative(23.5f, 22f)
                close()
                moveToRelative(702f, 0f)
                quadToRelative(8f, -15f, 23.5f, -22f)
                reflectiveQuadToRelative(31.5f, 0f)
                quadToRelative(16f, 7f, 22f, 22.5f)
                reflectiveQuadToRelative(-2f, 30.5f)
                quadToRelative(-34f, 65f, -85.5f, 116f)
                reflectiveQuadTo(704f, 904f)
                quadToRelative(-15f, 8f, -31f, 3f)
                reflectiveQuadToRelative(-23f, -21f)
                quadToRelative(-7f, -16f, -0.5f, -31.5f)
                reflectiveQuadTo(671f, 831f)
                quadToRelative(51f, -28f, 91.5f, -68.5f)
                reflectiveQuadTo(831f, 671f)
                close()
            }
        }.build()
        
        return _Sensor_occupied!!
    }

private var _Sensor_occupied: ImageVector? = null

