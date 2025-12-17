package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileAudio: ImageVector
    get() {
        if (_FileAudio != null) return _FileAudio!!
        
        _FileAudio = ImageVector.Builder(
            name = "file-audio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 136f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.7f, 0f, 0f, 10.7f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
                moveToRelative(-64f, 268f)
                curveToRelative(0f, 10.7f, -12.9f, 16f, -20.5f, 8.5f)
                lineTo(104f, 376f)
                horizontalLineTo(76f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(28f)
                lineToRelative(35.5f, -36.5f)
                curveToRelative(7.6f, -7.6f, 20.5f, -2.2f, 20.5f, 8.5f)
                verticalLineToRelative(136f)
                close()
                moveToRelative(33.2f, -47.6f)
                curveToRelative(9.1f, -9.3f, 9.1f, -24.1f, 0f, -33.4f)
                curveToRelative(-22.1f, -22.8f, 12.2f, -56.2f, 34.4f, -33.5f)
                curveToRelative(27.2f, 27.9f, 27.2f, 72.4f, 0f, 100.4f)
                curveToRelative(-21.8f, 22.3f, -56.9f, -10.4f, -34.4f, -33.5f)
                close()
                moveToRelative(86f, -117.1f)
                curveToRelative(54.4f, 55.9f, 54.4f, 144.8f, 0f, 200.8f)
                curveToRelative(-21.8f, 22.4f, -57f, -10.3f, -34.4f, -33.5f)
                curveToRelative(36.2f, -37.2f, 36.3f, -96.5f, 0f, -133.8f)
                curveToRelative(-22.1f, -22.8f, 12.3f, -56.3f, 34.4f, -33.5f)
                close()
                moveTo(384f, 121.9f)
                verticalLineToRelative(6.1f)
                horizontalLineTo(256f)
                verticalLineTo(0f)
                horizontalLineToRelative(6.1f)
                curveToRelative(6.4f, 0f, 12.5f, 2.5f, 17f, 7f)
                lineToRelative(97.9f, 98f)
                curveToRelative(4.5f, 4.5f, 7f, 10.6f, 7f, 16.9f)
                close()
            }
        }.build()
        
        return _FileAudio!!
    }

private var _FileAudio: ImageVector? = null

