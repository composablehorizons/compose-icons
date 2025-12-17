package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Ice_skating: ImageVector
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
                    moveTo(8f, 8.5f)
                    curveTo(8f, 8.22f, 8.22f, 8f, 8.5f, 8f)
                    horizontalLineToRelative(2.52f)
                    lineTo(11f, 7f)
                    horizontalLineTo(8.5f)
                    curveTo(8.22f, 7f, 8f, 6.78f, 8f, 6.5f)
                    curveTo(8f, 6.22f, 8.22f, 6f, 8.5f, 6f)
                    horizontalLineTo(11f)
                    verticalLineTo(3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(15f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(3f)
                    lineToRelative(0f, -2.88f)
                    curveToRelative(0f, -2.1f, -1.55f, -3.53f, -3.03f, -3.88f)
                    lineToRelative(-2.7f, -0.67f)
                    curveTo(12.4f, 10.35f, 11.7f, 9.76f, 11.32f, 9f)
                    horizontalLineTo(8.5f)
                    curveTo(8.22f, 9f, 8f, 8.78f, 8f, 8.5f)
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

