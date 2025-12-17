package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.File_present: ImageVector
    get() {
        if (_File_present != null) return _File_present!!
        
        _File_present = ImageVector.Builder(
            name = "file_present",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13.17f, 2f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8.83f)
                    curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                    lineToRelative(-4.83f, -4.83f)
                    curveTo(14.21f, 2.21f, 13.7f, 2f, 13.17f, 2f)
                    close()
                    moveTo(16f, 15f)
                    curveToRelative(0f, 2.34f, -2.01f, 4.21f, -4.39f, 3.98f)
                    curveTo(9.53f, 18.78f, 8f, 16.92f, 8f, 14.83f)
                    lineToRelative(0f, -5.19f)
                    curveToRelative(0f, -1.31f, 0.94f, -2.5f, 2.24f, -2.63f)
                    curveTo(11.74f, 6.86f, 13f, 8.03f, 13f, 9.5f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(9.5f)
                    curveTo(11f, 9.22f, 10.78f, 9f, 10.5f, 9f)
                    reflectiveCurveTo(10f, 9.22f, 10f, 9.5f)
                    verticalLineToRelative(5.39f)
                    curveToRelative(0f, 1f, 0.68f, 1.92f, 1.66f, 2.08f)
                    curveTo(12.92f, 17.18f, 14f, 16.21f, 14f, 15f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(15f)
                    close()
                    moveTo(14f, 7f)
                    verticalLineTo(4f)
                    lineToRelative(4f, 4f)
                    horizontalLineToRelative(-3f)
                    curveTo(14.45f, 8f, 14f, 7.55f, 14f, 7f)
                    close()
                }
            }
        }.build()
        
        return _File_present!!
    }

private var _File_present: ImageVector? = null

