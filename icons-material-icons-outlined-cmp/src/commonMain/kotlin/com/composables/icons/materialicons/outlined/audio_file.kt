package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Audio_file: ImageVector
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
                    moveTo(6f, 20f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(11f)
                    horizontalLineTo(6f)
                    close()
                    moveTo(16f, 11f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(3.88f)
                    curveToRelative(-0.36f, -0.24f, -0.79f, -0.38f, -1.25f, -0.38f)
                    curveToRelative(-1.24f, 0f, -2.25f, 1.01f, -2.25f, 2.25f)
                    curveToRelative(0f, 1.24f, 1.01f, 2.25f, 2.25f, 2.25f)
                    reflectiveCurveTo(13f, 17.99f, 13f, 16.75f)
                    verticalLineTo(13f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(11f)
                    close()
                }
            }
        }.build()
        
        return _Audio_file!!
    }

private var _Audio_file: ImageVector? = null

