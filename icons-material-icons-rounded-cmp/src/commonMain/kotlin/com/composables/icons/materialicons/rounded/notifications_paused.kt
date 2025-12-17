package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Notifications_paused: ImageVector
    get() {
        if (_Notifications_paused != null) return _Notifications_paused!!
        
        _Notifications_paused = ImageVector.Builder(
            name = "notifications_paused",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 22f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                close()
                moveToRelative(7.29f, -4.71f)
                lineTo(18f, 16f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.68f)
                curveTo(7.63f, 5.36f, 6f, 7.92f, 6f, 11f)
                verticalLineToRelative(5f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f)
                horizontalLineToRelative(13.17f)
                curveToRelative(0.9f, 0f, 1.34f, -1.08f, 0.71f, -1.71f)
                close()
                moveTo(14.5f, 9.33f)
                curveToRelative(0f, 0.31f, -0.11f, 0.6f, -0.3f, 0.84f)
                lineToRelative(-2.5f, 3.03f)
                horizontalLineToRelative(1.9f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-2.78f)
                curveToRelative(-0.73f, 0f, -1.32f, -0.59f, -1.32f, -1.32f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -0.31f, 0.11f, -0.6f, 0.3f, -0.84f)
                lineToRelative(2.5f, -3.03f)
                horizontalLineToRelative(-1.9f)
                curveToRelative(-0.5f, 0f, -0.9f, -0.4f, -0.9f, -0.9f)
                reflectiveCurveToRelative(0.4f, -0.9f, 0.9f, -0.9f)
                horizontalLineToRelative(2.78f)
                curveToRelative(0.73f, 0f, 1.32f, 0.59f, 1.32f, 1.33f)
                close()
            }
        }.build()
        
        return _Notifications_paused!!
    }

private var _Notifications_paused: ImageVector? = null

