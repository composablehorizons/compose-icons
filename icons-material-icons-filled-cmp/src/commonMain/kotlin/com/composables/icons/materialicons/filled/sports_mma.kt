package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sports_mma: ImageVector
    get() {
        if (_Sports_mma != null) return _Sports_mma!!
        
        _Sports_mma = ImageVector.Builder(
            name = "sports_mma",
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
                        moveTo(7f, 20f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(8f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(7f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 7f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 3f, 5f, 3.9f, 5f, 5f)
                        verticalLineToRelative(5.8f)
                        curveToRelative(0f, 0.13f, 0.01f, 0.26f, 0.04f, 0.39f)
                        lineToRelative(0.8f, 4f)
                        curveToRelative(0.09f, 0.47f, 0.5f, 0.8f, 0.98f, 0.8f)
                        horizontalLineToRelative(10.36f)
                        curveToRelative(0.45f, 0f, 0.89f, -0.36f, 0.98f, -0.8f)
                        lineToRelative(0.8f, -4f)
                        curveTo(18.99f, 11.06f, 19f, 10.93f, 19f, 10.8f)
                        verticalLineTo(8f)
                        curveTo(19f, 7.45f, 18.55f, 7f, 18f, 7f)
                        close()
                        moveTo(15f, 10f)
                        horizontalLineTo(7f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_mma!!
    }

private var _Sports_mma: ImageVector? = null

