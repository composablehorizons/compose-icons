package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.VideoCameraSlash: ImageVector
    get() {
        if (_VideoCameraSlash != null) return _VideoCameraSlash!!
        
        _VideoCameraSlash = ImageVector.Builder(
            name = "video-camera-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 10f)
                verticalLineTo(6.682f)
                lineTo(6.318f, 12f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveTo(10f, 6f)
                verticalLineToRelative(3.318f)
                lineTo(4.682f, 4f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                close()
                moveTo(14.537f, 4.057f)
                arcTo(0.75f, 0.75f, 0f, false, true, 15f, 4.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.28f, 0.53f)
                lineToRelative(-2f, -2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.22f, -0.53f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.22f, -0.53f)
                lineToRelative(2f, -2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.817f, -0.163f)
                close()
                moveTo(2.78f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(6.5f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-6.5f, -6.5f)
                close()
            }
        }.build()
        
        return _VideoCameraSlash!!
    }

private var _VideoCameraSlash: ImageVector? = null

