package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.QuestionCircle: ImageVector
    get() {
        if (_QuestionCircle != null) return _QuestionCircle!!
        
        _QuestionCircle = ImageVector.Builder(
            name = "question-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119.043f, 8f, 8f, 119.083f, 8f, 256f)
                curveToRelative(0f, 136.997f, 111.043f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111.003f, 248f, -248f)
                curveTo(504f, 119.083f, 392.957f, 8f, 256f, 8f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-110.532f, 0f, -200f, -89.431f, -200f, -200f)
                curveToRelative(0f, -110.495f, 89.472f, -200f, 200f, -200f)
                curveToRelative(110.491f, 0f, 200f, 89.471f, 200f, 200f)
                curveToRelative(0f, 110.53f, -89.431f, 200f, -200f, 200f)
                close()
                moveToRelative(107.244f, -255.2f)
                curveToRelative(0f, 67.052f, -72.421f, 68.084f, -72.421f, 92.863f)
                verticalLineTo(300f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineToRelative(-45.647f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-8.659f)
                curveToRelative(0f, -35.745f, 27.1f, -50.034f, 47.579f, -61.516f)
                curveToRelative(17.561f, -9.845f, 28.324f, -16.541f, 28.324f, -29.579f)
                curveToRelative(0f, -17.246f, -21.999f, -28.693f, -39.784f, -28.693f)
                curveToRelative(-23.189f, 0f, -33.894f, 10.977f, -48.942f, 29.969f)
                curveToRelative(-4.057f, 5.12f, -11.46f, 6.071f, -16.666f, 2.124f)
                lineToRelative(-27.824f, -21.098f)
                curveToRelative(-5.107f, -3.872f, -6.251f, -11.066f, -2.644f, -16.363f)
                curveTo(184.846f, 131.491f, 214.94f, 112f, 261.794f, 112f)
                curveToRelative(49.071f, 0f, 101.45f, 38.304f, 101.45f, 88.8f)
                close()
                moveTo(298f, 368f)
                curveToRelative(0f, 23.159f, -18.841f, 42f, -42f, 42f)
                reflectiveCurveToRelative(-42f, -18.841f, -42f, -42f)
                reflectiveCurveToRelative(18.841f, -42f, 42f, -42f)
                reflectiveCurveToRelative(42f, 18.841f, 42f, 42f)
                close()
            }
        }.build()
        
        return _QuestionCircle!!
    }

private var _QuestionCircle: ImageVector? = null

