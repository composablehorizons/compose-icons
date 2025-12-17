package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Voice_over_off: ImageVector
    get() {
        if (_Voice_over_off != null) return _Voice_over_off!!
        
        _Voice_over_off = ImageVector.Builder(
            name = "voice_over_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.99f, 9.18f)
                curveToRelative(0f, -0.06f, 0.01f, -0.12f, 0.01f, -0.18f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-0.06f, 0f, -0.12f, 0.01f, -0.18f, 0.01f)
                lineToRelative(4.17f, 4.17f)
                close()
                moveToRelative(-6.1f, -3.56f)
                lineTo(4.27f, 3f)
                lineTo(3f, 4.27f)
                lineToRelative(2.62f, 2.62f)
                curveTo(5.23f, 7.5f, 5f, 8.22f, 5f, 9f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                curveToRelative(0.78f, 0f, 1.5f, -0.23f, 2.11f, -0.62f)
                lineTo(19.73f, 21f)
                lineTo(21f, 19.73f)
                lineToRelative(-8.62f, -8.62f)
                lineToRelative(-5.49f, -5.49f)
                close()
                moveTo(9f, 15f)
                curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.66f, -5.33f, -4f, -8f, -4f)
                close()
                moveToRelative(7.76f, -9.64f)
                lineToRelative(-1.68f, 1.69f)
                curveToRelative(0.84f, 1.18f, 0.84f, 2.71f, 0f, 3.89f)
                lineToRelative(1.68f, 1.69f)
                curveToRelative(2.02f, -2.02f, 2.02f, -5.07f, 0f, -7.27f)
                close()
                moveTo(20.07f, 2f)
                lineToRelative(-1.63f, 1.63f)
                curveToRelative(2.77f, 3.02f, 2.77f, 7.56f, 0f, 10.74f)
                lineTo(20.07f, 16f)
                curveToRelative(3.9f, -3.89f, 3.91f, -9.95f, 0f, -14f)
                close()
            }
        }.build()
        
        return _Voice_over_off!!
    }

private var _Voice_over_off: ImageVector? = null

