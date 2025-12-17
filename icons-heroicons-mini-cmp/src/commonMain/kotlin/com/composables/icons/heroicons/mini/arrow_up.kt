package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowUp: ImageVector
    get() {
        if (_ArrowUp != null) return _ArrowUp!!
        
        _ArrowUp = ImageVector.Builder(
            name = "arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 17f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineTo(5.612f)
                lineTo(5.29f, 9.77f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.08f, -1.04f)
                lineToRelative(5.25f, -5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.08f, 0f)
                lineToRelative(5.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.08f, 1.04f)
                lineToRelative(-3.96f, -4.158f)
                verticalLineTo(16.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 17f)
                close()
            }
        }.build()
        
        return _ArrowUp!!
    }

private var _ArrowUp: ImageVector? = null

