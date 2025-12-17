package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Mercury: ImageVector
    get() {
        if (_Mercury != null) return _Mercury!!
        
        _Mercury = ImageVector.Builder(
            name = "mercury",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 288f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 208f)
                curveToRelative(0f, -44.2f, -19.9f, -83.7f, -51.2f, -110.1f)
                curveToRelative(2.5f, -1.8f, 4.9f, -3.8f, 7.2f, -5.8f)
                curveToRelative(24.7f, -21.2f, 39.8f, -48.8f, 43.2f, -78.8f)
                curveToRelative(0.9f, -7.1f, -4.7f, -13.3f, -11.9f, -13.3f)
                horizontalLineToRelative(-40.5f)
                curveTo(229f, 0f, 224.1f, 4.1f, 223f, 9.8f)
                curveToRelative(-2.4f, 12.5f, -9.6f, 24.3f, -20.7f, 33.8f)
                curveTo(187f, 56.8f, 166.3f, 64f, 144f, 64f)
                reflectiveCurveToRelative(-43f, -7.2f, -58.4f, -20.4f)
                curveTo(74.5f, 34.1f, 67.4f, 22.3f, 64.9f, 9.8f)
                curveTo(63.8f, 4.1f, 58.9f, 0f, 53.2f, 0f)
                horizontalLineTo(12.7f)
                curveTo(5.5f, 0f, -0.1f, 6.2f, 0.8f, 13.3f)
                curveTo(4.2f, 43.4f, 19.2f, 71f, 44f, 92.2f)
                curveToRelative(2.3f, 2f, 4.7f, 3.9f, 7.2f, 5.8f)
                curveTo(19.9f, 124.3f, 0f, 163.8f, 0f, 208f)
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
                curveToRelative(64.1f, -14.5f, 112f, -71.9f, 112f, -140.4f)
                close()
                moveToRelative(-224f, 0f)
                curveToRelative(0f, -44.1f, 35.9f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                reflectiveCurveToRelative(-80f, -35.9f, -80f, -80f)
                close()
            }
        }.build()
        
        return _Mercury!!
    }

private var _Mercury: ImageVector? = null

