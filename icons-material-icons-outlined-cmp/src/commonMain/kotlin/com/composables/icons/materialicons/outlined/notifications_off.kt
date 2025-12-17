package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Notifications_off: ImageVector
    get() {
        if (_Notifications_off != null) return _Notifications_off!!
        
        _Notifications_off = ImageVector.Builder(
            name = "notifications_off",
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
                moveToRelative(0f, -15.5f)
                curveToRelative(2.49f, 0f, 4f, 2.02f, 4f, 4.5f)
                verticalLineToRelative(0.1f)
                lineToRelative(2f, 2f)
                verticalLineTo(11f)
                curveToRelative(0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.68f)
                curveToRelative(-0.24f, 0.06f, -0.47f, 0.15f, -0.69f, 0.23f)
                lineToRelative(1.64f, 1.64f)
                curveToRelative(0.18f, -0.02f, 0.36f, -0.05f, 0.55f, -0.05f)
                close()
                moveTo(5.41f, 3.35f)
                lineTo(4f, 4.76f)
                lineToRelative(2.81f, 2.81f)
                curveTo(6.29f, 8.57f, 6f, 9.74f, 6f, 11f)
                verticalLineToRelative(5f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14.24f)
                lineToRelative(1.74f, 1.74f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.41f, 3.35f)
                close()
                moveTo(16f, 17f)
                horizontalLineTo(8f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.68f, 0.12f, -1.32f, 0.34f, -1.9f)
                lineTo(16f, 16.76f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        
        return _Notifications_off!!
    }

private var _Notifications_off: ImageVector? = null

