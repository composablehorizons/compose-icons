package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowLongRight: ImageVector
    get() {
        if (_ArrowLongRight != null) return _ArrowLongRight!!
        
        _ArrowLongRight = ImageVector.Builder(
            name = "arrow-long-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(12.59f)
                lineToRelative(-2.1f, -1.95f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.02f, -1.1f)
                lineToRelative(3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.1f)
                lineToRelative(-3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.02f, -1.1f)
                lineToRelative(2.1f, -1.95f)
                horizontalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 10f)
                close()
            }
        }.build()
        
        return _ArrowLongRight!!
    }

private var _ArrowLongRight: ImageVector? = null

