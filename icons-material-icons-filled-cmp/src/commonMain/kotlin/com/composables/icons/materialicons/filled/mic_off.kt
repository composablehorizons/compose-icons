package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mic_off: ImageVector
    get() {
        if (_Mic_off != null) return _Mic_off!!
        
        _Mic_off = ImageVector.Builder(
            name = "mic_off",
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
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 11f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(0f, 0.74f, -0.16f, 1.43f, -0.43f, 2.05f)
                lineToRelative(1.23f, 1.23f)
                curveToRelative(0.56f, -0.98f, 0.9f, -2.09f, 0.9f, -3.28f)
                close()
                moveToRelative(-4.02f, 0.17f)
                curveToRelative(0f, -0.06f, 0.02f, -0.11f, 0.02f, -0.17f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveTo(9f, 3.34f, 9f, 5f)
                verticalLineToRelative(0.18f)
                lineToRelative(5.98f, 5.99f)
                close()
                moveTo(4.27f, 3f)
                lineTo(3f, 4.27f)
                lineToRelative(6.01f, 6.01f)
                verticalLineTo(11f)
                curveToRelative(0f, 1.66f, 1.33f, 3f, 2.99f, 3f)
                curveToRelative(0.22f, 0f, 0.44f, -0.03f, 0.65f, -0.08f)
                lineToRelative(1.66f, 1.66f)
                curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f)
                curveToRelative(-2.76f, 0f, -5.3f, -2.1f, -5.3f, -5.1f)
                horizontalLineTo(5f)
                curveToRelative(0f, 3.41f, 2.72f, 6.23f, 6f, 6.72f)
                verticalLineTo(21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.28f)
                curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.54f, -0.9f)
                lineTo(19.73f, 21f)
                lineTo(21f, 19.73f)
                lineTo(4.27f, 3f)
                close()
            }
        }.build()
        
        return _Mic_off!!
    }

private var _Mic_off: ImageVector? = null

