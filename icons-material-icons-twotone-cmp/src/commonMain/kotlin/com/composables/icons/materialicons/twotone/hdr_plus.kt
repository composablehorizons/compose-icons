package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Hdr_plus: ImageVector
    get() {
        if (_Hdr_plus != null) return _Hdr_plus!!
        
        _Hdr_plus = ImageVector.Builder(
            name = "hdr_plus",
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
                        moveTo(12f, 4f)
                        curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                        curveToRelative(0f, 2.52f, 1.17f, 4.77f, 3f, 6.24f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(3.5f)
                        curveToRelative(0.8f, 0f, 1.5f, 0.7f, 1.5f, 1.5f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f)
                        lineTo(12f, 19f)
                        horizontalLineToRelative(-1.5f)
                        lineToRelative(-0.9f, -2f)
                        horizontalLineTo(8.5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(8.13f)
                        curveToRelative(1.15f, 0.64f, 2.47f, 1f, 3.87f, 1f)
                        curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                        curveTo(20f, 7.59f, 16.41f, 4f, 12f, 4f)
                        close()
                        moveTo(12f, 12f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineTo(9.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(12f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(6f)
                        horizontalLineTo(12f)
                        verticalLineTo(12f)
                        close()
                        moveTo(17.5f, 16f)
                        horizontalLineTo(16f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineTo(16f)
                        horizontalLineTo(13f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(1.5f)
                        verticalLineTo(13f)
                        horizontalLineTo(16f)
                        verticalLineToRelative(1.49f)
                        horizontalLineToRelative(1.5f)
                        verticalLineTo(16f)
                        close()
                        moveTo(17.5f, 10.5f)
                        curveToRelative(0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.8f, 0f, 1.5f, 0.7f, 1.5f, 1.5f)
                        verticalLineTo(10.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.5f, 7.5f)
                        horizontalLineTo(16f)
                        verticalLineTo(10.5f)
                        horizontalLineTo(14.5f)
                        verticalLineTo(7.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.5f, 14.5f)
                        horizontalLineTo(10.5f)
                        verticalLineTo(15.5f)
                        horizontalLineTo(8.5f)
                        verticalLineTo(14.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-1.4f, 0f, -2.72f, -0.36f, -3.87f, -1f)
                        horizontalLineTo(8.5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(1.1f)
                        lineToRelative(0.9f, 2f)
                        horizontalLineTo(12f)
                        lineToRelative(-0.9f, -2.1f)
                        curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(5.24f)
                        curveTo(5.17f, 16.77f, 4f, 14.52f, 4f, 12f)
                        curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                        curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                        close()
                        moveTo(8.5f, 15.5f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.5f, 8f)
                        lineTo(8.5f, 8f)
                        lineTo(8.5f, 6f)
                        lineTo(7f, 6f)
                        lineTo(7f, 12f)
                        lineTo(8.5f, 12f)
                        lineTo(8.5f, 9.5f)
                        lineTo(10.5f, 9.5f)
                        lineTo(10.5f, 12f)
                        lineTo(12f, 12f)
                        lineTo(12f, 6f)
                        lineTo(10.5f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 6f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.8f, 0f, 1.5f, -0.7f, 1.5f, -1.5f)
                        verticalLineToRelative(-3f)
                        curveTo(17.5f, 6.7f, 16.8f, 6f, 16f, 6f)
                        close()
                        moveTo(16f, 10.5f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(16f)
                        verticalLineTo(10.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 13f)
                        lineTo(14.5f, 13f)
                        lineTo(14.5f, 14.5f)
                        lineTo(13f, 14.5f)
                        lineTo(13f, 16f)
                        lineTo(14.5f, 16f)
                        lineTo(14.5f, 17.5f)
                        lineTo(16f, 17.5f)
                        lineTo(16f, 16f)
                        lineTo(17.5f, 16f)
                        lineTo(17.5f, 14.49f)
                        lineTo(16f, 14.49f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_plus!!
    }

private var _Hdr_plus: ImageVector? = null

