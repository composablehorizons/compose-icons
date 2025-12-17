package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Priority_high: ImageVector
    get() {
        if (_Priority_high != null) return _Priority_high!!
        
        _Priority_high = ImageVector.Builder(
            name = "priority_high",
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
                moveTo(14f, 19f)
                arcTo(2f, 2f, 0f, false, true, 12f, 21f)
                arcTo(2f, 2f, 0f, false, true, 10f, 19f)
                arcTo(2f, 2f, 0f, false, true, 14f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Priority_high!!
    }

private var _Priority_high: ImageVector? = null

