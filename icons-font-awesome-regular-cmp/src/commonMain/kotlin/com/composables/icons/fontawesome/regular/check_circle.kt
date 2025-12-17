package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.CheckCircle: ImageVector
    get() {
        if (_CheckCircle != null) return _CheckCircle!!
        
        _CheckCircle = ImageVector.Builder(
            name = "check-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119.033f, 8f, 8f, 119.033f, 8f, 256f)
                reflectiveCurveToRelative(111.033f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.033f, 248f, -248f)
                reflectiveCurveTo(392.967f, 8f, 256f, 8f)
                close()
                moveToRelative(0f, 48f)
                curveToRelative(110.532f, 0f, 200f, 89.451f, 200f, 200f)
                curveToRelative(0f, 110.532f, -89.451f, 200f, -200f, 200f)
                curveToRelative(-110.532f, 0f, -200f, -89.451f, -200f, -200f)
                curveToRelative(0f, -110.532f, 89.451f, -200f, 200f, -200f)
                moveToRelative(140.204f, 130.267f)
                lineToRelative(-22.536f, -22.718f)
                curveToRelative(-4.667f, -4.705f, -12.265f, -4.736f, -16.97f, -0.068f)
                lineTo(215.346f, 303.697f)
                lineToRelative(-59.792f, -60.277f)
                curveToRelative(-4.667f, -4.705f, -12.265f, -4.736f, -16.97f, -0.069f)
                lineToRelative(-22.719f, 22.536f)
                curveToRelative(-4.705f, 4.667f, -4.736f, 12.265f, -0.068f, 16.971f)
                lineToRelative(90.781f, 91.516f)
                curveToRelative(4.667f, 4.705f, 12.265f, 4.736f, 16.97f, 0.068f)
                lineToRelative(172.589f, -171.204f)
                curveToRelative(4.704f, -4.668f, 4.734f, -12.266f, 0.067f, -16.971f)
                close()
            }
        }.build()
        
        return _CheckCircle!!
    }

private var _CheckCircle: ImageVector? = null

