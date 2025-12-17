package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bluetooth_connected: ImageVector
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
                moveTo(6f, 13f)
                curveToRelative(0.55f, -0.55f, 0.55f, -1.44f, 0f, -1.99f)
                verticalLineTo(11f)
                curveToRelative(-0.55f, -0.55f, -1.45f, -0.55f, -2f, 0f)
                reflectiveCurveToRelative(-0.55f, 1.45f, 0f, 2f)
                reflectiveCurveToRelative(1.45f, 0.55f, 2f, 0f)
                close()
                moveToRelative(14f, -2f)
                curveToRelative(-0.56f, -0.56f, -1.45f, -0.56f, -2f, -0.01f)
                verticalLineTo(11f)
                curveToRelative(-0.55f, 0.55f, -0.55f, 1.44f, 0f, 1.99f)
                verticalLineTo(13f)
                curveToRelative(0.55f, 0.55f, 1.44f, 0.55f, 1.99f, 0f)
                horizontalLineTo(20f)
                curveToRelative(0.55f, -0.55f, 0.55f, -1.45f, 0f, -2f)
                close()
                moveToRelative(-3f, -4f)
                lineToRelative(-4.29f, -4.29f)
                curveToRelative(-0.63f, -0.63f, -1.71f, -0.19f, -1.71f, 0.7f)
                verticalLineToRelative(6.18f)
                lineTo(7.11f, 5.7f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineTo(10.59f, 12f)
                lineTo(5.7f, 16.89f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineTo(11f, 14.41f)
                verticalLineToRelative(6.18f)
                curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                lineTo(17f, 17f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.42f)
                lineTo(13.41f, 12f)
                lineTo(17f, 8.42f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0f, -1.42f)
                close()
                moveToRelative(-2.12f, 9.29f)
                lineTo(13f, 18.17f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                close()
                moveTo(13f, 9.59f)
                verticalLineTo(5.83f)
                lineToRelative(1.88f, 1.88f)
                lineTo(13f, 9.59f)
                close()
            }
        }.build()
        
        return _Bluetooth_connected!!
    }

private var _Bluetooth_connected: ImageVector? = null

