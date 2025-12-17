package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Circle_notifications: ImageVector
    get() {
        if (_Circle_notifications != null) return _Circle_notifications!!
        
        _Circle_notifications = ImageVector.Builder(
            name = "circle_notifications",
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
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(0f, 16.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveToRelative(5f, -2.5f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1f)
                lineToRelative(1f, -1f)
                verticalLineToRelative(-2.61f)
                curveTo(8f, 9.27f, 9.03f, 7.47f, 11f, 7f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.57f, 0.43f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.43f, 1f, 1f)
                verticalLineTo(7f)
                curveToRelative(1.97f, 0.47f, 3f, 2.28f, 3f, 4.39f)
                verticalLineTo(14f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Circle_notifications!!
    }

private var _Circle_notifications: ImageVector? = null

