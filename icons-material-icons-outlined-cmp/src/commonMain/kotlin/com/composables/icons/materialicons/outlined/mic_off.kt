package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Mic_off: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.8f, 4.9f)
                curveToRelative(0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f)
                reflectiveCurveToRelative(1.2f, 0.54f, 1.2f, 1.2f)
                lineToRelative(-0.01f, 3.91f)
                lineTo(15f, 10.6f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                curveToRelative(-1.54f, 0f, -2.79f, 1.16f, -2.96f, 2.65f)
                lineToRelative(1.76f, 1.76f)
                verticalLineTo(4.9f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(0f, 0.58f, -0.1f, 1.13f, -0.27f, 1.64f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(0.44f, -0.88f, 0.7f, -1.87f, 0.7f, -2.91f)
                close()
                moveTo(4.41f, 2.86f)
                lineTo(3f, 4.27f)
                lineToRelative(6f, 6f)
                verticalLineTo(11f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                curveToRelative(0.23f, 0f, 0.44f, -0.03f, 0.65f, -0.08f)
                lineToRelative(1.66f, 1.66f)
                curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f)
                curveToRelative(-2.76f, 0f, -5.3f, -2.1f, -5.3f, -5.1f)
                horizontalLineTo(5f)
                curveToRelative(0f, 3.41f, 2.72f, 6.23f, 6f, 6.72f)
                verticalLineTo(21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.28f)
                curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.55f, -0.9f)
                lineToRelative(4.2f, 4.2f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.41f, 2.86f)
                close()
            }
        }.build()
        
        return _Mic_off!!
    }

private var _Mic_off: ImageVector? = null

