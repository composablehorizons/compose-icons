package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SlashCircle: ImageVector
    get() {
        if (_SlashCircle != null) return _SlashCircle!!
        
        _SlashCircle = ImageVector.Builder(
            name = "slash-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-4.646f, -2.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineToRelative(-6f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _SlashCircle!!
    }

private var _SlashCircle: ImageVector? = null

