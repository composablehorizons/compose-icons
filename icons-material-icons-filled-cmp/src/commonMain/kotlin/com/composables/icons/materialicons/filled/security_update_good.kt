package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Security_update_good: ImageVector
    get() {
        if (_Security_update_good != null) return _Security_update_good!!
        
        _Security_update_good = ImageVector.Builder(
            name = "security_update_good",
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
                    moveTo(17f, 1f)
                    horizontalLineTo(7f)
                    curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                    verticalLineToRelative(18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(10f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(3f)
                    curveTo(19f, 1.9f, 18.1f, 1f, 17f, 1f)
                    close()
                    moveTo(17f, 18f)
                    horizontalLineTo(7f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(18f)
                    close()
                    moveTo(16f, 10.05f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(-3.54f, 3.54f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(11.05f, 15f)
                    lineTo(16f, 10.05f)
                    close()
                }
            }
        }.build()
        
        return _Security_update_good!!
    }

private var _Security_update_good: ImageVector? = null

