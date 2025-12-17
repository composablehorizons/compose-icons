package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Octagon: ImageVector
    get() {
        if (_Octagon != null) return _Octagon!!
        
        _Octagon = ImageVector.Builder(
            name = "octagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.107f, 0f)
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
                lineTo(4.54f, 0.146f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.893f, 0f)
                close()
            }
        }.build()
        
        return _Octagon!!
    }

private var _Octagon: ImageVector? = null

