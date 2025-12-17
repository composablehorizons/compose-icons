package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowDownCircle: ImageVector
    get() {
        if (_ArrowDownCircle != null) return _ArrowDownCircle!!
        
        _ArrowDownCircle = ImageVector.Builder(
            name = "arrow-down-circle",
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
                moveToRelative(0.75f, -11.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(4.59f)
                lineTo(7.3f, 9.24f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.1f, 1.02f)
                lineToRelative(3.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.1f, 0f)
                lineToRelative(3.25f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.1f, -1.02f)
                lineToRelative(-1.95f, 2.1f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()
        
        return _ArrowDownCircle!!
    }

private var _ArrowDownCircle: ImageVector? = null

