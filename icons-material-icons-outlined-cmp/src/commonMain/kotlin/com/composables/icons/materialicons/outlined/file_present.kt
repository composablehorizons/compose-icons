package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.File_present: ImageVector
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
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(20f)
                    close()
                    moveTo(12f, 17f)
                    lineTo(12f, 17f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    lineToRelative(0f, -5.5f)
                    curveTo(10f, 9.22f, 10.22f, 9f, 10.5f, 9f)
                    horizontalLineToRelative(0f)
                    curveTo(10.78f, 9f, 11f, 9.22f, 11f, 9.5f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9.5f)
                    curveTo(13f, 8.12f, 11.88f, 7f, 10.5f, 7f)
                    horizontalLineToRelative(0f)
                    curveTo(9.12f, 7f, 8f, 8.12f, 8f, 9.5f)
                    lineTo(8f, 15f)
                    curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                    horizontalLineToRelative(0f)
                    curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    curveTo(14f, 16.1f, 13.1f, 17f, 12f, 17f)
                    close()
                }
            }
        }.build()
        
        return _File_present!!
    }

private var _File_present: ImageVector? = null

