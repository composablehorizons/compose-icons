package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SkullCrossbones: ImageVector
    get() {
        if (_SkullCrossbones != null) return _SkullCrossbones!!
        
        _SkullCrossbones = ImageVector.Builder(
            name = "skull-crossbones",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(439.15f, 453.06f)
                lineTo(297.17f, 384f)
                lineToRelative(141.99f, -69.06f)
                curveToRelative(7.9f, -3.95f, 11.11f, -13.56f, 7.15f, -21.46f)
                lineTo(432f, 264.85f)
                curveToRelative(-3.95f, -7.9f, -13.56f, -11.11f, -21.47f, -7.16f)
                lineTo(224f, 348.41f)
                lineTo(37.47f, 257.69f)
                curveToRelative(-7.9f, -3.95f, -17.51f, -0.75f, -21.47f, 7.16f)
                lineTo(1.69f, 293.48f)
                curveToRelative(-3.95f, 7.9f, -0.75f, 17.51f, 7.15f, 21.46f)
                lineTo(150.83f, 384f)
                lineTo(8.85f, 453.06f)
                curveToRelative(-7.9f, 3.95f, -11.11f, 13.56f, -7.15f, 21.47f)
                lineToRelative(14.31f, 28.63f)
                curveToRelative(3.95f, 7.9f, 13.56f, 11.11f, 21.47f, 7.15f)
                lineTo(224f, 419.59f)
                lineToRelative(186.53f, 90.72f)
                curveToRelative(7.9f, 3.95f, 17.51f, 0.75f, 21.47f, -7.15f)
                lineToRelative(14.31f, -28.63f)
                curveToRelative(3.95f, -7.91f, 0.74f, -17.52f, -7.16f, -21.47f)
                close()
                moveTo(150f, 237.28f)
                lineToRelative(-5.48f, 25.87f)
                curveToRelative(-2.67f, 12.62f, 5.42f, 24.85f, 16.45f, 24.85f)
                horizontalLineToRelative(126.08f)
                curveToRelative(11.03f, 0f, 19.12f, -12.23f, 16.45f, -24.85f)
                lineToRelative(-5.5f, -25.87f)
                curveToRelative(41.78f, -22.41f, 70f, -62.75f, 70f, -109.28f)
                curveTo(368f, 57.31f, 303.53f, 0f, 224f, 0f)
                reflectiveCurveTo(80f, 57.31f, 80f, 128f)
                curveToRelative(0f, 46.53f, 28.22f, 86.87f, 70f, 109.28f)
                close()
                moveTo(280f, 112f)
                curveToRelative(17.65f, 0f, 32f, 14.35f, 32f, 32f)
                reflectiveCurveToRelative(-14.35f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.35f, -32f, -32f)
                reflectiveCurveToRelative(14.35f, -32f, 32f, -32f)
                close()
                moveToRelative(-112f, 0f)
                curveToRelative(17.65f, 0f, 32f, 14.35f, 32f, 32f)
                reflectiveCurveToRelative(-14.35f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.35f, -32f, -32f)
                reflectiveCurveToRelative(14.35f, -32f, 32f, -32f)
                close()
            }
        }.build()
        
        return _SkullCrossbones!!
    }

private var _SkullCrossbones: ImageVector? = null

