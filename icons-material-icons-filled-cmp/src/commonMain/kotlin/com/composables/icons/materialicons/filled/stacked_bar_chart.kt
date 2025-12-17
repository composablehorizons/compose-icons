package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Stacked_bar_chart: ImageVector
    get() {
        if (_Stacked_bar_chart != null) return _Stacked_bar_chart!!
        
        _Stacked_bar_chart = ImageVector.Builder(
            name = "stacked_bar_chart",
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
                moveTo(6f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineTo(6f)
                close()
                moveToRelative(0f, -5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineTo(6f)
                close()
                moveToRelative(10f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(-5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Stacked_bar_chart!!
    }

private var _Stacked_bar_chart: ImageVector? = null

