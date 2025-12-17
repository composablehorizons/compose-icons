package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.WaveSquare: ImageVector
    get() {
        if (_WaveSquare != null) return _WaveSquare!!
        
        _WaveSquare = ImageVector.Builder(
            name = "wave-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(476f, 480f)
                horizontalLineTo(324f)
                arcToRelative(36f, 36f, 0f, false, true, -36f, -36f)
                verticalLineTo(96f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(156f)
                arcToRelative(36f, 36f, 0f, false, true, -36f, 36f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(112f)
                verticalLineTo(68f)
                arcToRelative(36f, 36f, 0f, false, true, 36f, -36f)
                horizontalLineToRelative(152f)
                arcToRelative(36f, 36f, 0f, false, true, 36f, 36f)
                verticalLineToRelative(348f)
                horizontalLineToRelative(96f)
                verticalLineTo(260f)
                arcToRelative(36f, 36f, 0f, false, true, 36f, -36f)
                horizontalLineToRelative(140f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineTo(512f)
                verticalLineToRelative(156f)
                arcToRelative(36f, 36f, 0f, false, true, -36f, 36f)
                close()
            }
        }.build()
        
        return _WaveSquare!!
    }

private var _WaveSquare: ImageVector? = null

