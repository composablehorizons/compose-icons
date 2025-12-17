package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowRight: ImageVector
    get() {
        if (_ArrowRight != null) return _ArrowRight!!
        
        _ArrowRight = ImageVector.Builder(
            name = "arrow-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(190.5f, 66.9f)
                lineToRelative(22.2f, -22.2f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineTo(441f, 239f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0f, 33.9f)
                lineTo(246.6f, 467.3f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0f)
                lineToRelative(-22.2f, -22.2f)
                curveToRelative(-9.5f, -9.5f, -9.3f, -25f, 0.4f, -34.3f)
                lineTo(311.4f, 296f)
                horizontalLineTo(24f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -13.3f, 10.7f, -24f, 24f, -24f)
                horizontalLineToRelative(287.4f)
                lineTo(190.9f, 101.2f)
                curveToRelative(-9.8f, -9.3f, -10f, -24.8f, -0.4f, -34.3f)
                close()
            }
        }.build()
        
        return _ArrowRight!!
    }

private var _ArrowRight: ImageVector? = null

