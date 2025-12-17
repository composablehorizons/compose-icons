package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Closed_caption_off: ImageVector
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
                            moveTo(19f, 6f)
                            horizontalLineTo(5f)
                            verticalLineToRelative(12f)
                            horizontalLineToRelative(14f)
                            verticalLineTo(6f)
                            close()
                            moveTo(11f, 11f)
                            horizontalLineTo(9.5f)
                            verticalLineToRelative(-0.5f)
                            horizontalLineToRelative(-2f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(13f)
                            horizontalLineTo(11f)
                            verticalLineToRelative(1f)
                            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                            horizontalLineTo(7f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineToRelative(-4f)
                            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                            horizontalLineToRelative(3f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            verticalLineTo(11f)
                            close()
                            moveTo(18f, 11f)
                            horizontalLineToRelative(-1.5f)
                            verticalLineToRelative(-0.5f)
                            horizontalLineToRelative(-2f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(13f)
                            horizontalLineTo(18f)
                            verticalLineToRelative(1f)
                            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                            horizontalLineToRelative(-3f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineToRelative(-4f)
                            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                            horizontalLineToRelative(3f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            verticalLineTo(11f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(5f, 20f)
                            horizontalLineToRelative(14f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(6f)
                            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                            horizontalLineTo(5f)
                            curveTo(3.89f, 4f, 3f, 4.9f, 3f, 6f)
                            verticalLineToRelative(12f)
                            curveTo(3f, 19.1f, 3.89f, 20f, 5f, 20f)
                            close()
                            moveTo(5f, 6f)
                            horizontalLineToRelative(14f)
                            verticalLineToRelative(12f)
                            horizontalLineTo(5f)
                            verticalLineTo(6f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(10f, 9f)
                            horizontalLineTo(7f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(4f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
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
                            curveTo(11f, 9.45f, 10.55f, 9f, 10f, 9f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17f, 9f)
                            horizontalLineToRelative(-3f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(4f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
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
                            curveTo(18f, 9.45f, 17.55f, 9f, 17f, 9f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Closed_caption_off!!
    }

private var _Closed_caption_off: ImageVector? = null

