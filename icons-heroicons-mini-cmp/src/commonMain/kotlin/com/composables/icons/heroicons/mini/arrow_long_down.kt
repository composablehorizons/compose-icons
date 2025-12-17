package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowLongDown: ImageVector
    get() {
        if (_ArrowLongDown != null) return _ArrowLongDown!!
        
        _ArrowLongDown = ImageVector.Builder(
            name = "arrow-long-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(12.59f)
                lineToRelative(1.95f, -2.1f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.1f, 1.02f)
                lineToRelative(-3.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.1f, 0f)
                lineToRelative(-3.25f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.1f, -1.02f)
                lineToRelative(1.95f, 2.1f)
                verticalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 2f)
                close()
            }
        }.build()
        
        return _ArrowLongDown!!
    }

private var _ArrowLongDown: ImageVector? = null

