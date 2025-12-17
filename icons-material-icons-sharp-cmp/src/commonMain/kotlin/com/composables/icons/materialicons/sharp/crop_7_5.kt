package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Crop_7_5: ImageVector
    get() {
        if (_Crop_7_5 != null) return _Crop_7_5!!
        
        _Crop_7_5 = ImageVector.Builder(
            name = "crop_7_5",
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
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(18f)
                verticalLineTo(7f)
                close()
                moveToRelative(-2f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Crop_7_5!!
    }

private var _Crop_7_5: ImageVector? = null

