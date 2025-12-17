package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Thermostat_auto: ImageVector
    get() {
        if (_Thermostat_auto != null) return _Thermostat_auto!!
        
        _Thermostat_auto = ImageVector.Builder(
            name = "thermostat_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(639f, 428f)
                lineToRelative(-25f, 73f)
                quadToRelative(-3f, 8f, -10.5f, 13.5f)
                reflectiveQuadTo(587f, 520f)
                quadToRelative(-15f, 0f, -23.5f, -12.5f)
                reflectiveQuadTo(560f, 481f)
                lineToRelative(113f, -302f)
                quadToRelative(3f, -9f, 11f, -14f)
                reflectiveQuadToRelative(17f, -5f)
                horizontalLineToRelative(22f)
                quadToRelative(9f, 0f, 17f, 5f)
                reflectiveQuadToRelative(11f, 14f)
                lineToRelative(115f, 303f)
                quadToRelative(5f, 14f, -3f, 26f)
                reflectiveQuadToRelative(-23f, 12f)
                quadToRelative(-9f, 0f, -17f, -5.5f)
                reflectiveQuadTo(812f, 500f)
                lineToRelative(-25f, -72f)
                horizontalLineTo(639f)
                close()
                moveToRelative(18f, -52f)
                horizontalLineToRelative(110f)
                lineToRelative(-53f, -150f)
                horizontalLineToRelative(-2f)
                lineToRelative(-55f, 150f)
                close()
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
            }
        }.build()
        
        return _Thermostat_auto!!
    }

private var _Thermostat_auto: ImageVector? = null

