package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Thermostat_carbon: ImageVector
    get() {
        if (_Thermostat_carbon != null) return _Thermostat_carbon!!
        
        _Thermostat_carbon = ImageVector.Builder(
            name = "thermostat_carbon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 881f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(423f, 858f)
                lineTo(102f, 537f)
                quadToRelative(-11f, -12f, -17f, -26.5f)
                reflectiveQuadTo(79f, 480f)
                quadToRelative(0f, -16f, 6f, -31f)
                reflectiveQuadToRelative(17f, -26f)
                lineToRelative(321f, -321f)
                quadToRelative(12f, -12f, 26.5f, -17.5f)
                reflectiveQuadTo(480f, 79f)
                quadToRelative(16f, 0f, 31f, 5.5f)
                reflectiveQuadToRelative(26f, 17.5f)
                lineToRelative(321f, 321f)
                quadToRelative(12f, 11f, 17.5f, 26f)
                reflectiveQuadToRelative(5.5f, 31f)
                quadToRelative(0f, 16f, -5.5f, 30.5f)
                reflectiveQuadTo(858f, 537f)
                lineTo(537f, 858f)
                quadToRelative(-11f, 11f, -26f, 17f)
                reflectiveQuadToRelative(-31f, 6f)
                close()
                moveToRelative(0f, -80f)
                lineToRelative(321f, -321f)
                lineToRelative(-321f, -321f)
                lineToRelative(-321f, 321f)
                lineToRelative(321f, 321f)
                close()
                moveToRelative(0f, -321f)
                close()
            }
        }.build()
        
        return _Thermostat_carbon!!
    }

private var _Thermostat_carbon: ImageVector? = null

