package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hdr_enhanced_select: ImageVector
    get() {
        if (_Hdr_enhanced_select != null) return _Hdr_enhanced_select!!
        
        _Hdr_enhanced_select = ImageVector.Builder(
            name = "hdr_enhanced_select",
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
                        moveTo(12f, 2f)
                        curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                        reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                        reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                        reflectiveCurveTo(8.69f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 4f)
                        curveTo(9.79f, 4f, 8f, 5.79f, 8f, 8f)
                        reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                        reflectiveCurveTo(14.21f, 4f, 12f, 4f)
                        close()
                        moveTo(13f, 11f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(9f)
                        horizontalLineTo(9f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(11f)
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
                        moveTo(18f, 18.5f)
                        curveToRelative(0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f)
                        lineTo(18f, 22f)
                        horizontalLineToRelative(-1.5f)
                        lineToRelative(-0.9f, -2f)
                        horizontalLineToRelative(-1.1f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(13f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(3.5f)
                        curveToRelative(0.8f, 0f, 1.5f, 0.7f, 1.5f, 1.5f)
                        verticalLineTo(18.5f)
                        close()
                        moveTo(16.5f, 18.5f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(16.5f)
                        close()
                        moveTo(3.5f, 18f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(3.5f)
                        verticalLineToRelative(-2.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(22f)
                        horizontalLineTo(0f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(3.5f)
                        close()
                        moveTo(10f, 16f)
                        curveToRelative(0.8f, 0f, 1.5f, 0.7f, 1.5f, 1.5f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f)
                        horizontalLineTo(6.5f)
                        verticalLineToRelative(-6f)
                        horizontalLineTo(10f)
                        close()
                        moveTo(10f, 20.5f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_enhanced_select!!
    }

private var _Hdr_enhanced_select: ImageVector? = null

