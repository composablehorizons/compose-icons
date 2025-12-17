package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Anthropic: ImageVector
    get() {
        if (_Anthropic != null) return _Anthropic!!
        
        _Anthropic = ImageVector.Builder(
            name = "anthropic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.218f, 2f)
                horizontalLineToRelative(2.402f)
                lineTo(16f, 12.987f)
                horizontalLineToRelative(-2.402f)
                close()
                moveTo(4.379f, 2f)
                horizontalLineToRelative(2.512f)
                lineToRelative(4.38f, 10.987f)
                horizontalLineTo(8.82f)
                lineToRelative(-0.895f, -2.308f)
                horizontalLineToRelative(-4.58f)
                lineToRelative(-0.896f, 2.307f)
                horizontalLineTo(0f)
                lineTo(4.38f, 2.001f)
                close()
                moveToRelative(2.755f, 6.64f)
                lineTo(5.635f, 4.777f)
                lineTo(4.137f, 8.64f)
                close()
            }
        }.build()
        
        return _Anthropic!!
    }

private var _Anthropic: ImageVector? = null

