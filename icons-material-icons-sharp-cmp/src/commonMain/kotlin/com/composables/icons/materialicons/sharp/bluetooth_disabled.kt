package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bluetooth_disabled: ImageVector
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
                moveTo(13f, 5.83f)
                lineToRelative(1.88f, 1.88f)
                lineToRelative(-1.6f, 1.6f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.02f, -3.02f)
                lineTo(12f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.03f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(-3.2f)
                close()
                moveTo(5.41f, 4f)
                lineTo(4f, 5.41f)
                lineTo(10.59f, 12f)
                lineTo(5f, 17.59f)
                lineTo(6.41f, 19f)
                lineTo(11f, 14.41f)
                verticalLineTo(22f)
                horizontalLineToRelative(1f)
                lineToRelative(4.29f, -4.29f)
                lineToRelative(2.3f, 2.29f)
                lineTo(20f, 18.59f)
                lineTo(5.41f, 4f)
                close()
                moveTo(13f, 18.17f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                lineTo(13f, 18.17f)
                close()
            }
        }.build()
        
        return _Bluetooth_disabled!!
    }

private var _Bluetooth_disabled: ImageVector? = null

