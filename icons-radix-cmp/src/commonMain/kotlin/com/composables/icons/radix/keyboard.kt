package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Keyboard: ImageVector
    get() {
        if (_Keyboard != null) return _Keyboard!!
        
        _Keyboard = ImageVector.Builder(
            name = "keyboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.6533f, 3.00781f)
                curveTo(14.4097f, 3.08461f, 15f, 3.72334f, 15f, 4.5f)
                verticalLineTo(10.5f)
                lineTo(14.9922f, 10.6533f)
                curveTo(14.9205f, 11.3593f, 14.3593f, 11.9205f, 13.6533f, 11.9922f)
                lineTo(13.5f, 12f)
                horizontalLineTo(1.5f)
                lineTo(1.34668f, 11.9922f)
                curveTo(0.64069f, 11.9205f, 0.0794913f, 11.3593f, 0.0078125f, 10.6533f)
                lineTo(0f, 10.5f)
                verticalLineTo(4.5f)
                curveTo(9.06007E-8f, 3.72334f, 0.590277f, 3.08461f, 1.34668f, 3.00781f)
                lineTo(1.5f, 3f)
                horizontalLineTo(13.5f)
                lineTo(13.6533f, 3.00781f)
                close()
                moveTo(1.5f, 4f)
                curveTo(1.22386f, 4f, 1f, 4.22386f, 1f, 4.5f)
                verticalLineTo(10.5f)
                curveTo(1f, 10.7761f, 1.22386f, 11f, 1.5f, 11f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 11f, 14f, 10.7761f, 14f, 10.5f)
                verticalLineTo(4.5f)
                curveTo(14f, 4.22386f, 13.7761f, 4f, 13.5f, 4f)
                horizontalLineTo(1.5f)
                close()
                moveTo(3f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                close()
                moveTo(11f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                close()
                moveTo(13f, 10f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                close()
                moveTo(4f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                close()
                moveTo(6f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                close()
                moveTo(8f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                close()
                moveTo(10f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                close()
                moveTo(12f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                close()
                moveTo(3f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                close()
                moveTo(5f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                close()
                moveTo(7f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                close()
                moveTo(9f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                close()
                moveTo(11f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                close()
                moveTo(13f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Keyboard!!
    }

private var _Keyboard: ImageVector? = null

