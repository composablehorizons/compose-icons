package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Substack: ImageVector
    get() {
        if (_Substack != null) return _Substack!!
        
        _Substack = ImageVector.Builder(
            name = "substack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 3.604f)
                horizontalLineTo(1f)
                verticalLineToRelative(1.891f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1.89f)
                close()
                moveTo(1f, 7.208f)
                verticalLineTo(16f)
                lineToRelative(7f, -3.926f)
                lineTo(15f, 16f)
                verticalLineTo(7.208f)
                close()
                moveTo(15f, 0f)
                horizontalLineTo(1f)
                verticalLineToRelative(1.89f)
                horizontalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Substack!!
    }

private var _Substack: ImageVector? = null

