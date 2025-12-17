package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SadCry: ImageVector
    get() {
        if (_SadCry != null) return _SadCry!!
        
        _SadCry = ImageVector.Builder(
            name = "sad-cry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                curveToRelative(0f, 90.1f, 48.2f, 168.7f, 120f, 212.1f)
                verticalLineTo(288f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.2f, 16f, 16f)
                verticalLineToRelative(196.7f)
                curveToRelative(29.5f, 12.4f, 62f, 19.3f, 96f, 19.3f)
                reflectiveCurveToRelative(66.5f, -6.9f, 96f, -19.3f)
                verticalLineTo(288f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.2f, 16f, 16f)
                verticalLineToRelative(180.1f)
                curveTo(447.8f, 424.7f, 496f, 346f, 496f, 256f)
                curveTo(496f, 119f, 385f, 8f, 248f, 8f)
                close()
                moveToRelative(-65.5f, 216.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61f, 0f)
                lineTo(112f, 233f)
                curveToRelative(-3.8f, 3.3f, -9.3f, 4f, -13.7f, 1.6f)
                curveToRelative(-4.4f, -2.4f, -6.9f, -7.4f, -6.1f, -12.4f)
                curveToRelative(4f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveTo(208f, 197f, 212f, 222.2f)
                curveToRelative(0.8f, 5f, -1.7f, 10f, -6.1f, 12.4f)
                curveToRelative(-5.8f, 3.1f, -11.2f, 0.7f, -13.7f, -1.6f)
                lineToRelative(-9.7f, -8.5f)
                close()
                moveTo(248f, 416f)
                curveToRelative(-26.5f, 0f, -48f, -28.7f, -48f, -64f)
                reflectiveCurveToRelative(21.5f, -64f, 48f, -64f)
                reflectiveCurveToRelative(48f, 28.7f, 48f, 64f)
                reflectiveCurveToRelative(-21.5f, 64f, -48f, 64f)
                close()
                moveToRelative(149.8f, -181.5f)
                curveToRelative(-5.8f, 3.1f, -11.2f, 0.7f, -13.7f, -1.6f)
                lineToRelative(-9.5f, -8.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61f, 0f)
                lineTo(304f, 233f)
                curveToRelative(-3.8f, 3.3f, -9.3f, 4f, -13.7f, 1.6f)
                curveToRelative(-4.4f, -2.4f, -6.9f, -7.4f, -6.1f, -12.4f)
                curveToRelative(4f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveTo(400f, 197f, 404f, 222.2f)
                curveToRelative(0.6f, 4.9f, -1.8f, 9.9f, -6.2f, 12.3f)
                close()
            }
        }.build()
        
        return _SadCry!!
    }

private var _SadCry: ImageVector? = null

