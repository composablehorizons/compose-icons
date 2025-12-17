package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Transgender: ImageVector
    get() {
        if (_Transgender != null) return _Transgender!!
        
        _Transgender = ImageVector.Builder(
            name = "transgender",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(372f, 0f)
                horizontalLineToRelative(-79f)
                curveToRelative(-10.7f, 0f, -16f, 12.9f, -8.5f, 20.5f)
                lineToRelative(16.9f, 16.9f)
                lineToRelative(-80.7f, 80.7f)
                curveTo(198.5f, 104.1f, 172.2f, 96f, 144f, 96f)
                curveTo(64.5f, 96f, 0f, 160.5f, 0f, 240f)
                curveToRelative(0f, 68.5f, 47.9f, 125.9f, 112f, 140.4f)
                verticalLineTo(408f)
                horizontalLineTo(76f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(28f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-28f)
                horizontalLineToRelative(36f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineToRelative(-36f)
                verticalLineToRelative(-27.6f)
                curveToRelative(64.1f, -14.6f, 112f, -71.9f, 112f, -140.4f)
                curveToRelative(0f, -28.2f, -8.1f, -54.5f, -22.1f, -76.7f)
                lineToRelative(80.7f, -80.7f)
                lineToRelative(16.9f, 16.9f)
                curveToRelative(7.6f, 7.6f, 20.5f, 2.2f, 20.5f, -8.5f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                close()
                moveTo(144f, 320f)
                curveToRelative(-44.1f, 0f, -80f, -35.9f, -80f, -80f)
                reflectiveCurveToRelative(35.9f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                close()
            }
        }.build()
        
        return _Transgender!!
    }

private var _Transgender: ImageVector? = null

