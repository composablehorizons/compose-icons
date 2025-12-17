package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mosque: ImageVector
    get() {
        if (_Mosque != null) return _Mosque!!
        
        _Mosque = ImageVector.Builder(
            name = "mosque",
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
                        moveTo(9.91f, 9f)
                        horizontalLineToRelative(4.18f)
                        curveTo(15.14f, 9f, 16f, 8.14f, 16f, 7.09f)
                        curveToRelative(0f, -0.64f, -0.32f, -1.23f, -0.85f, -1.59f)
                        lineTo(12f, 3.4f)
                        lineTo(8.85f, 5.5f)
                        curveTo(8.32f, 5.86f, 8f, 6.45f, 8f, 7.09f)
                        curveTo(8f, 8.14f, 8.86f, 9f, 9.91f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 11f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                        curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 4f)
                        curveToRelative(0f, 0f, -2f, 1.9f, -2f, 3f)
                        curveToRelative(0f, 0.74f, 0.4f, 1.38f, 1f, 1.72f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.95f, -0.66f, -1.74f, -1.55f, -1.94f)
                        curveTo(17.79f, 8.48f, 18f, 7.81f, 18f, 7.09f)
                        curveToRelative(0f, -1.31f, -0.65f, -2.53f, -1.74f, -3.25f)
                        lineTo(12f, 1f)
                        lineTo(7.74f, 3.84f)
                        curveTo(6.65f, 4.56f, 6f, 5.78f, 6f, 7.09f)
                        curveToRelative(0f, 0.72f, 0.21f, 1.39f, 0.55f, 1.96f)
                        curveTo(5.66f, 9.26f, 5f, 10.05f, 5f, 11f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(3f)
                        verticalLineTo(8.72f)
                        curveTo(3.6f, 8.38f, 4f, 7.74f, 4f, 7f)
                        curveToRelative(0f, -1.1f, -2f, -3f, -2f, -3f)
                        reflectiveCurveTo(0f, 5.9f, 0f, 7f)
                        curveToRelative(0f, 0.74f, 0.4f, 1.38f, 1f, 1.72f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(8.72f)
                        curveToRelative(0.6f, -0.35f, 1f, -0.98f, 1f, -1.72f)
                        curveTo(24f, 5.9f, 22f, 4f, 22f, 4f)
                        close()
                        moveTo(8.85f, 5.5f)
                        lineTo(12f, 3.4f)
                        lineToRelative(3.15f, 2.1f)
                        curveTo(15.68f, 5.86f, 16f, 6.45f, 16f, 7.09f)
                        curveTo(16f, 8.14f, 15.14f, 9f, 14.09f, 9f)
                        horizontalLineTo(9.91f)
                        curveTo(8.86f, 9f, 8f, 8.14f, 8f, 7.09f)
                        curveTo(8f, 6.45f, 8.32f, 5.86f, 8.85f, 5.5f)
                        close()
                        moveTo(21f, 19f)
                        horizontalLineToRelative(-6f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                        curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mosque!!
    }

private var _Mosque: ImageVector? = null

