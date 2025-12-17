package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Bluetooth_connected: ImageVector
    get() {
        if (_Bluetooth_connected != null) return _Bluetooth_connected!!
        
        _Bluetooth_connected = ImageVector.Builder(
            name = "bluetooth_connected",
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
                moveTo(7f, 12f)
                lineToRelative(-2f, -2f)
                lineToRelative(-2f, 2f)
                lineToRelative(2f, 2f)
                lineToRelative(2f, -2f)
                close()
                moveToRelative(10.71f, -4.29f)
                lineTo(12f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(7.59f)
                lineTo(6.41f, 5f)
                lineTo(5f, 6.41f)
                lineTo(10.59f, 12f)
                lineTo(5f, 17.59f)
                lineTo(6.41f, 19f)
                lineTo(11f, 14.41f)
                verticalLineTo(22f)
                horizontalLineToRelative(1f)
                lineToRelative(5.71f, -5.71f)
                lineToRelative(-4.3f, -4.29f)
                lineToRelative(4.3f, -4.29f)
                close()
                moveTo(13f, 5.83f)
                lineToRelative(1.88f, 1.88f)
                lineTo(13f, 9.59f)
                verticalLineTo(5.83f)
                close()
                moveToRelative(1.88f, 10.46f)
                lineTo(13f, 18.17f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                close()
                moveTo(19f, 10f)
                lineToRelative(-2f, 2f)
                lineToRelative(2f, 2f)
                lineToRelative(2f, -2f)
                lineToRelative(-2f, -2f)
                close()
            }
        }.build()
        
        return _Bluetooth_connected!!
    }

private var _Bluetooth_connected: ImageVector? = null

