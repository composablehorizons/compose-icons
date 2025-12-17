package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Social_distance: ImageVector
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
                moveTo(18.01f, 13.01f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(18.17f, 16f)
                horizontalLineTo(5.83f)
                lineToRelative(1.58f, -1.59f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(2f, 17f)
                lineToRelative(3.99f, 3.99f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.83f, 18f)
                horizontalLineToRelative(12.34f)
                lineToRelative(-1.58f, 1.58f)
                lineToRelative(1.41f, 1.41f)
                lineTo(22f, 17f)
                lineTo(18.01f, 13.01f)
                close()
            }
        }.build()
        
        return _Social_distance!!
    }

private var _Social_distance: ImageVector? = null

