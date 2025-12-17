package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Amd: ImageVector
    get() {
        if (_Amd != null) return _Amd!!
        
        _Amd = ImageVector.Builder(
            name = "amd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.334f, 0f)
                lineToRelative(4.358f, 4.359f)
                horizontalLineToRelative(7.15f)
                verticalLineToRelative(7.15f)
                lineToRelative(4.358f, 4.358f)
                verticalLineTo(0f)
                close()
                moveTo(0.2f, 9.72f)
                lineToRelative(4.487f, -4.488f)
                verticalLineToRelative(6.281f)
                horizontalLineToRelative(6.28f)
                lineTo(6.48f, 16f)
                horizontalLineTo(0.2f)
                close()
            }
        }.build()
        
        return _Amd!!
    }

private var _Amd: ImageVector? = null

