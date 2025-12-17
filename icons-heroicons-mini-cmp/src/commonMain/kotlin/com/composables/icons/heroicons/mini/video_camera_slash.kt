package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.VideoCameraSlash: ImageVector
    get() {
        if (_VideoCameraSlash != null) return _VideoCameraSlash!!
        
        _VideoCameraSlash = ImageVector.Builder(
            name = "video-camera-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 13.75f)
                verticalLineTo(7.182f)
                lineTo(9.818f, 16f)
                horizontalLineTo(3.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 13.75f)
                close()
                moveTo(13f, 6.25f)
                verticalLineToRelative(6.568f)
                lineTo(4.182f, 4f)
                horizontalLineToRelative(6.568f)
                arcTo(2.25f, 2.25f, 0f, false, true, 13f, 6.25f)
                close()
                moveTo(19f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.28f, -0.53f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.22f, 0.53f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.199f, 0.079f, 0.39f, 0.22f, 0.53f)
                lineToRelative(3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.28f, -0.53f)
                verticalLineTo(4.75f)
                close()
                moveTo(2.28f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(10.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(2.28f, 4.22f)
                close()
            }
        }.build()
        
        return _VideoCameraSlash!!
    }

private var _VideoCameraSlash: ImageVector? = null

