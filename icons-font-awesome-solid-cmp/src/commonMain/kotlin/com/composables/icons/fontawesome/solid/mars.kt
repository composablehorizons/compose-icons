package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Mars: ImageVector
    get() {
        if (_Mars != null) return _Mars!!
        
        _Mars = ImageVector.Builder(
            name = "mars",
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
                lineToRelative(-80.7f, 80.7f)
                curveToRelative(-22.2f, -14f, -48.5f, -22.1f, -76.7f, -22.1f)
                curveTo(64.5f, 160f, 0f, 224.5f, 0f, 304f)
                reflectiveCurveToRelative(64.5f, 144f, 144f, 144f)
                reflectiveCurveToRelative(144f, -64.5f, 144f, -144f)
                curveToRelative(0f, -28.2f, -8.1f, -54.5f, -22.1f, -76.7f)
                lineToRelative(80.7f, -80.7f)
                lineToRelative(16.9f, 16.9f)
                curveToRelative(7.6f, 7.6f, 20.5f, 2.2f, 20.5f, -8.5f)
                verticalLineTo(76f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                close()
                moveTo(144f, 384f)
                curveToRelative(-44.1f, 0f, -80f, -35.9f, -80f, -80f)
                reflectiveCurveToRelative(35.9f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                close()
            }
        }.build()
        
        return _Mars!!
    }

private var _Mars: ImageVector? = null

