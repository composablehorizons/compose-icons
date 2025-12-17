package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LessThan: ImageVector
    get() {
        if (_LessThan != null) return _LessThan!!
        
        _LessThan = ImageVector.Builder(
            name = "less-than",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(365.46f, 357.74f)
                lineTo(147.04f, 255.89f)
                lineToRelative(218.47f, -101.88f)
                curveToRelative(16.02f, -7.47f, 22.95f, -26.51f, 15.48f, -42.53f)
                lineToRelative(-13.52f, -29f)
                curveTo(360f, 66.46f, 340.96f, 59.53f, 324.94f, 67f)
                lineTo(18.48f, 209.91f)
                arcToRelative(32.014f, 32.014f, 0f, false, false, -18.48f, 29f)
                verticalLineToRelative(34.24f)
                curveToRelative(0f, 12.44f, 7.21f, 23.75f, 18.48f, 29f)
                lineToRelative(306.31f, 142.83f)
                curveToRelative(16.06f, 7.49f, 35.15f, 0.54f, 42.64f, -15.52f)
                lineToRelative(13.56f, -29.08f)
                curveToRelative(7.49f, -16.06f, 0.54f, -35.15f, -15.53f, -42.64f)
                close()
            }
        }.build()
        
        return _LessThan!!
    }

private var _LessThan: ImageVector? = null

