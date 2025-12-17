package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BowlSpoon: ImageVector
    get() {
        if (_BowlSpoon != null) return _BowlSpoon!!
        
        _BowlSpoon = ImageVector.Builder(
            name = "bowl-spoon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.694f, -2.247f, 5.49f, -3.983f, 6.983f)
                lineToRelative(-0.017f, 0.013f)
                verticalLineToRelative(0.504f)
                arcToRelative(2f, 2f, 0f, false, true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-0.496f)
                lineToRelative(-0.065f, -0.053f)
                curveToRelative(-1.76f, -1.496f, -3.794f, -4.965f, -3.928f, -6.77f)
                lineToRelative(-0.007f, -0.181f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                curveToRelative(1.71f, 0f, 3.237f, 0.787f, 3.785f, 2f)
                horizontalLineToRelative(8.215f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                lineToRelative(-8.216f, 0.001f)
                curveToRelative(-0.548f, 1.213f, -2.074f, 1.999f, -3.784f, 1.999f)
                curveToRelative(-2.144f, 0f, -4f, -1.237f, -4f, -3f)
                reflectiveCurveToRelative(1.856f, -3f, 4f, -3f)
            }
        }.build()
        
        return _BowlSpoon!!
    }

private var _BowlSpoon: ImageVector? = null

