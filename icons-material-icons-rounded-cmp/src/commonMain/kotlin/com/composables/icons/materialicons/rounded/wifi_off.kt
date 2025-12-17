package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wifi_off: ImageVector
    get() {
        if (_Wifi_off != null) return _Wifi_off!!
        
        _Wifi_off = ImageVector.Builder(
            name = "wifi_off",
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
                moveTo(20.06f, 10.14f)
                curveToRelative(0.56f, 0.46f, 1.38f, 0.42f, 1.89f, -0.09f)
                curveToRelative(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f)
                curveToRelative(-3.59f, -2.94f, -8.2f, -4.03f, -12.55f, -3.26f)
                lineToRelative(2.59f, 2.59f)
                curveToRelative(2.89f, -0.03f, 5.8f, 0.92f, 8.17f, 2.86f)
                close()
                moveToRelative(-2.27f, 1.83f)
                curveToRelative(-0.78f, -0.57f, -1.63f, -1f, -2.52f, -1.3f)
                lineToRelative(2.95f, 2.95f)
                curveToRelative(0.24f, -0.58f, 0.1f, -1.27f, -0.43f, -1.65f)
                close()
                moveToRelative(-3.84f, 4.26f)
                curveToRelative(-1.22f, -0.63f, -2.68f, -0.63f, -3.91f, 0f)
                curveToRelative(-0.59f, 0.31f, -0.7f, 1.12f, -0.23f, 1.59f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(1.47f, -1.47f)
                curveToRelative(0.49f, -0.47f, 0.39f, -1.28f, -0.21f, -1.59f)
                close()
                moveToRelative(5.73f, 1.67f)
                lineTo(4.12f, 2.34f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineTo(5.05f, 6.1f)
                curveToRelative(-1.01f, 0.5f, -1.99f, 1.11f, -2.89f, 1.85f)
                curveToRelative(-0.65f, 0.53f, -0.69f, 1.51f, -0.1f, 2.1f)
                curveToRelative(0.51f, 0.51f, 1.32f, 0.56f, 1.87f, 0.1f)
                curveToRelative(1f, -0.82f, 2.1f, -1.46f, 3.25f, -1.93f)
                lineToRelative(2.23f, 2.23f)
                curveToRelative(-1.13f, 0.3f, -2.21f, 0.8f, -3.19f, 1.51f)
                curveToRelative(-0.69f, 0.5f, -0.73f, 1.51f, -0.13f, 2.11f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.49f, 0.49f, 1.26f, 0.54f, 1.83f, 0.13f)
                curveToRelative(1.19f, -0.84f, 2.58f, -1.26f, 3.97f, -1.29f)
                lineToRelative(6.37f, 6.37f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.37f, 0.39f, -1f, 0f, -1.39f)
                close()
            }
        }.build()
        
        return _Wifi_off!!
    }

private var _Wifi_off: ImageVector? = null

