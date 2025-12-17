package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GasPump: ImageVector
    get() {
        if (_GasPump != null) return _GasPump!!
        
        _GasPump = ImageVector.Builder(
            name = "gas-pump",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 448f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(320f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(157.2f, -340.7f)
                lineToRelative(-81f, -81f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0f, 22.6f)
                lineTo(416f, 97.9f)
                verticalLineTo(160f)
                curveToRelative(0f, 28.1f, 20.9f, 51.3f, 48f, 55.2f)
                verticalLineTo(376f)
                curveToRelative(0f, 13.2f, -10.8f, 24f, -24f, 24f)
                reflectiveCurveToRelative(-24f, -10.8f, -24f, -24f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -48.6f, -39.4f, -88f, -88f, -88f)
                horizontalLineToRelative(-8f)
                verticalLineTo(64f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                horizontalLineTo(96f)
                curveTo(60.7f, 0f, 32f, 28.7f, 32f, 64f)
                verticalLineToRelative(352f)
                horizontalLineToRelative(288f)
                verticalLineTo(304f)
                horizontalLineToRelative(8f)
                curveToRelative(22.1f, 0f, 40f, 17.9f, 40f, 40f)
                verticalLineToRelative(27.8f)
                curveToRelative(0f, 37.7f, 27f, 72f, 64.5f, 75.9f)
                curveToRelative(43f, 4.3f, 79.5f, -29.5f, 79.5f, -71.7f)
                verticalLineTo(152.6f)
                curveToRelative(0f, -17f, -6.8f, -33.3f, -18.8f, -45.3f)
                close()
                moveTo(256f, 192f)
                horizontalLineTo(96f)
                verticalLineTo(64f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(128f)
                close()
            }
        }.build()
        
        return _GasPump!!
    }

private var _GasPump: ImageVector? = null

