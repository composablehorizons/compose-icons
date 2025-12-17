package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Closed_caption_off: ImageVector
    get() {
        if (_Closed_caption_off != null) return _Closed_caption_off!!
        
        _Closed_caption_off = ImageVector.Builder(
            name = "closed_caption_off",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(19f, 4f)
                            horizontalLineTo(5f)
                            curveTo(3.89f, 4f, 3f, 4.9f, 3f, 6f)
                            verticalLineToRelative(12f)
                            curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                            horizontalLineToRelative(14f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(6f)
                            curveTo(21f, 4.9f, 20.1f, 4f, 19f, 4f)
                            close()
                            moveTo(19f, 18f)
                            horizontalLineTo(5f)
                            verticalLineTo(6f)
                            horizontalLineToRelative(14f)
                            verticalLineTo(18f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(7f, 15f)
                            horizontalLineToRelative(3f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-1f)
                            horizontalLineTo(9.5f)
                            verticalLineToRelative(0.5f)
                            horizontalLineToRelative(-2f)
                            verticalLineToRelative(-3f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(11f)
                            horizontalLineTo(11f)
                            verticalLineToRelative(-1f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineTo(7f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(4f)
                            curveTo(6f, 14.55f, 6.45f, 15f, 7f, 15f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(14f, 15f)
                            horizontalLineToRelative(3f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-1f)
                            horizontalLineToRelative(-1.5f)
                            verticalLineToRelative(0.5f)
                            horizontalLineToRelative(-2f)
                            verticalLineToRelative(-3f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(11f)
                            horizontalLineTo(18f)
                            verticalLineToRelative(-1f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineToRelative(-3f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(4f)
                            curveTo(13f, 14.55f, 13.45f, 15f, 14f, 15f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Closed_caption_off!!
    }

private var _Closed_caption_off: ImageVector? = null

