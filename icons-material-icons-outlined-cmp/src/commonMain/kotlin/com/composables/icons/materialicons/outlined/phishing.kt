package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Phishing: ImageVector
    get() {
        if (_Phishing != null) return _Phishing!!
        
        _Phishing = ImageVector.Builder(
            name = "phishing",
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
                        moveTo(17f, 6.18f)
                        verticalLineTo(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(4.18f)
                        curveTo(13.84f, 6.6f, 13f, 7.7f, 13f, 9f)
                        reflectiveCurveToRelative(0.84f, 2.4f, 2f, 2.82f)
                        verticalLineTo(15f)
                        curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                        reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                        verticalLineToRelative(-1.17f)
                        lineToRelative(1.59f, 1.59f)
                        lineTo(10f, 14f)
                        lineTo(5f, 9f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                        reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                        verticalLineToRelative(-3.18f)
                        curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                        reflectiveCurveTo(18.16f, 6.6f, 17f, 6.18f)
                        close()
                        moveTo(16f, 10f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(16.55f, 10f, 16f, 10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Phishing!!
    }

private var _Phishing: ImageVector? = null

