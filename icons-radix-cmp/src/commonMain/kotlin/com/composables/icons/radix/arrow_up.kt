package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ArrowUp: ImageVector
    get() {
        if (_ArrowUp != null) return _ArrowUp!!
        
        _ArrowUp = ImageVector.Builder(
            name = "arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.22457f, 2.08224f)
                curveTo(7.41865f, 1.95407f, 7.68261f, 1.97583f, 7.85348f, 2.14669f)
                lineTo(11.8535f, 6.14669f)
                lineTo(11.9179f, 6.22482f)
                curveTo(12.0461f, 6.4189f, 12.0243f, 6.68286f, 11.8535f, 6.85372f)
                curveTo(11.6826f, 7.02459f, 11.4187f, 7.04634f, 11.2246f, 6.91818f)
                lineTo(11.1464f, 6.85372f)
                lineTo(7.99996f, 3.70724f)
                verticalLineTo(12.5002f)
                curveTo(7.99996f, 12.7763f, 7.7761f, 13.0002f, 7.49996f, 13.0002f)
                curveTo(7.22382f, 13.0002f, 6.99996f, 12.7763f, 6.99996f, 12.5002f)
                verticalLineTo(3.70724f)
                lineTo(3.85348f, 6.85372f)
                curveTo(3.65822f, 7.04899f, 3.34171f, 7.04899f, 3.14645f, 6.85372f)
                curveTo(2.95118f, 6.65846f, 2.95118f, 6.34195f, 3.14645f, 6.14669f)
                lineTo(7.14645f, 2.14669f)
                lineTo(7.22457f, 2.08224f)
                close()
            }
        }.build()
        
        return _ArrowUp!!
    }

private var _ArrowUp: ImageVector? = null

