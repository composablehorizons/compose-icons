package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Bluetooth_searching: ImageVector
    get() {
        if (_Bluetooth_searching != null) return _Bluetooth_searching!!
        
        _Bluetooth_searching = ImageVector.Builder(
            name = "bluetooth_searching",
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
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.24f, 12.01f)
                lineToRelative(2.32f, 2.32f)
                curveToRelative(0.28f, -0.72f, 0.44f, -1.51f, 0.44f, -2.33f)
                curveToRelative(0f, -0.82f, -0.16f, -1.59f, -0.43f, -2.31f)
                lineToRelative(-2.33f, 2.32f)
                close()
                moveToRelative(5.29f, -5.3f)
                lineToRelative(-1.26f, 1.26f)
                curveToRelative(0.63f, 1.21f, 0.98f, 2.57f, 0.98f, 4.02f)
                reflectiveCurveToRelative(-0.36f, 2.82f, -0.98f, 4.02f)
                lineToRelative(1.2f, 1.2f)
                curveToRelative(0.97f, -1.54f, 1.54f, -3.36f, 1.54f, -5.31f)
                curveToRelative(-0.01f, -1.89f, -0.55f, -3.67f, -1.48f, -5.19f)
                close()
                moveToRelative(-3.82f, 1f)
                lineTo(10f, 2f)
                horizontalLineTo(9f)
                verticalLineToRelative(7.59f)
                lineTo(4.41f, 5f)
                lineTo(3f, 6.41f)
                lineTo(8.59f, 12f)
                lineTo(3f, 17.59f)
                lineTo(4.41f, 19f)
                lineTo(9f, 14.41f)
                verticalLineTo(22f)
                horizontalLineToRelative(1f)
                lineToRelative(5.71f, -5.71f)
                lineToRelative(-4.3f, -4.29f)
                lineToRelative(4.3f, -4.29f)
                close()
                moveTo(11f, 5.83f)
                lineToRelative(1.88f, 1.88f)
                lineTo(11f, 9.59f)
                verticalLineTo(5.83f)
                close()
                moveToRelative(1.88f, 10.46f)
                lineTo(11f, 18.17f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                close()
            }
        }.build()
        
        return _Bluetooth_searching!!
    }

private var _Bluetooth_searching: ImageVector? = null

