package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Unity: ImageVector
    get() {
        if (_Unity != null) return _Unity!!
        
        _Unity = ImageVector.Builder(
            name = "unity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(498.11f, 206.4f)
                lineTo(445.31f, 14.72f)
                lineTo(248.2f, 66.08f)
                lineTo(219f, 116.14f)
                lineToRelative(-59.2f, -0.43f)
                lineTo(15.54f, 256f)
                lineTo(159.82f, 396.32f)
                lineToRelative(59.17f, -0.43f)
                lineToRelative(29.24f, 50f)
                lineToRelative(197.08f, 51.36f)
                lineToRelative(52.8f, -191.62f)
                lineToRelative(-30f, -49.63f)
                close()
                moveTo(223.77f, 124.2f)
                lineTo(374.55f, 86.51f)
                lineTo(288f, 232.33f)
                horizontalLineTo(114.87f)
                close()
                moveToRelative(0f, 263.63f)
                lineTo(114.87f, 279.71f)
                horizontalLineTo(288f)
                lineToRelative(86.55f, 145.81f)
                close()
                moveToRelative(193f, 14f)
                lineTo(330.17f, 256f)
                lineToRelative(86.58f, -145.84f)
                lineTo(458.56f, 256f)
                close()
            }
        }.build()
        
        return _Unity!!
    }

private var _Unity: ImageVector? = null

