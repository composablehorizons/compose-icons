package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandYoutube: ImageVector
    get() {
        if (_BrandYoutube != null) return _BrandYoutube!!
        
        _BrandYoutube = ImageVector.Builder(
            name = "brand-youtube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 3f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                verticalLineToRelative(8f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
                horizontalLineToRelative(-12f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                verticalLineToRelative(-8f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, -5f)
                close()
                moveToRelative(-9f, 6f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1.514f, 0.857f)
                lineToRelative(5f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.714f)
                lineToRelative(-5f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, -1.514f, 0.857f)
                close()
            }
        }.build()
        
        return _BrandYoutube!!
    }

private var _BrandYoutube: ImageVector? = null

