package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ThermometerFull: ImageVector
    get() {
        if (_ThermometerFull != null) return _ThermometerFull!!
        
        _ThermometerFull = ImageVector.Builder(
            name = "thermometer-full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 96f)
                curveToRelative(0f, -53.019f, -42.981f, -96f, -96f, -96f)
                reflectiveCurveTo(32f, 42.981f, 32f, 96f)
                verticalLineToRelative(203.347f)
                curveTo(12.225f, 321.756f, 0.166f, 351.136f, 0.002f, 383.333f)
                curveToRelative(-0.359f, 70.303f, 56.787f, 128.176f, 127.089f, 128.664f)
                curveToRelative(0.299f, 0.002f, 0.61f, 0.003f, 0.909f, 0.003f)
                curveToRelative(70.698f, 0f, 128f, -57.304f, 128f, -128f)
                curveToRelative(0f, -32.459f, -12.088f, -62.09f, -32f, -84.653f)
                verticalLineTo(96f)
                close()
                moveToRelative(-96f, 368f)
                lineToRelative(-0.576f, -0.002f)
                curveToRelative(-43.86f, -0.304f, -79.647f, -36.544f, -79.423f, -80.42f)
                curveToRelative(0.173f, -33.98f, 19.266f, -51.652f, 31.999f, -66.08f)
                verticalLineTo(96f)
                curveToRelative(0f, -26.467f, 21.533f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.533f, 48f, 48f)
                verticalLineToRelative(221.498f)
                curveToRelative(12.63f, 14.312f, 32f, 32.164f, 32f, 66.502f)
                curveToRelative(0f, 44.112f, -35.888f, 80f, -80f, 80f)
                close()
                moveToRelative(64f, -80f)
                curveToRelative(0f, 35.346f, -28.654f, 64f, -64f, 64f)
                reflectiveCurveToRelative(-64f, -28.654f, -64f, -64f)
                curveToRelative(0f, -23.685f, 12.876f, -44.349f, 32f, -55.417f)
                verticalLineTo(96f)
                curveToRelative(0f, -17.673f, 14.327f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.327f, 32f, 32f)
                verticalLineToRelative(232.583f)
                curveToRelative(19.124f, 11.068f, 32f, 31.732f, 32f, 55.417f)
                close()
            }
        }.build()
        
        return _ThermometerFull!!
    }

private var _ThermometerFull: ImageVector? = null

