package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.ThinkPeaks: ImageVector
    get() {
        if (_ThinkPeaks != null) return _ThinkPeaks!!
        
        _ThinkPeaks = ImageVector.Builder(
            name = "think-peaks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(465.4f, 409.4f)
                lineToRelative(87.1f, -150.2f)
                lineToRelative(-32f, -0.3f)
                lineToRelative(-55.1f, 95f)
                lineTo(259.2f, 0f)
                lineTo(23f, 407.4f)
                lineToRelative(32f, 0.3f)
                lineTo(259.2f, 55.6f)
                close()
                moveToRelative(-355.3f, -44.1f)
                horizontalLineToRelative(32.1f)
                lineToRelative(117.4f, -202.5f)
                lineTo(463f, 511.9f)
                lineToRelative(32.5f, 0.1f)
                lineToRelative(-235.8f, -404.6f)
                close()
            }
        }.build()
        
        return _ThinkPeaks!!
    }

private var _ThinkPeaks: ImageVector? = null

