package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nest_remote_comfort_sensor: ImageVector
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
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveTo(122f, 344f)
                lineToRelative(-59f, -55f)
                quadToRelative(81f, -79f, 188f, -124f)
                reflectiveQuadToRelative(229f, -45f)
                quadToRelative(122f, 0f, 229f, 45f)
                reflectiveQuadToRelative(188f, 124f)
                lineToRelative(-59f, 55f)
                quadToRelative(-71f, -67f, -162f, -105.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-105f, 0f, -196f, 38.5f)
                reflectiveQuadTo(122f, 344f)
                close()
                moveToRelative(570f, 137f)
                quadToRelative(-42f, -38f, -96f, -59.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-62f, 0f, -115.5f, 21.5f)
                reflectiveQuadTo(268f, 481f)
                lineToRelative(-59f, -55f)
                quadToRelative(54f, -50f, 123.5f, -78f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(78f, 0f, 147f, 28f)
                reflectiveQuadToRelative(123f, 78f)
                lineToRelative(-58f, 55f)
                close()
                moveTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Nest_remote_comfort_sensor!!
    }

private var _Nest_remote_comfort_sensor: ImageVector? = null

