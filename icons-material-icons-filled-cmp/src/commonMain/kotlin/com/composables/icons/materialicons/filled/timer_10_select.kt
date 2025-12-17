package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Timer_10_select: ImageVector
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
                moveTo(13f, 5f)
                horizontalLineToRelative(-3f)
                curveTo(8.34f, 5f, 7f, 6.34f, 7f, 8f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineTo(8f)
                curveTo(16f, 6.34f, 14.66f, 5f, 13f, 5f)
                close()
                moveTo(1f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineTo(8f)
                close()
                moveTo(18.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.68f, -1.5f, 1.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(19f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()
        
        return _Timer_10_select!!
    }

private var _Timer_10_select: ImageVector? = null

