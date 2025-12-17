package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sensor_window: ImageVector
    get() {
        if (_Sensor_window != null) return _Sensor_window!!
        
        _Sensor_window = ImageVector.Builder(
            name = "sensor_window",
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
                moveToRelative(80f, -440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-280f)
                horizontalLineTo(240f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(0f, 80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-280f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, 280f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Sensor_window!!
    }

private var _Sensor_window: ImageVector? = null

