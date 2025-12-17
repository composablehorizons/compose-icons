package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Ice_skating: ImageVector
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
                    lineToRelative(-0.01f, -6f)
                    lineToRelative(-5.71f, -1.43f)
                    curveTo(12.4f, 10.35f, 11.7f, 9.76f, 11.32f, 9f)
                    horizontalLineTo(8f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(3.02f)
                    lineTo(11f, 7f)
                    horizontalLineTo(8f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(3f)
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

