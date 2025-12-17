package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Rule: ImageVector
    get() {
        if (_Rule != null) return _Rule!!
        
        _Rule = ImageVector.Builder(
            name = "rule",
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
                    moveTo(16.54f, 11f)
                    lineTo(13f, 7.46f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(2.12f, 2.12f)
                    lineToRelative(4.24f, -4.24f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(16.54f, 11f)
                    close()
                    moveTo(11f, 7f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(9f)
                    verticalLineTo(7f)
                    close()
                    moveTo(21f, 13.41f)
                    lineTo(19.59f, 12f)
                    lineTo(17f, 14.59f)
                    lineTo(14.41f, 12f)
                    lineTo(13f, 13.41f)
                    lineTo(15.59f, 16f)
                    lineTo(13f, 18.59f)
                    lineTo(14.41f, 20f)
                    lineTo(17f, 17.41f)
                    lineTo(19.59f, 20f)
                    lineTo(21f, 18.59f)
                    lineTo(18.41f, 16f)
                    lineTo(21f, 13.41f)
                    close()
                    moveTo(11f, 15f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(9f)
                    verticalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _Rule!!
    }

private var _Rule: ImageVector? = null

