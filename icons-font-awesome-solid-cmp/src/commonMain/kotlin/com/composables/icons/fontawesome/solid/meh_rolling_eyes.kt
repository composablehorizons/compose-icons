package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MehRollingEyes: ImageVector
    get() {
        if (_MehRollingEyes != null) return _MehRollingEyes!!
        
        _MehRollingEyes = ImageVector.Builder(
            name = "meh-rolling-eyes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveTo(88f, 224f)
                curveToRelative(0f, -24.3f, 13.7f, -45.2f, 33.6f, -56f)
                curveToRelative(-0.7f, 2.6f, -1.6f, 5.2f, -1.6f, 8f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                curveToRelative(0f, -2.8f, -0.9f, -5.4f, -1.6f, -8f)
                curveToRelative(19.9f, 10.8f, 33.6f, 31.7f, 33.6f, 56f)
                curveToRelative(0f, 35.3f, -28.7f, 64f, -64f, 64f)
                reflectiveCurveToRelative(-64f, -28.7f, -64f, -64f)
                close()
                moveToRelative(224f, 176f)
                horizontalLineTo(184f)
                curveToRelative(-21.2f, 0f, -21.2f, -32f, 0f, -32f)
                horizontalLineToRelative(128f)
                curveToRelative(21.2f, 0f, 21.2f, 32f, 0f, 32f)
                close()
                moveToRelative(32f, -112f)
                curveToRelative(-35.3f, 0f, -64f, -28.7f, -64f, -64f)
                curveToRelative(0f, -24.3f, 13.7f, -45.2f, 33.6f, -56f)
                curveToRelative(-0.7f, 2.6f, -1.6f, 5.2f, -1.6f, 8f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                curveToRelative(0f, -2.8f, -0.9f, -5.4f, -1.6f, -8f)
                curveToRelative(19.9f, 10.8f, 33.6f, 31.7f, 33.6f, 56f)
                curveToRelative(0f, 35.3f, -28.7f, 64f, -64f, 64f)
                close()
            }
        }.build()
        
        return _MehRollingEyes!!
    }

private var _MehRollingEyes: ImageVector? = null

