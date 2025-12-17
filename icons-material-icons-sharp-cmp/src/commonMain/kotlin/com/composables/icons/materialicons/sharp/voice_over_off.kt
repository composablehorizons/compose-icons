package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Voice_over_off: ImageVector
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
                moveTo(16.76f, 5.36f)
                lineToRelative(-1.68f, 1.69f)
                curveToRelative(0.8f, 1.13f, 0.83f, 2.58f, 0.09f, 3.74f)
                lineToRelative(1.7f, 1.7f)
                curveToRelative(1.9f, -2.02f, 1.87f, -4.98f, -0.11f, -7.13f)
                close()
                moveTo(20.07f, 2f)
                lineToRelative(-1.63f, 1.63f)
                curveToRelative(2.72f, 2.97f, 2.76f, 7.39f, 0.14f, 10.56f)
                lineToRelative(1.64f, 1.64f)
                curveToRelative(3.74f, -3.89f, 3.71f, -9.84f, -0.15f, -13.83f)
                close()
                moveTo(9.43f, 5.04f)
                lineToRelative(3.53f, 3.53f)
                curveToRelative(-0.2f, -1.86f, -1.67f, -3.33f, -3.53f, -3.53f)
                close()
                moveTo(4.41f, 2.86f)
                lineTo(3f, 4.27f)
                lineToRelative(2.62f, 2.62f)
                curveTo(5.23f, 7.5f, 5f, 8.22f, 5f, 9f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                curveToRelative(0.78f, 0f, 1.5f, -0.23f, 2.11f, -0.62f)
                lineToRelative(4.4f, 4.4f)
                curveTo(13.74f, 15.6f, 10.78f, 15f, 9f, 15f)
                curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.37f, -0.11f, -0.7f, -0.29f, -1.02f)
                lineTo(19.73f, 21f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.41f, 2.86f)
                close()
            }
        }.build()
        
        return _Voice_over_off!!
    }

private var _Voice_over_off: ImageVector? = null

