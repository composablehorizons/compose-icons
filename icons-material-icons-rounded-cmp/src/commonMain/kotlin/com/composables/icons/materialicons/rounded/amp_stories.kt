package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Amp_stories: ImageVector
    get() {
        if (_Amp_stories != null) return _Amp_stories!!
        
        _Amp_stories = ImageVector.Builder(
            name = "amp_stories",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 4f)
                        horizontalLineTo(8f)
                        curveTo(7.45f, 4f, 7f, 4.45f, 7f, 5f)
                        verticalLineToRelative(13f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(8f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(5f)
                        curveTo(17f, 4.45f, 16.55f, 4f, 16f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 6f)
                        curveTo(3.45f, 6f, 3f, 6.45f, 3f, 7f)
                        verticalLineToRelative(9f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineTo(7f)
                        curveTo(5f, 6.45f, 4.55f, 6f, 4f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 6f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(9f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineTo(7f)
                        curveTo(21f, 6.45f, 20.55f, 6f, 20f, 6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Amp_stories!!
    }

private var _Amp_stories: ImageVector? = null

