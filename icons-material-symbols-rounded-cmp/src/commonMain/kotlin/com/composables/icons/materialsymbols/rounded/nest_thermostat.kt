package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nest_thermostat: ImageVector
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
                moveTo(398f, 409f)
                lineToRelative(-86f, 152f)
                quadToRelative(-5f, 8f, -2f, 16f)
                reflectiveQuadToRelative(11f, 13f)
                quadToRelative(8f, 4f, 15.5f, 2f)
                reflectiveQuadToRelative(12.5f, -10f)
                lineToRelative(95f, -168f)
                quadToRelative(1f, -2f, 3f, -10f)
                verticalLineToRelative(-19f)
                quadToRelative(0f, -8f, -6.5f, -14f)
                reflectiveQuadToRelative(-14.5f, -6f)
                horizontalLineTo(312f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6.5f, 14.5f)
                reflectiveQuadTo(313f, 406f)
                horizontalLineToRelative(83f)
                lineToRelative(2f, 3f)
                close()
                moveToRelative(176f, 191f)
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
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, -320f)
                close()
            }
        }.build()
        
        return _Nest_thermostat!!
    }

private var _Nest_thermostat: ImageVector? = null

