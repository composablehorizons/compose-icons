package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hdr_plus: ImageVector
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
                        moveTo(8.13f, 19f)
                        curveToRelative(1.15f, 0.64f, 2.47f, 1f, 3.87f, 1f)
                        curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                        reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                        reflectiveCurveToRelative(-8f, 3.59f, -8f, 8f)
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
                        close()
                        moveTo(12f, 2f)
                        curveToRelative(5.52f, 0f, 10f, 4.48f, 10f, 10f)
                        reflectiveCurveToRelative(-4.48f, 10f, -10f, 10f)
                        reflectiveCurveTo(2f, 17.52f, 2f, 12f)
                        reflectiveCurveTo(6.48f, 2f, 12f, 2f)
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
                        moveTo(10.5f, 15.5f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(10.5f)
                        close()
                        moveTo(10.5f, 8f)
                        verticalLineTo(6f)
                        horizontalLineTo(12f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineTo(9.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(12f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(10.5f)
                        close()
                        moveTo(16f, 6f)
                        curveToRelative(0.8f, 0f, 1.5f, 0.7f, 1.5f, 1.5f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(6f)
                        horizontalLineTo(16f)
                        close()
                        moveTo(16f, 10.5f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_plus!!
    }

private var _Hdr_plus: ImageVector? = null

