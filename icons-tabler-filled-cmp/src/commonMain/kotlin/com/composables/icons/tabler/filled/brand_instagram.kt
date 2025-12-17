package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandInstagram: ImageVector
    get() {
        if (_BrandInstagram != null) return _BrandInstagram!!
        
        _BrandInstagram = ImageVector.Builder(
            name = "brand-instagram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 3f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                verticalLineToRelative(8f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineToRelative(-8f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                verticalLineToRelative(-8f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, -5f)
                close()
                moveToRelative(-4f, 5f)
                arcToRelative(4f, 4f, 0f, false, false, -3.995f, 3.8f)
                lineToRelative(-0.005f, 0.2f)
                arcToRelative(4f, 4f, 0f, true, false, 4f, -4f)
                moveToRelative(4.5f, -1.5f)
                arcToRelative(1f, 1f, 0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.127f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, 0.117f)
                lineToRelative(0.007f, -0.127f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
        }.build()
        
        return _BrandInstagram!!
    }

private var _BrandInstagram: ImageVector? = null

