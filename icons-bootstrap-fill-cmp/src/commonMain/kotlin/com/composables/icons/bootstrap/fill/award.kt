package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Award: ImageVector
    get() {
        if (_Award != null) return _Award!!
        
        _Award = ImageVector.Builder(
            name = "award",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                lineToRelative(1.669f, 0.864f)
                lineToRelative(1.858f, 0.282f)
                lineToRelative(0.842f, 1.68f)
                lineToRelative(1.337f, 1.32f)
                lineTo(13.4f, 6f)
                lineToRelative(0.306f, 1.854f)
                lineToRelative(-1.337f, 1.32f)
                lineToRelative(-0.842f, 1.68f)
                lineToRelative(-1.858f, 0.282f)
                lineTo(8f, 12f)
                lineToRelative(-1.669f, -0.864f)
                lineToRelative(-1.858f, -0.282f)
                lineToRelative(-0.842f, -1.68f)
                lineToRelative(-1.337f, -1.32f)
                lineTo(2.6f, 6f)
                lineToRelative(-0.306f, -1.854f)
                lineToRelative(1.337f, -1.32f)
                lineToRelative(0.842f, -1.68f)
                lineTo(6.331f, 0.864f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 11.794f)
                verticalLineTo(16f)
                lineToRelative(4f, -1f)
                lineToRelative(4f, 1f)
                verticalLineToRelative(-4.206f)
                lineToRelative(-2.018f, 0.306f)
                lineTo(8f, 13.126f)
                lineTo(6.018f, 12.1f)
                close()
            }
        }.build()
        
        return _Award!!
    }

private var _Award: ImageVector? = null

