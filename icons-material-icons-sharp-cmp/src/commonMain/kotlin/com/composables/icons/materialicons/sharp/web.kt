package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Web: ImageVector
    get() {
        if (_Web != null) return _Web!!
        
        _Web = ImageVector.Builder(
            name = "web",
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
                    moveTo(22f, 4f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(4f)
                    close()
                    moveTo(4f, 9f)
                    horizontalLineToRelative(10.5f)
                    verticalLineToRelative(3.5f)
                    horizontalLineTo(4f)
                    verticalLineTo(9f)
                    close()
                    moveTo(4f, 14.5f)
                    horizontalLineToRelative(10.5f)
                    verticalLineTo(18f)
                    lineTo(4f, 18f)
                    verticalLineTo(14.5f)
                    close()
                    moveTo(20f, 18f)
                    lineToRelative(-3.5f, 0f)
                    verticalLineTo(9f)
                    horizontalLineTo(20f)
                    verticalLineTo(18f)
                    close()
                }
            }
        }.build()
        
        return _Web!!
    }

private var _Web: ImageVector? = null

