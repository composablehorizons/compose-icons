package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Align_horizontal_right: ImageVector
    get() {
        if (_Align_horizontal_right != null) return _Align_horizontal_right!!
        
        _Align_horizontal_right = ImageVector.Builder(
            name = "align_horizontal_right",
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
                moveTo(20f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2f)
                close()
                moveTo(2f, 10f)
                horizontalLineToRelative(16f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                close()
                moveTo(8f, 17f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        
        return _Align_horizontal_right!!
    }

private var _Align_horizontal_right: ImageVector? = null

