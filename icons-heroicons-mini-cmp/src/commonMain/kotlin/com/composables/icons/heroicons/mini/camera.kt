package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(0.93f)
                arcToRelative(2f, 2f, 0f, false, false, 1.664f, -0.89f)
                lineToRelative(0.812f, -1.22f)
                arcTo(2f, 2f, 0f, false, true, 8.07f, 3f)
                horizontalLineToRelative(3.86f)
                arcToRelative(2f, 2f, 0f, false, true, 1.664f, 0.89f)
                lineToRelative(0.812f, 1.22f)
                arcTo(2f, 2f, 0f, false, false, 16.07f, 6f)
                horizontalLineTo(17f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                close()
                moveToRelative(13.5f, 3f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, -9f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 9f, 0f)
                close()
                moveTo(10f, 14f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

