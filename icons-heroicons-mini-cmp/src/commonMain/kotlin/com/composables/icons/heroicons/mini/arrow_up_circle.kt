package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowUpCircle: ImageVector
    get() {
        if (_ArrowUpCircle != null) return _ArrowUpCircle!!
        
        _ArrowUpCircle = ImageVector.Builder(
            name = "arrow-up-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 18f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, -16f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                close()
                moveToRelative(-0.75f, -4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(8.66f)
                lineToRelative(1.95f, 2.1f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.1f, -1.02f)
                lineToRelative(-3.25f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.1f, 0f)
                lineTo(6.2f, 9.74f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.1f, 1.02f)
                lineToRelative(1.95f, -2.1f)
                verticalLineToRelative(4.59f)
                close()
            }
        }.build()
        
        return _ArrowUpCircle!!
    }

private var _ArrowUpCircle: ImageVector? = null

