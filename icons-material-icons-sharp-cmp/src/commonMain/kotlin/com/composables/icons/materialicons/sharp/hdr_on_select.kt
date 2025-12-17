package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Hdr_on_select: ImageVector
    get() {
        if (_Hdr_on_select != null) return _Hdr_on_select!!
        
        _Hdr_on_select = ImageVector.Builder(
            name = "hdr_on_select",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(18f, 19.9f)
                        verticalLineTo(16f)
                        horizontalLineToRelative(-5f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(1.1f)
                        lineToRelative(0.9f, 2f)
                        horizontalLineTo(18f)
                        lineToRelative(-0.9f, -2.1f)
                        horizontalLineTo(18f)
                        close()
                        moveTo(16.5f, 18.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(18.5f)
                        close()
                        moveTo(3.5f, 18f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(0f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-2.5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(22f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-6f)
                        horizontalLineTo(3.5f)
                        verticalLineTo(18f)
                        close()
                        moveTo(10f, 16f)
                        horizontalLineTo(6.5f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(10f)
                        curveToRelative(0.8f, 0f, 1.5f, -0.7f, 1.5f, -1.5f)
                        verticalLineToRelative(-3f)
                        curveTo(11.5f, 16.7f, 10.8f, 16f, 10f, 16f)
                        close()
                        moveTo(10f, 20.5f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(20.5f)
                        close()
                        moveTo(24f, 20f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(22f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(20f)
                        close()
                        moveTo(12f, 4f)
                        curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                        reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                        reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                        reflectiveCurveTo(9.79f, 4f, 12f, 4f)
                        moveTo(12f, 2f)
                        curveTo(8.69f, 2f, 6f, 4.69f, 6f, 8f)
                        reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                        reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                        reflectiveCurveTo(15.31f, 2f, 12f, 2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_on_select!!
    }

private var _Hdr_on_select: ImageVector? = null

