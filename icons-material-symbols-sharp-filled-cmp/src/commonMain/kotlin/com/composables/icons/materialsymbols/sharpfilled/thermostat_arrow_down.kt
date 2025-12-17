package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Thermostat_arrow_down: ImageVector
    get() {
        if (_Thermostat_arrow_down != null) return _Thermostat_arrow_down!!
        
        _Thermostat_arrow_down = ImageVector.Builder(
            name = "thermostat_arrow_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(120f, 640f)
                quadToRelative(0f, -48f, 21f, -89.5f)
                reflectiveQuadToRelative(59f, -70.5f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(240f)
                quadToRelative(38f, 29f, 59f, 70.5f)
                reflectiveQuadToRelative(21f, 89.5f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(320f, 840f)
                close()
                moveTo(200f, 640f)
                horizontalLineToRelative(240f)
                quadToRelative(0f, -29f, -12.5f, -54f)
                reflectiveQuadTo(392f, 544f)
                lineToRelative(-32f, -24f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(320f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 240f)
                verticalLineToRelative(280f)
                lineToRelative(-32f, 24f)
                quadToRelative(-23f, 17f, -35.5f, 42f)
                reflectiveQuadTo(200f, 640f)
                close()
                moveToRelative(580f, 160f)
                lineTo(640f, 660f)
                lineToRelative(57f, -56f)
                lineToRelative(43f, 43f)
                verticalLineToRelative(-487f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(488f)
                lineToRelative(44f, -44f)
                lineToRelative(56f, 56f)
                lineToRelative(-140f, 140f)
                close()
            }
        }.build()
        
        return _Thermostat_arrow_down!!
    }

private var _Thermostat_arrow_down: ImageVector? = null

