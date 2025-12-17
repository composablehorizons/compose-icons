package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sensor_window: ImageVector
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
                moveToRelative(120f, -440f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-240f)
                horizontalLineTo(280f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, 80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-240f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-40f, -360f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-640f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Sensor_window!!
    }

private var _Sensor_window: ImageVector? = null

