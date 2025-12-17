package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DeviceCameraVideo: ImageVector
    get() {
        if (_DeviceCameraVideo != null) return _DeviceCameraVideo!!
        
        _DeviceCameraVideo = ImageVector.Builder(
            name = "device-camera-video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 3f)
                curveTo(2.11929f, 3f, 1f, 4.11929f, 1f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(1f, 11.8807f, 2.11929f, 13f, 3.5f, 13f)
                horizontalLineTo(8.5f)
                curveTo(9.88071f, 13f, 11f, 11.8807f, 11f, 10.5f)
                verticalLineTo(10.3728f)
                lineTo(13.0354f, 11.7782f)
                curveTo(13.8646f, 12.3507f, 14.9957f, 11.7572f, 14.9957f, 10.7496f)
                verticalLineTo(5.25216f)
                curveTo(14.9957f, 4.24453f, 13.8646f, 3.65101f, 13.0354f, 4.22353f)
                lineTo(11f, 5.62896f)
                verticalLineTo(5.5f)
                curveTo(11f, 4.11929f, 9.88071f, 3f, 8.5f, 3f)
                horizontalLineTo(3.5f)
                close()
                moveTo(11f, 6.84418f)
                lineTo(13.6036f, 5.04643f)
                curveTo(13.7695f, 4.93193f, 13.9957f, 5.05063f, 13.9957f, 5.25216f)
                verticalLineTo(10.7496f)
                curveTo(13.9957f, 10.9511f, 13.7695f, 11.0698f, 13.6036f, 10.9553f)
                lineTo(11f, 9.15757f)
                verticalLineTo(6.84418f)
                close()
                moveTo(2f, 5.5f)
                curveTo(2f, 4.67157f, 2.67157f, 4f, 3.5f, 4f)
                horizontalLineTo(8.5f)
                curveTo(9.32843f, 4f, 10f, 4.67157f, 10f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(10f, 11.3284f, 9.32843f, 12f, 8.5f, 12f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 12f, 2f, 11.3284f, 2f, 10.5f)
                verticalLineTo(5.5f)
                close()
            }
        }.build()
        
        return _DeviceCameraVideo!!
    }

private var _DeviceCameraVideo: ImageVector? = null

