package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Join_full: ImageVector
    get() {
        if (_Join_full != null) return _Join_full!!
        
        _Join_full = ImageVector.Builder(
            name = "join_full",
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
                        moveTo(15f, 12f)
                        arcTo(3f, 5.74f, 0f, false, true, 12f, 17.74f)
                        arcTo(3f, 5.74f, 0f, false, true, 9f, 12f)
                        arcTo(3f, 5.74f, 0f, false, true, 15f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.5f, 12f)
                        curveToRelative(0f, -0.97f, 0.23f, -4.16f, 3.03f, -6.5f)
                        curveTo(9.75f, 5.19f, 8.9f, 5f, 8f, 5f)
                        curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                        reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                        curveToRelative(0.9f, 0f, 1.75f, -0.19f, 2.53f, -0.5f)
                        curveTo(7.73f, 16.16f, 7.5f, 12.97f, 7.5f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 5f)
                        curveToRelative(-0.9f, 0f, -1.75f, 0.19f, -2.53f, 0.5f)
                        curveToRelative(2.8f, 2.34f, 3.03f, 5.53f, 3.03f, 6.5f)
                        curveToRelative(0f, 0.97f, -0.23f, 4.16f, -3.03f, 6.5f)
                        curveTo(14.25f, 18.81f, 15.1f, 19f, 16f, 19f)
                        curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                        reflectiveCurveTo(19.86f, 5f, 16f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Join_full!!
    }

private var _Join_full: ImageVector? = null

