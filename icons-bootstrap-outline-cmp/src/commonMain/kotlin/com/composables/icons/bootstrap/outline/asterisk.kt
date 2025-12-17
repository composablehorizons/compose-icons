package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Asterisk: ImageVector
    get() {
        if (_Asterisk != null) return _Asterisk!!
        
        _Asterisk = ImageVector.Builder(
            name = "asterisk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(5.268f)
                lineToRelative(4.562f, -2.634f)
                arcToRelative(1f, 1f, 0f, true, true, 1f, 1.732f)
                lineTo(10f, 8f)
                lineToRelative(4.562f, 2.634f)
                arcToRelative(1f, 1f, 0f, true, true, -1f, 1.732f)
                lineTo(9f, 9.732f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                verticalLineTo(9.732f)
                lineToRelative(-4.562f, 2.634f)
                arcToRelative(1f, 1f, 0f, true, true, -1f, -1.732f)
                lineTo(6f, 8f)
                lineTo(1.438f, 5.366f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1.732f)
                lineTo(7f, 6.268f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _Asterisk!!
    }

private var _Asterisk: ImageVector? = null

