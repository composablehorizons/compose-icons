package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Vertical_align_top: ImageVector
    get() {
        if (_Vertical_align_top != null) return _Vertical_align_top!!
        
        _Vertical_align_top = ImageVector.Builder(
            name = "vertical_align_top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                verticalLineTo(11f)
                horizontalLineToRelative(3f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                close()
                moveTo(4f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Vertical_align_top!!
    }

private var _Vertical_align_top: ImageVector? = null

