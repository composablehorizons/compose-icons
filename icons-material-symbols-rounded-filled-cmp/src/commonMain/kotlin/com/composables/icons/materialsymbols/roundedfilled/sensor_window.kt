package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sensor_window: ImageVector
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
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(40f, -440f)
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

