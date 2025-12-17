package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.WeightHanging: ImageVector
    get() {
        if (_WeightHanging != null) return _WeightHanging!!
        
        _WeightHanging = ImageVector.Builder(
            name = "weight-hanging",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(510.28f, 445.86f)
                lineToRelative(-73.03f, -292.13f)
                curveToRelative(-3.8f, -15.19f, -16.44f, -25.72f, -30.87f, -25.72f)
                horizontalLineToRelative(-60.25f)
                curveToRelative(3.57f, -10.05f, 5.88f, -20.72f, 5.88f, -32f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                reflectiveCurveToRelative(-96f, 42.98f, -96f, 96f)
                curveToRelative(0f, 11.28f, 2.3f, 21.95f, 5.88f, 32f)
                horizontalLineToRelative(-60.25f)
                curveToRelative(-14.43f, 0f, -27.08f, 10.54f, -30.87f, 25.72f)
                lineTo(1.72f, 445.86f)
                curveTo(-6.61f, 479.17f, 16.38f, 512f, 48.03f, 512f)
                horizontalLineToRelative(415.95f)
                curveToRelative(31.64f, 0f, 54.63f, -32.83f, 46.3f, -66.14f)
                close()
                moveTo(256f, 128f)
                curveToRelative(-17.64f, 0f, -32f, -14.36f, -32f, -32f)
                reflectiveCurveToRelative(14.36f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.36f, 32f, 32f)
                reflectiveCurveToRelative(-14.36f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _WeightHanging!!
    }

private var _WeightHanging: ImageVector? = null

