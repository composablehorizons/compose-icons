package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Dyalog: ImageVector
    get() {
        if (_Dyalog != null) return _Dyalog!!
        
        _Dyalog = ImageVector.Builder(
            name = "dyalog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 416f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                verticalLineToRelative(119.2f)
                horizontalLineToRelative(64f)
                verticalLineTo(96f)
                horizontalLineToRelative(107.2f)
                curveTo(284.6f, 96f, 352f, 176.2f, 352f, 255.9f)
                curveTo(352f, 332f, 293.4f, 416f, 171.2f, 416f)
                horizontalLineTo(0f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(171.2f)
                curveTo(331.9f, 480f, 416f, 367.3f, 416f, 255.9f)
                curveToRelative(0f, -58.7f, -22.1f, -113.4f, -62.3f, -154.3f)
                curveTo(308.9f, 56f, 245.7f, 32f, 171.2f, 32f)
                horizontalLineTo(0f)
                close()
            }
        }.build()
        
        return _Dyalog!!
    }

private var _Dyalog: ImageVector? = null

