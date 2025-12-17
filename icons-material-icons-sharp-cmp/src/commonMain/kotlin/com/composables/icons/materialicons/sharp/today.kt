package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Today: ImageVector
    get() {
        if (_Today != null) return _Today!!
        
        _Today = ImageVector.Builder(
            name = "today",
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
                moveTo(21f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(11f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineTo(7f)
                verticalLineToRelative(-5f)
                close()
            }
        }.build()
        
        return _Today!!
    }

private var _Today: ImageVector? = null

