package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowUpRight: ImageVector
    get() {
        if (_ArrowUpRight != null) return _ArrowUpRight!!
        
        _ArrowUpRight = ImageVector.Builder(
            name = "arrow-up-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.22f, 14.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(7.22f, -7.22f)
                verticalLineToRelative(5.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(5.69f)
                lineToRelative(-7.22f, 7.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                close()
            }
        }.build()
        
        return _ArrowUpRight!!
    }

private var _ArrowUpRight: ImageVector? = null

