package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.VideoCamera: ImageVector
    get() {
        if (_VideoCamera != null) return _VideoCamera!!
        
        _VideoCamera = ImageVector.Builder(
            name = "video-camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(3f)
                close()
                moveTo(15f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.28f, -0.53f)
                lineToRelative(-2f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.22f, 0.53f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.199f, 0.079f, 0.39f, 0.22f, 0.53f)
                lineToRelative(2f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.28f, -0.53f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }.build()
        
        return _VideoCamera!!
    }

private var _VideoCamera: ImageVector? = null

