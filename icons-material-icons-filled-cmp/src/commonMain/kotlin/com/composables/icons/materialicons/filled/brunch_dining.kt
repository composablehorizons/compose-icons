package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Brunch_dining: ImageVector
    get() {
        if (_Brunch_dining != null) return _Brunch_dining!!
        
        _Brunch_dining = ImageVector.Builder(
            name = "brunch_dining",
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
                    moveTo(18f, 8f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(8f)
                    close()
                    moveTo(15.51f, 22f)
                    horizontalLineTo(2.49f)
                    curveTo(2.22f, 22f, 2f, 21.78f, 2f, 21.5f)
                    verticalLineTo(20f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(1.5f)
                    curveTo(16f, 21.78f, 15.78f, 22f, 15.51f, 22f)
                    close()
                    moveTo(18f, 15.89f)
                    lineToRelative(-0.4f, -0.42f)
                    curveToRelative(-1.02f, -1.08f, -1.6f, -2.52f, -1.6f, -4f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(9.51f)
                    curveToRelative(0f, 1.46f, -0.54f, 2.87f, -1.53f, 3.94f)
                    lineTo(20f, 15.97f)
                    verticalLineTo(20f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(15.89f)
                    close()
                    moveTo(7f, 16f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(4.5f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                    horizontalLineToRelative(-13f)
                    curveTo(2.22f, 18f, 2f, 17.78f, 2f, 17.5f)
                    verticalLineToRelative(-1f)
                    curveTo(2f, 16.22f, 2.22f, 16f, 2.5f, 16f)
                    horizontalLineTo(7f)
                    close()
                }
            }
        }.build()
        
        return _Brunch_dining!!
    }

private var _Brunch_dining: ImageVector? = null

