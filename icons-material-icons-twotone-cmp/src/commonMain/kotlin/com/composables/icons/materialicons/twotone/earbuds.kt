package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Earbuds: ImageVector
    get() {
        if (_Earbuds != null) return _Earbuds!!
        
        _Earbuds = ImageVector.Builder(
            name = "earbuds",
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
                        moveTo(7f, 6f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveTo(5f, 5.45f, 5f, 6f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(1f)
                        curveTo(6.55f, 7f, 7f, 6.55f, 7f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 18f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(-1f)
                        curveTo(17.45f, 17f, 17f, 17.45f, 17f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 3f)
                        curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                        reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(0.83f)
                        curveTo(7.44f, 9f, 8.89f, 7.82f, 9f, 6.21f)
                        curveToRelative(0.12f, -1.69f, -1.16f, -3.1f, -2.8f, -3.21f)
                        curveTo(4.44f, 2.89f, 3f, 4.42f, 3f, 6.19f)
                        verticalLineTo(16f)
                        curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                        reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                        reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(-0.83f)
                        curveToRelative(-1.61f, 0f, -3.06f, 1.18f, -3.17f, 2.79f)
                        curveToRelative(-0.12f, 1.69f, 1.16f, 3.1f, 2.8f, 3.21f)
                        curveToRelative(1.76f, 0.12f, 3.2f, -1.42f, 3.2f, -3.18f)
                        verticalLineTo(8f)
                        curveTo(21f, 5.24f, 18.76f, 3f, 16f, 3f)
                        close()
                        moveTo(5f, 6f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(6.55f, 7f, 6f, 7f)
                        horizontalLineTo(5f)
                        verticalLineTo(6f)
                        close()
                        moveTo(19f, 18f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(1f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Earbuds!!
    }

private var _Earbuds: ImageVector? = null

