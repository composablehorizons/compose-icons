package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Thermostat_carbon: ImageVector
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
                moveTo(480f, 912f)
                lineTo(48f, 480f)
                lineToRelative(432f, -432f)
                lineToRelative(432f, 432f)
                lineTo(480f, 912f)
                close()
            }
        }.build()
        
        return _Thermostat_carbon!!
    }

private var _Thermostat_carbon: ImageVector? = null

