package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sports_hockey: ImageVector
    get() {
        if (_Sports_hockey != null) return _Sports_hockey!!
        
        _Sports_hockey = ImageVector.Builder(
            name = "sports_hockey",
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
                        moveTo(2f, 17f)
                        verticalLineToRelative(3f)
                        lineToRelative(2f, 0f)
                        verticalLineToRelative(-4f)
                        horizontalLineTo(3f)
                        curveTo(2.45f, 16f, 2f, 16.45f, 2f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 16f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(4f)
                        lineToRelative(4.69f, -0.01f)
                        curveToRelative(0.38f, 0f, 0.72f, -0.21f, 0.89f, -0.55f)
                        lineToRelative(0.87f, -1.9f)
                        lineToRelative(-1.59f, -3.48f)
                        lineTo(9f, 16f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21.71f, 16.29f)
                            curveTo(21.53f, 16.11f, 21.28f, 16f, 21f, 16f)
                            horizontalLineToRelative(-1f)
                            verticalLineToRelative(4f)
                            lineToRelative(2f, 0f)
                            verticalLineToRelative(-3f)
                            curveTo(22f, 16.72f, 21.89f, 16.47f, 21.71f, 16.29f)
                            close()
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.6f, 12.84f)
                        lineTo(17.65f, 4f)
                        horizontalLineTo(14.3f)
                        lineToRelative(-1.76f, 3.97f)
                        lineToRelative(-0.49f, 1.1f)
                        lineTo(12f, 9.21f)
                        lineTo(9.7f, 4f)
                        horizontalLineTo(6.35f)
                        lineToRelative(4.05f, 8.84f)
                        lineToRelative(1.52f, 3.32f)
                        lineTo(12f, 16.34f)
                        lineToRelative(1.42f, 3.1f)
                        curveToRelative(0.17f, 0.34f, 0.51f, 0.55f, 0.89f, 0.55f)
                        lineTo(19f, 20f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(-4f)
                        lineTo(13.6f, 12.84f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_hockey!!
    }

private var _Sports_hockey: ImageVector? = null

