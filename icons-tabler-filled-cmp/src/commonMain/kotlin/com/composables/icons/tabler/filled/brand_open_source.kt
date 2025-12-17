package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandOpenSource: ImageVector
    get() {
        if (_BrandOpenSource != null) return _BrandOpenSource!!
        
        _BrandOpenSource = ImageVector.Builder(
            name = "brand-open-source",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.283f, 2.004f)
                arcToRelative(10f, 10f, 0f, false, true, 3.736f, 19.155f)
                arcToRelative(1f, 1f, 0f, false, true, -1.332f, -0.551f)
                lineToRelative(-2.193f, -5.602f)
                arcToRelative(1f, 1f, 0f, false, true, 0.456f, -1.245f)
                arcToRelative(2f, 2f, 0f, true, false, -1.9f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0.457f, 1.244f)
                lineToRelative(-2.193f, 5.603f)
                arcToRelative(1f, 1f, 0f, false, true, -1.332f, 0.552f)
                arcToRelative(10f, 10f, 0f, false, true, 4.018f, -19.16f)
                close()
            }
        }.build()
        
        return _BrandOpenSource!!
    }

private var _BrandOpenSource: ImageVector? = null

