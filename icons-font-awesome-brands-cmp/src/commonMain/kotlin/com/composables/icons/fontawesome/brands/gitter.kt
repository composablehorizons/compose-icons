package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Gitter: ImageVector
    get() {
        if (_Gitter != null) return _Gitter!!
        
        _Gitter = ImageVector.Builder(
            name = "gitter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(66.4f, 322.5f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineToRelative(50.4f)
                verticalLineToRelative(322.5f)
                close()
                moveTo(166.9f, 76.1f)
                horizontalLineToRelative(-50.4f)
                verticalLineTo(512f)
                horizontalLineToRelative(50.4f)
                verticalLineTo(76.1f)
                close()
                moveToRelative(100.6f, 0f)
                horizontalLineToRelative(-50.4f)
                verticalLineTo(512f)
                horizontalLineToRelative(50.4f)
                verticalLineTo(76.1f)
                close()
                moveTo(368f, 76f)
                horizontalLineToRelative(-50.4f)
                verticalLineToRelative(247f)
                horizontalLineTo(368f)
                verticalLineTo(76f)
                close()
            }
        }.build()
        
        return _Gitter!!
    }

private var _Gitter: ImageVector? = null

