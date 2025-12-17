package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowSmallRight: ImageVector
    get() {
        if (_ArrowSmallRight != null) return _ArrowSmallRight!!
        
        _ArrowSmallRight = ImageVector.Builder(
            name = "arrow-small-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(6.638f)
                lineTo(10.23f, 7.29f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.04f, -1.08f)
                lineToRelative(3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.08f)
                lineToRelative(-3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.04f, -1.08f)
                lineToRelative(2.158f, -1.96f)
                horizontalLineTo(5.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5f, 10f)
                close()
            }
        }.build()
        
        return _ArrowSmallRight!!
    }

private var _ArrowSmallRight: ImageVector? = null

