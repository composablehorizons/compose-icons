package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowUpRight: ImageVector
    get() {
        if (_ArrowUpRight != null) return _ArrowUpRight!!
        
        _ArrowUpRight = ImageVector.Builder(
            name = "arrow-up-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.25f, 3.75f)
                horizontalLineTo(19.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(11.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(6.31f)
                lineTo(5.03f, 20.03f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineTo(17.69f, 5.25f)
                horizontalLineTo(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                close()
            }
        }.build()
        
        return _ArrowUpRight!!
    }

private var _ArrowUpRight: ImageVector? = null

