package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CameraReels: ImageVector
    get() {
        if (_CameraReels != null) return _CameraReels!!
        
        _CameraReels = ImageVector.Builder(
            name = "camera-reels",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 3f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 6f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 6f)
                horizontalLineToRelative(0.5f)
                arcToRelative(2f, 2f, 0f, false, true, 1.983f, 1.738f)
                lineToRelative(3.11f, -1.382f)
                arcTo(1f, 1f, 0f, false, true, 16f, 7.269f)
                verticalLineToRelative(7.462f)
                arcToRelative(1f, 1f, 0f, false, true, -1.406f, 0.913f)
                lineToRelative(-3.111f, -1.382f)
                arcTo(2f, 2f, 0f, false, true, 9.5f, 16f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
        }.build()
        
        return _CameraReels!!
    }

private var _CameraReels: ImageVector? = null

