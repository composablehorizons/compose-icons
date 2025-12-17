package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.West: ImageVector
    get() {
        if (_West != null) return _West!!
        
        _West = ImageVector.Builder(
            name = "west",
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
                moveTo(9f, 19f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.83f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(5.83f)
                lineToRelative(4.59f, -4.59f)
                lineTo(9f, 5f)
                lineToRelative(-7f, 7f)
                lineTo(9f, 19f)
                close()
            }
        }.build()
        
        return _West!!
    }

private var _West: ImageVector? = null

