package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ExpandArrowsAlt: ImageVector
    get() {
        if (_ExpandArrowsAlt != null) return _ExpandArrowsAlt!!
        
        _ExpandArrowsAlt = ImageVector.Builder(
            name = "expand-arrows-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 344f)
                verticalLineToRelative(112f)
                arcToRelative(23.94f, 23.94f, 0f, false, true, -24f, 24f)
                horizontalLineTo(312f)
                curveToRelative(-21.39f, 0f, -32.09f, -25.9f, -17f, -41f)
                lineToRelative(36.2f, -36.2f)
                lineTo(224f, 295.6f)
                lineTo(116.77f, 402.9f)
                lineTo(153f, 439f)
                curveToRelative(15.09f, 15.1f, 4.39f, 41f, -17f, 41f)
                horizontalLineTo(24f)
                arcToRelative(23.94f, 23.94f, 0f, false, true, -24f, -24f)
                verticalLineTo(344f)
                curveToRelative(0f, -21.4f, 25.89f, -32.1f, 41f, -17f)
                lineToRelative(36.19f, 36.2f)
                lineTo(184.46f, 256f)
                lineTo(77.18f, 148.7f)
                lineTo(41f, 185f)
                curveToRelative(-15.1f, 15.1f, -41f, 4.4f, -41f, -17f)
                verticalLineTo(56f)
                arcToRelative(23.94f, 23.94f, 0f, false, true, 24f, -24f)
                horizontalLineToRelative(112f)
                curveToRelative(21.39f, 0f, 32.09f, 25.9f, 17f, 41f)
                lineToRelative(-36.2f, 36.2f)
                lineTo(224f, 216.4f)
                lineToRelative(107.23f, -107.3f)
                lineTo(295f, 73f)
                curveToRelative(-15.09f, -15.1f, -4.39f, -41f, 17f, -41f)
                horizontalLineToRelative(112f)
                arcToRelative(23.94f, 23.94f, 0f, false, true, 24f, 24f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 21.4f, -25.89f, 32.1f, -41f, 17f)
                lineToRelative(-36.19f, -36.2f)
                lineTo(263.54f, 256f)
                lineToRelative(107.28f, 107.3f)
                lineTo(407f, 327.1f)
                curveToRelative(15.1f, -15.2f, 41f, -4.5f, 41f, 16.9f)
                close()
            }
        }.build()
        
        return _ExpandArrowsAlt!!
    }

private var _ExpandArrowsAlt: ImageVector? = null

