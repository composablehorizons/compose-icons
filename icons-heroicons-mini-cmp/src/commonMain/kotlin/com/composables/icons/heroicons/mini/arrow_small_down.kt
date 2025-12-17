package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowSmallDown: ImageVector
    get() {
        if (_ArrowSmallDown != null) return _ArrowSmallDown!!
        
        _ArrowSmallDown = ImageVector.Builder(
            name = "arrow-small-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.638f)
                lineToRelative(1.96f, -2.158f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.08f, 1.04f)
                lineToRelative(-3.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.08f, 0f)
                lineToRelative(-3.25f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.08f, -1.04f)
                lineToRelative(1.96f, 2.158f)
                verticalLineTo(5.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 5f)
                close()
            }
        }.build()
        
        return _ArrowSmallDown!!
    }

private var _ArrowSmallDown: ImageVector? = null

