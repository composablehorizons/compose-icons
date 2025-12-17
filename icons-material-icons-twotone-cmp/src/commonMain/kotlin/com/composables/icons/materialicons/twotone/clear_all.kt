package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Clear_all: ImageVector
    get() {
        if (_Clear_all != null) return _Clear_all!!
        
        _Clear_all = ImageVector.Builder(
            name = "clear_all",
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
                moveTo(5f, 11f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                close()
                moveToRelative(-2f, 4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveToRelative(4f, -8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Clear_all!!
    }

private var _Clear_all: ImageVector? = null

