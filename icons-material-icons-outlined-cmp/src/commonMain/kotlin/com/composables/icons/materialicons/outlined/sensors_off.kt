package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sensors_off: ImageVector
    get() {
        if (_Sensors_off != null) return _Sensors_off!!
        
        _Sensors_off = ImageVector.Builder(
            name = "sensors_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.14f, 10.96f)
                curveTo(8.05f, 11.29f, 8f, 11.64f, 8f, 12f)
                curveToRelative(0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(6.67f, 15.16f, 6f, 13.66f, 6f, 12f)
                curveToRelative(0f, -0.93f, 0.21f, -1.8f, 0.58f, -2.59f)
                lineTo(5.11f, 7.94f)
                curveTo(4.4f, 9.13f, 4f, 10.52f, 4f, 12f)
                curveToRelative(0f, 2.21f, 0.9f, 4.21f, 2.35f, 5.65f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(3.12f, 17.26f, 2f, 14.76f, 2f, 12f)
                curveToRelative(0f, -2.04f, 0.61f, -3.93f, 1.66f, -5.51f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(8.14f, 10.96f)
                close()
                moveTo(17.42f, 14.59f)
                curveTo(17.79f, 13.8f, 18f, 12.93f, 18f, 12f)
                curveToRelative(0f, -1.66f, -0.67f, -3.16f, -1.76f, -4.24f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(15.55f, 9.9f, 16f, 10.9f, 16f, 12f)
                curveToRelative(0f, 0.36f, -0.05f, 0.71f, -0.14f, 1.04f)
                lineTo(17.42f, 14.59f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 1.48f, -0.4f, 2.87f, -1.11f, 4.06f)
                lineToRelative(1.45f, 1.45f)
                curveTo(21.39f, 15.93f, 22f, 14.04f, 22f, 12f)
                curveToRelative(0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(19.1f, 7.79f, 20f, 9.79f, 20f, 12f)
                close()
            }
        }.build()
        
        return _Sensors_off!!
    }

private var _Sensors_off: ImageVector? = null

