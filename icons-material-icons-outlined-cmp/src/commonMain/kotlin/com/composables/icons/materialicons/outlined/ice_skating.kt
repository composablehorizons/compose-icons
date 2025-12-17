package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Ice_skating: ImageVector
    get() {
        if (_Ice_skating != null) return _Ice_skating!!
        
        _Ice_skating = ImageVector.Builder(
            name = "ice_skating",
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21f, 17f)
                    curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -1.79f, -1.19f, -3.34f, -2.91f, -3.82f)
                    lineToRelative(-2.62f, -0.74f)
                    curveTo(12.62f, 9.19f, 12f, 8.39f, 12f, 7.5f)
                    verticalLineTo(3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(15f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                    horizontalLineTo(21f)
                    close()
                    moveTo(5f, 16f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(8.5f)
                    curveTo(8.22f, 6f, 8f, 6.22f, 8f, 6.5f)
                    curveTo(8f, 6.78f, 8.22f, 7f, 8.5f, 7f)
                    horizontalLineTo(10f)
                    lineToRelative(0.1f, 1f)
                    horizontalLineTo(8.5f)
                    curveTo(8.22f, 8f, 8f, 8.22f, 8f, 8.5f)
                    curveTo(8f, 8.78f, 8.22f, 9f, 8.5f, 9f)
                    horizontalLineToRelative(1.81f)
                    curveToRelative(0.45f, 1.12f, 1.4f, 2.01f, 2.6f, 2.36f)
                    lineToRelative(2.62f, 0.73f)
                    curveTo(16.4f, 12.33f, 17f, 13.1f, 17f, 14f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(5f)
                    close()
                    moveTo(14f, 20f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Ice_skating!!
    }

private var _Ice_skating: ImageVector? = null

