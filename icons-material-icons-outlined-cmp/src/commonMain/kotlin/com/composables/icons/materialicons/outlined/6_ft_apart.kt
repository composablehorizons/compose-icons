package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`6_ft_apart`: ImageVector
    get() {
        if (_6_ft_apart != null) return _6_ft_apart!!
        
        _6_ft_apart = ImageVector.Builder(
            name = "6_ft_apart",
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
                moveTo(6f, 6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(7.1f, 2f, 6f, 2f)
                reflectiveCurveTo(4f, 2.9f, 4f, 4f)
                reflectiveCurveTo(4.9f, 6f, 6f, 6f)
                close()
                moveTo(10f, 9.43f)
                curveToRelative(0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f)
                curveTo(7.93f, 7.21f, 6.99f, 7f, 6f, 7f)
                curveTo(5.01f, 7f, 4.07f, 7.21f, 3.22f, 7.58f)
                curveTo(2.48f, 7.9f, 2f, 8.62f, 2f, 9.43f)
                verticalLineTo(10f)
                horizontalLineToRelative(8f)
                verticalLineTo(9.43f)
                close()
                moveTo(18f, 6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(16.9f, 6f, 18f, 6f)
                close()
                moveTo(22f, 9.43f)
                curveToRelative(0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f)
                curveTo(19.93f, 7.21f, 18.99f, 7f, 18f, 7f)
                curveToRelative(-0.99f, 0f, -1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(14.48f, 7.9f, 14f, 8.62f, 14f, 9.43f)
                verticalLineTo(10f)
                horizontalLineToRelative(8f)
                verticalLineTo(9.43f)
                close()
                moveTo(19f, 17f)
                verticalLineToRelative(-2.01f)
                lineTo(5f, 15f)
                verticalLineToRelative(2f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(2.01f)
                lineTo(19f, 13f)
                verticalLineToRelative(-2f)
                lineToRelative(3f, 3f)
                lineTo(19f, 17f)
                close()
                moveTo(10f, 19f)
                verticalLineToRelative(-1f)
                horizontalLineTo(7.5f)
                curveTo(7.22f, 18f, 7f, 18.22f, 7f, 18.5f)
                verticalLineToRelative(3f)
                curveTo(7f, 21.78f, 7.22f, 22f, 7.5f, 22f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(20f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                close()
                moveTo(9f, 20.5f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineToRelative(-0.5f)
                horizontalLineTo(9f)
                close()
                moveTo(17.5f, 19f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineTo(19f)
                close()
                moveTo(12.5f, 19f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineTo(22f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineTo(14f)
                verticalLineToRelative(1f)
                horizontalLineTo(12.5f)
                close()
            }
        }.build()
        
        return _6_ft_apart!!
    }

private var _6_ft_apart: ImageVector? = null

