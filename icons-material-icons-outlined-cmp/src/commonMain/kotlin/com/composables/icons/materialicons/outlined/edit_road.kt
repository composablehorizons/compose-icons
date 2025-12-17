package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Edit_road: ImageVector
    get() {
        if (_Edit_road != null) return _Edit_road!!
        
        _Edit_road = ImageVector.Builder(
            name = "edit_road",
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
                        moveTo(18f, 4f)
                        lineTo(16f, 4f)
                        lineTo(16f, 11.9f)
                        lineTo(18f, 9.9f)
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
                        moveTo(10f, 4f)
                        horizontalLineTo(12f)
                        verticalLineTo(8f)
                        horizontalLineTo(10f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 10f)
                        horizontalLineTo(12f)
                        verticalLineTo(14f)
                        horizontalLineTo(10f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 16f)
                        horizontalLineTo(12f)
                        verticalLineTo(20f)
                        horizontalLineTo(10f)
                        verticalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.56f, 12.59f)
                        lineToRelative(-1.15f, -1.15f)
                        curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0f)
                        lineTo(14f, 16.73f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(3.27f)
                        lineToRelative(5.29f, -5.29f)
                        curveTo(23.15f, 14.12f, 23.15f, 13.17f, 22.56f, 12.59f)
                        close()
                        moveTo(16.58f, 18.45f)
                        horizontalLineToRelative(-1.03f)
                        verticalLineToRelative(-1.03f)
                        lineTo(19f, 13.97f)
                        lineTo(20.03f, 15f)
                        lineTo(16.58f, 18.45f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Edit_road!!
    }

private var _Edit_road: ImageVector? = null

