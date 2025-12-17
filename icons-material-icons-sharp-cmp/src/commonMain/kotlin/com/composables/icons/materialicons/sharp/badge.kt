package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Badge: ImageVector
    get() {
        if (_Badge != null) return _Badge!!
        
        _Badge = ImageVector.Builder(
            name = "badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 7f)
                    horizontalLineToRelative(-7f)
                    verticalLineTo(2f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(15f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(7f)
                    close()
                    moveTo(9f, 12f)
                    curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                    curveTo(7.5f, 12.67f, 8.17f, 12f, 9f, 12f)
                    close()
                    moveTo(12f, 18f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-0.43f)
                    curveToRelative(0f, -0.6f, 0.36f, -1.15f, 0.92f, -1.39f)
                    curveTo(7.56f, 15.9f, 8.26f, 15.75f, 9f, 15.75f)
                    reflectiveCurveToRelative(1.44f, 0.15f, 2.08f, 0.43f)
                    curveToRelative(0.55f, 0.24f, 0.92f, 0.78f, 0.92f, 1.39f)
                    verticalLineTo(18f)
                    close()
                    moveTo(13f, 9f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(18f, 16.5f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(16.5f)
                    close()
                    moveTo(18f, 13.5f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(12f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(13.5f)
                    close()
                }
            }
        }.build()
        
        return _Badge!!
    }

private var _Badge: ImageVector? = null

