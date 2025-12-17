package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Webcam: ImageVector
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
                moveTo(0f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(9.269f)
                curveToRelative(0.144f, 0.162f, 0.33f, 0.324f, 0.531f, 0.475f)
                arcToRelative(7f, 7f, 0f, false, false, 0.907f, 0.57f)
                lineToRelative(0.014f, 0.006f)
                lineToRelative(0.003f, 0.002f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 13f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.224f, -0.947f)
                lineToRelative(0.003f, -0.002f)
                lineToRelative(0.014f, -0.007f)
                arcToRelative(5f, 5f, 0f, false, false, 0.268f, -0.148f)
                arcToRelative(7f, 7f, 0f, false, false, 0.639f, -0.421f)
                curveToRelative(0.2f, -0.15f, 0.387f, -0.313f, 0.531f, -0.475f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 6.5f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-2f, 1f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                moveToRelative(7f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
            }
        }.build()
        
        return _Webcam!!
    }

private var _Webcam: ImageVector? = null

