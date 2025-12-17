package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Request_quote: ImageVector
    get() {
        if (_Request_quote != null) return _Request_quote!!
        
        _Request_quote = ImageVector.Builder(
            name = "request_quote",
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
                    moveTo(14f, 2f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(20f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(8f)
                    lineTo(14f, 2f)
                    close()
                    moveTo(15f, 12f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(12f)
                    close()
                    moveTo(13f, 8f)
                    verticalLineTo(3.5f)
                    lineTo(17.5f, 8f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Request_quote!!
    }

private var _Request_quote: ImageVector? = null

