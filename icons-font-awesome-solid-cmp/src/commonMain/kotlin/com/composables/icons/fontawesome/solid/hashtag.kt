package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Hashtag: ImageVector
    get() {
        if (_Hashtag != null) return _Hashtag!!
        
        _Hashtag = ImageVector.Builder(
            name = "hashtag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440.667f, 182.109f)
                lineToRelative(7.143f, -40f)
                curveToRelative(1.313f, -7.355f, -4.342f, -14.109f, -11.813f, -14.109f)
                horizontalLineToRelative(-74.81f)
                lineToRelative(14.623f, -81.891f)
                curveTo(377.123f, 38.754f, 371.468f, 32f, 363.997f, 32f)
                horizontalLineToRelative(-40.632f)
                arcToRelative(12f, 12f, 0f, false, false, -11.813f, 9.891f)
                lineTo(296.175f, 128f)
                horizontalLineTo(197.54f)
                lineToRelative(14.623f, -81.891f)
                curveTo(213.477f, 38.754f, 207.822f, 32f, 200.35f, 32f)
                horizontalLineToRelative(-40.632f)
                arcToRelative(12f, 12f, 0f, false, false, -11.813f, 9.891f)
                lineTo(132.528f, 128f)
                horizontalLineTo(53.432f)
                arcToRelative(12f, 12f, 0f, false, false, -11.813f, 9.891f)
                lineToRelative(-7.143f, 40f)
                curveTo(33.163f, 185.246f, 38.818f, 192f, 46.289f, 192f)
                horizontalLineToRelative(74.81f)
                lineTo(98.242f, 320f)
                horizontalLineTo(19.146f)
                arcToRelative(12f, 12f, 0f, false, false, -11.813f, 9.891f)
                lineToRelative(-7.143f, 40f)
                curveTo(-1.123f, 377.246f, 4.532f, 384f, 12.003f, 384f)
                horizontalLineToRelative(74.81f)
                lineTo(72.19f, 465.891f)
                curveTo(70.877f, 473.246f, 76.532f, 480f, 84.003f, 480f)
                horizontalLineToRelative(40.632f)
                arcToRelative(12f, 12f, 0f, false, false, 11.813f, -9.891f)
                lineTo(151.826f, 384f)
                horizontalLineToRelative(98.634f)
                lineToRelative(-14.623f, 81.891f)
                curveTo(234.523f, 473.246f, 240.178f, 480f, 247.65f, 480f)
                horizontalLineToRelative(40.632f)
                arcToRelative(12f, 12f, 0f, false, false, 11.813f, -9.891f)
                lineTo(315.472f, 384f)
                horizontalLineToRelative(79.096f)
                arcToRelative(12f, 12f, 0f, false, false, 11.813f, -9.891f)
                lineToRelative(7.143f, -40f)
                curveToRelative(1.313f, -7.355f, -4.342f, -14.109f, -11.813f, -14.109f)
                horizontalLineToRelative(-74.81f)
                lineToRelative(22.857f, -128f)
                horizontalLineToRelative(79.096f)
                arcToRelative(12f, 12f, 0f, false, false, 11.813f, -9.891f)
                close()
                moveTo(261.889f, 320f)
                horizontalLineToRelative(-98.634f)
                lineToRelative(22.857f, -128f)
                horizontalLineToRelative(98.634f)
                lineToRelative(-22.857f, 128f)
                close()
            }
        }.build()
        
        return _Hashtag!!
    }

private var _Hashtag: ImageVector? = null

