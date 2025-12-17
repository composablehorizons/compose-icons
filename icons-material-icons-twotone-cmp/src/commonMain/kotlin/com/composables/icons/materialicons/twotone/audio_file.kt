package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Audio_file: ImageVector
    get() {
        if (_Audio_file != null) return _Audio_file!!
        
        _Audio_file = ImageVector.Builder(
            name = "audio_file",
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
                        moveTo(13f, 4f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(4f)
                        close()
                        moveTo(16f, 11f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(3.75f)
                        curveToRelative(0f, 1.24f, -1.01f, 2.25f, -2.25f, 2.25f)
                        reflectiveCurveTo(8.5f, 17.99f, 8.5f, 16.75f)
                        curveToRelative(0f, -1.24f, 1.01f, -2.25f, 2.25f, -2.25f)
                        curveToRelative(0.46f, 0f, 0.89f, 0.14f, 1.25f, 0.38f)
                        verticalLineTo(11f)
                        horizontalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(8f)
                        lineTo(14f, 2f)
                        close()
                        moveTo(18f, 20f)
                        horizontalLineTo(6f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 14.88f)
                        curveToRelative(-0.36f, -0.24f, -0.79f, -0.38f, -1.25f, -0.38f)
                        curveToRelative(-1.24f, 0f, -2.25f, 1.01f, -2.25f, 2.25f)
                        curveToRelative(0f, 1.24f, 1.01f, 2.25f, 2.25f, 2.25f)
                        reflectiveCurveTo(13f, 17.99f, 13f, 16.75f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(14.88f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Audio_file!!
    }

private var _Audio_file: ImageVector? = null

