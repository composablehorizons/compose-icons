package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Superpowers: ImageVector
    get() {
        if (_Superpowers != null) return _Superpowers!!
        
        _Superpowers = ImageVector.Builder(
            name = "superpowers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 32f)
                curveToRelative(-83.3f, 11f, -166.8f, 22f, -250f, 33f)
                curveToRelative(-92f, 12.5f, -163.3f, 86.7f, -169f, 180f)
                curveToRelative(-3.3f, 55.5f, 18f, 109.5f, 57.8f, 148.2f)
                lineTo(0f, 480f)
                curveToRelative(83.3f, -11f, 166.5f, -22f, 249.8f, -33f)
                curveToRelative(91.8f, -12.5f, 163.3f, -86.8f, 168.7f, -179.8f)
                curveToRelative(3.5f, -55.5f, -18f, -109.5f, -57.7f, -148.2f)
                lineTo(448f, 32f)
                close()
                moveToRelative(-79.7f, 232.3f)
                curveToRelative(-4.2f, 79.5f, -74f, 139.2f, -152.8f, 134.5f)
                curveToRelative(-79.5f, -4.7f, -140.7f, -71f, -136.3f, -151f)
                curveToRelative(4.5f, -79.2f, 74.3f, -139.3f, 153f, -134.5f)
                curveToRelative(79.3f, 4.7f, 140.5f, 71f, 136.1f, 151f)
                close()
            }
        }.build()
        
        return _Superpowers!!
    }

private var _Superpowers: ImageVector? = null

