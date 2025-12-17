package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Gem: ImageVector
    get() {
        if (_Gem != null) return _Gem!!
        
        _Gem = ImageVector.Builder(
            name = "gem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(485.5f, 0f)
                lineTo(576f, 160f)
                horizontalLineTo(474.9f)
                lineTo(405.7f, 0f)
                horizontalLineToRelative(79.8f)
                close()
                moveToRelative(-128f, 0f)
                lineToRelative(69.2f, 160f)
                horizontalLineTo(149.3f)
                lineTo(218.5f, 0f)
                horizontalLineToRelative(139f)
                close()
                moveToRelative(-267f, 0f)
                horizontalLineToRelative(79.8f)
                lineToRelative(-69.2f, 160f)
                horizontalLineTo(0f)
                lineTo(90.5f, 0f)
                close()
                moveTo(0f, 192f)
                horizontalLineToRelative(100.7f)
                lineToRelative(123f, 251.7f)
                curveToRelative(1.5f, 3.1f, -2.7f, 5.9f, -5f, 3.3f)
                lineTo(0f, 192f)
                close()
                moveToRelative(148.2f, 0f)
                horizontalLineToRelative(279.6f)
                lineToRelative(-137f, 318.2f)
                curveToRelative(-1f, 2.4f, -4.5f, 2.4f, -5.5f, 0f)
                lineTo(148.2f, 192f)
                close()
                moveToRelative(204.1f, 251.7f)
                lineToRelative(123f, -251.7f)
                horizontalLineTo(576f)
                lineTo(357.3f, 446.9f)
                curveToRelative(-2.3f, 2.7f, -6.5f, -0.1f, -5f, -3.2f)
                close()
            }
        }.build()
        
        return _Gem!!
    }

private var _Gem: ImageVector? = null

