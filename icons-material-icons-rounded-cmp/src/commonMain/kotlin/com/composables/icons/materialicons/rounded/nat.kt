package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Nat: ImageVector
    get() {
        if (_Nat != null) return _Nat!!
        
        _Nat = ImageVector.Builder(
            name = "nat",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6.82f, 13f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(6.82f)
                        curveTo(6.4f, 9.84f, 5.3f, 9f, 4f, 9f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                        curveTo(5.3f, 15f, 6.4f, 14.16f, 6.82f, 13f)
                        close()
                        moveTo(4f, 13f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(5f, 12.55f, 4.55f, 13f, 4f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.47f, 12.4f)
                        curveToRelative(0.27f, -0.2f, 0.27f, -0.6f, 0f, -0.8f)
                        lineTo(19f, 9f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-4.05f)
                        curveToRelative(-0.47f, -4.69f, -4.16f, -8.42f, -8.83f, -8.94f)
                        curveTo(5.52f, 2f, 5f, 2.46f, 5f, 3.06f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f)
                        curveTo(9.88f, 4.48f, 13f, 7.87f, 13f, 12f)
                        reflectiveCurveToRelative(-3.12f, 7.52f, -7.13f, 7.95f)
                        curveTo(5.37f, 20.01f, 5f, 20.44f, 5f, 20.94f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.6f, 0.52f, 1.07f, 1.11f, 1f)
                        curveToRelative(4.67f, -0.52f, 8.37f, -4.25f, 8.83f, -8.94f)
                        horizontalLineTo(19f)
                        verticalLineToRelative(2f)
                        lineTo(22.47f, 12.4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Nat!!
    }

private var _Nat: ImageVector? = null

