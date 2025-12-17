package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CameraVideoOff: ImageVector
    get() {
        if (_CameraVideoOff != null) return _CameraVideoOff!!
        
        _CameraVideoOff = ImageVector.Builder(
            name = "camera-video-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.961f, 12.365f)
                arcToRelative(2f, 2f, 0f, false, false, 0.522f, -1.103f)
                lineToRelative(3.11f, 1.382f)
                arcTo(1f, 1f, 0f, false, false, 16f, 11.731f)
                verticalLineTo(4.269f)
                arcToRelative(1f, 1f, 0f, false, false, -1.406f, -0.913f)
                lineToRelative(-3.111f, 1.382f)
                arcTo(2f, 2f, 0f, false, false, 9.5f, 3f)
                horizontalLineTo(4.272f)
                lineToRelative(0.714f, 1f)
                horizontalLineTo(9.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -0.144f, 0.518f)
                close()
                moveTo(1.428f, 4.18f)
                arcTo(1f, 1f, 0f, false, false, 1f, 5f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5.014f)
                lineToRelative(0.714f, 1f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.675f, 0.334f, -1.272f, 0.847f, -1.634f)
                close()
                moveTo(15f, 11.73f)
                lineToRelative(-3.5f, -1.555f)
                verticalLineToRelative(-4.35f)
                lineTo(15f, 4.269f)
                close()
                moveToRelative(-4.407f, 3.56f)
                lineToRelative(-10f, -14f)
                lineToRelative(0.814f, -0.58f)
                lineToRelative(10f, 14f)
                close()
            }
        }.build()
        
        return _CameraVideoOff!!
    }

private var _CameraVideoOff: ImageVector? = null

