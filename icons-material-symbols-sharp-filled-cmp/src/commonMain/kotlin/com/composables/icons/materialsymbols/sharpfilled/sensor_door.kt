package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sensor_door: ImageVector
    get() {
        if (_Sensor_door != null) return _Sensor_door!!
        
        _Sensor_door = ImageVector.Builder(
            name = "sensor_door",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(460f, -340f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(620f, 420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(620f, 540f)
                close()
            }
        }.build()
        
        return _Sensor_door!!
    }

private var _Sensor_door: ImageVector? = null

