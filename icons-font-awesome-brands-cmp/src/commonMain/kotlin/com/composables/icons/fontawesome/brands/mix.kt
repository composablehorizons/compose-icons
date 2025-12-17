package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Mix: ImageVector
    get() {
        if (_Mix != null) return _Mix!!
        
        _Mix = ImageVector.Builder(
            name = "mix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 64f)
                verticalLineToRelative(348.9f)
                curveToRelative(0f, 56.2f, 88f, 58.1f, 88f, 0f)
                verticalLineTo(174.3f)
                curveToRelative(7.9f, -52.9f, 88f, -50.4f, 88f, 6.5f)
                verticalLineToRelative(175.3f)
                curveToRelative(0f, 57.9f, 96f, 58f, 96f, 0f)
                verticalLineTo(240f)
                curveToRelative(5.3f, -54.7f, 88f, -52.5f, 88f, 4.3f)
                verticalLineToRelative(23.8f)
                curveToRelative(0f, 59.9f, 88f, 56.6f, 88f, 0f)
                verticalLineTo(64f)
                horizontalLineTo(0f)
                close()
            }
        }.build()
        
        return _Mix!!
    }

private var _Mix: ImageVector? = null

