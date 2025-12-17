package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowLongLeft: ImageVector
    get() {
        if (_ArrowLongLeft != null) return _ArrowLongLeft!!
        
        _ArrowLongLeft = ImageVector.Builder(
            name = "arrow-long-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(4.66f)
                lineToRelative(2.1f, 1.95f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.02f, 1.1f)
                lineToRelative(-3.5f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.1f)
                lineToRelative(3.5f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.02f, 1.1f)
                lineToRelative(-2.1f, 1.95f)
                horizontalLineToRelative(12.59f)
                arcTo(0.75f, 0.75f, 0f, false, true, 18f, 10f)
                close()
            }
        }.build()
        
        return _ArrowLongLeft!!
    }

private var _ArrowLongLeft: ImageVector? = null

