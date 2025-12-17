package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sports_basketball: ImageVector
    get() {
        if (_Sports_basketball != null) return _Sports_basketball!!
        
        _Sports_basketball = ImageVector.Builder(
            name = "sports_basketball",
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
                            moveTo(17.09f, 11f)
                            horizontalLineToRelative(4.86f)
                            curveToRelative(-0.16f, -1.61f, -0.71f, -3.11f, -1.54f, -4.4f)
                            curveTo(18.68f, 7.43f, 17.42f, 9.05f, 17.09f, 11f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6.91f, 11f)
                            curveTo(6.58f, 9.05f, 5.32f, 7.43f, 3.59f, 6.6f)
                            curveTo(2.76f, 7.89f, 2.21f, 9.39f, 2.05f, 11f)
                            horizontalLineTo(6.91f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(15.07f, 11f)
                            curveToRelative(0.32f, -2.59f, 1.88f, -4.79f, 4.06f, -6f)
                            curveToRelative(-1.6f, -1.63f, -3.74f, -2.71f, -6.13f, -2.95f)
                            verticalLineTo(11f)
                            horizontalLineTo(15.07f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(8.93f, 11f)
                            horizontalLineTo(11f)
                            verticalLineTo(2.05f)
                            curveTo(8.61f, 2.29f, 6.46f, 3.37f, 4.87f, 5f)
                            curveTo(7.05f, 6.21f, 8.61f, 8.41f, 8.93f, 11f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(15.07f, 13f)
                            horizontalLineTo(13f)
                            verticalLineToRelative(8.95f)
                            curveToRelative(2.39f, -0.24f, 4.54f, -1.32f, 6.13f, -2.95f)
                            curveTo(16.95f, 17.79f, 15.39f, 15.59f, 15.07f, 13f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(3.59f, 17.4f)
                            curveToRelative(1.72f, -0.83f, 2.99f, -2.46f, 3.32f, -4.4f)
                            horizontalLineTo(2.05f)
                            curveTo(2.21f, 14.61f, 2.76f, 16.11f, 3.59f, 17.4f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17.09f, 13f)
                            curveToRelative(0.33f, 1.95f, 1.59f, 3.57f, 3.32f, 4.4f)
                            curveToRelative(0.83f, -1.29f, 1.38f, -2.79f, 1.54f, -4.4f)
                            horizontalLineTo(17.09f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(8.93f, 13f)
                            curveToRelative(-0.32f, 2.59f, -1.88f, 4.79f, -4.06f, 6f)
                            curveToRelative(1.6f, 1.63f, 3.74f, 2.71f, 6.13f, 2.95f)
                            verticalLineTo(13f)
                            horizontalLineTo(8.93f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Sports_basketball!!
    }

private var _Sports_basketball: ImageVector? = null

