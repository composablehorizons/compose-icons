package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Crop_16_9: ImageVector
    get() {
        if (_Crop_16_9 != null) return _Crop_16_9!!
        
        _Crop_16_9 = ImageVector.Builder(
            name = "crop_16_9",
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
                moveTo(21f, 6f)
                horizontalLineTo(3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(18f)
                verticalLineTo(6f)
                close()
                moveToRelative(-2f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
        
        return _Crop_16_9!!
    }

private var _Crop_16_9: ImageVector? = null

