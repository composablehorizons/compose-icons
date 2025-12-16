package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Ruby: ImageVector
    get() {
        if (_Ruby != null) return _Ruby!!
        
        _Ruby = ImageVector.Builder(
            name = "ruby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 2f)
                curveTo(3.31062f, 2f, 3.13749f, 2.107f, 3.05279f, 2.27639f)
                lineTo(1.05279f, 6.27639f)
                curveTo(0.96496f, 6.45206f, 0.988101f, 6.66287f, 1.11195f, 6.8153f)
                lineTo(7.61195f, 14.8153f)
                curveTo(7.70689f, 14.9322f, 7.84944f, 15f, 8f, 15f)
                curveTo(8.15057f, 15f, 8.29312f, 14.9322f, 8.38806f, 14.8153f)
                lineTo(14.8881f, 6.8153f)
                curveTo(15.0119f, 6.66287f, 15.035f, 6.45206f, 14.9472f, 6.27639f)
                lineTo(12.9472f, 2.27639f)
                curveTo(12.8625f, 2.107f, 12.6894f, 2f, 12.5f, 2f)
                horizontalLineTo(3.5f)
                close()
                moveTo(2.30902f, 6f)
                lineTo(3.80902f, 3f)
                horizontalLineTo(5.85972f)
                lineTo(5.10972f, 6f)
                horizontalLineTo(2.30902f)
                close()
                moveTo(2.55049f, 7f)
                horizontalLineTo(5.13251f)
                lineTo(6.74627f, 12.164f)
                lineTo(2.55049f, 7f)
                close()
                moveTo(6.1802f, 7f)
                horizontalLineTo(9.81985f)
                lineTo(8.00002f, 12.8234f)
                lineTo(6.1802f, 7f)
                close()
                moveTo(10.8675f, 7f)
                horizontalLineTo(13.4495f)
                lineTo(9.25381f, 12.164f)
                lineTo(10.8675f, 7f)
                close()
                moveTo(13.691f, 6f)
                horizontalLineTo(10.8903f)
                lineTo(10.1403f, 3f)
                horizontalLineTo(12.191f)
                lineTo(13.691f, 6f)
                close()
                moveTo(9.85956f, 6f)
                horizontalLineTo(6.14049f)
                lineTo(6.89049f, 3f)
                horizontalLineTo(9.10956f)
                lineTo(9.85956f, 6f)
                close()
            }
        }.build()
        
        return _Ruby!!
    }

private var _Ruby: ImageVector? = null

