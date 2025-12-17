package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Notifications_active: ImageVector
    get() {
        if (_Notifications_active != null) return _Notifications_active!!
        
        _Notifications_active = ImageVector.Builder(
            name = "notifications_active",
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
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(6f, -6f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.68f)
                curveTo(7.64f, 5.36f, 6f, 7.92f, 6f, 11f)
                verticalLineToRelative(5f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-1f)
                lineToRelative(-2f, -2f)
                close()
                moveToRelative(-2f, 1f)
                horizontalLineTo(8f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.48f, 1.51f, -4.5f, 4f, -4.5f)
                reflectiveCurveToRelative(4f, 2.02f, 4f, 4.5f)
                verticalLineToRelative(6f)
                close()
                moveTo(7.58f, 4.08f)
                lineTo(6.15f, 2.65f)
                curveTo(3.75f, 4.48f, 2.17f, 7.3f, 2.03f, 10.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.15f, -2.65f, 1.51f, -4.97f, 3.55f, -6.42f)
                close()
                moveToRelative(12.39f, 6.42f)
                horizontalLineToRelative(2f)
                curveToRelative(-0.15f, -3.2f, -1.73f, -6.02f, -4.12f, -7.85f)
                lineToRelative(-1.42f, 1.43f)
                curveToRelative(2.02f, 1.45f, 3.39f, 3.77f, 3.54f, 6.42f)
                close()
            }
        }.build()
        
        return _Notifications_active!!
    }

private var _Notifications_active: ImageVector? = null

