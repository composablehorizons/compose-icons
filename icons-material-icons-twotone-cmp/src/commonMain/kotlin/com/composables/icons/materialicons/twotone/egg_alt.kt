package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Egg_alt: ImageVector
    get() {
        if (_Egg_alt != null) return _Egg_alt!!
        
        _Egg_alt = ImageVector.Builder(
            name = "egg_alt",
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
                            moveTo(17.59f, 10.42f)
                            curveToRelative(-0.69f, -0.68f, -1.21f, -1.51f, -1.76f, -2.39f)
                            curveTo(14.48f, 5.86f, 13.31f, 4f, 9.97f, 4f)
                            curveTo(8.35f, 4f, 7.01f, 4.52f, 5.99f, 5.55f)
                            curveTo(4.68f, 6.88f, 3.97f, 8.99f, 4f, 11.5f)
                            curveTo(4.05f, 16.01f, 8.33f, 17f, 9.97f, 17f)
                            curveToRelative(1.69f, 0f, 2.68f, 1.05f, 3.34f, 1.74f)
                            curveTo(14.03f, 19.5f, 14.5f, 20f, 15.99f, 20f)
                            curveToRelative(1.89f, 0f, 4.01f, -2.13f, 4.01f, -4.98f)
                            curveTo(20f, 12.82f, 19.49f, 12.31f, 17.59f, 10.42f)
                            close()
                            moveTo(12f, 15.5f)
                            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                            reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                            reflectiveCurveTo(13.93f, 15.5f, 12f, 15.5f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(19f, 9f)
                            curveTo(17f, 7f, 15.99f, 2f, 9.97f, 2f)
                            curveTo(4.95f, 2f, 1.94f, 6f, 2f, 11.52f)
                            curveTo(2.06f, 17.04f, 6.96f, 19f, 9.97f, 19f)
                            curveToRelative(2.01f, 0f, 2.01f, 3f, 6.02f, 3f)
                            curveTo(19f, 22f, 22f, 19f, 22f, 15.02f)
                            curveTo(22f, 12f, 21.01f, 11f, 19f, 9f)
                            close()
                            moveTo(15.99f, 20f)
                            curveToRelative(-1.49f, 0f, -1.96f, -0.5f, -2.68f, -1.26f)
                            curveTo(12.66f, 18.05f, 11.66f, 17f, 9.97f, 17f)
                            curveTo(8.33f, 17f, 4.05f, 16.01f, 4f, 11.5f)
                            curveTo(3.97f, 8.99f, 4.68f, 6.88f, 5.99f, 5.55f)
                            curveTo(7.01f, 4.52f, 8.35f, 4f, 9.97f, 4f)
                            curveToRelative(3.34f, 0f, 4.51f, 1.86f, 5.86f, 4.02f)
                            curveToRelative(0.55f, 0.88f, 1.07f, 1.71f, 1.76f, 2.39f)
                            curveToRelative(1.9f, 1.89f, 2.41f, 2.4f, 2.41f, 4.61f)
                            curveTo(20f, 17.87f, 17.88f, 20f, 15.99f, 20f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(15.5f, 12f)
                            arcTo(3.5f, 3.5f, 0f, false, true, 12f, 15.5f)
                            arcTo(3.5f, 3.5f, 0f, false, true, 8.5f, 12f)
                            arcTo(3.5f, 3.5f, 0f, false, true, 15.5f, 12f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Egg_alt!!
    }

private var _Egg_alt: ImageVector? = null

