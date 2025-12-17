package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Dove: ImageVector
    get() {
        if (_Dove != null) return _Dove!!
        
        _Dove = ImageVector.Builder(
            name = "dove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 167.2f)
                verticalLineToRelative(-28.1f)
                curveToRelative(-28.2f, -36.3f, -47.1f, -79.3f, -54.1f, -125.2f)
                curveToRelative(-2.1f, -13.5f, -19f, -18.8f, -27.8f, -8.3f)
                curveToRelative(-21.1f, 24.9f, -37.7f, 54.1f, -48.9f, 86.5f)
                curveToRelative(34.2f, 38.3f, 80f, 64.6f, 130.8f, 75.1f)
                close()
                moveTo(400f, 64f)
                curveToRelative(-44.2f, 0f, -80f, 35.9f, -80f, 80.1f)
                verticalLineToRelative(59.4f)
                curveTo(215.6f, 197.3f, 127f, 133f, 87f, 41.8f)
                curveToRelative(-5.5f, -12.5f, -23.2f, -13.2f, -29f, -0.9f)
                curveTo(41.4f, 76f, 32f, 115.2f, 32f, 156.6f)
                curveToRelative(0f, 70.8f, 34.1f, 136.9f, 85.1f, 185.9f)
                curveToRelative(13.2f, 12.7f, 26.1f, 23.2f, 38.9f, 32.8f)
                lineToRelative(-143.9f, 36f)
                curveTo(1.4f, 414f, -3.4f, 426.4f, 2.6f, 435.7f)
                curveTo(20f, 462.6f, 63f, 508.2f, 155.8f, 512f)
                curveToRelative(8f, 0.3f, 16f, -2.6f, 22.1f, -7.9f)
                lineToRelative(65.2f, -56.1f)
                horizontalLineTo(320f)
                curveToRelative(88.4f, 0f, 160f, -71.5f, 160f, -159.9f)
                verticalLineTo(128f)
                lineToRelative(32f, -64f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, 96.1f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                reflectiveCurveToRelative(7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _Dove!!
    }

private var _Dove: ImageVector? = null

