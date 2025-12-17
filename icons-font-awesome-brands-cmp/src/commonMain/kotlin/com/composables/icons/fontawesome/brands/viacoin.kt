package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Viacoin: ImageVector
    get() {
        if (_Viacoin != null) return _Viacoin!!
        
        _Viacoin = ImageVector.Builder(
            name = "viacoin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 32f)
                horizontalLineToRelative(-64f)
                lineToRelative(-80.7f, 192f)
                horizontalLineToRelative(-94.5f)
                lineTo(64f, 32f)
                horizontalLineTo(0f)
                lineToRelative(48f, 112f)
                horizontalLineTo(0f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(68.5f)
                lineToRelative(13.8f, 32f)
                horizontalLineTo(0f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(102.8f)
                lineTo(192f, 480f)
                lineToRelative(89.2f, -208f)
                horizontalLineTo(384f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(-82.3f)
                lineToRelative(13.8f, -32f)
                horizontalLineTo(384f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(-48f)
                lineToRelative(48f, -112f)
                close()
                moveTo(192f, 336f)
                lineToRelative(-27f, -64f)
                horizontalLineToRelative(54f)
                lineToRelative(-27f, 64f)
                close()
            }
        }.build()
        
        return _Viacoin!!
    }

private var _Viacoin: ImageVector? = null

