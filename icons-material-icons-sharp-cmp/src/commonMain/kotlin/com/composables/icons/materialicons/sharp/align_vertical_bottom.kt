package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Align_vertical_bottom: ImageVector
    get() {
        if (_Align_vertical_bottom != null) return _Align_vertical_bottom!!
        
        _Align_vertical_bottom = ImageVector.Builder(
            name = "align_vertical_bottom",
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
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(20f)
                verticalLineTo(22f)
                close()
                moveTo(10f, 2f)
                horizontalLineTo(7f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(3f)
                verticalLineTo(2f)
                close()
                moveTo(17f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        
        return _Align_vertical_bottom!!
    }

private var _Align_vertical_bottom: ImageVector? = null

