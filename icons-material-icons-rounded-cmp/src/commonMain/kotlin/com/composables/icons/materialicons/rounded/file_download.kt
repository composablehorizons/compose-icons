package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.File_download: ImageVector
    get() {
        if (_File_download != null) return _File_download!!
        
        _File_download = ImageVector.Builder(
            name = "file_download",
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
                    moveTo(16.59f, 9f)
                    horizontalLineTo(15f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-4f)
                    curveTo(9.45f, 3f, 9f, 3.45f, 9f, 4f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(7.41f)
                    curveToRelative(-0.89f, 0f, -1.34f, 1.08f, -0.71f, 1.71f)
                    lineToRelative(4.59f, 4.59f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    lineToRelative(4.59f, -4.59f)
                    curveTo(17.92f, 10.08f, 17.48f, 9f, 16.59f, 9f)
                    close()
                    moveTo(5f, 19f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(12f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                    horizontalLineTo(6f)
                    curveTo(5.45f, 18f, 5f, 18.45f, 5f, 19f)
                    close()
                }
            }
        }.build()
        
        return _File_download!!
    }

private var _File_download: ImageVector? = null

