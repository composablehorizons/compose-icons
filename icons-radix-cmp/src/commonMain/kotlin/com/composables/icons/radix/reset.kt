package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Reset: ImageVector
    get() {
        if (_Reset != null) return _Reset!!
        
        _Reset = ImageVector.Builder(
            name = "reset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.22457f, 2.08224f)
                curveTo(4.41865f, 1.95407f, 4.68261f, 1.97583f, 4.85348f, 2.14669f)
                curveTo(5.02434f, 2.31756f, 5.0461f, 2.58152f, 4.91793f, 2.7756f)
                lineTo(4.85348f, 2.85372f)
                lineTo(3.70699f, 4.00021f)
                horizontalLineTo(8.99996f)
                curveTo(11.4852f, 4.00021f, 13.5f, 6.01493f, 13.5f, 8.50021f)
                curveTo(13.5f, 10.9855f, 11.4852f, 13.0002f, 8.99996f, 13.0002f)
                horizontalLineTo(4.99996f)
                curveTo(4.72382f, 13.0002f, 4.49996f, 12.7764f, 4.49996f, 12.5002f)
                curveTo(4.49996f, 12.2241f, 4.72382f, 12.0002f, 4.99996f, 12.0002f)
                horizontalLineTo(8.99996f)
                curveTo(10.933f, 12.0002f, 12.5f, 10.4332f, 12.5f, 8.50021f)
                curveTo(12.5f, 6.56721f, 10.933f, 5.00021f, 8.99996f, 5.00021f)
                horizontalLineTo(3.70699f)
                lineTo(4.85348f, 6.14669f)
                lineTo(4.91793f, 6.22482f)
                curveTo(5.0461f, 6.4189f, 5.02434f, 6.68286f, 4.85348f, 6.85372f)
                curveTo(4.68261f, 7.02459f, 4.41865f, 7.04634f, 4.22457f, 6.91818f)
                lineTo(4.14645f, 6.85372f)
                lineTo(2.14645f, 4.85372f)
                curveTo(1.95118f, 4.65846f, 1.95118f, 4.34195f, 2.14645f, 4.14669f)
                lineTo(4.14645f, 2.14669f)
                lineTo(4.22457f, 2.08224f)
                close()
            }
        }.build()
        
        return _Reset!!
    }

private var _Reset: ImageVector? = null

