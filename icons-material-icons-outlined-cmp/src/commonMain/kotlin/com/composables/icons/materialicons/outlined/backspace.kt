package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Backspace: ImageVector
    get() {
        if (_Backspace != null) return _Backspace!!
        
        _Backspace = ImageVector.Builder(
            name = "backspace",
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
                moveTo(22f, 3f)
                horizontalLineTo(7f)
                curveToRelative(-0.69f, 0f, -1.23f, 0.35f, -1.59f, 0.88f)
                lineTo(0f, 12f)
                lineToRelative(5.41f, 8.11f)
                curveToRelative(0.36f, 0.53f, 0.9f, 0.89f, 1.59f, 0.89f)
                horizontalLineToRelative(15f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(7.07f)
                lineTo(2.4f, 12f)
                lineToRelative(4.66f, -7f)
                horizontalLineTo(22f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-11.59f, -2f)
                lineTo(14f, 13.41f)
                lineTo(17.59f, 17f)
                lineTo(19f, 15.59f)
                lineTo(15.41f, 12f)
                lineTo(19f, 8.41f)
                lineTo(17.59f, 7f)
                lineTo(14f, 10.59f)
                lineTo(10.41f, 7f)
                lineTo(9f, 8.41f)
                lineTo(12.59f, 12f)
                lineTo(9f, 15.59f)
                close()
            }
        }.build()
        
        return _Backspace!!
    }

private var _Backspace: ImageVector? = null

