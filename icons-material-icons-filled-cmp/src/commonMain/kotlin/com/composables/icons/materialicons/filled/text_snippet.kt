package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Text_snippet: ImageVector
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
                    moveTo(20.41f, 8.41f)
                    lineToRelative(-4.83f, -4.83f)
                    curveTo(15.21f, 3.21f, 14.7f, 3f, 14.17f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(9.83f)
                    curveTo(21f, 9.3f, 20.79f, 8.79f, 20.41f, 8.41f)
                    close()
                    moveTo(7f, 7f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(7f)
                    verticalLineTo(7f)
                    close()
                    moveTo(17f, 17f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(17f)
                    close()
                    moveTo(17f, 13f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Text_snippet!!
    }

private var _Text_snippet: ImageVector? = null

