package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ThermometerEmpty: ImageVector
    get() {
        if (_ThermometerEmpty != null) return _ThermometerEmpty!!
        
        _ThermometerEmpty = ImageVector.Builder(
            name = "thermometer-empty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 384f)
                curveToRelative(0f, 35.346f, -28.654f, 64f, -64f, 64f)
                reflectiveCurveToRelative(-64f, -28.654f, -64f, -64f)
                curveToRelative(0f, -35.346f, 28.654f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.654f, 64f, 64f)
                close()
                moveToRelative(32f, -84.653f)
                curveToRelative(19.912f, 22.563f, 32f, 52.194f, 32f, 84.653f)
                curveToRelative(0f, 70.696f, -57.303f, 128f, -128f, 128f)
                curveToRelative(-0.299f, 0f, -0.609f, -0.001f, -0.909f, -0.003f)
                curveTo(56.789f, 511.509f, -0.357f, 453.636f, 0.002f, 383.333f)
                curveTo(0.166f, 351.135f, 12.225f, 321.755f, 32f, 299.347f)
                verticalLineTo(96f)
                curveToRelative(0f, -53.019f, 42.981f, -96f, 96f, -96f)
                reflectiveCurveToRelative(96f, 42.981f, 96f, 96f)
                verticalLineToRelative(203.347f)
                close()
                moveTo(208f, 384f)
                curveToRelative(0f, -34.339f, -19.37f, -52.19f, -32f, -66.502f)
                verticalLineTo(96f)
                curveToRelative(0f, -26.467f, -21.533f, -48f, -48f, -48f)
                reflectiveCurveTo(80f, 69.533f, 80f, 96f)
                verticalLineToRelative(221.498f)
                curveToRelative(-12.732f, 14.428f, -31.825f, 32.1f, -31.999f, 66.08f)
                curveToRelative(-0.224f, 43.876f, 35.563f, 80.116f, 79.423f, 80.42f)
                lineTo(128f, 464f)
                curveToRelative(44.112f, 0f, 80f, -35.888f, 80f, -80f)
                close()
            }
        }.build()
        
        return _ThermometerEmpty!!
    }

private var _ThermometerEmpty: ImageVector? = null

