package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nest_remote_comfort_sensor: ImageVector
    get() {
        if (_Nest_remote_comfort_sensor != null) return _Nest_remote_comfort_sensor!!
        
        _Nest_remote_comfort_sensor = ImageVector.Builder(
            name = "nest_remote_comfort_sensor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -640f)
                quadToRelative(-94f, 0f, -176.5f, 31f)
                reflectiveQuadTo(153f, 317f)
                quadToRelative(-14f, 11f, -31f, 11f)
                reflectiveQuadToRelative(-30f, -11f)
                quadToRelative(-12f, -11f, -12f, -28f)
                reflectiveQuadToRelative(13f, -28f)
                quadToRelative(78f, -66f, 177f, -103.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(111f, 0f, 210f, 37.5f)
                reflectiveQuadTo(867f, 262f)
                quadToRelative(13f, 11f, 12.5f, 27.5f)
                reflectiveQuadTo(867f, 317f)
                quadToRelative(-13f, 11f, -29.5f, 11f)
                reflectiveQuadTo(807f, 317f)
                quadToRelative(-68f, -55f, -150.5f, -86f)
                reflectiveQuadTo(480f, 200f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(-51f, 0f, -96.5f, 15f)
                reflectiveQuadTo(300f, 456f)
                quadToRelative(-14f, 10f, -31f, 9.5f)
                reflectiveQuadTo(239f, 453f)
                quadToRelative(-12f, -11f, -12f, -27f)
                reflectiveQuadToRelative(13f, -26f)
                quadToRelative(51f, -38f, 111.5f, -59f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(68f, 0f, 128f, 21f)
                reflectiveQuadToRelative(111f, 59f)
                quadToRelative(13f, 10f, 13.5f, 26f)
                reflectiveQuadTo(721f, 453f)
                quadToRelative(-12f, 12f, -29f, 12.5f)
                reflectiveQuadToRelative(-31f, -9.5f)
                quadToRelative(-38f, -26f, -84f, -41f)
                reflectiveQuadToRelative(-97f, -15f)
                close()
            }
        }.build()
        
        return _Nest_remote_comfort_sensor!!
    }

private var _Nest_remote_comfort_sensor: ImageVector? = null

