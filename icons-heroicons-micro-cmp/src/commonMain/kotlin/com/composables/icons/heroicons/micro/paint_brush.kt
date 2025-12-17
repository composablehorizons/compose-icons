package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PaintBrush: ImageVector
    get() {
        if (_PaintBrush != null) return _PaintBrush!!
        
        _PaintBrush = ImageVector.Builder(
            name = "paint-brush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.613f, 1.258f)
                arcToRelative(1.535f, 1.535f, 0f, false, true, 2.13f, 2.129f)
                lineToRelative(-1.905f, 2.856f)
                arcToRelative(8f, 8f, 0f, false, true, -3.56f, 2.939f)
                arcToRelative(4.011f, 4.011f, 0f, false, false, -2.46f, -2.46f)
                arcToRelative(8f, 8f, 0f, false, true, 2.94f, -3.56f)
                lineToRelative(2.855f, -1.904f)
                close()
                moveTo(5.5f, 8f)
                arcTo(2.5f, 2.5f, 0f, false, false, 3f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.7f, 0.459f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.983f, 1f)
                arcTo(3.5f, 3.5f, 0f, false, false, 8f, 10.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 5.5f, 8f)
                close()
            }
        }.build()
        
        return _PaintBrush!!
    }

private var _PaintBrush: ImageVector? = null

