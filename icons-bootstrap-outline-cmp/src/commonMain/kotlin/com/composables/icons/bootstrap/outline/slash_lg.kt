package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SlashLg: ImageVector
    get() {
        if (_SlashLg != null) return _SlashLg!!
        
        _SlashLg = ImageVector.Builder(
            name = "slash-lg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.854f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-11f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineToRelative(11f, -11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
            }
        }.build()
        
        return _SlashLg!!
    }

private var _SlashLg: ImageVector? = null

