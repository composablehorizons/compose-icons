package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Content_copy: ImageVector
    get() {
        if (_Content_copy != null) return _Content_copy!!
        
        _Content_copy = ImageVector.Builder(
            name = "content_copy",
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
                    moveTo(15f, 20f)
                    horizontalLineTo(5f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveTo(3.45f, 6f, 3f, 6.45f, 3f, 7f)
                    verticalLineToRelative(13f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(10f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveTo(16f, 20.45f, 15.55f, 20f, 15f, 20f)
                    close()
                    moveTo(20f, 16f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(9f)
                    curveTo(7.9f, 2f, 7f, 2.9f, 7f, 4f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(9f)
                    curveTo(19.1f, 18f, 20f, 17.1f, 20f, 16f)
                    close()
                    moveTo(18f, 16f)
                    horizontalLineTo(9f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(9f)
                    verticalLineTo(16f)
                    close()
                }
            }
        }.build()
        
        return _Content_copy!!
    }

private var _Content_copy: ImageVector? = null

