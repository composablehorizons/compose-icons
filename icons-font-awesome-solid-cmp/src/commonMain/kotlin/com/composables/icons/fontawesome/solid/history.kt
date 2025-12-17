package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.History: ImageVector
    get() {
        if (_History != null) return _History!!
        
        _History = ImageVector.Builder(
            name = "history",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 255.531f)
                curveToRelative(0.253f, 136.64f, -111.18f, 248.372f, -247.82f, 248.468f)
                curveToRelative(-59.015f, 0.042f, -113.223f, -20.53f, -155.822f, -54.911f)
                curveToRelative(-11.077f, -8.94f, -11.905f, -25.541f, -1.839f, -35.607f)
                lineToRelative(11.267f, -11.267f)
                curveToRelative(8.609f, -8.609f, 22.353f, -9.551f, 31.891f, -1.984f)
                curveTo(173.062f, 425.135f, 212.781f, 440f, 256f, 440f)
                curveToRelative(101.705f, 0f, 184f, -82.311f, 184f, -184f)
                curveToRelative(0f, -101.705f, -82.311f, -184f, -184f, -184f)
                curveToRelative(-48.814f, 0f, -93.149f, 18.969f, -126.068f, 49.932f)
                lineToRelative(50.754f, 50.754f)
                curveToRelative(10.08f, 10.08f, 2.941f, 27.314f, -11.313f, 27.314f)
                horizontalLineTo(24f)
                curveToRelative(-8.837f, 0f, -16f, -7.163f, -16f, -16f)
                verticalLineTo(38.627f)
                curveToRelative(0f, -14.254f, 17.234f, -21.393f, 27.314f, -11.314f)
                lineToRelative(49.372f, 49.372f)
                curveTo(129.209f, 34.136f, 189.552f, 8f, 256f, 8f)
                curveToRelative(136.81f, 0f, 247.747f, 110.78f, 248f, 247.531f)
                close()
                moveToRelative(-180.912f, 78.784f)
                lineToRelative(9.823f, -12.63f)
                curveToRelative(8.138f, -10.463f, 6.253f, -25.542f, -4.21f, -33.679f)
                lineTo(288f, 256.349f)
                verticalLineTo(152f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineToRelative(-16f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(135.651f)
                lineToRelative(65.409f, 50.874f)
                curveToRelative(10.463f, 8.137f, 25.541f, 6.253f, 33.679f, -4.21f)
                close()
            }
        }.build()
        
        return _History!!
    }

private var _History: ImageVector? = null

