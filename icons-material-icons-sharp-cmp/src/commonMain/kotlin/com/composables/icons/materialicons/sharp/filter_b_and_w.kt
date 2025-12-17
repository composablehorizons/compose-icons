package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Filter_b_and_w: ImageVector
    get() {
        if (_Filter_b_and_w != null) return _Filter_b_and_w!!
        
        _Filter_b_and_w = ImageVector.Builder(
            name = "filter_b_and_w",
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
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 16f)
                lineToRelative(-7f, -8f)
                verticalLineToRelative(8f)
                horizontalLineTo(5f)
                lineToRelative(7f, -8f)
                verticalLineTo(5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Filter_b_and_w!!
    }

private var _Filter_b_and_w: ImageVector? = null

