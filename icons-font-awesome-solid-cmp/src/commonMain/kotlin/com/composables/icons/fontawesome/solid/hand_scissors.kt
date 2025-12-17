package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandScissors: ImageVector
    get() {
        if (_HandScissors != null) return _HandScissors!!
        
        _HandScissors = ImageVector.Builder(
            name = "hand-scissors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 440f)
                curveToRelative(0f, -22.092f, 17.909f, -40f, 40f, -40f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-32f)
                curveToRelative(-22.091f, 0f, -40f, -17.908f, -40f, -40f)
                reflectiveCurveToRelative(17.909f, -40f, 40f, -40f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-8f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                reflectiveCurveToRelative(21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(208f)
                verticalLineToRelative(-13.572f)
                lineToRelative(-177.551f, -69.74f)
                curveToRelative(-24.674f, -9.694f, -36.818f, -37.555f, -27.125f, -62.228f)
                curveToRelative(9.693f, -24.674f, 37.554f, -36.817f, 62.228f, -27.124f)
                lineToRelative(190.342f, 74.765f)
                lineToRelative(24.872f, -31.09f)
                curveToRelative(12.306f, -15.381f, 33.978f, -19.515f, 51.081f, -9.741f)
                lineToRelative(112f, 64f)
                arcTo(40.002f, 40.002f, 0f, false, true, 512f, 168f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 18.562f, -12.77f, 34.686f, -30.838f, 38.937f)
                lineToRelative(-136f, 32f)
                arcTo(39.982f, 39.982f, 0f, false, true, 336f, 480f)
                horizontalLineToRelative(-80f)
                curveToRelative(-22.091f, 0f, -40f, -17.908f, -40f, -40f)
                close()
            }
        }.build()
        
        return _HandScissors!!
    }

private var _HandScissors: ImageVector? = null

