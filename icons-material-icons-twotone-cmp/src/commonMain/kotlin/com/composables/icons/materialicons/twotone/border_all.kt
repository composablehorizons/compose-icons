package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Border_all: ImageVector
    get() {
        if (_Border_all != null) return _Border_all!!
        
        _Border_all = ImageVector.Builder(
            name = "border_all",
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
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                close()
                moveTo(11f, 19f)
                horizontalLineTo(5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(0f, -8f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(8f, 8f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(0f, -8f)
                horizontalLineToRelative(-6f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Border_all!!
    }

private var _Border_all: ImageVector? = null

