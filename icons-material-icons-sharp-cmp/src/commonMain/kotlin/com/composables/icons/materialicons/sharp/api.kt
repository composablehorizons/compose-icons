package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Api: ImageVector
    get() {
        if (_Api != null) return _Api!!
        
        _Api = ImageVector.Builder(
            name = "api",
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
                    moveTo(14f, 12f)
                    lineToRelative(-2f, 2f)
                    lineToRelative(-2f, -2f)
                    lineToRelative(2f, -2f)
                    lineTo(14f, 12f)
                    close()
                    moveTo(12f, 6f)
                    lineToRelative(2.12f, 2.12f)
                    lineToRelative(2.5f, -2.5f)
                    lineTo(12f, 1f)
                    lineTo(7.38f, 5.62f)
                    lineToRelative(2.5f, 2.5f)
                    lineTo(12f, 6f)
                    close()
                    moveTo(6f, 12f)
                    lineToRelative(2.12f, -2.12f)
                    lineToRelative(-2.5f, -2.5f)
                    lineTo(1f, 12f)
                    lineToRelative(4.62f, 4.62f)
                    lineToRelative(2.5f, -2.5f)
                    lineTo(6f, 12f)
                    close()
                    moveTo(18f, 12f)
                    lineToRelative(-2.12f, 2.12f)
                    lineToRelative(2.5f, 2.5f)
                    lineTo(23f, 12f)
                    lineToRelative(-4.62f, -4.62f)
                    lineToRelative(-2.5f, 2.5f)
                    lineTo(18f, 12f)
                    close()
                    moveTo(12f, 18f)
                    lineToRelative(-2.12f, -2.12f)
                    lineToRelative(-2.5f, 2.5f)
                    lineTo(12f, 23f)
                    lineToRelative(4.62f, -4.62f)
                    lineToRelative(-2.5f, -2.5f)
                    lineTo(12f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Api!!
    }

private var _Api: ImageVector? = null

