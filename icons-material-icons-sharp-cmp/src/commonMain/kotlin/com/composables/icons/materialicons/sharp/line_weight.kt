package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Line_weight: ImageVector
    get() {
        if (_Line_weight != null) return _Line_weight!!
        
        _Line_weight = ImageVector.Builder(
            name = "line_weight",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 17f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(0f, -7f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-3f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(0f, -9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(18f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Line_weight!!
    }

private var _Line_weight: ImageVector? = null

