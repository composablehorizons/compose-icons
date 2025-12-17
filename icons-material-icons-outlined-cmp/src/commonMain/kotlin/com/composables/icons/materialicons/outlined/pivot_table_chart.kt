package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Pivot_table_chart: ImageVector
    get() {
        if (_Pivot_table_chart != null) return _Pivot_table_chart!!
        
        _Pivot_table_chart = ImageVector.Builder(
            name = "pivot_table_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21f, 5f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineToRelative(-9f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(11f)
                    verticalLineTo(5f)
                    close()
                    moveTo(3f, 19f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(10f)
                    horizontalLineTo(3f)
                    verticalLineTo(19f)
                    close()
                    moveTo(3f, 5f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    close()
                    moveTo(18f, 8.99f)
                    lineTo(14f, 13f)
                    lineToRelative(1.41f, 1.41f)
                    lineToRelative(1.59f, -1.6f)
                    verticalLineTo(15f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineToRelative(-2.17f)
                    lineToRelative(1.59f, -1.59f)
                    lineTo(13f, 14f)
                    lineToRelative(-4f, 4f)
                    lineToRelative(4f, 4f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(12.83f, 19f)
                    horizontalLineTo(15f)
                    curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                    verticalLineToRelative(-2.18f)
                    lineToRelative(1.59f, 1.6f)
                    lineTo(22f, 13f)
                    lineTo(18f, 8.99f)
                    close()
                }
            }
        }.build()
        
        return _Pivot_table_chart!!
    }

private var _Pivot_table_chart: ImageVector? = null

