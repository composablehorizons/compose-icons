package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowDown: ImageVector
    get() {
        if (_ArrowDown != null) return _ArrowDown!!
        
        _ArrowDown = ImageVector.Builder(
            name = "arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(10.638f)
                lineToRelative(3.96f, -4.158f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.08f, 1.04f)
                lineToRelative(-5.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.08f, 0f)
                lineToRelative(-5.25f, -5.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.08f, -1.04f)
                lineToRelative(3.96f, 4.158f)
                verticalLineTo(3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 3f)
                close()
            }
        }.build()
        
        return _ArrowDown!!
    }

private var _ArrowDown: ImageVector? = null

