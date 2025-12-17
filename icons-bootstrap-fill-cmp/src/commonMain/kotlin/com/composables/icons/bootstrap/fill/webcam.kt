package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Webcam: ImageVector
    get() {
        if (_Webcam != null) return _Webcam!!
        
        _Webcam = ImageVector.Builder(
            name = "webcam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.644f, 11.094f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.356f, -0.15f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.356f, 0.15f)
                curveToRelative(0.175f, 0.177f, 0.39f, 0.347f, 0.603f, 0.496f)
                arcToRelative(7f, 7f, 0f, false, false, 0.752f, 0.456f)
                lineToRelative(0.01f, 0.006f)
                horizontalLineToRelative(0.003f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 13f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.224f, -0.947f)
                lineToRelative(0.002f, -0.001f)
                lineToRelative(0.01f, -0.006f)
                arcToRelative(4f, 4f, 0f, false, false, 0.214f, -0.116f)
                arcToRelative(8f, 8f, 0f, false, false, 0.539f, -0.34f)
                curveToRelative(0.214f, -0.15f, 0.428f, -0.319f, 0.603f, -0.496f)
                moveTo(7f, 6.5f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(6f, 1.5f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -4f)
                moveTo(12.5f, 7f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
            }
        }.build()
        
        return _Webcam!!
    }

private var _Webcam: ImageVector? = null

