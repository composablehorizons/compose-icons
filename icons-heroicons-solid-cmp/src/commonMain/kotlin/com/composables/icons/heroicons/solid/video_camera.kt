package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.VideoCamera: ImageVector
    get() {
        if (_VideoCamera != null) return _VideoCamera!!
        
        _VideoCamera = ImageVector.Builder(
            name = "video-camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 4.5f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(8.25f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineTo(4.5f)
                close()
                moveTo(19.94f, 18.75f)
                lineToRelative(-2.69f, -2.69f)
                verticalLineTo(7.94f)
                lineToRelative(2.69f, -2.69f)
                curveToRelative(0.944f, -0.945f, 2.56f, -0.276f, 2.56f, 1.06f)
                verticalLineToRelative(11.38f)
                curveToRelative(0f, 1.336f, -1.616f, 2.005f, -2.56f, 1.06f)
                close()
            }
        }.build()
        
        return _VideoCamera!!
    }

private var _VideoCamera: ImageVector? = null

