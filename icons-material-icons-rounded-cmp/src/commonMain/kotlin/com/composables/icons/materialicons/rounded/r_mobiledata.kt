package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.R_mobiledata: ImageVector
    get() {
        if (_R_mobiledata != null) return _R_mobiledata!!
        
        _R_mobiledata = ImageVector.Builder(
            name = "r_mobiledata",
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
                        moveTo(7.8f, 7.2f)
                        lineToRelative(0.65f, 1.52f)
                        curveTo(8.71f, 9.33f, 8.27f, 10f, 7.61f, 10f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.37f, 0f, -0.7f, -0.22f, -0.85f, -0.56f)
                        lineTo(5.87f, 7.33f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(1.75f)
                        curveTo(4f, 9.59f, 3.59f, 10f, 3.08f, 10f)
                        horizontalLineTo(2.92f)
                        curveTo(2.41f, 10f, 2f, 9.59f, 2f, 9.08f)
                        verticalLineTo(3f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(1.33f)
                        curveTo(9f, 6.13f, 8.47f, 6.87f, 7.8f, 7.2f)
                        close()
                        moveTo(7f, 4f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(1.33f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _R_mobiledata!!
    }

private var _R_mobiledata: ImageVector? = null

