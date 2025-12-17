package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Feed: ImageVector
    get() {
        if (_Feed != null) return _Feed!!
        
        _Feed = ImageVector.Builder(
            name = "feed",
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
                    moveTo(16f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8f)
                    lineTo(16f, 3f)
                    close()
                    moveTo(19f, 19f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(19f)
                    close()
                    moveTo(7f, 17f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(7f)
                    verticalLineTo(17f)
                    close()
                    moveTo(12f, 7f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(7f)
                    close()
                    moveTo(7f, 13f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(7f)
                    verticalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Feed!!
    }

private var _Feed: ImageVector? = null

