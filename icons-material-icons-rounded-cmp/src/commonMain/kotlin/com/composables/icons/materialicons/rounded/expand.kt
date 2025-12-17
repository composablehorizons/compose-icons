package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Expand: ImageVector
    get() {
        if (_Expand != null) return _Expand!!
        
        _Expand = ImageVector.Builder(
            name = "expand",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(5f, 20f)
                    horizontalLineToRelative(14f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(4f, 20.45f, 4.45f, 20f, 5f, 20f)
                    close()
                    moveTo(5f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(5f)
                    curveTo(4.45f, 4f, 4f, 3.55f, 4f, 3f)
                    verticalLineToRelative(0f)
                    curveTo(4f, 2.45f, 4.45f, 2f, 5f, 2f)
                    close()
                    moveTo(13f, 9f)
                    horizontalLineToRelative(1.79f)
                    curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                    lineToRelative(-2.79f, -2.79f)
                    curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                    lineTo(8.85f, 8.15f)
                    curveTo(8.54f, 8.46f, 8.76f, 9f, 9.21f, 9f)
                    horizontalLineTo(11f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(9.21f)
                    curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                    lineToRelative(2.79f, 2.79f)
                    curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                    lineToRelative(2.79f, -2.79f)
                    curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f)
                    horizontalLineTo(13f)
                    verticalLineTo(9f)
                    close()
                }
            }
        }.build()
        
        return _Expand!!
    }

private var _Expand: ImageVector? = null

