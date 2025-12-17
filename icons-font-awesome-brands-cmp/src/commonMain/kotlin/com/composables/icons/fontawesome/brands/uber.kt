package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Uber: ImageVector
    get() {
        if (_Uber != null) return _Uber!!
        
        _Uber = ImageVector.Builder(
            name = "uber",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(414.1f, 32f)
                horizontalLineTo(33.9f)
                curveTo(15.2f, 32f, 0f, 47.2f, 0f, 65.9f)
                verticalLineTo(446f)
                curveToRelative(0f, 18.8f, 15.2f, 34f, 33.9f, 34f)
                horizontalLineTo(414f)
                curveToRelative(18.7f, 0f, 33.9f, -15.2f, 33.9f, -33.9f)
                verticalLineTo(65.9f)
                curveTo(448f, 47.2f, 432.8f, 32f, 414.1f, 32f)
                close()
                moveTo(237.6f, 391.1f)
                curveTo(163f, 398.6f, 96.4f, 344.2f, 88.9f, 269.6f)
                horizontalLineToRelative(94.4f)
                verticalLineTo(290f)
                curveToRelative(0f, 3.7f, 3f, 6.8f, 6.8f, 6.8f)
                horizontalLineTo(258f)
                curveToRelative(3.7f, 0f, 6.8f, -3f, 6.8f, -6.8f)
                verticalLineToRelative(-67.9f)
                curveToRelative(0f, -3.7f, -3f, -6.8f, -6.8f, -6.8f)
                horizontalLineToRelative(-67.9f)
                curveToRelative(-3.7f, 0f, -6.8f, 3f, -6.8f, 6.8f)
                verticalLineToRelative(20.4f)
                horizontalLineTo(88.9f)
                curveToRelative(7f, -69.4f, 65.4f, -122.2f, 135.1f, -122.2f)
                curveToRelative(69.7f, 0f, 128.1f, 52.8f, 135.1f, 122.2f)
                curveToRelative(7.5f, 74.5f, -46.9f, 141.1f, -121.5f, 148.6f)
                close()
            }
        }.build()
        
        return _Uber!!
    }

private var _Uber: ImageVector? = null

