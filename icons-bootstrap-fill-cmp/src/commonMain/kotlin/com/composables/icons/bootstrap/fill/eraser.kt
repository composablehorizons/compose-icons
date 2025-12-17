package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Eraser: ImageVector
    get() {
        if (_Eraser != null) return _Eraser!!
        
        _Eraser = ImageVector.Builder(
            name = "eraser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.086f, 2.207f)
                arcToRelative(2f, 2f, 0f, false, true, 2.828f, 0f)
                lineToRelative(3.879f, 3.879f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2.828f)
                lineToRelative(-5.5f, 5.5f)
                arcTo(2f, 2f, 0f, false, true, 7.879f, 15f)
                horizontalLineTo(5.12f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -0.586f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2.828f)
                close()
                moveToRelative(0.66f, 11.34f)
                lineTo(3.453f, 8.254f)
                lineTo(1.914f, 9.793f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, 0.293f)
                horizontalLineTo(7.88f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, -0.293f)
                close()
            }
        }.build()
        
        return _Eraser!!
    }

private var _Eraser: ImageVector? = null

