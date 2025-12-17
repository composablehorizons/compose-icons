package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Mic: ImageVector
    get() {
        if (_Mic != null) return _Mic!!
        
        _Mic = ImageVector.Builder(
            name = "mic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 7f)
                verticalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, false, 8f, 0f)
                verticalLineTo(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(5f, 5f, 0f, false, true, -4.5f, 4.975f)
                verticalLineTo(15f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.025f)
                arcTo(5f, 5f, 0f, false, true, 3f, 8f)
                verticalLineTo(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _Mic!!
    }

private var _Mic: ImageVector? = null

