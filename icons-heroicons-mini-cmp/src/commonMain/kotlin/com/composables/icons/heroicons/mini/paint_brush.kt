package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PaintBrush: ImageVector
    get() {
        if (_PaintBrush != null) return _PaintBrush!!
        
        _PaintBrush = ImageVector.Builder(
            name = "paint-brush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.993f, 1.385f)
                arcToRelative(1.87f, 1.87f, 0f, false, true, 2.623f, 2.622f)
                lineToRelative(-4.03f, 5.27f)
                arcToRelative(12.749f, 12.749f, 0f, false, true, -4.237f, 3.562f)
                arcToRelative(4.508f, 4.508f, 0f, false, false, -3.188f, -3.188f)
                arcToRelative(12.75f, 12.75f, 0f, false, true, 3.562f, -4.236f)
                lineToRelative(5.27f, -4.03f)
                close()
                moveTo(6f, 11f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.72f, 0.45f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.035f, 0.931f)
                arcTo(4.001f, 4.001f, 0f, false, false, 9f, 14.004f)
                verticalLineTo(14f)
                arcToRelative(3.01f, 3.01f, 0f, false, false, -1.66f, -2.685f)
                arcTo(2.99f, 2.99f, 0f, false, false, 6f, 11f)
                close()
            }
        }.build()
        
        return _PaintBrush!!
    }

private var _PaintBrush: ImageVector? = null

