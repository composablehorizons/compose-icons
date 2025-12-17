package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.View_cozy: ImageVector
    get() {
        if (_View_cozy != null) return _View_cozy!!
        
        _View_cozy = ImageVector.Builder(
            name = "view_cozy",
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
                        moveTo(4f, 18f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(6f)
                        horizontalLineTo(4f)
                        verticalLineTo(18f)
                        close()
                        moveTo(12.75f, 7.25f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(7.25f)
                        close()
                        moveTo(12.75f, 12.75f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(12.75f)
                        close()
                        moveTo(7.25f, 7.25f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(7.25f)
                        close()
                        moveTo(7.25f, 12.75f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(12.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.25f, 7.25f)
                        horizontalLineTo(11.25f)
                        verticalLineTo(11.25f)
                        horizontalLineTo(7.25f)
                        verticalLineTo(7.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.75f, 7.25f)
                        horizontalLineTo(16.75f)
                        verticalLineTo(11.25f)
                        horizontalLineTo(12.75f)
                        verticalLineTo(7.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.25f, 12.75f)
                        horizontalLineTo(11.25f)
                        verticalLineTo(16.75f)
                        horizontalLineTo(7.25f)
                        verticalLineTo(12.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.75f, 12.75f)
                        horizontalLineTo(16.75f)
                        verticalLineTo(16.75f)
                        horizontalLineTo(12.75f)
                        verticalLineTo(12.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 4f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                        close()
                        moveTo(20f, 18f)
                        horizontalLineTo(4f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _View_cozy!!
    }

private var _View_cozy: ImageVector? = null

