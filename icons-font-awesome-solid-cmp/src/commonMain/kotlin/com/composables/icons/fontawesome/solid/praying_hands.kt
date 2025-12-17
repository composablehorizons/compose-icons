package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PrayingHands: ImageVector
    get() {
        if (_PrayingHands != null) return _PrayingHands!!
        
        _PrayingHands = ImageVector.Builder(
            name = "praying-hands",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(272f, 191.91f)
                curveToRelative(-17.6f, 0f, -32f, 14.4f, -32f, 32f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-76.55f)
                curveToRelative(0f, -17.39f, 4.72f, -34.47f, 13.69f, -49.39f)
                lineToRelative(77.75f, -129.59f)
                curveToRelative(9.09f, -15.16f, 4.19f, -34.81f, -10.97f, -43.91f)
                curveToRelative(-14.45f, -8.67f, -32.72f, -4.3f, -42.3f, 9.21f)
                curveToRelative(-0.2f, 0.23f, -0.62f, 0.21f, -0.79f, 0.48f)
                lineToRelative(-117.26f, 175.9f)
                curveTo(117.56f, 205.9f, 112f, 224.31f, 112f, 243.29f)
                verticalLineToRelative(80.23f)
                lineToRelative(-90.12f, 30.04f)
                arcTo(31.974f, 31.974f, 0f, false, false, 0f, 383.91f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 10.82f, 8.52f, 32f, 32f, 32f)
                curveToRelative(2.69f, 0f, 5.41f, -0.34f, 8.06f, -1.03f)
                lineToRelative(179.19f, -46.62f)
                curveTo(269.16f, 449.99f, 304f, 403.8f, 304f, 351.91f)
                verticalLineToRelative(-128f)
                curveToRelative(0f, -17.6f, -14.4f, -32f, -32f, -32f)
                close()
                moveToRelative(346.12f, 161.73f)
                lineTo(528f, 323.6f)
                verticalLineToRelative(-80.23f)
                curveToRelative(0f, -18.98f, -5.56f, -37.39f, -16.12f, -53.23f)
                lineTo(394.62f, 14.25f)
                curveToRelative(-0.18f, -0.27f, -0.59f, -0.24f, -0.79f, -0.48f)
                curveToRelative(-9.58f, -13.51f, -27.85f, -17.88f, -42.3f, -9.21f)
                curveToRelative(-15.16f, 9.09f, -20.06f, 28.75f, -10.97f, 43.91f)
                lineToRelative(77.75f, 129.59f)
                curveToRelative(8.97f, 14.92f, 13.69f, 32f, 13.69f, 49.39f)
                verticalLineTo(304f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -17.6f, -14.4f, -32f, -32f, -32f)
                reflectiveCurveToRelative(-32f, 14.4f, -32f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 51.89f, 34.84f, 98.08f, 84.75f, 112.34f)
                lineToRelative(179.19f, 46.62f)
                curveToRelative(2.66f, 0.69f, 5.38f, 1.03f, 8.06f, 1.03f)
                curveToRelative(23.48f, 0f, 32f, -21.18f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -13.77f, -8.81f, -25.99f, -21.88f, -30.35f)
                close()
            }
        }.build()
        
        return _PrayingHands!!
    }

private var _PrayingHands: ImageVector? = null

