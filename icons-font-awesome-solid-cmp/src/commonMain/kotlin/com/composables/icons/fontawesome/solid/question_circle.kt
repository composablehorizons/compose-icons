package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.QuestionCircle: ImageVector
    get() {
        if (_QuestionCircle != null) return _QuestionCircle!!
        
        _QuestionCircle = ImageVector.Builder(
            name = "question-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 256f)
                curveToRelative(0f, 136.997f, -111.043f, 248f, -248f, 248f)
                reflectiveCurveTo(8f, 392.997f, 8f, 256f)
                curveTo(8f, 119.083f, 119.043f, 8f, 256f, 8f)
                reflectiveCurveToRelative(248f, 111.083f, 248f, 248f)
                close()
                moveTo(262.655f, 90f)
                curveToRelative(-54.497f, 0f, -89.255f, 22.957f, -116.549f, 63.758f)
                curveToRelative(-3.536f, 5.286f, -2.353f, 12.415f, 2.715f, 16.258f)
                lineToRelative(34.699f, 26.31f)
                curveToRelative(5.205f, 3.947f, 12.621f, 3.008f, 16.665f, -2.122f)
                curveToRelative(17.864f, -22.658f, 30.113f, -35.797f, 57.303f, -35.797f)
                curveToRelative(20.429f, 0f, 45.698f, 13.148f, 45.698f, 32.958f)
                curveToRelative(0f, 14.976f, -12.363f, 22.667f, -32.534f, 33.976f)
                curveTo(247.128f, 238.528f, 216f, 254.941f, 216f, 296f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(56f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-1.333f)
                curveToRelative(0f, -28.462f, 83.186f, -29.647f, 83.186f, -106.667f)
                curveToRelative(0f, -58.002f, -60.165f, -102f, -116.531f, -102f)
                close()
                moveTo(256f, 338f)
                curveToRelative(-25.365f, 0f, -46f, 20.635f, -46f, 46f)
                curveToRelative(0f, 25.364f, 20.635f, 46f, 46f, 46f)
                reflectiveCurveToRelative(46f, -20.636f, 46f, -46f)
                curveToRelative(0f, -25.365f, -20.635f, -46f, -46f, -46f)
                close()
            }
        }.build()
        
        return _QuestionCircle!!
    }

private var _QuestionCircle: ImageVector? = null

