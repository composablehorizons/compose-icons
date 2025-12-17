package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Timer_10_select: ImageVector
    get() {
        if (_Timer_10_select != null) return _Timer_10_select!!
        
        _Timer_10_select = ImageVector.Builder(
            name = "timer_10_select",
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
                moveTo(13f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                moveTo(16f, 5f)
                horizontalLineTo(7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(9f)
                verticalLineTo(5f)
                close()
                moveTo(1f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineTo(8f)
                close()
                moveTo(23f, 11f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineTo(11f)
                close()
            }
        }.build()
        
        return _Timer_10_select!!
    }

private var _Timer_10_select: ImageVector? = null

