package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Invert_colors: ImageVector
    get() {
        if (_Invert_colors != null) return _Invert_colors!!
        
        _Invert_colors = ImageVector.Builder(
            name = "invert_colors",
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
                        moveTo(7.75f, 8.99f)
                        curveTo(6.62f, 10.1f, 6f, 11.57f, 6f, 13.13f)
                        curveTo(6f, 16.37f, 8.69f, 19f, 12f, 19f)
                        lineToRelative(0f, -14.19f)
                        lineTo(7.75f, 8.99f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.65f, 7.56f)
                        lineTo(17.65f, 7.56f)
                        lineTo(12f, 2f)
                        lineTo(6.35f, 7.56f)
                        lineToRelative(0f, 0f)
                        curveTo(4.9f, 8.99f, 4f, 10.96f, 4f, 13.13f)
                        curveTo(4f, 17.48f, 7.58f, 21f, 12f, 21f)
                        curveToRelative(4.42f, 0f, 8f, -3.52f, 8f, -7.87f)
                        curveTo(20f, 10.96f, 19.1f, 8.99f, 17.65f, 7.56f)
                        close()
                        moveTo(6f, 13.13f)
                        curveToRelative(0f, -1.56f, 0.62f, -3.03f, 1.75f, -4.14f)
                        lineTo(12f, 4.81f)
                        lineTo(12f, 19f)
                        curveTo(8.69f, 19f, 6f, 16.37f, 6f, 13.13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Invert_colors!!
    }

private var _Invert_colors: ImageVector? = null

