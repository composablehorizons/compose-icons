package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.AirBalloon: ImageVector
    get() {
        if (_AirBalloon != null) return _AirBalloon!!
        
        _AirBalloon = ImageVector.Builder(
            name = "air-balloon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 18f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 7f, 7f)
                curveToRelative(0f, 4.185f, -3.297f, 9f, -7f, 9f)
                reflectiveCurveToRelative(-7f, -4.815f, -7f, -9f)
                arcToRelative(7f, 7f, 0f, false, true, 7f, -7f)
            }
        }.build()
        
        return _AirBalloon!!
    }

private var _AirBalloon: ImageVector? = null

