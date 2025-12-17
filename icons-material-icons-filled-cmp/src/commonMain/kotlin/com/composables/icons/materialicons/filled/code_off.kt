package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Code_off: ImageVector
    get() {
        if (_Code_off != null) return _Code_off!!
        
        _Code_off = ImageVector.Builder(
            name = "code_off",
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
                moveTo(19.17f, 12f)
                lineToRelative(-4.58f, -4.59f)
                lineTo(16f, 6f)
                lineToRelative(6f, 6f)
                lineToRelative(-3.59f, 3.59f)
                lineTo(17f, 14.17f)
                lineTo(19.17f, 12f)
                close()
                moveTo(1.39f, 4.22f)
                lineToRelative(4.19f, 4.19f)
                lineTo(2f, 12f)
                lineToRelative(6f, 6f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.83f, 12f)
                lineTo(7f, 9.83f)
                lineToRelative(12.78f, 12.78f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
            }
        }.build()
        
        return _Code_off!!
    }

private var _Code_off: ImageVector? = null

