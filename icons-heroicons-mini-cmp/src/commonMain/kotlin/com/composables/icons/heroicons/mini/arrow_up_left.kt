package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowUpLeft: ImageVector
    get() {
        if (_ArrowUpLeft != null) return _ArrowUpLeft!!
        
        _ArrowUpLeft = ImageVector.Builder(
            name = "arrow-up-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.78f, 14.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineTo(6.5f, 7.56f)
                verticalLineToRelative(5.69f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5.75f, 5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(7.56f)
                lineToRelative(7.22f, 7.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                close()
            }
        }.build()
        
        return _ArrowUpLeft!!
    }

private var _ArrowUpLeft: ImageVector? = null

