package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Directions_subway_filled: ImageVector
    get() {
        if (_Directions_subway_filled != null) return _Directions_subway_filled!!
        
        _Directions_subway_filled = ImageVector.Builder(
            name = "directions_subway_filled",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
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
                        moveTo(12f, 2f)
                        curveTo(8f, 2f, 4f, 2.5f, 4f, 6f)
                        verticalLineToRelative(9.5f)
                        curveTo(4f, 17.43f, 5.57f, 19f, 7.5f, 19f)
                        lineTo(6f, 20f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(-1f)
                        lineToRelative(-1.5f, -1f)
                        curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                        verticalLineTo(6f)
                        curveTo(20f, 2.5f, 16.42f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 4f)
                        curveToRelative(3.71f, 0f, 5.13f, 0.46f, 5.67f, 1f)
                        horizontalLineTo(13f)
                        horizontalLineToRelative(-2f)
                        horizontalLineTo(6.43f)
                        curveTo(7.03f, 4.48f, 8.48f, 4f, 12f, 4f)
                        close()
                        moveTo(6f, 7f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(6f)
                        verticalLineTo(7f)
                        close()
                        moveTo(18f, 15.5f)
                        curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                        horizontalLineToRelative(-9f)
                        curveTo(6.67f, 17f, 6f, 16.33f, 6f, 15.5f)
                        verticalLineTo(12f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(15.5f)
                        close()
                        moveTo(18f, 10f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 7f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10f, 14.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 14f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 17f, 14.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Directions_subway_filled!!
    }

private var _Directions_subway_filled: ImageVector? = null

