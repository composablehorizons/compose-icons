package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sports: ImageVector
    get() {
        if (_Sports != null) return _Sports!!
        
        _Sports = ImageVector.Builder(
            name = "sports",
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
                            moveTo(21f, 6f)
                            horizontalLineToRelative(-9.77f)
                            curveTo(9.57f, 6f, 8.01f, 6.66f, 6.87f, 7.73f)
                            curveTo(6.54f, 6.73f, 5.61f, 6f, 4.5f, 6f)
                            curveTo(3.12f, 6f, 2f, 7.12f, 2f, 8.5f)
                            curveTo(2f, 9.88f, 3.12f, 11f, 4.5f, 11f)
                            curveToRelative(0.21f, 0f, 0.41f, -0.03f, 0.61f, -0.08f)
                            curveToRelative(-0.05f, 0.25f, -0.09f, 0.51f, -0.1f, 0.78f)
                            curveToRelative(-0.18f, 3.68f, 2.95f, 6.68f, 6.68f, 6.27f)
                            curveToRelative(2.55f, -0.28f, 4.68f, -2.26f, 5.19f, -4.77f)
                            curveToRelative(0.15f, -0.71f, 0.15f, -1.4f, 0.06f, -2.06f)
                            curveToRelative(-0.09f, -0.6f, 0.38f, -1.13f, 0.99f, -1.13f)
                            lineToRelative(2.76f, 0f)
                            curveTo(21.56f, 10f, 22f, 9.55f, 22f, 9f)
                            verticalLineTo(7f)
                            curveTo(22f, 6.45f, 21.55f, 6f, 21f, 6f)
                            close()
                            moveTo(4.5f, 9f)
                            curveTo(4.22f, 9f, 4f, 8.78f, 4f, 8.5f)
                            curveTo(4f, 8.22f, 4.22f, 8f, 4.5f, 8f)
                            reflectiveCurveTo(5f, 8.22f, 5f, 8.5f)
                            curveTo(5f, 8.78f, 4.78f, 9f, 4.5f, 9f)
                            close()
                            moveTo(11f, 15f)
                            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                            reflectiveCurveTo(12.66f, 15f, 11f, 15f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(13f, 12f)
                            arcTo(2f, 2f, 0f, false, true, 11f, 14f)
                            arcTo(2f, 2f, 0f, false, true, 9f, 12f)
                            arcTo(2f, 2f, 0f, false, true, 13f, 12f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Sports!!
    }

private var _Sports: ImageVector? = null

