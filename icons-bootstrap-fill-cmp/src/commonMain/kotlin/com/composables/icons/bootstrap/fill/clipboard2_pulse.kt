package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Clipboard2Pulse: ImageVector
    get() {
        if (_Clipboard2Pulse != null) return _Clipboard2Pulse!!
        
        _Clipboard2Pulse = ImageVector.Builder(
            name = "clipboard2-pulse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11f, 2f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.085f, 1f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 2.5f)
                verticalLineToRelative(12f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 16f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-12f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 1f)
                horizontalLineToRelative(-0.585f)
                quadToRelative(0.084f, 0.236f, 0.085f, 0.5f)
                verticalLineTo(2f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 2f)
                verticalLineToRelative(-0.5f)
                quadToRelative(0.001f, -0.264f, 0.085f, -0.5f)
                moveTo(9.98f, 5.356f)
                lineTo(11.372f, 10f)
                horizontalLineToRelative(0.128f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.479f, -0.356f)
                lineToRelative(-0.94f, -3.135f)
                lineToRelative(-1.092f, 5.096f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.968f, 0.039f)
                lineTo(6.383f, 8.85f)
                lineToRelative(-0.936f, 1.873f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 11f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(0.191f)
                lineToRelative(1.362f, -2.724f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.926f, 0.08f)
                lineToRelative(0.94f, 3.135f)
                lineToRelative(1.092f, -5.096f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.968f, -0.039f)
                close()
            }
        }.build()
        
        return _Clipboard2Pulse!!
    }

private var _Clipboard2Pulse: ImageVector? = null

