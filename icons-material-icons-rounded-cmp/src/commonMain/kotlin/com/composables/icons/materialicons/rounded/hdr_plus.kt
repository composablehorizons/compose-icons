package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hdr_plus: ImageVector
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
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 15.5f)
                        curveToRelative(0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f)
                        lineToRelative(0.49f, 1.13f)
                        curveToRelative(0.2f, 0.46f, -0.14f, 0.97f, -0.64f, 0.97f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.27f, 0f, -0.52f, -0.16f, -0.63f, -0.41f)
                        lineTo(9.6f, 17f)
                        horizontalLineTo(8.5f)
                        verticalLineToRelative(1.31f)
                        curveTo(8.5f, 18.69f, 8.19f, 19f, 7.81f, 19f)
                        horizontalLineTo(7.69f)
                        curveTo(7.31f, 19f, 7f, 18.69f, 7f, 18.31f)
                        verticalLineTo(14f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(2.5f)
                        curveToRelative(0.82f, 0f, 1.5f, 0.68f, 1.5f, 1.5f)
                        verticalLineTo(15.5f)
                        close()
                        moveTo(11.25f, 12f)
                        lineTo(11.25f, 12f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                        verticalLineTo(9.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(1.75f)
                        curveTo(8.5f, 11.66f, 8.16f, 12f, 7.75f, 12f)
                        horizontalLineToRelative(0f)
                        curveTo(7.34f, 12f, 7f, 11.66f, 7f, 11.25f)
                        verticalLineToRelative(-4.5f)
                        curveTo(7f, 6.34f, 7.34f, 6f, 7.75f, 6f)
                        horizontalLineToRelative(0f)
                        curveTo(8.16f, 6f, 8.5f, 6.34f, 8.5f, 6.75f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(6.75f)
                        curveTo(10.5f, 6.34f, 10.84f, 6f, 11.25f, 6f)
                        horizontalLineToRelative(0f)
                        curveTo(11.66f, 6f, 12f, 6.34f, 12f, 6.75f)
                        verticalLineToRelative(4.5f)
                        curveTo(12f, 11.66f, 11.66f, 12f, 11.25f, 12f)
                        close()
                        moveTo(16.75f, 16f)
                        horizontalLineTo(16f)
                        verticalLineToRelative(0.75f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                        verticalLineTo(16f)
                        horizontalLineToRelative(-0.75f)
                        curveTo(13.34f, 16f, 13f, 15.66f, 13f, 15.25f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                        horizontalLineToRelative(0.75f)
                        verticalLineToRelative(-0.75f)
                        curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                        verticalLineToRelative(0.74f)
                        horizontalLineToRelative(0.75f)
                        curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                        verticalLineToRelative(0.01f)
                        curveTo(17.5f, 15.66f, 17.16f, 16f, 16.75f, 16f)
                        close()
                        moveTo(17.5f, 10.5f)
                        curveToRelative(0f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f)
                        horizontalLineToRelative(-2.5f)
                        curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                        verticalLineToRelative(-5f)
                        curveTo(13f, 6.22f, 13.22f, 6f, 13.5f, 6f)
                        horizontalLineTo(16f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.68f, 1.5f, 1.5f)
                        verticalLineTo(10.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_plus!!
    }

private var _Hdr_plus: ImageVector? = null

