package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.OctagonHalf: ImageVector
    get() {
        if (_OctagonHalf != null) return _OctagonHalf!!
        
        _OctagonHalf = ImageVector.Builder(
            name = "octagon-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.54f, 0.146f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.893f, 0f)
                horizontalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.353f, 0.146f)
                lineToRelative(4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, 0.353f)
                verticalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.146f, 0.353f)
                lineToRelative(-4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.353f, 0.146f)
                horizontalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.353f, -0.146f)
                lineTo(0.146f, 11.46f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0f, 11.107f)
                verticalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, -0.353f)
                close()
                moveTo(8f, 15f)
                horizontalLineToRelative(2.9f)
                lineToRelative(4.1f, -4.1f)
                verticalLineTo(5.1f)
                lineTo(10.9f, 1f)
                horizontalLineTo(8f)
                close()
            }
        }.build()
        
        return _OctagonHalf!!
    }

private var _OctagonHalf: ImageVector? = null

