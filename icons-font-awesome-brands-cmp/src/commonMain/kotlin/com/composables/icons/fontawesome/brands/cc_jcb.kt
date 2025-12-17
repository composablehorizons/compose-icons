package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CcJcb: ImageVector
    get() {
        if (_CcJcb != null) return _CcJcb!!
        
        _CcJcb = ImageVector.Builder(
            name = "cc-jcb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(431.5f, 244.3f)
                verticalLineTo(212f)
                curveToRelative(41.2f, 0f, 38.5f, 0.2f, 38.5f, 0.2f)
                curveToRelative(7.3f, 1.3f, 13.3f, 7.3f, 13.3f, 16f)
                curveToRelative(0f, 8.8f, -6f, 14.5f, -13.3f, 15.8f)
                curveToRelative(-1.2f, 0.4f, -3.3f, 0.3f, -38.5f, 0.3f)
                close()
                moveToRelative(42.8f, 20.2f)
                curveToRelative(-2.8f, -0.7f, -3.3f, -0.5f, -42.8f, -0.5f)
                verticalLineToRelative(35f)
                curveToRelative(39.6f, 0f, 40f, 0.2f, 42.8f, -0.5f)
                curveToRelative(7.5f, -1.5f, 13.5f, -8f, 13.5f, -17f)
                curveToRelative(0f, -8.7f, -6f, -15.5f, -13.5f, -17f)
                close()
                moveTo(576f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(480f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveTo(182f, 192.3f)
                horizontalLineToRelative(-57f)
                curveToRelative(0f, 67.1f, 10.7f, 109.7f, -35.8f, 109.7f)
                curveToRelative(-19.5f, 0f, -38.8f, -5.7f, -57.2f, -14.8f)
                verticalLineToRelative(28f)
                curveToRelative(30f, 8.3f, 68f, 8.3f, 68f, 8.3f)
                curveToRelative(97.9f, 0f, 82f, -47.7f, 82f, -131.2f)
                close()
                moveToRelative(178.5f, 4.5f)
                curveToRelative(-63.4f, -16f, -165f, -14.9f, -165f, 59.3f)
                curveToRelative(0f, 77.1f, 108.2f, 73.6f, 165f, 59.2f)
                verticalLineTo(287f)
                curveTo(312.9f, 311.7f, 253f, 309f, 253f, 256f)
                reflectiveCurveToRelative(59.8f, -55.6f, 107.5f, -31.2f)
                verticalLineToRelative(-28f)
                close()
                moveTo(544f, 286.5f)
                curveToRelative(0f, -18.5f, -16.5f, -30.5f, -38f, -32f)
                verticalLineToRelative(-0.8f)
                curveToRelative(19.5f, -2.7f, 30.3f, -15.5f, 30.3f, -30.2f)
                curveToRelative(0f, -19f, -15.7f, -30f, -37f, -31f)
                curveToRelative(0f, 0f, 6.3f, -0.3f, -120.3f, -0.3f)
                verticalLineToRelative(127.5f)
                horizontalLineToRelative(122.7f)
                curveToRelative(24.3f, 0.1f, 42.3f, -12.9f, 42.3f, -33.2f)
                close()
            }
        }.build()
        
        return _CcJcb!!
    }

private var _CcJcb: ImageVector? = null

