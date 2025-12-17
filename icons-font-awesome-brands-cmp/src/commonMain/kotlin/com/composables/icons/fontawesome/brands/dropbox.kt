package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Dropbox: ImageVector
    get() {
        if (_Dropbox != null) return _Dropbox!!
        
        _Dropbox = ImageVector.Builder(
            name = "dropbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 528f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(264.4f, 116.3f)
                lineToRelative(-132f, 84.3f)
                lineToRelative(132f, 84.3f)
                lineToRelative(-132f, 84.3f)
                lineTo(0f, 284.1f)
                lineToRelative(132.3f, -84.3f)
                lineTo(0f, 116.3f)
                lineTo(132.3f, 32f)
                lineToRelative(132.1f, 84.3f)
                close()
                moveTo(131.6f, 395.7f)
                lineToRelative(132f, -84.3f)
                lineToRelative(132f, 84.3f)
                lineToRelative(-132f, 84.3f)
                lineToRelative(-132f, -84.3f)
                close()
                moveToRelative(132.8f, -111.6f)
                lineToRelative(132f, -84.3f)
                lineToRelative(-132f, -83.6f)
                lineTo(395.7f, 32f)
                lineTo(528f, 116.3f)
                lineToRelative(-132.3f, 84.3f)
                lineTo(528f, 284.8f)
                lineToRelative(-132.3f, 84.3f)
                lineToRelative(-131.3f, -85f)
                close()
            }
        }.build()
        
        return _Dropbox!!
    }

private var _Dropbox: ImageVector? = null

