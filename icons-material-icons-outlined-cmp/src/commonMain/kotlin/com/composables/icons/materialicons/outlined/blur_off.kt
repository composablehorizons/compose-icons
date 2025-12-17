package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Blur_off: ImageVector
    get() {
        if (_Blur_off != null) return _Blur_off!!
        
        _Blur_off = ImageVector.Builder(
            name = "blur_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 6f)
                arcTo(1f, 1f, 0f, false, true, 14f, 7f)
                arcTo(1f, 1f, 0f, false, true, 13f, 6f)
                arcTo(1f, 1f, 0f, false, true, 15f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.8f, 11.48f)
                lineToRelative(0.2f, 0.02f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                lineToRelative(0.02f, 0.2f)
                curveToRelative(0.09f, 0.67f, 0.61f, 1.19f, 1.28f, 1.28f)
                close()
                moveTo(14f, 3.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveToRelative(-4f, 0f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 10f)
                arcTo(1f, 1f, 0f, false, true, 18f, 11f)
                arcTo(1f, 1f, 0f, false, true, 17f, 10f)
                arcTo(1f, 1f, 0f, false, true, 19f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 6f)
                arcTo(1f, 1f, 0f, false, true, 18f, 7f)
                arcTo(1f, 1f, 0f, false, true, 17f, 6f)
                arcTo(1f, 1f, 0f, false, true, 19f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 10.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 6f)
                arcTo(1f, 1f, 0f, false, true, 10f, 7f)
                arcTo(1f, 1f, 0f, false, true, 9f, 6f)
                arcTo(1f, 1f, 0f, false, true, 11f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 14f)
                arcTo(1f, 1f, 0f, false, true, 18f, 15f)
                arcTo(1f, 1f, 0f, false, true, 17f, 14f)
                arcTo(1f, 1f, 0f, false, true, 19f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 18f)
                arcTo(1f, 1f, 0f, false, true, 6f, 19f)
                arcTo(1f, 1f, 0f, false, true, 5f, 18f)
                arcTo(1f, 1f, 0f, false, true, 7f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 20.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveToRelative(7f, -7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveToRelative(-18f, 0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 18f)
                arcTo(1f, 1f, 0f, false, true, 10f, 19f)
                arcTo(1f, 1f, 0f, false, true, 9f, 18f)
                arcTo(1f, 1f, 0f, false, true, 11f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 9.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveToRelative(7f, 11f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 14f)
                arcTo(1f, 1f, 0f, false, true, 6f, 15f)
                arcTo(1f, 1f, 0f, false, true, 5f, 14f)
                arcTo(1f, 1f, 0f, false, true, 7f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 5.27f)
                lineTo(6f, 8.77f)
                lineToRelative(0.28f, 0.28f)
                lineTo(6f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.1f, -0.03f, -0.19f, -0.06f, -0.28f)
                lineToRelative(2.81f, 2.81f)
                curveToRelative(-0.71f, 0.11f, -1.25f, 0.73f, -1.25f, 1.47f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.74f, 0f, 1.36f, -0.54f, 1.47f, -1.25f)
                lineToRelative(2.81f, 2.81f)
                curveToRelative(-0.09f, -0.03f, -0.18f, -0.06f, -0.28f, -0.06f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.1f, -0.03f, -0.19f, -0.06f, -0.28f)
                lineToRelative(3.78f, 3.78f)
                horizontalLineToRelative(0.01f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.91f, 3.86f)
                lineTo(2.5f, 5.27f)
                close()
            }
        }.build()
        
        return _Blur_off!!
    }

private var _Blur_off: ImageVector? = null

