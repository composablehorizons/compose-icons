package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.BlackTie: ImageVector
    get() {
        if (_BlackTie != null) return _BlackTie!!
        
        _BlackTie = ImageVector.Builder(
            name = "black-tie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 32f)
                verticalLineToRelative(448f)
                horizontalLineToRelative(448f)
                verticalLineTo(32f)
                horizontalLineTo(0f)
                close()
                moveToRelative(316.5f, 325.2f)
                lineTo(224f, 445.9f)
                lineToRelative(-92.5f, -88.7f)
                lineToRelative(64.5f, -184f)
                lineToRelative(-64.5f, -86.6f)
                horizontalLineToRelative(184.9f)
                lineTo(252f, 173.2f)
                lineToRelative(64.5f, 184f)
                close()
            }
        }.build()
        
        return _BlackTie!!
    }

private var _BlackTie: ImageVector? = null

