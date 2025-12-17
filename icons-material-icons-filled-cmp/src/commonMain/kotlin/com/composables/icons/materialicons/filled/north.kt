package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.North: ImageVector
    get() {
        if (_North != null) return _North!!
        
        _North = ImageVector.Builder(
            name = "north",
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
                moveTo(5f, 9f)
                lineToRelative(1.41f, 1.41f)
                lineTo(11f, 5.83f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(5.83f)
                lineToRelative(4.59f, 4.59f)
                lineTo(19f, 9f)
                lineToRelative(-7f, -7f)
                lineTo(5f, 9f)
                close()
            }
        }.build()
        
        return _North!!
    }

private var _North: ImageVector? = null

