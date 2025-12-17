package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pivot_table_chart: ImageVector
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
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(10f)
                        horizontalLineTo(3f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 5f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.65f, 9.35f)
                        lineToRelative(-2.79f, 2.79f)
                        curveTo(14.54f, 12.46f, 14.76f, 13f, 15.21f, 13f)
                        horizontalLineTo(17f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1.79f)
                        curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                        lineToRelative(-2.79f, 2.79f)
                        curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                        lineToRelative(2.79f, 2.79f)
                        curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f)
                        verticalLineTo(19f)
                        horizontalLineToRelative(2f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(1.79f)
                        curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                        lineToRelative(-2.79f, -2.79f)
                        curveTo(18.16f, 9.16f, 17.84f, 9.16f, 17.65f, 9.35f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Pivot_table_chart!!
    }

private var _Pivot_table_chart: ImageVector? = null

