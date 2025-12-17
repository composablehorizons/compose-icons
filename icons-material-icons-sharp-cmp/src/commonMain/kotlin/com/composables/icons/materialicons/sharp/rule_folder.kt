package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Rule_folder: ImageVector
    get() {
        if (_Rule_folder != null) return _Rule_folder!!
        
        _Rule_folder = ImageVector.Builder(
            name = "rule_folder",
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
                    moveTo(22f, 6f)
                    horizontalLineTo(12f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(6f)
                    close()
                    moveTo(7.83f, 16f)
                    lineTo(5f, 13.17f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(3.54f, -3.54f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(7.83f, 16f)
                    close()
                    moveTo(17.41f, 13f)
                    lineTo(19f, 14.59f)
                    lineTo(17.59f, 16f)
                    lineTo(16f, 14.41f)
                    lineTo(14.41f, 16f)
                    lineTo(13f, 14.59f)
                    lineTo(14.59f, 13f)
                    lineTo(13f, 11.41f)
                    lineTo(14.41f, 10f)
                    lineTo(16f, 11.59f)
                    lineTo(17.59f, 10f)
                    lineTo(19f, 11.41f)
                    lineTo(17.41f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Rule_folder!!
    }

private var _Rule_folder: ImageVector? = null

