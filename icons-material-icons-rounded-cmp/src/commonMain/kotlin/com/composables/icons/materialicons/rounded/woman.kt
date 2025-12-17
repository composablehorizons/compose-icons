package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Woman: ImageVector
    get() {
        if (_Woman != null) return _Woman!!
        
        _Woman = ImageVector.Builder(
            name = "woman",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 4f)
                    arcTo(2f, 2f, 0f, false, true, 12f, 6f)
                    arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                    arcTo(2f, 2f, 0f, false, true, 14f, 4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16.45f, 14.63f)
                    lineToRelative(-2.52f, -6.32f)
                    curveToRelative(-0.32f, -0.79f, -1.08f, -1.3f, -1.94f, -1.31f)
                    curveToRelative(-0.85f, 0f, -1.62f, 0.51f, -1.94f, 1.31f)
                    lineToRelative(-2.52f, 6.32f)
                    curveTo(7.28f, 15.29f, 7.77f, 16f, 8.47f, 16f)
                    horizontalLineTo(10f)
                    verticalLineToRelative(5f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(1.53f)
                    curveTo(16.23f, 16f, 16.72f, 15.29f, 16.45f, 14.63f)
                    close()
                }
            }
        }.build()
        
        return _Woman!!
    }

private var _Woman: ImageVector? = null

