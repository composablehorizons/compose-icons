package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Brilliance: ImageVector
    get() {
        if (_Brilliance != null) return _Brilliance!!
        
        _Brilliance = ImageVector.Builder(
            name = "brilliance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, true, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 0f, 16f)
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, false, false, 7f, 7f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 0f, -7f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, 7f)
            }
        }.build()
        
        return _Brilliance!!
    }

private var _Brilliance: ImageVector? = null

