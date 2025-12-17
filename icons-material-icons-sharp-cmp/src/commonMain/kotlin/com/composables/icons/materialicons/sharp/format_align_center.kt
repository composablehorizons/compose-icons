package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_align_center: ImageVector
    get() {
        if (_Format_align_center != null) return _Format_align_center!!
        
        _Format_align_center = ImageVector.Builder(
            name = "format_align_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                close()
                moveToRelative(-4f, 6f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -8f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4f, -6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                close()
                moveTo(3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Format_align_center!!
    }

private var _Format_align_center: ImageVector? = null

