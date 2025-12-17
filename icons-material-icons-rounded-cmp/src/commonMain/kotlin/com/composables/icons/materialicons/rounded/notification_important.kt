package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Notification_important: ImageVector
    get() {
        if (_Notification_important != null) return _Notification_important!!
        
        _Notification_important = ImageVector.Builder(
            name = "notification_important",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 23f)
                curveToRelative(1.1f, 0f, 1.99f, -0.89f, 1.99f, -1.99f)
                horizontalLineToRelative(-3.98f)
                curveToRelative(0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f)
                close()
                moveToRelative(8.29f, -4.71f)
                lineTo(19f, 17f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -3.35f, -2.36f, -6.15f, -5.5f, -6.83f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.17f)
                curveTo(7.36f, 4.85f, 5f, 7.65f, 5f, 11f)
                verticalLineToRelative(6f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f)
                horizontalLineToRelative(15.17f)
                curveToRelative(0.9f, 0f, 1.34f, -1.08f, 0.71f, -1.71f)
                close()
                moveTo(13f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Notification_important!!
    }

private var _Notification_important: ImageVector? = null

