package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Autofps_select: ImageVector
    get() {
        if (_Autofps_select != null) return _Autofps_select!!
        
        _Autofps_select = ImageVector.Builder(
            name = "autofps_select",
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
                        moveTo(12.03f, 6.3f)
                        lineTo(11.97f, 6.3f)
                        lineTo(10.95f, 9.19f)
                        lineTo(13.05f, 9.19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 22f)
                        lineTo(4f, 22f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        curveTo(3f, 21.55f, 3.45f, 22f, 4f, 22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 15f)
                        curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                        reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                        reflectiveCurveTo(6f, 5.69f, 6f, 9f)
                        reflectiveCurveTo(8.69f, 15f, 12f, 15f)
                        close()
                        moveTo(12f, 5f)
                        lineTo(12f, 5f)
                        curveToRelative(0.38f, 0f, 0.71f, 0.23f, 0.85f, 0.59f)
                        lineToRelative(2.12f, 5.65f)
                        curveToRelative(0.14f, 0.37f, -0.13f, 0.76f, -0.53f, 0.76f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.24f, 0f, -0.45f, -0.15f, -0.53f, -0.38f)
                        lineToRelative(-0.49f, -1.41f)
                        horizontalLineToRelative(-2.83f)
                        lineToRelative(-0.5f, 1.41f)
                        curveTo(10.01f, 11.85f, 9.8f, 12f, 9.56f, 12f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.39f, 0f, -0.67f, -0.39f, -0.53f, -0.76f)
                        lineToRelative(2.12f, -5.65f)
                        curveTo(11.29f, 5.23f, 11.62f, 5f, 12f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 22f)
                        lineTo(8f, 22f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        curveTo(7f, 21.55f, 7.45f, 22f, 8f, 22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 22f)
                        lineTo(12f, 22f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        curveTo(11f, 21.55f, 11.45f, 22f, 12f, 22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 18f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-4f)
                        curveTo(15.45f, 17f, 15f, 17.45f, 15f, 18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Autofps_select!!
    }

private var _Autofps_select: ImageVector? = null

