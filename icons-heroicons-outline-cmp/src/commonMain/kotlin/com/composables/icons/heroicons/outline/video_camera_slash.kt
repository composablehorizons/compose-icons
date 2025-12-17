package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.VideoCameraSlash: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15.75f, 10.5f)
                lineToRelative(4.72f, -4.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.28f, 0.53f)
                verticalLineToRelative(11.38f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.28f, 0.53f)
                lineToRelative(-4.72f, -4.72f)
                moveTo(12f, 18.75f)
                horizontalLineTo(4.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, -2.25f)
                verticalLineTo(9f)
                moveToRelative(12.841f, 9.091f)
                lineTo(16.5f, 19.5f)
                moveToRelative(-1.409f, -1.409f)
                curveToRelative(0.407f, -0.407f, 0.659f, -0.97f, 0.659f, -1.591f)
                verticalLineToRelative(-9f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.621f, 0f, -1.184f, 0.252f, -1.591f, 0.659f)
                moveToRelative(12.182f, 12.182f)
                lineTo(2.909f, 5.909f)
                moveTo(1.5f, 4.5f)
                lineToRelative(1.409f, 1.409f)
            }
        }.build()
        
        return _VideoCameraSlash!!
    }

private var _VideoCameraSlash: ImageVector? = null

