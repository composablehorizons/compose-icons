package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Highlight_alt: ImageVector
    get() {
        if (_Highlight_alt != null) return _Highlight_alt!!
        
        _Highlight_alt = ImageVector.Builder(
            name = "highlight_alt",
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
                    moveTo(17f, 5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(5f)
                    close()
                    moveTo(19f, 9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(19f, 13f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(13f)
                    close()
                    moveTo(11f, 21f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(21f)
                    close()
                    moveTo(7f, 5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(3f)
                    horizontalLineTo(7f)
                    verticalLineTo(5f)
                    close()
                    moveTo(3f, 17f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(3f)
                    verticalLineTo(17f)
                    close()
                    moveTo(5f, 21f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(3f)
                    curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                    close()
                    moveTo(19f, 3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                    close()
                    moveTo(11f, 5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(5f)
                    close()
                    moveTo(3f, 9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    horizontalLineTo(3f)
                    verticalLineTo(9f)
                    close()
                    moveTo(7f, 21f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(7f)
                    verticalLineTo(21f)
                    close()
                    moveTo(3f, 13f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(3f)
                    verticalLineTo(13f)
                    close()
                    moveTo(3f, 5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(3f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    close()
                    moveTo(18.71f, 17.29f)
                    lineToRelative(1.44f, -1.44f)
                    curveToRelative(0.32f, -0.32f, 0.09f, -0.85f, -0.35f, -0.85f)
                    horizontalLineTo(16f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(3.79f)
                    curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                    lineToRelative(1.44f, -1.44f)
                    lineToRelative(2f, 2f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                    lineTo(18.71f, 17.29f)
                    close()
                }
            }
        }.build()
        
        return _Highlight_alt!!
    }

private var _Highlight_alt: ImageVector? = null

