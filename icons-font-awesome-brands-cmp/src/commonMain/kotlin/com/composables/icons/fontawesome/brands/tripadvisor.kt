package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Tripadvisor: ImageVector
    get() {
        if (_Tripadvisor != null) return _Tripadvisor!!
        
        _Tripadvisor = ImageVector.Builder(
            name = "tripadvisor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528.91f, 178.82f)
                lineTo(576f, 127.58f)
                horizontalLineTo(471.66f)
                arcToRelative(326.11f, 326.11f, 0f, false, false, -367f, 0f)
                horizontalLineTo(0f)
                lineToRelative(47.09f, 51.24f)
                arcTo(143.911f, 143.911f, 0f, false, false, 241.86f, 390.73f)
                lineTo(288f, 440.93f)
                lineToRelative(46.11f, -50.17f)
                arcTo(143.94f, 143.94f, 0f, false, false, 575.88f, 285.18f)
                horizontalLineToRelative(-0.03f)
                arcTo(143.56f, 143.56f, 0f, false, false, 528.91f, 178.82f)
                close()
                moveTo(144.06f, 382.57f)
                arcToRelative(97.39f, 97.39f, 0f, true, true, 97.39f, -97.39f)
                arcTo(97.39f, 97.39f, 0f, false, true, 144.06f, 382.57f)
                close()
                moveTo(288f, 282.37f)
                curveToRelative(0f, -64.09f, -46.62f, -119.08f, -108.09f, -142.59f)
                arcToRelative(281f, 281f, 0f, false, true, 216.17f, 0f)
                curveTo(334.61f, 163.3f, 288f, 218.29f, 288f, 282.37f)
                close()
                moveToRelative(143.88f, 100.2f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(97.405f, 97.405f, 0f, true, true, 0.01f, 0f)
                close()
                moveTo(144.06f, 234.12f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(51.06f, 51.06f, 0f, true, false, 51.06f, 51.06f)
                verticalLineToRelative(-0.11f)
                arcTo(51f, 51f, 0f, false, false, 144.06f, 234.12f)
                close()
                moveToRelative(287.82f, 0f)
                arcToRelative(51.06f, 51.06f, 0f, true, false, 51.06f, 51.06f)
                arcTo(51.06f, 51.06f, 0f, false, false, 431.88f, 234.12f)
                close()
            }
        }.build()
        
        return _Tripadvisor!!
    }

private var _Tripadvisor: ImageVector? = null

