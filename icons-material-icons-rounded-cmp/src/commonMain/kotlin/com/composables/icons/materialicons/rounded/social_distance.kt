package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Social_distance: ImageVector
    get() {
        if (_Social_distance != null) return _Social_distance!!
        
        _Social_distance = ImageVector.Builder(
            name = "social_distance",
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
                moveTo(4f, 5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveTo(4f, 6.1f, 4f, 5f)
                close()
                moveTo(8.78f, 8.58f)
                curveTo(7.93f, 8.21f, 6.99f, 8f, 6f, 8f)
                reflectiveCurveTo(4.07f, 8.21f, 3.22f, 8.58f)
                curveTo(2.48f, 8.9f, 2f, 9.62f, 2f, 10.43f)
                lineTo(2f, 11f)
                horizontalLineToRelative(8f)
                lineToRelative(0f, -0.57f)
                curveTo(10f, 9.62f, 9.52f, 8.9f, 8.78f, 8.58f)
                close()
                moveTo(18f, 7f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveTo(16f, 6.1f, 16.9f, 7f, 18f, 7f)
                close()
                moveTo(20.78f, 8.58f)
                curveTo(19.93f, 8.21f, 18.99f, 8f, 18f, 8f)
                curveToRelative(-0.99f, 0f, -1.93f, 0.21f, -2.78f, 0.58f)
                curveTo(14.48f, 8.9f, 14f, 9.62f, 14f, 10.43f)
                lineTo(14f, 11f)
                horizontalLineToRelative(8f)
                lineToRelative(0f, -0.57f)
                curveTo(22f, 9.62f, 21.52f, 8.9f, 20.78f, 8.58f)
                close()
                moveTo(21.65f, 16.65f)
                lineToRelative(-2.79f, -2.79f)
                curveTo(18.54f, 13.54f, 18f, 13.76f, 18f, 14.21f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineToRelative(-1.79f)
                curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(2.79f, 2.79f)
                curveTo(5.46f, 20.46f, 6f, 20.24f, 6f, 19.79f)
                verticalLineTo(18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1.79f)
                curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.79f, -2.79f)
                curveTo(21.84f, 17.16f, 21.84f, 16.84f, 21.65f, 16.65f)
                close()
            }
        }.build()
        
        return _Social_distance!!
    }

private var _Social_distance: ImageVector? = null

