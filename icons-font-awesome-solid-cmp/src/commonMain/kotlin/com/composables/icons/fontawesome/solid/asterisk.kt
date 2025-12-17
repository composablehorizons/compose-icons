package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Asterisk: ImageVector
    get() {
        if (_Asterisk != null) return _Asterisk!!
        
        _Asterisk = ImageVector.Builder(
            name = "asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(478.21f, 334.093f)
                lineTo(336f, 256f)
                lineToRelative(142.21f, -78.093f)
                curveToRelative(11.795f, -6.477f, 15.961f, -21.384f, 9.232f, -33.037f)
                lineToRelative(-19.48f, -33.741f)
                curveToRelative(-6.728f, -11.653f, -21.72f, -15.499f, -33.227f, -8.523f)
                lineTo(296f, 186.718f)
                lineToRelative(3.475f, -162.204f)
                curveTo(299.763f, 11.061f, 288.937f, 0f, 275.48f, 0f)
                horizontalLineToRelative(-38.96f)
                curveToRelative(-13.456f, 0f, -24.283f, 11.061f, -23.994f, 24.514f)
                lineTo(216f, 186.718f)
                lineTo(77.265f, 102.607f)
                curveToRelative(-11.506f, -6.976f, -26.499f, -3.13f, -33.227f, 8.523f)
                lineToRelative(-19.48f, 33.741f)
                curveToRelative(-6.728f, 11.653f, -2.562f, 26.56f, 9.233f, 33.037f)
                lineTo(176f, 256f)
                lineTo(33.79f, 334.093f)
                curveToRelative(-11.795f, 6.477f, -15.961f, 21.384f, -9.232f, 33.037f)
                lineToRelative(19.48f, 33.741f)
                curveToRelative(6.728f, 11.653f, 21.721f, 15.499f, 33.227f, 8.523f)
                lineTo(216f, 325.282f)
                lineToRelative(-3.475f, 162.204f)
                curveTo(212.237f, 500.939f, 223.064f, 512f, 236.52f, 512f)
                horizontalLineToRelative(38.961f)
                curveToRelative(13.456f, 0f, 24.283f, -11.061f, 23.995f, -24.514f)
                lineTo(296f, 325.282f)
                lineToRelative(138.735f, 84.111f)
                curveToRelative(11.506f, 6.976f, 26.499f, 3.13f, 33.227f, -8.523f)
                lineToRelative(19.48f, -33.741f)
                curveToRelative(6.728f, -11.653f, 2.563f, -26.559f, -9.232f, -33.036f)
                close()
            }
        }.build()
        
        return _Asterisk!!
    }

private var _Asterisk: ImageVector? = null

