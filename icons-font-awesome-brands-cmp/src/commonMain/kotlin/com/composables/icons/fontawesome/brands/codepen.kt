package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Codepen: ImageVector
    get() {
        if (_Codepen != null) return _Codepen!!
        
        _Codepen = ImageVector.Builder(
            name = "codepen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(502.285f, 159.704f)
                lineToRelative(-234f, -156f)
                curveToRelative(-7.987f, -4.915f, -16.511f, -4.96f, -24.571f, 0f)
                lineToRelative(-234f, 156f)
                curveTo(3.714f, 163.703f, 0f, 170.847f, 0f, 177.989f)
                verticalLineToRelative(155.999f)
                curveToRelative(0f, 7.143f, 3.714f, 14.286f, 9.715f, 18.286f)
                lineToRelative(234f, 156.022f)
                curveToRelative(7.987f, 4.915f, 16.511f, 4.96f, 24.571f, 0f)
                lineToRelative(234f, -156.022f)
                curveToRelative(6f, -3.999f, 9.715f, -11.143f, 9.715f, -18.286f)
                verticalLineTo(177.989f)
                curveToRelative(-0.001f, -7.142f, -3.715f, -14.286f, -9.716f, -18.285f)
                close()
                moveTo(278f, 63.131f)
                lineToRelative(172.286f, 114.858f)
                lineToRelative(-76.857f, 51.429f)
                lineTo(278f, 165.703f)
                verticalLineTo(63.131f)
                close()
                moveToRelative(-44f, 0f)
                verticalLineToRelative(102.572f)
                lineToRelative(-95.429f, 63.715f)
                lineToRelative(-76.857f, -51.429f)
                lineTo(234f, 63.131f)
                close()
                moveTo(44f, 219.132f)
                lineToRelative(55.143f, 36.857f)
                lineTo(44f, 292.846f)
                verticalLineToRelative(-73.714f)
                close()
                moveToRelative(190f, 229.715f)
                lineTo(61.714f, 333.989f)
                lineToRelative(76.857f, -51.429f)
                lineTo(234f, 346.275f)
                verticalLineToRelative(102.572f)
                close()
                moveToRelative(22f, -140.858f)
                lineToRelative(-77.715f, -52f)
                lineToRelative(77.715f, -52f)
                lineToRelative(77.715f, 52f)
                lineToRelative(-77.715f, 52f)
                close()
                moveToRelative(22f, 140.858f)
                verticalLineTo(346.275f)
                lineToRelative(95.429f, -63.715f)
                lineToRelative(76.857f, 51.429f)
                lineTo(278f, 448.847f)
                close()
                moveToRelative(190f, -156.001f)
                lineToRelative(-55.143f, -36.857f)
                lineTo(468f, 219.132f)
                verticalLineToRelative(73.714f)
                close()
            }
        }.build()
        
        return _Codepen!!
    }

private var _Codepen: ImageVector? = null

