package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.VideoCamera: ImageVector
    get() {
        if (_VideoCamera != null) return _VideoCamera!!
        
        _VideoCamera = ImageVector.Builder(
            name = "video-camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.25f, 4f)
                arcTo(2.25f, 2.25f, 0f, false, false, 1f, 6.25f)
                verticalLineToRelative(7.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3.25f, 16f)
                horizontalLineToRelative(7.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 13f, 13.75f)
                verticalLineToRelative(-7.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 10.75f, 4f)
                horizontalLineToRelative(-7.5f)
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
            }
        }.build()
        
        return _VideoCamera!!
    }

private var _VideoCamera: ImageVector? = null

