package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TransgenderAlt: ImageVector
    get() {
        if (_TransgenderAlt != null) return _TransgenderAlt!!
        
        _TransgenderAlt = ImageVector.Builder(
            name = "transgender-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 480f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(468f, 0f)
                horizontalLineToRelative(-79f)
                curveToRelative(-10.7f, 0f, -16f, 12.9f, -8.5f, 20.5f)
                lineToRelative(16.9f, 16.9f)
                lineToRelative(-80.7f, 80.7f)
                curveTo(294.5f, 104.1f, 268.2f, 96f, 240f, 96f)
                curveToRelative(-28.2f, 0f, -54.5f, 8.1f, -76.7f, 22.1f)
                lineToRelative(-16.5f, -16.5f)
                lineToRelative(19.8f, -19.8f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0f, -17f)
                lineToRelative(-28.3f, -28.3f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17f, 0f)
                lineToRelative(-19.8f, 19.8f)
                lineToRelative(-19f, -19f)
                lineToRelative(16.9f, -16.9f)
                curveTo(107.1f, 12.9f, 101.7f, 0f, 91f, 0f)
                horizontalLineTo(12f)
                curveTo(5.4f, 0f, 0f, 5.4f, 0f, 12f)
                verticalLineToRelative(79f)
                curveToRelative(0f, 10.7f, 12.9f, 16f, 20.5f, 8.5f)
                lineToRelative(16.9f, -16.9f)
                lineToRelative(19f, 19f)
                lineToRelative(-19.8f, 19.8f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0f, 17f)
                lineToRelative(28.3f, 28.3f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17f, 0f)
                lineToRelative(19.8f, -19.8f)
                lineToRelative(16.5f, 16.5f)
                curveTo(104.1f, 185.5f, 96f, 211.8f, 96f, 240f)
                curveToRelative(0f, 68.5f, 47.9f, 125.9f, 112f, 140.4f)
                verticalLineTo(408f)
                horizontalLineToRelative(-36f)
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
                moveTo(240f, 320f)
                curveToRelative(-44.1f, 0f, -80f, -35.9f, -80f, -80f)
                reflectiveCurveToRelative(35.9f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                close()
            }
        }.build()
        
        return _TransgenderAlt!!
    }

private var _TransgenderAlt: ImageVector? = null

