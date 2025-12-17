package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.System_security_update: ImageVector
    get() {
        if (_System_security_update != null) return _System_security_update!!
        
        _System_security_update = ImageVector.Builder(
            name = "system_security_update",
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
                    moveTo(5f, 1f)
                    verticalLineToRelative(22f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(1f)
                    horizontalLineTo(5f)
                    close()
                    moveTo(17f, 18f)
                    horizontalLineTo(7f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(18f)
                    close()
                    moveTo(16f, 12f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(8f)
                    lineToRelative(4f, 4f)
                    lineTo(16f, 12f)
                    close()
                }
            }
        }.build()
        
        return _System_security_update!!
    }

private var _System_security_update: ImageVector? = null

