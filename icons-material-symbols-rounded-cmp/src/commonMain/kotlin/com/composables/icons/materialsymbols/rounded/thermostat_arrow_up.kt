package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Thermostat_arrow_up: ImageVector
    get() {
        if (_Thermostat_arrow_up != null) return _Thermostat_arrow_up!!
        
        _Thermostat_arrow_up = ImageVector.Builder(
            name = "thermostat_arrow_up",
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
                moveToRelative(540f, -328f)
                lineToRelative(-24f, 24f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(92f, -92f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(92f, 92f)
                quadToRelative(11f, 12f, 11f, 28.5f)
                reflectiveQuadTo(899f, 336f)
                quadToRelative(-12f, 11f, -28.5f, 11.5f)
                reflectiveQuadTo(843f, 336f)
                lineToRelative(-23f, -23f)
                verticalLineToRelative(447f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(780f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(740f, 760f)
                verticalLineToRelative(-448f)
                close()
            }
        }.build()
        
        return _Thermostat_arrow_up!!
    }

private var _Thermostat_arrow_up: ImageVector? = null

