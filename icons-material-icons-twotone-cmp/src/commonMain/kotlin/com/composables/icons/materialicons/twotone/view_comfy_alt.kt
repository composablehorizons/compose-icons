package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.View_comfy_alt: ImageVector
    get() {
        if (_View_comfy_alt != null) return _View_comfy_alt!!
        
        _View_comfy_alt = ImageVector.Builder(
            name = "view_comfy_alt",
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
                        moveTo(13f, 7f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(7f)
                        close()
                        moveTo(13f, 13f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(13f)
                        close()
                        moveTo(7f, 7f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(7f)
                        verticalLineTo(7f)
                        close()
                        moveTo(7f, 13f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(7f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 7f)
                        horizontalLineTo(11f)
                        verticalLineTo(11f)
                        horizontalLineTo(7f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 7f)
                        horizontalLineTo(17f)
                        verticalLineTo(11f)
                        horizontalLineTo(13f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 13f)
                        horizontalLineTo(11f)
                        verticalLineTo(17f)
                        horizontalLineTo(7f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 13f)
                        horizontalLineTo(17f)
                        verticalLineTo(17f)
                        horizontalLineTo(13f)
                        verticalLineTo(13f)
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
        
        return _View_comfy_alt!!
    }

private var _View_comfy_alt: ImageVector? = null

