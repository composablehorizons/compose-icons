package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Badge: ImageVector
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
                    moveTo(20f, 7f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-2f)
                    curveTo(9.9f, 2f, 9f, 2.9f, 9f, 4f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 7f, 2f, 7.9f, 2f, 9f)
                    verticalLineToRelative(11f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(9f)
                    curveTo(22f, 7.9f, 21.1f, 7f, 20f, 7f)
                    close()
                    moveTo(9f, 12f)
                    curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                    reflectiveCurveTo(9.83f, 15f, 9f, 15f)
                    reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveTo(8.17f, 12f, 9f, 12f)
                    close()
                    moveTo(12f, 18f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-0.75f)
                    curveToRelative(0f, -1f, 2f, -1.5f, 3f, -1.5f)
                    reflectiveCurveToRelative(3f, 0.5f, 3f, 1.5f)
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

