package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.RubleSign: ImageVector
    get() {
        if (_RubleSign != null) return _RubleSign!!
        
        _RubleSign = ImageVector.Builder(
            name = "ruble-sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(239.36f, 320f)
                curveTo(324.48f, 320f, 384f, 260.542f, 384f, 175.071f)
                reflectiveCurveTo(324.48f, 32f, 239.36f, 32f)
                horizontalLineTo(76f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(206.632f)
                horizontalLineTo(12f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineTo(308f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(52f)
                verticalLineToRelative(32f)
                horizontalLineTo(12f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(52f)
                verticalLineToRelative(52f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(58.56f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-52f)
                horizontalLineTo(308f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineTo(146.56f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(92.8f)
                close()
                moveToRelative(-92.8f, -219.252f)
                horizontalLineToRelative(78.72f)
                curveToRelative(46.72f, 0f, 74.88f, 29.11f, 74.88f, 74.323f)
                curveToRelative(0f, 45.832f, -28.16f, 75.561f, -76.16f, 75.561f)
                horizontalLineToRelative(-77.44f)
                verticalLineTo(100.748f)
                close()
            }
        }.build()
        
        return _RubleSign!!
    }

private var _RubleSign: ImageVector? = null

