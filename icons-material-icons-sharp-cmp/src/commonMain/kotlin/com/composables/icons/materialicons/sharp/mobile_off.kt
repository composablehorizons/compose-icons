package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mobile_off: ImageVector
    get() {
        if (_Mobile_off != null) return _Mobile_off!!
        
        _Mobile_off = ImageVector.Builder(
            name = "mobile_off",
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
                moveTo(17f, 5f)
                verticalLineToRelative(8.61f)
                lineToRelative(2f, 2f)
                verticalLineTo(1f)
                horizontalLineTo(5f)
                verticalLineToRelative(0.61f)
                lineTo(8.39f, 5f)
                close()
                moveTo(2.9f, 2.35f)
                lineTo(1.49f, 3.76f)
                lineTo(5f, 7.27f)
                verticalLineTo(23f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1.73f)
                lineToRelative(1.7f, 1.7f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.9f, 2.35f)
                close()
                moveTo(7f, 19f)
                verticalLineTo(9.27f)
                lineTo(16.73f, 19f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Mobile_off!!
    }

private var _Mobile_off: ImageVector? = null

