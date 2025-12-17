package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mosque: ImageVector
    get() {
        if (_Mosque != null) return _Mosque!!
        
        _Mosque = ImageVector.Builder(
            name = "mosque",
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
                        moveTo(6.12f, 8f)
                        curveTo(6f, 8f, 18f, 8f, 17.88f, 8f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.88f, 8f)
                        curveTo(17.95f, 7.71f, 18f, 7.41f, 18f, 7.09f)
                        curveToRelative(0f, -1.31f, -0.65f, -2.53f, -1.74f, -3.25f)
                        lineTo(12f, 1f)
                        lineTo(7.74f, 3.84f)
                        curveTo(6.65f, 4.56f, 6f, 5.78f, 6f, 7.09f)
                        curveTo(6f, 7.41f, 6.05f, 7.71f, 6.12f, 8f)
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(24f, 7f)
                        curveToRelative(0f, -1.1f, -2f, -3f, -2f, -3f)
                        reflectiveCurveToRelative(-2f, 1.9f, -2f, 3f)
                        curveToRelative(0f, 0.74f, 0.4f, 1.38f, 1f, 1.72f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(9f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(3f)
                        verticalLineTo(8.72f)
                        curveTo(3.6f, 8.38f, 4f, 7.74f, 4f, 7f)
                        curveToRelative(0f, -1.1f, -2f, -3f, -2f, -3f)
                        reflectiveCurveTo(0f, 5.9f, 0f, 7f)
                        curveToRelative(0f, 0.74f, 0.4f, 1.38f, 1f, 1.72f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(9f)
                        verticalLineTo(8.72f)
                        curveTo(23.6f, 8.38f, 24f, 7.74f, 24f, 7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mosque!!
    }

private var _Mosque: ImageVector? = null

