package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Brunch_dining: ImageVector
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
                        moveTo(16f, 22f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(22f)
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
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Brunch_dining!!
    }

private var _Brunch_dining: ImageVector? = null

