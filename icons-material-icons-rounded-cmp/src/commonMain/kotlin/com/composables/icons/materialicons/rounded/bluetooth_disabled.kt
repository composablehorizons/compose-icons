package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bluetooth_disabled: ImageVector
    get() {
        if (_Bluetooth_disabled != null) return _Bluetooth_disabled!!
        
        _Bluetooth_disabled = ImageVector.Builder(
            name = "bluetooth_disabled",
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
                moveTo(19.29f, 17.89f)
                lineTo(6.11f, 4.7f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineTo(10.59f, 12f)
                lineTo(5.7f, 16.89f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineTo(11f, 14.41f)
                verticalLineToRelative(6.18f)
                curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                lineToRelative(3.59f, -3.59f)
                lineToRelative(1.59f, 1.59f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.38f, -0.39f, 0.38f, -1.03f, -0.01f, -1.41f)
                close()
                moveToRelative(-6.29f, 0.28f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                lineTo(13f, 18.17f)
                close()
                moveToRelative(0f, -12.34f)
                lineToRelative(1.88f, 1.88f)
                lineToRelative(-1.47f, 1.47f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17f, 8.42f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.42f)
                lineToRelative(-4.29f, -4.29f)
                curveToRelative(-0.63f, -0.63f, -1.71f, -0.19f, -1.71f, 0.7f)
                verticalLineToRelative(3.36f)
                lineToRelative(2f, 2f)
                verticalLineTo(5.83f)
                close()
            }
        }.build()
        
        return _Bluetooth_disabled!!
    }

private var _Bluetooth_disabled: ImageVector? = null

