package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VenusMars: ImageVector
    get() {
        if (_VenusMars != null) return _VenusMars!!
        
        _VenusMars = ImageVector.Builder(
            name = "venus-mars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(564f, 0f)
                horizontalLineToRelative(-79f)
                curveToRelative(-10.7f, 0f, -16f, 12.9f, -8.5f, 20.5f)
                lineToRelative(16.9f, 16.9f)
                lineToRelative(-48.7f, 48.7f)
                curveTo(422.5f, 72.1f, 396.2f, 64f, 368f, 64f)
                curveToRelative(-33.7f, 0f, -64.6f, 11.6f, -89.2f, 30.9f)
                curveToRelative(14f, 16.7f, 25f, 36f, 32.1f, 57.1f)
                curveToRelative(14.5f, -14.8f, 34.7f, -24f, 57.1f, -24f)
                curveToRelative(44.1f, 0f, 80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                curveToRelative(-22.3f, 0f, -42.6f, -9.2f, -57.1f, -24f)
                curveToRelative(-7.1f, 21.1f, -18f, 40.4f, -32.1f, 57.1f)
                curveToRelative(24.5f, 19.4f, 55.5f, 30.9f, 89.2f, 30.9f)
                curveToRelative(79.5f, 0f, 144f, -64.5f, 144f, -144f)
                curveToRelative(0f, -28.2f, -8.1f, -54.5f, -22.1f, -76.7f)
                lineToRelative(48.7f, -48.7f)
                lineToRelative(16.9f, 16.9f)
                curveToRelative(2.4f, 2.4f, 5.4f, 3.5f, 8.4f, 3.5f)
                curveToRelative(6.2f, 0f, 12.1f, -4.8f, 12.1f, -12f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                close()
                moveTo(144f, 64f)
                curveTo(64.5f, 64f, 0f, 128.5f, 0f, 208f)
                curveToRelative(0f, 68.5f, 47.9f, 125.9f, 112f, 140.4f)
                verticalLineTo(400f)
                horizontalLineTo(76f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(36f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-36f)
                horizontalLineToRelative(36f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineToRelative(-36f)
                verticalLineToRelative(-51.6f)
                curveToRelative(64.1f, -14.6f, 112f, -71.9f, 112f, -140.4f)
                curveToRelative(0f, -79.5f, -64.5f, -144f, -144f, -144f)
                close()
                moveToRelative(0f, 224f)
                curveToRelative(-44.1f, 0f, -80f, -35.9f, -80f, -80f)
                reflectiveCurveToRelative(35.9f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                close()
            }
        }.build()
        
        return _VenusMars!!
    }

private var _VenusMars: ImageVector? = null

