package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Dropbox: ImageVector
    get() {
        if (_Dropbox != null) return _Dropbox!!
        
        _Dropbox = ImageVector.Builder(
            name = "dropbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.01f, 4.555f)
                lineTo(4.005f, 7.11f)
                lineTo(8.01f, 9.665f)
                lineTo(4.005f, 12.22f)
                lineTo(0f, 9.651f)
                lineToRelative(4.005f, -2.555f)
                lineTo(0f, 4.555f)
                lineTo(4.005f, 2f)
                close()
                moveToRelative(-4.026f, 8.487f)
                lineToRelative(4.006f, -2.555f)
                lineToRelative(4.005f, 2.555f)
                lineToRelative(-4.005f, 2.555f)
                close()
                moveToRelative(4.026f, -3.39f)
                lineToRelative(4.005f, -2.556f)
                lineTo(8.01f, 4.555f)
                lineTo(11.995f, 2f)
                lineTo(16f, 4.555f)
                lineTo(11.995f, 7.11f)
                lineTo(16f, 9.665f)
                lineToRelative(-4.005f, 2.555f)
                close()
            }
        }.build()
        
        return _Dropbox!!
    }

private var _Dropbox: ImageVector? = null

