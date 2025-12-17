package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hdr_enhanced_select: ImageVector
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
                        curveTo(8.69f, 2f, 6f, 4.69f, 6f, 8f)
                        reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                        reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                        reflectiveCurveTo(15.31f, 2f, 12f, 2f)
                        close()
                        moveTo(14f, 9f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-1f)
                        curveTo(9.45f, 9f, 9f, 8.55f, 9f, 8f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(1f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(0f)
                        curveTo(15f, 8.55f, 14.55f, 9f, 14f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 16f)
                        horizontalLineTo(7f)
                        curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                        verticalLineToRelative(5f)
                        curveTo(6.5f, 21.78f, 6.72f, 22f, 7f, 22f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.82f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                        verticalLineToRelative(-3f)
                        curveTo(11.5f, 16.67f, 10.82f, 16f, 10f, 16f)
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
                        moveTo(16.5f, 16f)
                        horizontalLineTo(14f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(4.31f)
                        curveToRelative(0f, 0.38f, 0.31f, 0.69f, 0.69f, 0.69f)
                        horizontalLineToRelative(0.11f)
                        curveToRelative(0.38f, 0f, 0.69f, -0.31f, 0.69f, -0.69f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(1.1f)
                        lineToRelative(0.72f, 1.59f)
                        curveToRelative(0.11f, 0.25f, 0.36f, 0.41f, 0.63f, 0.41f)
                        horizontalLineToRelative(0f)
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
                        moveTo(3.5f, 18f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1.25f)
                        curveTo(1.5f, 16.34f, 1.16f, 16f, 0.75f, 16f)
                        horizontalLineToRelative(0f)
                        curveTo(0.34f, 16f, 0f, 16.34f, 0f, 16.75f)
                        verticalLineToRelative(4.5f)
                        curveTo(0f, 21.66f, 0.34f, 22f, 0.75f, 22f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                        verticalLineTo(19.5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(1.75f)
                        curveTo(3.5f, 21.66f, 3.84f, 22f, 4.25f, 22f)
                        horizontalLineToRelative(0f)
                        curveTo(4.66f, 22f, 5f, 21.66f, 5f, 21.25f)
                        verticalLineToRelative(-4.5f)
                        curveTo(5f, 16.34f, 4.66f, 16f, 4.25f, 16f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 18.5f)
                        verticalLineToRelative(-1.25f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                        verticalLineToRelative(1.25f)
                        horizontalLineToRelative(-1.25f)
                        curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                        horizontalLineToRelative(1.25f)
                        verticalLineToRelative(1.25f)
                        curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(1.25f)
                        curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        horizontalLineTo(22f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_enhanced_select!!
    }

private var _Hdr_enhanced_select: ImageVector? = null

