package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowLeftCircle: ImageVector
    get() {
        if (_ArrowLeftCircle != null) return _ArrowLeftCircle!!
        
        _ArrowLeftCircle = ImageVector.Builder(
            name = "arrow-left-circle",
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
                moveToRelative(3.25f, -7.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(8.66f)
                lineToRelative(2.1f, -1.95f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.02f, -1.1f)
                lineToRelative(-3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.1f)
                lineToRelative(3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.02f, -1.1f)
                lineToRelative(-2.1f, -1.95f)
                horizontalLineToRelative(4.59f)
                close()
            }
        }.build()
        
        return _ArrowLeftCircle!!
    }

private var _ArrowLeftCircle: ImageVector? = null

