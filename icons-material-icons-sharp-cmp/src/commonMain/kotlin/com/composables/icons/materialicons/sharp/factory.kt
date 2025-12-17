package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Factory: ImageVector
    get() {
        if (_Factory != null) return _Factory!!
        
        _Factory = ImageVector.Builder(
            name = "factory",
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
                    moveTo(22f, 10f)
                    verticalLineToRelative(12f)
                    horizontalLineTo(2f)
                    verticalLineTo(10f)
                    lineToRelative(7f, -3f)
                    verticalLineToRelative(2f)
                    lineToRelative(5f, -2f)
                    lineToRelative(0f, 0f)
                    lineToRelative(0f, 3f)
                    horizontalLineTo(22f)
                    close()
                    moveTo(17.2f, 8.5f)
                    lineTo(18f, 2f)
                    horizontalLineToRelative(3f)
                    lineToRelative(0.8f, 6.5f)
                    horizontalLineTo(17.2f)
                    close()
                    moveTo(11f, 18f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(18f)
                    close()
                    moveTo(7f, 18f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(7f)
                    verticalLineTo(18f)
                    close()
                    moveTo(17f, 14f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Factory!!
    }

private var _Factory: ImageVector? = null

