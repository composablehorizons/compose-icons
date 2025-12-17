package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Crop_landscape: ImageVector
    get() {
        if (_Crop_landscape != null) return _Crop_landscape!!
        
        _Crop_landscape = ImageVector.Builder(
            name = "crop_landscape",
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
                moveTo(21f, 5f)
                horizontalLineTo(3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(18f)
                verticalLineTo(5f)
                close()
                moveToRelative(-2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Crop_landscape!!
    }

private var _Crop_landscape: ImageVector? = null

