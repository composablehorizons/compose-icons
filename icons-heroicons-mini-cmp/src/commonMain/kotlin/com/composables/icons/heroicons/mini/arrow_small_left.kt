package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowSmallLeft: ImageVector
    get() {
        if (_ArrowSmallLeft != null) return _ArrowSmallLeft!!
        
        _ArrowSmallLeft = ImageVector.Builder(
            name = "arrow-small-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(7.612f)
                lineToRelative(2.158f, 1.96f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.04f, 1.08f)
                lineToRelative(-3.5f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.08f)
                lineToRelative(3.5f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.04f, 1.08f)
                lineTo(7.612f, 9.25f)
                horizontalLineToRelative(6.638f)
                arcTo(0.75f, 0.75f, 0f, false, true, 15f, 10f)
                close()
            }
        }.build()
        
        return _ArrowSmallLeft!!
    }

private var _ArrowSmallLeft: ImageVector? = null

