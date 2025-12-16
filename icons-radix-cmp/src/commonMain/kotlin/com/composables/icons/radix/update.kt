package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Update: ImageVector
    get() {
        if (_Update != null) return _Update!!
        
        _Update = ImageVector.Builder(
            name = "update",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.98779f, 1.56268f)
                curveTo(8.0409f, 1.27989f, 8.3134f, 1.09275f, 8.59619f, 1.14569f)
                lineTo(8.86475f, 1.20233f)
                curveTo(11.6292f, 1.83955f, 14.0531f, 4.23823f, 14.0532f, 7.70331f)
                curveTo(14.0532f, 9.23977f, 13.3539f, 10.4478f, 12.5376f, 11.3664f)
                curveTo(11.9526f, 12.0246f, 11.2828f, 12.5586f, 10.7446f, 12.968f)
                lineTo(12.3823f, 12.968f)
                curveTo(12.6583f, 12.9681f, 12.8822f, 13.192f, 12.8823f, 13.468f)
                curveTo(12.8823f, 13.744f, 12.6583f, 13.9678f, 12.3823f, 13.968f)
                lineTo(9.38232f, 13.968f)
                curveTo(9.10618f, 13.968f, 8.88232f, 13.7441f, 8.88232f, 13.468f)
                lineTo(8.88232f, 10.468f)
                curveTo(8.88242f, 10.1919f, 9.10624f, 9.96796f, 9.38232f, 9.96796f)
                curveTo(9.65828f, 9.96811f, 9.88223f, 10.192f, 9.88232f, 10.468f)
                lineTo(9.88232f, 12.3137f)
                lineTo(10.064f, 12.176f)
                curveTo(10.5978f, 11.7712f, 11.2158f, 11.2844f, 11.7583f, 10.674f)
                curveTo(12.4727f, 9.87007f, 13.0102f, 8.89839f, 13.0103f, 7.70331f)
                curveTo(13.0101f, 4.69155f, 10.8502f, 2.63051f, 8.40381f, 2.17108f)
                lineTo(8.30225f, 2.14081f)
                curveTo(8.07811f, 2.04924f, 7.94169f, 1.80992f, 7.98779f, 1.56268f)
                close()
                moveTo(0.86084f, 7.29706f)
                curveTo(0.860904f, 5.76062f, 1.56016f, 4.55258f, 2.37646f, 3.63397f)
                curveTo(2.96144f, 2.97579f, 3.63128f, 2.44174f, 4.16943f, 2.03241f)
                lineTo(2.53174f, 2.03241f)
                curveTo(2.25581f, 2.03224f, 2.03185f, 1.80835f, 2.03174f, 1.53241f)
                curveTo(2.03174f, 1.25637f, 2.25574f, 1.03258f, 2.53174f, 1.03241f)
                lineTo(5.53174f, 1.03241f)
                curveTo(5.80788f, 1.03241f, 6.03174f, 1.25627f, 6.03174f, 1.53241f)
                lineTo(6.03174f, 4.53241f)
                curveTo(6.03162f, 4.80845f, 5.80781f, 5.03241f, 5.53174f, 5.03241f)
                curveTo(5.25581f, 5.03224f, 5.03185f, 4.80835f, 5.03174f, 4.53241f)
                lineTo(5.03174f, 2.68671f)
                lineTo(4.8501f, 2.8244f)
                curveTo(4.3163f, 3.22913f, 3.6983f, 3.71593f, 3.15576f, 4.32635f)
                curveTo(2.44134f, 5.13029f, 1.90387f, 6.10199f, 1.90381f, 7.29706f)
                curveTo(1.90397f, 10.3411f, 4.11093f, 12.4148f, 6.58936f, 12.8439f)
                curveTo(6.87264f, 12.8932f, 7.06302f, 13.1631f, 7.01416f, 13.4465f)
                curveTo(6.96499f, 13.7298f, 6.69498f, 13.92f, 6.41162f, 13.8713f)
                curveTo(3.50004f, 13.3671f, 0.860998f, 10.9128f, 0.86084f, 7.29706f)
                close()
            }
        }.build()
        
        return _Update!!
    }

private var _Update: ImageVector? = null

