package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Certificate: ImageVector
    get() {
        if (_Certificate != null) return _Certificate!!
        
        _Certificate = ImageVector.Builder(
            name = "certificate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(458.622f, 255.92f)
                lineToRelative(45.985f, -45.005f)
                curveToRelative(13.708f, -12.977f, 7.316f, -36.039f, -10.664f, -40.339f)
                lineToRelative(-62.65f, -15.99f)
                lineToRelative(17.661f, -62.015f)
                curveToRelative(4.991f, -17.838f, -11.829f, -34.663f, -29.661f, -29.671f)
                lineToRelative(-61.994f, 17.667f)
                lineToRelative(-15.984f, -62.671f)
                curveTo(337.085f, 0.197f, 313.765f, -6.276f, 300.99f, 7.228f)
                lineTo(256f, 53.57f)
                lineTo(211.011f, 7.229f)
                curveToRelative(-12.63f, -13.351f, -36.047f, -7.234f, -40.325f, 10.668f)
                lineToRelative(-15.984f, 62.671f)
                lineToRelative(-61.995f, -17.667f)
                curveTo(74.87f, 57.907f, 58.056f, 74.738f, 63.046f, 92.572f)
                lineToRelative(17.661f, 62.015f)
                lineToRelative(-62.65f, 15.99f)
                curveTo(0.069f, 174.878f, -6.31f, 197.944f, 7.392f, 210.915f)
                lineToRelative(45.985f, 45.005f)
                lineToRelative(-45.985f, 45.004f)
                curveToRelative(-13.708f, 12.977f, -7.316f, 36.039f, 10.664f, 40.339f)
                lineToRelative(62.65f, 15.99f)
                lineToRelative(-17.661f, 62.015f)
                curveToRelative(-4.991f, 17.838f, 11.829f, 34.663f, 29.661f, 29.671f)
                lineToRelative(61.994f, -17.667f)
                lineToRelative(15.984f, 62.671f)
                curveToRelative(4.439f, 18.575f, 27.696f, 24.018f, 40.325f, 10.668f)
                lineTo(256f, 458.61f)
                lineToRelative(44.989f, 46.001f)
                curveToRelative(12.5f, 13.488f, 35.987f, 7.486f, 40.325f, -10.668f)
                lineToRelative(15.984f, -62.671f)
                lineToRelative(61.994f, 17.667f)
                curveToRelative(17.836f, 4.994f, 34.651f, -11.837f, 29.661f, -29.671f)
                lineToRelative(-17.661f, -62.015f)
                lineToRelative(62.65f, -15.99f)
                curveToRelative(17.987f, -4.302f, 24.366f, -27.367f, 10.664f, -40.339f)
                lineToRelative(-45.984f, -45.004f)
                close()
            }
        }.build()
        
        return _Certificate!!
    }

private var _Certificate: ImageVector? = null

