package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Timer_3_select: ImageVector
    get() {
        if (_Timer_3_select != null) return _Timer_3_select!!
        
        _Timer_3_select = ImageVector.Builder(
            name = "timer_3_select",
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
                moveTo(21f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.68f, 1.5f, 1.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.82f, 0f, -1.5f, -0.68f, -1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.82f, 0.68f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(21f)
                close()
                moveTo(4f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -1.16f, -0.94f, -2.1f, -2.1f, -2.1f)
                curveToRelative(1.16f, 0f, 2.1f, -0.94f, 2.1f, -2.1f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Timer_3_select!!
    }

private var _Timer_3_select: ImageVector? = null

