package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`1x_mobiledata`: ImageVector
    get() {
        if (_1x_mobiledata != null) return _1x_mobiledata!!
        
        _1x_mobiledata = ImageVector.Builder(
            name = "1x_mobiledata",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 7f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(9f)
                        horizontalLineTo(5f)
                        curveTo(4.45f, 9f, 4f, 8.55f, 4f, 8f)
                        verticalLineToRelative(0f)
                        curveTo(4f, 7.45f, 4.45f, 7f, 5f, 7f)
                        close()
                        moveTo(15.83f, 11.72f)
                        lineToRelative(1.92f, -3.21f)
                        curveTo(18.15f, 7.85f, 17.67f, 7f, 16.9f, 7f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.35f, 0f, -0.68f, 0.18f, -0.86f, 0.49f)
                        lineToRelative(-1.37f, 2.28f)
                        lineToRelative(-1.38f, -2.29f)
                        curveTo(13.11f, 7.18f, 12.79f, 7f, 12.44f, 7f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.78f, 0f, -1.26f, 0.85f, -0.86f, 1.51f)
                        lineToRelative(1.92f, 3.21f)
                        lineToRelative(-2.26f, 3.77f)
                        curveToRelative(-0.4f, 0.67f, 0.08f, 1.51f, 0.86f, 1.51f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.35f, 0f, 0.68f, -0.18f, 0.86f, -0.49f)
                        lineToRelative(1.71f, -2.85f)
                        lineToRelative(1.71f, 2.85f)
                        curveToRelative(0.18f, 0.3f, 0.51f, 0.49f, 0.86f, 0.49f)
                        horizontalLineToRelative(0.01f)
                        curveToRelative(0.78f, 0f, 1.26f, -0.85f, 0.86f, -1.51f)
                        lineTo(15.83f, 11.72f)
                        close()
                    }
                }
            }
        }.build()
        
        return _1x_mobiledata!!
    }

private var _1x_mobiledata: ImageVector? = null

