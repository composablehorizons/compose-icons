package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.People_alt: ImageVector
    get() {
        if (_People_alt != null) return _People_alt!!
        
        _People_alt = ImageVector.Builder(
            name = "people_alt",
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
                }
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16.67f, 13.13f)
                            curveTo(18.04f, 14.06f, 19f, 15.32f, 19f, 17f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(3f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-2f)
                            curveTo(23f, 14.82f, 19.43f, 13.53f, 16.67f, 13.13f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(13f, 8f)
                            arcTo(4f, 4f, 0f, false, true, 9f, 12f)
                            arcTo(4f, 4f, 0f, false, true, 5f, 8f)
                            arcTo(4f, 4f, 0f, false, true, 13f, 8f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(15f, 12f)
                            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                            curveToRelative(-0.47f, 0f, -0.91f, 0.1f, -1.33f, 0.24f)
                            curveTo(14.5f, 5.27f, 15f, 6.58f, 15f, 8f)
                            reflectiveCurveToRelative(-0.5f, 2.73f, -1.33f, 3.76f)
                            curveTo(14.09f, 11.9f, 14.53f, 12f, 15f, 12f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(9f, 13f)
                            curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                            verticalLineToRelative(2f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(14f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-2f)
                            curveTo(17f, 14.34f, 11.67f, 13f, 9f, 13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _People_alt!!
    }

private var _People_alt: ImageVector? = null

