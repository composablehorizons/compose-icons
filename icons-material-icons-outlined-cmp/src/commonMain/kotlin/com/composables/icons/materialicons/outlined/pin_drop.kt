package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Pin_drop: ImageVector
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
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
                moveToRelative(0f, -2f)
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
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                close()
                moveTo(5f, 20f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Pin_drop!!
    }

private var _Pin_drop: ImageVector? = null

