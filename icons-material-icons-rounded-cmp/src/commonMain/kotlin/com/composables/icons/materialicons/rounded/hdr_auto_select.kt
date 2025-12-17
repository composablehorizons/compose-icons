package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hdr_auto_select: ImageVector
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
                        horizontalLineTo(7.25f)
                        curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                        verticalLineToRelative(4.5f)
                        curveTo(6.5f, 21.66f, 6.84f, 22f, 7.25f, 22f)
                        horizontalLineTo(10f)
                        curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                        verticalLineToRelative(-3f)
                        curveTo(11.5f, 16.67f, 10.83f, 16f, 10f, 16f)
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
                        moveTo(4.25f, 16f)
                        curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1.25f)
                        curveTo(1.5f, 16.34f, 1.16f, 16f, 0.75f, 16f)
                        reflectiveCurveTo(0f, 16.34f, 0f, 16.75f)
                        verticalLineToRelative(4.5f)
                        curveTo(0f, 21.66f, 0.34f, 22f, 0.75f, 22f)
                        reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                        verticalLineTo(19.5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(1.75f)
                        curveTo(3.5f, 21.66f, 3.84f, 22f, 4.25f, 22f)
                        reflectiveCurveTo(5f, 21.66f, 5f, 21.25f)
                        verticalLineToRelative(-4.5f)
                        curveTo(5f, 16.34f, 4.66f, 16f, 4.25f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(23.25f, 18.5f)
                        horizontalLineTo(22f)
                        verticalLineToRelative(-1.25f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                        verticalLineToRelative(1.25f)
                        horizontalLineToRelative(-1.25f)
                        curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                        reflectiveCurveTo(18.84f, 20f, 19.25f, 20f)
                        horizontalLineToRelative(1.25f)
                        verticalLineToRelative(1.25f)
                        curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                        reflectiveCurveTo(22f, 21.66f, 22f, 21.25f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(1.25f)
                        curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                        reflectiveCurveTo(23.66f, 18.5f, 23.25f, 18.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.5f, 16f)
                        horizontalLineToRelative(-2.75f)
                        curveTo(13.34f, 16f, 13f, 16.34f, 13f, 16.75f)
                        verticalLineToRelative(4.56f)
                        curveToRelative(0f, 0.38f, 0.31f, 0.69f, 0.69f, 0.69f)
                        horizontalLineToRelative(0.11f)
                        curveToRelative(0.38f, 0f, 0.69f, -0.31f, 0.69f, -0.69f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(1.1f)
                        lineToRelative(0.72f, 1.59f)
                        curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f)
                        curveToRelative(0.5f, 0f, 0.83f, -0.51f, 0.64f, -0.97f)
                        lineTo(17.1f, 19.9f)
                        curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f)
                        verticalLineToRelative(-1f)
                        curveTo(18f, 16.67f, 17.33f, 16f, 16.5f, 16f)
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
                        moveTo(14.44f, 11f)
                        curveToRelative(-0.24f, 0f, -0.45f, -0.15f, -0.53f, -0.38f)
                        lineToRelative(-0.49f, -1.41f)
                        horizontalLineToRelative(-2.83f)
                        lineToRelative(-0.5f, 1.41f)
                        curveTo(10.01f, 10.85f, 9.8f, 11f, 9.56f, 11f)
                        curveToRelative(-0.39f, 0f, -0.67f, -0.39f, -0.53f, -0.76f)
                        lineToRelative(2.12f, -5.65f)
                        curveTo(11.29f, 4.23f, 11.62f, 4f, 12f, 4f)
                        reflectiveCurveToRelative(0.71f, 0.23f, 0.85f, 0.59f)
                        lineToRelative(2.12f, 5.65f)
                        curveTo(15.11f, 10.61f, 14.84f, 11f, 14.44f, 11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_auto_select!!
    }

private var _Hdr_auto_select: ImageVector? = null

