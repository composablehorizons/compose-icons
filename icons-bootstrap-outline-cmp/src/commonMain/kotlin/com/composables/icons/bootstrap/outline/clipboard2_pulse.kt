package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Clipboard2Pulse: ImageVector
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
                moveTo(9.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 2f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 2.5f)
                verticalLineToRelative(12f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 16f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-12f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 1f)
                horizontalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.979f, 5.356f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.968f, 0.04f)
                lineTo(7.92f, 10.49f)
                lineToRelative(-0.94f, -3.135f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.926f, -0.08f)
                lineTo(4.69f, 10f)
                horizontalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.447f, -0.276f)
                lineToRelative(0.936f, -1.873f)
                lineToRelative(1.138f, 3.793f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.968f, -0.04f)
                lineTo(9.58f, 7.51f)
                lineToRelative(0.94f, 3.135f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11f, 11f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-0.128f)
                close()
            }
        }.build()
        
        return _Clipboard2Pulse!!
    }

private var _Clipboard2Pulse: ImageVector? = null

