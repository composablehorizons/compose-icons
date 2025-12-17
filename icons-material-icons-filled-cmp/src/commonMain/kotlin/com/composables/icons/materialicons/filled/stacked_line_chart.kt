package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Stacked_line_chart: ImageVector
    get() {
        if (_Stacked_line_chart != null) return _Stacked_line_chart!!
        
        _Stacked_line_chart = ImageVector.Builder(
            name = "stacked_line_chart",
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
                moveTo(2f, 19.99f)
                lineToRelative(7.5f, -7.51f)
                lineToRelative(4f, 4f)
                lineToRelative(7.09f, -7.97f)
                lineTo(22f, 9.92f)
                lineToRelative(-8.5f, 9.56f)
                lineToRelative(-4f, -4f)
                lineToRelative(-6f, 6.01f)
                lineTo(2f, 19.99f)
                close()
                moveTo(3.5f, 15.49f)
                lineToRelative(6f, -6.01f)
                lineToRelative(4f, 4f)
                lineTo(22f, 3.92f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-7.09f, 7.97f)
                lineToRelative(-4f, -4f)
                lineTo(2f, 13.99f)
                lineTo(3.5f, 15.49f)
                close()
            }
        }.build()
        
        return _Stacked_line_chart!!
    }

private var _Stacked_line_chart: ImageVector? = null

