package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Add_chart: ImageVector
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
                        moveTo(19f, 19f)
                        lineTo(5f, 19f)
                        lineTo(5f, 5f)
                        lineTo(14f, 5f)
                        lineTo(14f, 3f)
                        lineTo(3f, 3f)
                        lineTo(3f, 21f)
                        lineTo(21f, 21f)
                        lineTo(21f, 10f)
                        lineTo(19f, 10f)
                        close()
                    }
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

