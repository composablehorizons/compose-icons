package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Spatial_tracking: ImageVector
    get() {
        if (_Spatial_tracking != null) return _Spatial_tracking!!
        
        _Spatial_tracking = ImageVector.Builder(
            name = "spatial_tracking",
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
                        moveTo(14f, 9f)
                        arcTo(4f, 4f, 0f, false, true, 10f, 13f)
                        arcTo(4f, 4f, 0f, false, true, 6f, 9f)
                        arcTo(4f, 4f, 0f, false, true, 14f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.39f, 15.56f)
                        curveTo(14.71f, 14.7f, 12.53f, 14f, 10f, 14f)
                        curveToRelative(-2.53f, 0f, -4.71f, 0.7f, -6.39f, 1.56f)
                        curveTo(2.61f, 16.07f, 2f, 17.1f, 2f, 18.22f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2.78f)
                        curveTo(18f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.05f, 2.41f)
                        lineTo(18.64f, 1f)
                        curveToRelative(-3.51f, 3.51f, -3.51f, 9.21f, 0f, 12.73f)
                        lineToRelative(1.41f, -1.41f)
                        curveTo(17.32f, 9.58f, 17.32f, 5.14f, 20.05f, 2.41f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.88f, 5.24f)
                        lineToRelative(-1.41f, -1.41f)
                        curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                        lineToRelative(1.41f, -1.41f)
                        curveTo(21.71f, 8.32f, 21.71f, 6.41f, 22.88f, 5.24f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Spatial_tracking!!
    }

private var _Spatial_tracking: ImageVector? = null

