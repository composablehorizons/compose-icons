package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Garage: ImageVector
    get() {
        if (_Garage != null) return _Garage!!
        
        _Garage = ImageVector.Builder(
            name = "garage",
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
                        moveTo(16f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 16f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 9f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 8f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 10f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.33f, 7.5f)
                        lineTo(7.67f, 9.5f)
                        lineTo(16.33f, 9.5f)
                        lineTo(15.67f, 7.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 2f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(20f)
                        horizontalLineToRelative(20f)
                        verticalLineTo(2f)
                        close()
                        moveTo(19f, 18.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-7.31f)
                        lineTo(6.89f, 5.5f)
                        horizontalLineToRelative(10.21f)
                        lineTo(19f, 11.19f)
                        verticalLineTo(18.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Garage!!
    }

private var _Garage: ImageVector? = null

