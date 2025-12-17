package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Pin_drop: ImageVector
    get() {
        if (_Pin_drop != null) return _Pin_drop!!
        
        _Pin_drop = ImageVector.Builder(
            name = "pin_drop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                curveTo(9.19f, 3f, 6f, 5.11f, 6f, 9.13f)
                curveToRelative(0f, 2.68f, 2f, 5.49f, 6f, 8.44f)
                curveToRelative(4f, -2.95f, 6f, -5.77f, 6f, -8.44f)
                curveTo(18f, 5.11f, 14.81f, 3f, 12f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 4f)
                curveToRelative(1.93f, 0f, 5f, 1.4f, 5f, 5.15f)
                curveToRelative(0f, 2.16f, -1.72f, 4.67f, -5f, 7.32f)
                curveToRelative(-3.28f, -2.65f, -5f, -5.17f, -5f, -7.32f)
                curveTo(7f, 5.4f, 10.07f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(8.73f, 2f, 5f, 4.46f, 5f, 9.15f)
                curveToRelative(0f, 3.12f, 2.33f, 6.41f, 7f, 9.85f)
                curveToRelative(4.67f, -3.44f, 7f, -6.73f, 7f, -9.85f)
                curveTo(19f, 4.46f, 15.27f, 2f, 12f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(13.1f, 7f, 12f, 7f)
                close()
                moveTo(5f, 20f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                close()
            }
        }.build()
        
        return _Pin_drop!!
    }

private var _Pin_drop: ImageVector? = null

