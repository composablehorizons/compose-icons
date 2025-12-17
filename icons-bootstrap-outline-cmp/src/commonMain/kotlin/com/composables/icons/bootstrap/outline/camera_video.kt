package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CameraVideo: ImageVector
    get() {
        if (_CameraVideo != null) return _CameraVideo!!
        
        _CameraVideo = ImageVector.Builder(
            name = "camera-video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(7.5f)
                arcToRelative(2f, 2f, 0f, false, true, 1.983f, 1.738f)
                lineToRelative(3.11f, -1.382f)
                arcTo(1f, 1f, 0f, false, true, 16f, 4.269f)
                verticalLineToRelative(7.462f)
                arcToRelative(1f, 1f, 0f, false, true, -1.406f, 0.913f)
                lineToRelative(-3.111f, -1.382f)
                arcTo(2f, 2f, 0f, false, true, 9.5f, 13f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(11.5f, 5.175f)
                lineToRelative(3.5f, 1.556f)
                verticalLineTo(4.269f)
                lineToRelative(-3.5f, 1.556f)
                close()
                moveTo(2f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(7.5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _CameraVideo!!
    }

private var _CameraVideo: ImageVector? = null

