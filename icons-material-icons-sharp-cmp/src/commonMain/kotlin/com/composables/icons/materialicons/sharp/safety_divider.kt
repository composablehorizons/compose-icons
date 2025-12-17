package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Safety_divider: ImageVector
    get() {
        if (_Safety_divider != null) return _Safety_divider!!
        
        _Safety_divider = ImageVector.Builder(
            name = "safety_divider",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5f)
                close()
                moveTo(5f, 12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveTo(3f, 11.1f, 3.9f, 12f, 5f, 12f)
                close()
                moveTo(7.78f, 13.58f)
                curveTo(6.93f, 13.21f, 5.99f, 13f, 5f, 13f)
                reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(1.48f, 13.9f, 1f, 14.62f, 1f, 15.43f)
                lineTo(1f, 16f)
                horizontalLineToRelative(8f)
                lineToRelative(0f, -0.57f)
                curveTo(9f, 14.62f, 8.52f, 13.9f, 7.78f, 13.58f)
                close()
                moveTo(19f, 12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveTo(17f, 11.1f, 17.9f, 12f, 19f, 12f)
                close()
                moveTo(21.78f, 13.58f)
                curveTo(20.93f, 13.21f, 19.99f, 13f, 19f, 13f)
                reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(15.48f, 13.9f, 15f, 14.62f, 15f, 15.43f)
                lineTo(15f, 16f)
                horizontalLineToRelative(8f)
                lineToRelative(0f, -0.57f)
                curveTo(23f, 14.62f, 22.52f, 13.9f, 21.78f, 13.58f)
                close()
            }
        }.build()
        
        return _Safety_divider!!
    }

private var _Safety_divider: ImageVector? = null

