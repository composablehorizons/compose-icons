package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Nat: ImageVector
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
                        moveTo(23f, 12f)
                        lineToRelative(-4f, -3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-4.05f)
                        curveTo(14.45f, 5.95f, 10.19f, 2f, 5f, 2f)
                        verticalLineToRelative(2f)
                        curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                        reflectiveCurveToRelative(-3.58f, 8f, -8f, 8f)
                        verticalLineToRelative(2f)
                        curveToRelative(5.19f, 0f, 9.45f, -3.95f, 9.95f, -9f)
                        horizontalLineTo(19f)
                        verticalLineToRelative(2f)
                        lineTo(23f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Nat!!
    }

private var _Nat: ImageVector? = null

