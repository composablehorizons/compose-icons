package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.SpeakerLoud: ImageVector
    get() {
        if (_SpeakerLoud != null) return _SpeakerLoud!!
        
        _SpeakerLoud = ImageVector.Builder(
            name = "speaker-loud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.00195f, 1.06561f)
                curveTo(7.14436f, 0.984293f, 7.3197f, 0.977587f, 7.46973f, 1.05096f)
                curveTo(7.64126f, 1.13486f, 7.75f, 1.30922f, 7.75f, 1.50018f)
                verticalLineTo(13.5002f)
                curveTo(7.75f, 13.6911f, 7.64126f, 13.8655f, 7.46973f, 13.9494f)
                curveTo(7.29823f, 14.0333f, 7.09409f, 14.0119f, 6.94336f, 13.8947f)
                lineTo(3.22168f, 11.0002f)
                horizontalLineTo(1.5f)
                curveTo(0.723336f, 11.0002f, 0.0846095f, 10.4099f, 0.0078125f, 9.6535f)
                lineTo(0f, 9.50018f)
                verticalLineTo(5.50018f)
                curveTo(1.61064E-6f, 4.67175f, 0.671574f, 4.00018f, 1.5f, 4.00018f)
                horizontalLineTo(3.22168f)
                lineTo(6.94336f, 1.10565f)
                lineTo(7.00195f, 1.06561f)
                close()
                moveTo(12.1152f, 1.38397f)
                curveTo(12.2838f, 1.24147f, 12.536f, 1.26242f, 12.6787f, 1.43084f)
                lineTo(12.9473f, 1.76287f)
                curveTo(15.5508f, 5.13386f, 15.5507f, 9.86645f, 12.9473f, 13.2375f)
                lineTo(12.6787f, 13.5695f)
                lineTo(12.6201f, 13.6262f)
                curveTo(12.4739f, 13.7409f, 12.2627f, 13.741f, 12.1152f, 13.6164f)
                curveTo(11.9679f, 13.4915f, 11.9324f, 13.2824f, 12.0215f, 13.1193f)
                lineTo(12.0684f, 13.0529f)
                lineTo(12.3135f, 12.7492f)
                curveTo(14.6948f, 9.66597f, 14.6955f, 5.33554f, 12.3145f, 2.25213f)
                lineTo(12.0684f, 1.94744f)
                lineTo(12.0225f, 1.88104f)
                curveTo(11.933f, 1.71785f, 11.9677f, 1.50896f, 12.1152f, 1.38397f)
                close()
                moveTo(3.7002f, 4.89471f)
                curveTo(3.61243f, 4.96297f, 3.50377f, 5.00018f, 3.39258f, 5.00018f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 5.00018f, 1f, 5.22404f, 1f, 5.50018f)
                verticalLineTo(9.50018f)
                lineTo(1.00977f, 9.60077f)
                curveTo(1.05629f, 9.82873f, 1.25829f, 10.0002f, 1.5f, 10.0002f)
                horizontalLineTo(3.39258f)
                lineTo(3.47559f, 10.007f)
                curveTo(3.55692f, 10.0207f, 3.63442f, 10.0545f, 3.7002f, 10.1056f)
                lineTo(6.75f, 12.4777f)
                verticalLineTo(2.52166f)
                lineTo(3.7002f, 4.89471f)
                close()
                moveTo(10.2783f, 3.84784f)
                curveTo(10.4391f, 3.74098f, 10.6493f, 3.76591f, 10.7812f, 3.89666f)
                lineTo(10.833f, 3.95916f)
                lineTo(10.9629f, 4.16229f)
                curveTo(12.2548f, 6.27291f, 12.2112f, 8.96969f, 10.833f, 11.0412f)
                curveTo(10.7106f, 11.2248f, 10.4621f, 11.2747f, 10.2783f, 11.1525f)
                curveTo(10.0945f, 11.0302f, 10.0448f, 10.7817f, 10.167f, 10.5978f)
                curveTo(11.3724f, 8.78616f, 11.4094f, 6.42521f, 10.2793f, 4.57928f)
                lineTo(10.166f, 4.40252f)
                lineTo(10.1289f, 4.33123f)
                curveTo(10.059f, 4.15884f, 10.1174f, 3.9549f, 10.2783f, 3.84784f)
                close()
            }
        }.build()
        
        return _SpeakerLoud!!
    }

private var _SpeakerLoud: ImageVector? = null

