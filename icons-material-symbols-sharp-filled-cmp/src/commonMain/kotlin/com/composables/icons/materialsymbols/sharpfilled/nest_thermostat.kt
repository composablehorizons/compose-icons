package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nest_thermostat: ImageVector
    get() {
        if (_Nest_thermostat != null) return _Nest_thermostat!!
        
        _Nest_thermostat = ImageVector.Builder(
            name = "nest_thermostat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(339f, 600f)
                lineToRelative(108f, -191f)
                verticalLineToRelative(-44f)
                horizontalLineTo(292f)
                verticalLineToRelative(41f)
                horizontalLineToRelative(104f)
                lineToRelative(2f, 3f)
                lineToRelative(-96f, 171f)
                lineToRelative(37f, 20f)
                close()
                moveToRelative(235f, 0f)
                quadToRelative(45f, 0f, 70.5f, -34.5f)
                reflectiveQuadTo(670f, 480f)
                quadToRelative(0f, -51f, -26f, -85.5f)
                reflectiveQuadTo(574f, 360f)
                quadToRelative(-45f, 0f, -70.5f, 34.5f)
                reflectiveQuadTo(478f, 480f)
                quadToRelative(0f, 51f, 25.5f, 85.5f)
                reflectiveQuadTo(574f, 600f)
                close()
                moveToRelative(0f, -41f)
                quadToRelative(-26f, 0f, -39f, -23.5f)
                reflectiveQuadTo(522f, 480f)
                quadToRelative(0f, -24f, 11f, -51.5f)
                reflectiveQuadToRelative(41f, -27.5f)
                quadToRelative(30f, 0f, 41f, 27.5f)
                reflectiveQuadToRelative(11f, 51.5f)
                quadToRelative(0f, 32f, -13f, 55.5f)
                reflectiveQuadTo(574f, 559f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Nest_thermostat!!
    }

private var _Nest_thermostat: ImageVector? = null

