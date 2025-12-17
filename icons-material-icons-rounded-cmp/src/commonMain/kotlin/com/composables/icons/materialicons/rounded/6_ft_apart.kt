package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`6_ft_apart`: ImageVector
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
                moveTo(21.65f, 14.35f)
                lineToRelative(-1.79f, 1.79f)
                curveTo(19.54f, 16.46f, 19f, 16.24f, 19f, 15.79f)
                verticalLineToRelative(-0.8f)
                lineTo(5f, 15f)
                verticalLineToRelative(0.79f)
                curveToRelative(0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f)
                lineToRelative(-1.79f, -1.79f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(1.79f, -1.79f)
                curveTo(4.46f, 11.54f, 5f, 11.76f, 5f, 12.21f)
                verticalLineToRelative(0.8f)
                lineTo(19f, 13f)
                verticalLineToRelative(-0.79f)
                curveToRelative(0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f)
                lineToRelative(1.79f, 1.79f)
                curveTo(21.84f, 13.84f, 21.84f, 14.16f, 21.65f, 14.35f)
                close()
                moveTo(10f, 18.5f)
                lineTo(10f, 18.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2f)
                curveTo(7.22f, 18f, 7f, 18.22f, 7f, 18.5f)
                verticalLineToRelative(3f)
                curveTo(7f, 21.78f, 7.22f, 22f, 7.5f, 22f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(20f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineToRelative(1.5f)
                curveTo(9.78f, 19f, 10f, 18.78f, 10f, 18.5f)
                close()
                moveTo(9f, 20.5f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineToRelative(-0.5f)
                horizontalLineTo(9f)
                close()
                moveTo(17f, 19f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(0f)
                curveTo(17.5f, 18.78f, 17.28f, 19f, 17f, 19f)
                close()
                moveTo(14f, 18.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                curveTo(13.78f, 18f, 14f, 18.22f, 14f, 18.5f)
                close()
            }
        }.build()
        
        return _6_ft_apart!!
    }

private var _6_ft_apart: ImageVector? = null

