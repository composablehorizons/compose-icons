package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Stay_current_landscape: ImageVector
    get() {
        if (_Stay_current_landscape != null) return _Stay_current_landscape!!
        
        _Stay_current_landscape = ImageVector.Builder(
            name = "stay_current_landscape",
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
                moveTo(1f, 19f)
                horizontalLineToRelative(22f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineToRelative(14f)
                close()
                moveTo(19f, 7f)
                verticalLineToRelative(10f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Stay_current_landscape!!
    }

private var _Stay_current_landscape: ImageVector? = null

