package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MarsStroke: ImageVector
    get() {
        if (_MarsStroke != null) return _MarsStroke!!
        
        _MarsStroke = ImageVector.Builder(
            name = "mars-stroke",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(372f, 64f)
                horizontalLineToRelative(-79f)
                curveToRelative(-10.7f, 0f, -16f, 12.9f, -8.5f, 20.5f)
                lineToRelative(16.9f, 16.9f)
                lineToRelative(-17.5f, 17.5f)
                lineToRelative(-14.1f, -14.1f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17f, 0f)
                lineTo(224.5f, 133f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0f, 17f)
                lineToRelative(14.1f, 14.1f)
                lineToRelative(-18f, 18f)
                curveToRelative(-22.2f, -14f, -48.5f, -22.1f, -76.7f, -22.1f)
                curveTo(64.5f, 160f, 0f, 224.5f, 0f, 304f)
                reflectiveCurveToRelative(64.5f, 144f, 144f, 144f)
                reflectiveCurveToRelative(144f, -64.5f, 144f, -144f)
                curveToRelative(0f, -28.2f, -8.1f, -54.5f, -22.1f, -76.7f)
                lineToRelative(18f, -18f)
                lineToRelative(14.1f, 14.1f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17f, 0f)
                lineToRelative(28.3f, -28.3f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0f, -17f)
                lineTo(329.2f, 164f)
                lineToRelative(17.5f, -17.5f)
                lineToRelative(16.9f, 16.9f)
                curveToRelative(7.6f, 7.6f, 20.5f, 2.2f, 20.5f, -8.5f)
                verticalLineTo(76f)
                curveToRelative(-0.1f, -6.6f, -5.5f, -12f, -12.1f, -12f)
                close()
                moveTo(144f, 384f)
                curveToRelative(-44.1f, 0f, -80f, -35.9f, -80f, -80f)
                reflectiveCurveToRelative(35.9f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                close()
            }
        }.build()
        
        return _MarsStroke!!
    }

private var _MarsStroke: ImageVector? = null

