package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.VideoCameraSlash: ImageVector
    get() {
        if (_VideoCameraSlash != null) return _VideoCameraSlash!!
        
        _VideoCameraSlash = ImageVector.Builder(
            name = "video-camera-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.97f, 3.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(15f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-15f, -15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveTo(17.25f, 16.06f)
                lineToRelative(2.69f, 2.69f)
                curveToRelative(0.944f, 0.945f, 2.56f, 0.276f, 2.56f, -1.06f)
                verticalLineTo(6.31f)
                curveToRelative(0f, -1.336f, -1.616f, -2.005f, -2.56f, -1.06f)
                lineToRelative(-2.69f, 2.69f)
                verticalLineToRelative(8.12f)
                close()
                moveTo(15.75f, 7.5f)
                verticalLineToRelative(8.068f)
                lineTo(4.682f, 4.5f)
                horizontalLineToRelative(8.068f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                close()
                moveTo(1.5f, 16.5f)
                verticalLineTo(7.682f)
                lineToRelative(11.773f, 11.773f)
                curveToRelative(-0.17f, 0.03f, -0.345f, 0.045f, -0.523f, 0.045f)
                horizontalLineTo(4.5f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                close()
            }
        }.build()
        
        return _VideoCameraSlash!!
    }

private var _VideoCameraSlash: ImageVector? = null

