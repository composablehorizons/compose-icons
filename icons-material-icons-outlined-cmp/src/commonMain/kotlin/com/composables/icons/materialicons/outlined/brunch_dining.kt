package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Brunch_dining: ImageVector
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
                        moveTo(2f, 21.5f)
                        curveTo(2f, 21.78f, 2.22f, 22f, 2.49f, 22f)
                        horizontalLineToRelative(13.02f)
                        curveToRelative(0.27f, 0f, 0.49f, -0.22f, 0.49f, -0.5f)
                        verticalLineTo(20f)
                        horizontalLineTo(2f)
                        verticalLineTo(21.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.5f, 16f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(2.5f)
                        curveTo(2.22f, 16f, 2f, 16.22f, 2f, 16.5f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(14f)
                        verticalLineToRelative(-1.5f)
                        curveTo(16f, 16.22f, 15.78f, 16f, 15.5f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.47f, 15.45f)
                        curveToRelative(0.99f, -1.07f, 1.53f, -2.48f, 1.53f, -3.94f)
                        verticalLineTo(2f)
                        horizontalLineToRelative(-6f)
                        verticalLineToRelative(9.47f)
                        curveToRelative(0f, 1.48f, 0.58f, 2.92f, 1.6f, 4f)
                        lineToRelative(0.4f, 0.42f)
                        verticalLineTo(22f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-4.03f)
                        lineTo(20.47f, 15.45f)
                        close()
                        moveTo(18f, 4f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(4f)
                        close()
                        moveTo(19.03f, 14.07f)
                        curveToRelative(-0.65f, -0.71f, -1.03f, -1.65f, -1.03f, -2.6f)
                        verticalLineTo(10f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(1.51f)
                        curveTo(20f, 12.46f, 19.66f, 13.36f, 19.03f, 14.07f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Brunch_dining!!
    }

private var _Brunch_dining: ImageVector? = null

