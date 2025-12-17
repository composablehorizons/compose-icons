package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Phishing: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 9f)
                    curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                    verticalLineTo(3f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(3.18f)
                    curveTo(13.84f, 6.6f, 13f, 7.7f, 13f, 9f)
                    reflectiveCurveToRelative(0.84f, 2.4f, 2f, 2.82f)
                    lineToRelative(0f, 3.01f)
                    curveToRelative(0f, 2.09f, -1.52f, 3.96f, -3.6f, 4.16f)
                    curveTo(9.02f, 19.21f, 7f, 17.34f, 7f, 15f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(1.79f)
                    curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                    lineTo(5.85f, 9.85f)
                    curveTo(5.54f, 9.54f, 5f, 9.76f, 5f, 10.21f)
                    lineToRelative(0f, 4.58f)
                    curveToRelative(0f, 3.05f, 2.19f, 5.77f, 5.21f, 6.16f)
                    curveTo(13.87f, 21.42f, 17f, 18.57f, 17f, 15f)
                    verticalLineToRelative(-3.18f)
                    curveTo(18.16f, 11.4f, 19f, 10.3f, 19f, 9f)
                    close()
                    moveTo(16f, 10f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    reflectiveCurveTo(16.55f, 10f, 16f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Phishing!!
    }

private var _Phishing: ImageVector? = null

