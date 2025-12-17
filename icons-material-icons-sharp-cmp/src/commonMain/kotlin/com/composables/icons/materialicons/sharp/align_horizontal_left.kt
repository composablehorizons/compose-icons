package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Align_horizontal_left: ImageVector
    get() {
        if (_Align_horizontal_left != null) return _Align_horizontal_left!!
        
        _Align_horizontal_left = ImageVector.Builder(
            name = "align_horizontal_left",
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
                moveTo(4f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                close()
                moveTo(22f, 7f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(16f)
                verticalLineTo(7f)
                close()
                moveTo(16f, 14f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineTo(14f)
                close()
            }
        }.build()
        
        return _Align_horizontal_left!!
    }

private var _Align_horizontal_left: ImageVector? = null

