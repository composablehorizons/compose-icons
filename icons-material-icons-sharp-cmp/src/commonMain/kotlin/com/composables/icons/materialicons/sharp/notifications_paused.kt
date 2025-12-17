package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Notifications_paused: ImageVector
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
                moveToRelative(6f, -6f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f)
                verticalLineTo(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.18f)
                curveTo(7.63f, 5.36f, 6f, 7.93f, 6f, 11f)
                verticalLineToRelative(5f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-1f)
                lineToRelative(-2f, -2f)
                close()
                moveToRelative(-3.5f, -6.2f)
                lineToRelative(-2.8f, 3.4f)
                horizontalLineToRelative(2.8f)
                verticalLineTo(15f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.8f)
                lineToRelative(2.8f, -3.4f)
                horizontalLineTo(9.5f)
                verticalLineTo(8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.8f)
                close()
            }
        }.build()
        
        return _Notifications_paused!!
    }

private var _Notifications_paused: ImageVector? = null

