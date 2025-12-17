package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Add_chart: ImageVector
    get() {
        if (_Add_chart != null) return _Add_chart!!
        
        _Add_chart = ImageVector.Builder(
            name = "add_chart",
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
                        moveTo(11f, 7f)
                        horizontalLineTo(13f)
                        verticalLineTo(17f)
                        horizontalLineTo(11f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 13f)
                        horizontalLineTo(17f)
                        verticalLineTo(17f)
                        horizontalLineTo(15f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 19f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(9f)
                        verticalLineTo(3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-9f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 10f)
                        horizontalLineTo(9f)
                        verticalLineTo(17f)
                        horizontalLineTo(7f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 5f)
                        lineTo(19f, 3f)
                        lineTo(17f, 3f)
                        lineTo(17f, 5f)
                        lineTo(15f, 5f)
                        lineTo(15f, 7f)
                        lineTo(17f, 7f)
                        lineTo(17f, 9f)
                        lineTo(19f, 9f)
                        lineTo(19f, 7f)
                        lineTo(21f, 7f)
                        lineTo(21f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Add_chart!!
    }

private var _Add_chart: ImageVector? = null

