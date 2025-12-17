package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Add_road: ImageVector
    get() {
        if (_Add_road != null) return _Add_road!!
        
        _Add_road = ImageVector.Builder(
            name = "add_road",
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
                        moveTo(20f, 18f)
                        lineTo(20f, 15f)
                        lineTo(18f, 15f)
                        lineTo(18f, 18f)
                        lineTo(15f, 18f)
                        lineTo(15f, 20f)
                        lineTo(18f, 20f)
                        lineTo(18f, 23f)
                        lineTo(20f, 23f)
                        lineTo(20f, 20f)
                        lineTo(23f, 20f)
                        lineTo(23f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 4f)
                        horizontalLineTo(20f)
                        verticalLineTo(13f)
                        horizontalLineTo(18f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 4f)
                        horizontalLineTo(6f)
                        verticalLineTo(20f)
                        horizontalLineTo(4f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 4f)
                        horizontalLineTo(13f)
                        verticalLineTo(8f)
                        horizontalLineTo(11f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 10f)
                        horizontalLineTo(13f)
                        verticalLineTo(14f)
                        horizontalLineTo(11f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 16f)
                        horizontalLineTo(13f)
                        verticalLineTo(20f)
                        horizontalLineTo(11f)
                        verticalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Add_road!!
    }

private var _Add_road: ImageVector? = null

