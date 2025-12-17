package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Windows: ImageVector
    get() {
        if (_Windows != null) return _Windows!!
        
        _Windows = ImageVector.Builder(
            name = "windows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 93.7f)
                lineToRelative(183.6f, -25.3f)
                verticalLineToRelative(177.4f)
                horizontalLineTo(0f)
                verticalLineTo(93.7f)
                close()
                moveToRelative(0f, 324.6f)
                lineToRelative(183.6f, 25.3f)
                verticalLineTo(268.4f)
                horizontalLineTo(0f)
                verticalLineToRelative(149.9f)
                close()
                moveToRelative(203.8f, 28f)
                lineTo(448f, 480f)
                verticalLineTo(268.4f)
                horizontalLineTo(203.8f)
                verticalLineToRelative(177.9f)
                close()
                moveToRelative(0f, -380.6f)
                verticalLineToRelative(180.1f)
                horizontalLineTo(448f)
                verticalLineTo(32f)
                lineTo(203.8f, 65.7f)
                close()
            }
        }.build()
        
        return _Windows!!
    }

private var _Windows: ImageVector? = null

