package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Local_bar: ImageVector
    get() {
        if (_Local_bar != null) return _Local_bar!!
        
        _Local_bar = ImageVector.Builder(
            name = "local_bar",
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
                moveTo(21f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                lineToRelative(8f, 9f)
                verticalLineToRelative(5f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                lineToRelative(8f, -9f)
                close()
                moveTo(7.43f, 7f)
                lineTo(5.66f, 5f)
                horizontalLineToRelative(12.69f)
                lineToRelative(-1.78f, 2f)
                horizontalLineTo(7.43f)
                close()
            }
        }.build()
        
        return _Local_bar!!
    }

private var _Local_bar: ImageVector? = null

