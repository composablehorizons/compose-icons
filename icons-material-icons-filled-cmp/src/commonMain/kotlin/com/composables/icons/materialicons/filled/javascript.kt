package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Javascript: ImageVector
    get() {
        if (_Javascript != null) return _Javascript!!
        
        _Javascript = ImageVector.Builder(
            name = "javascript",
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
                    moveTo(12f, 14f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(0.5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(13f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(-0.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(16f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-3f)
                    curveTo(12.45f, 15f, 12f, 14.55f, 12f, 14f)
                    close()
                    moveTo(9f, 9f)
                    verticalLineToRelative(4.5f)
                    horizontalLineTo(7.5f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(1f)
                    curveTo(6f, 14.33f, 6.67f, 15f, 7.5f, 15f)
                    horizontalLineTo(9f)
                    curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                    verticalLineTo(9f)
                    curveTo(10.5f, 9f, 9.83f, 9f, 9f, 9f)
                    close()
                }
            }
        }.build()
        
        return _Javascript!!
    }

private var _Javascript: ImageVector? = null

