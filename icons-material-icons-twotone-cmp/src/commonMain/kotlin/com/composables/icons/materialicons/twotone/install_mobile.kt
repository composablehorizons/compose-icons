package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Install_mobile: ImageVector
    get() {
        if (_Install_mobile != null) return _Install_mobile!!
        
        _Install_mobile = ImageVector.Builder(
            name = "install_mobile",
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
                        moveTo(7f, 20f)
                        horizontalLineTo(17f)
                        verticalLineTo(21f)
                        horizontalLineTo(7f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 3f)
                        horizontalLineTo(14f)
                        verticalLineTo(4f)
                        horizontalLineTo(7f)
                        verticalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(7f)
                        verticalLineTo(4f)
                        horizontalLineTo(7f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(7f)
                        verticalLineTo(1.01f)
                        lineTo(7f, 1f)
                        curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                        verticalLineToRelative(18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(18f)
                        close()
                        moveTo(17f, 21f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 3f)
                        lineTo(17f, 3f)
                        lineTo(17f, 10.17f)
                        lineTo(14.41f, 7.59f)
                        lineTo(14f, 8f)
                        lineTo(13f, 9f)
                        lineTo(14f, 10f)
                        lineTo(18f, 14f)
                        lineTo(21f, 11f)
                        lineTo(23f, 9f)
                        lineTo(21.59f, 7.59f)
                        lineTo(21f, 8.18f)
                        lineTo(19f, 10.17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Install_mobile!!
    }

private var _Install_mobile: ImageVector? = null

