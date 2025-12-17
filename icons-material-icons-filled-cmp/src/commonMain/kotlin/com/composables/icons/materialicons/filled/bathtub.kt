package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Bathtub: ImageVector
    get() {
        if (_Bathtub != null) return _Bathtub!!
        
        _Bathtub = ImageVector.Builder(
            name = "bathtub",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(9f, 7f)
                            arcTo(2f, 2f, 0f, false, true, 7f, 9f)
                            arcTo(2f, 2f, 0f, false, true, 5f, 7f)
                            arcTo(2f, 2f, 0f, false, true, 9f, 7f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20f, 13f)
                            verticalLineTo(4.83f)
                            curveTo(20f, 3.27f, 18.73f, 2f, 17.17f, 2f)
                            curveToRelative(-0.75f, 0f, -1.47f, 0.3f, -2f, 0.83f)
                            lineToRelative(-1.25f, 1.25f)
                            curveTo(13.76f, 4.03f, 13.59f, 4f, 13.41f, 4f)
                            curveToRelative(-0.4f, 0f, -0.77f, 0.12f, -1.08f, 0.32f)
                            lineToRelative(2.76f, 2.76f)
                            curveToRelative(0.2f, -0.31f, 0.32f, -0.68f, 0.32f, -1.08f)
                            curveToRelative(0f, -0.18f, -0.03f, -0.34f, -0.07f, -0.51f)
                            lineToRelative(1.25f, -1.25f)
                            curveTo(16.74f, 4.09f, 16.95f, 4f, 17.17f, 4f)
                            curveTo(17.63f, 4f, 18f, 4.37f, 18f, 4.83f)
                            verticalLineTo(13f)
                            horizontalLineToRelative(-6.85f)
                            curveToRelative(-0.3f, -0.21f, -0.57f, -0.45f, -0.82f, -0.72f)
                            lineToRelative(-1.4f, -1.55f)
                            curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f)
                            curveTo(7.93f, 10.08f, 7.59f, 10f, 7.24f, 10f)
                            curveTo(6f, 10.01f, 5f, 11.01f, 5f, 12.25f)
                            verticalLineTo(13f)
                            horizontalLineTo(2f)
                            verticalLineToRelative(6f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(14f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineToRelative(-6f)
                            horizontalLineTo(20f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Bathtub!!
    }

private var _Bathtub: ImageVector? = null

