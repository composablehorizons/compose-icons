package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Forward: ImageVector
    get() {
        if (_Forward != null) return _Forward!!
        
        _Forward = ImageVector.Builder(
            name = "forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.055f, 7.06f)
                curveTo(3.805f, 6.347f, 2.25f, 7.25f, 2.25f, 8.69f)
                verticalLineToRelative(8.122f)
                curveToRelative(0f, 1.44f, 1.555f, 2.343f, 2.805f, 1.628f)
                lineTo(12f, 14.471f)
                verticalLineToRelative(2.34f)
                curveToRelative(0f, 1.44f, 1.555f, 2.343f, 2.805f, 1.628f)
                lineToRelative(7.108f, -4.061f)
                curveToRelative(1.26f, -0.72f, 1.26f, -2.536f, 0f, -3.256f)
                lineToRelative(-7.108f, -4.061f)
                curveTo(13.555f, 6.346f, 12f, 7.249f, 12f, 8.689f)
                verticalLineToRelative(2.34f)
                lineTo(5.055f, 7.061f)
                close()
            }
        }.build()
        
        return _Forward!!
    }

private var _Forward: ImageVector? = null

