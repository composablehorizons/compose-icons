package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.North_west: ImageVector
    get() {
        if (_North_west != null) return _North_west!!
        
        _North_west = ImageVector.Builder(
            name = "north_west",
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
                moveTo(5f, 15f)
                horizontalLineToRelative(2f)
                verticalLineTo(8.41f)
                lineTo(18.59f, 20f)
                lineTo(20f, 18.59f)
                lineTo(8.41f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        
        return _North_west!!
    }

private var _North_west: ImageVector? = null

