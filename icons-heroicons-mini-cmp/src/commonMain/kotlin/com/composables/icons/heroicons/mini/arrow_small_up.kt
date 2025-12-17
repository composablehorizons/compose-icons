package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowSmallUp: ImageVector
    get() {
        if (_ArrowSmallUp != null) return _ArrowSmallUp!!
        
        _ArrowSmallUp = ImageVector.Builder(
            name = "arrow-small-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineTo(7.612f)
                lineTo(7.29f, 9.77f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.08f, -1.04f)
                lineToRelative(3.25f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.08f, 0f)
                lineToRelative(3.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.08f, 1.04f)
                lineToRelative(-1.96f, -2.158f)
                verticalLineToRelative(6.638f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 15f)
                close()
            }
        }.build()
        
        return _ArrowSmallUp!!
    }

private var _ArrowSmallUp: ImageVector? = null

