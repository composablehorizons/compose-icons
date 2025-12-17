package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Clipboard2X: ImageVector
    get() {
        if (_Clipboard2X != null) return _Clipboard2X!!
        
        _Clipboard2X = ImageVector.Builder(
            name = "clipboard2-x",
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
                moveTo(8f, 8.293f)
                lineToRelative(1.146f, -1.147f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, 0.708f)
                lineTo(8.707f, 9f)
                lineToRelative(1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8f, 9.707f)
                lineToRelative(-1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(7.293f, 9f)
                lineTo(6.146f, 7.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                close()
            }
        }.build()
        
        return _Clipboard2X!!
    }

private var _Clipboard2X: ImageVector? = null

