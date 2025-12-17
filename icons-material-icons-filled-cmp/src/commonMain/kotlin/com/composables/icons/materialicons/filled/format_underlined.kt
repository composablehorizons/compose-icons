package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Format_underlined: ImageVector
    get() {
        if (_Format_underlined != null) return _Format_underlined!!
        
        _Format_underlined = ImageVector.Builder(
            name = "format_underlined",
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
                moveTo(12f, 17f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveTo(8.5f, 12.93f, 8.5f, 11f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveToRelative(-7f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Format_underlined!!
    }

private var _Format_underlined: ImageVector? = null

