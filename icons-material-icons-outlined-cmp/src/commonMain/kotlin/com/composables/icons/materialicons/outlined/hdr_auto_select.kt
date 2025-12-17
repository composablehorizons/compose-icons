package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hdr_auto_select: ImageVector
    get() {
        if (_Hdr_auto_select != null) return _Hdr_auto_select!!
        
        _Hdr_auto_select = ImageVector.Builder(
            name = "hdr_auto_select",
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
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3.5f, 18f)
                        lineTo(1.5f, 18f)
                        lineTo(1.5f, 16f)
                        lineTo(0f, 16f)
                        lineTo(0f, 22f)
                        lineTo(1.5f, 22f)
                        lineTo(1.5f, 19.5f)
                        lineTo(3.5f, 19.5f)
                        lineTo(3.5f, 22f)
                        lineTo(5f, 22f)
                        lineTo(5f, 16f)
                        lineTo(3.5f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 18.5f)
                        lineTo(22f, 16.5f)
                        lineTo(20.5f, 16.5f)
                        lineTo(20.5f, 18.5f)
                        lineTo(18.5f, 18.5f)
                        lineTo(18.5f, 20f)
                        lineTo(20.5f, 20f)
                        lineTo(20.5f, 22f)
                        lineTo(22f, 22f)
                        lineTo(22f, 20f)
                        lineTo(24f, 20f)
                        lineTo(24f, 18.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.5f, 16f)
                        horizontalLineTo(13f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(1.1f)
                        lineToRelative(0.9f, 2f)
                        horizontalLineTo(18f)
                        lineToRelative(-0.9f, -2.1f)
                        curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f)
                        verticalLineToRelative(-1f)
                        curveTo(18f, 16.7f, 17.3f, 16f, 16.5f, 16f)
                        close()
                        moveTo(16.5f, 18.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(18.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.97f, 5.3f)
                        lineTo(10.95f, 8.19f)
                        lineTo(13.05f, 8.19f)
                        lineTo(12.03f, 5.3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(8.69f, 2f, 6f, 4.69f, 6f, 8f)
                        reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                        reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                        reflectiveCurveTo(15.31f, 2f, 12f, 2f)
                        close()
                        moveTo(14.04f, 11f)
                        lineToRelative(-0.63f, -1.79f)
                        horizontalLineToRelative(-2.83f)
                        lineTo(9.96f, 11f)
                        horizontalLineTo(8.74f)
                        lineToRelative(2.63f, -7f)
                        horizontalLineToRelative(1.25f)
                        lineToRelative(2.63f, 7f)
                        horizontalLineTo(14.04f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_auto_select!!
    }

private var _Hdr_auto_select: ImageVector? = null

