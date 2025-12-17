package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowLeft: ImageVector
    get() {
        if (_ArrowLeft != null) return _ArrowLeft!!
        
        _ArrowLeft = ImageVector.Builder(
            name = "arrow-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(5.612f)
                lineToRelative(4.158f, 3.96f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.04f, 1.08f)
                lineToRelative(-5.5f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.08f)
                lineToRelative(5.5f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.04f, 1.08f)
                lineTo(5.612f, 9.25f)
                horizontalLineTo(16.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 17f, 10f)
                close()
            }
        }.build()
        
        return _ArrowLeft!!
    }

private var _ArrowLeft: ImageVector? = null

