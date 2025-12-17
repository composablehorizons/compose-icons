package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Rocket: ImageVector
    get() {
        if (_Rocket != null) return _Rocket!!
        
        _Rocket = ImageVector.Builder(
            name = "rocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(505.12018f, 19.09375f)
                curveToRelative(-1.18945f, -5.53125f, -6.65819f, -11f, -12.207f, -12.1875f)
                curveTo(460.716f, 0f, 435.507f, 0f, 410.40747f, 0f)
                curveTo(307.17523f, 0f, 245.26909f, 55.20312f, 199.05238f, 128f)
                horizontalLineTo(94.83772f)
                curveToRelative(-16.34763f, 0.01562f, -35.55658f, 11.875f, -42.88664f, 26.48438f)
                lineTo(2.51562f, 253.29688f)
                arcTo(28.4f, 28.4f, 0f, false, false, 0f, 264f)
                arcToRelative(24.00867f, 24.00867f, 0f, false, false, 24.00582f, 24f)
                horizontalLineTo(127.81618f)
                lineToRelative(-22.47457f, 22.46875f)
                curveToRelative(-11.36521f, 11.36133f, -12.99607f, 32.25781f, 0f, 45.25f)
                lineTo(156.24582f, 406.625f)
                curveToRelative(11.15623f, 11.1875f, 32.15619f, 13.15625f, 45.27726f, 0f)
                lineToRelative(22.47457f, -22.46875f)
                verticalLineTo(488f)
                arcToRelative(24.00867f, 24.00867f, 0f, false, false, 24.00581f, 24f)
                arcToRelative(28.55934f, 28.55934f, 0f, false, false, 10.707f, -2.51562f)
                lineToRelative(98.72834f, -49.39063f)
                curveToRelative(14.62888f, -7.29687f, 26.50776f, -26.5f, 26.50776f, -42.85937f)
                verticalLineTo(312.79688f)
                curveToRelative(72.59753f, -46.3125f, 128.03493f, -108.40626f, 128.03493f, -211.09377f)
                curveTo(512.07526f, 76.5f, 512.07526f, 51.29688f, 505.12018f, 19.09375f)
                close()
                moveTo(384.04034f, 168f)
                arcTo(40f, 40f, 0f, true, true, 424.05f, 128f)
                arcTo(40.02322f, 40.02322f, 0f, false, true, 384.04034f, 168f)
                close()
            }
        }.build()
        
        return _Rocket!!
    }

private var _Rocket: ImageVector? = null

