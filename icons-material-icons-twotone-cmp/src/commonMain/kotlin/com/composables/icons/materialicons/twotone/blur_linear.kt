package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Blur_linear: ImageVector
    get() {
        if (_Blur_linear != null) return _Blur_linear!!
        
        _Blur_linear = ImageVector.Builder(
            name = "blur_linear",
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
                moveTo(17f, 16.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 12f)
                arcTo(1f, 1f, 0f, false, true, 9f, 13f)
                arcTo(1f, 1f, 0f, false, true, 8f, 12f)
                arcTo(1f, 1f, 0f, false, true, 10f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 8f)
                arcTo(1f, 1f, 0f, false, true, 13f, 9f)
                arcTo(1f, 1f, 0f, false, true, 12f, 8f)
                arcTo(1f, 1f, 0f, false, true, 14f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 16f)
                arcTo(1f, 1f, 0f, false, true, 13f, 17f)
                arcTo(1f, 1f, 0f, false, true, 12f, 16f)
                arcTo(1f, 1f, 0f, false, true, 14f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 12.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 12f)
                arcTo(1f, 1f, 0f, false, true, 13f, 13f)
                arcTo(1f, 1f, 0f, false, true, 12f, 12f)
                arcTo(1f, 1f, 0f, false, true, 14f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 8.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 16f)
                arcTo(1f, 1f, 0f, false, true, 9f, 17f)
                arcTo(1f, 1f, 0f, false, true, 8f, 16f)
                arcTo(1f, 1f, 0f, false, true, 10f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 8f)
                arcTo(1f, 1f, 0f, false, true, 9f, 9f)
                arcTo(1f, 1f, 0f, false, true, 8f, 8f)
                arcTo(1f, 1f, 0f, false, true, 10f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 19f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Blur_linear!!
    }

private var _Blur_linear: ImageVector? = null

