package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Cup: ImageVector
    get() {
        if (_Cup != null) return _Cup!!
        
        _Cup = ImageVector.Builder(
            name = "cup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.11f, 3.187f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 3f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.488f, 0.608f)
                lineToRelative(-0.22f, 0.991f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, -1.3f, 5.854f)
                lineToRelative(-0.132f, 0.59f)
                arcTo(2.5f, 2.5f, 0f, false, true, 9.896f, 13f)
                horizontalLineTo(4.104f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.44f, -1.958f)
                lineTo(0.012f, 3.608f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.098f, -0.42f)
                close()
                moveToRelative(12.574f, 6.288f)
                arcToRelative(2f, 2f, 0f, false, false, 0.866f, -3.899f)
                close()
                moveTo(1.124f, 4f)
                lineToRelative(1.516f, 6.825f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.104f, 12f)
                horizontalLineToRelative(5.792f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.464f, -1.175f)
                lineTo(12.877f, 4f)
                horizontalLineTo(1.123f)
                close()
            }
        }.build()
        
        return _Cup!!
    }

private var _Cup: ImageVector? = null

