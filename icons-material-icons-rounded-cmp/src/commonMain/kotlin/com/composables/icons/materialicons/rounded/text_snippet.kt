package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Text_snippet: ImageVector
    get() {
        if (_Text_snippet != null) return _Text_snippet!!
        
        _Text_snippet = ImageVector.Builder(
            name = "text_snippet",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.17f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(9.83f)
                    curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                    lineToRelative(-4.83f, -4.83f)
                    curveTo(15.21f, 3.21f, 14.7f, 3f, 14.17f, 3f)
                    lineTo(14.17f, 3f)
                    close()
                    moveTo(8f, 15f)
                    horizontalLineToRelative(8f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(8f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(7f, 15.45f, 7.45f, 15f, 8f, 15f)
                    close()
                    moveTo(8f, 11f)
                    horizontalLineToRelative(8f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(8f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(7f, 11.45f, 7.45f, 11f, 8f, 11f)
                    close()
                    moveTo(8f, 7f)
                    horizontalLineToRelative(5f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(8f)
                    curveTo(7.45f, 9f, 7f, 8.55f, 7f, 8f)
                    verticalLineToRelative(0f)
                    curveTo(7f, 7.45f, 7.45f, 7f, 8f, 7f)
                    close()
                }
            }
        }.build()
        
        return _Text_snippet!!
    }

private var _Text_snippet: ImageVector? = null

