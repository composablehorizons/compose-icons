package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandVercel: ImageVector
    get() {
        if (_BrandVercel != null) return _BrandVercel!!
        
        _BrandVercel = ImageVector.Builder(
            name = "brand-vercel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.143f, 3.486f)
                arcToRelative(1f, 1f, 0f, false, true, 1.714f, 0f)
                lineToRelative(9f, 15f)
                arcToRelative(1f, 1f, 0f, false, true, -0.857f, 1.514f)
                horizontalLineToRelative(-18f)
                arcToRelative(1f, 1f, 0f, false, true, -0.857f, -1.514f)
                close()
            }
        }.build()
        
        return _BrandVercel!!
    }

private var _BrandVercel: ImageVector? = null

