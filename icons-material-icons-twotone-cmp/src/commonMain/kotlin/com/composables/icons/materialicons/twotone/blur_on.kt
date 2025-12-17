package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Blur_on: ImageVector
    get() {
        if (_Blur_on != null) return _Blur_on!!
        
        _Blur_on = ImageVector.Builder(
            name = "blur_on",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 18f)
                arcTo(1f, 1f, 0f, false, true, 14f, 19f)
                arcTo(1f, 1f, 0f, false, true, 13f, 18f)
                arcTo(1f, 1f, 0f, false, true, 15f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 14f)
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
                moveTo(3f, 9.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(14.5f, 3f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
                moveTo(21f, 14.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 18f)
                arcTo(1f, 1f, 0f, false, true, 18f, 19f)
                arcTo(1f, 1f, 0f, false, true, 17f, 18f)
                arcTo(1f, 1f, 0f, false, true, 19f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 21f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                close()
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
                moveTo(19f, 14f)
                arcTo(1f, 1f, 0f, false, true, 18f, 15f)
                arcTo(1f, 1f, 0f, false, true, 17f, 14f)
                arcTo(1f, 1f, 0f, false, true, 19f, 14f)
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
                moveTo(7f, 18f)
                arcTo(1f, 1f, 0f, false, true, 6f, 19f)
                arcTo(1f, 1f, 0f, false, true, 5f, 18f)
                arcTo(1f, 1f, 0f, false, true, 7f, 18f)
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
                moveTo(3.5f, 14f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
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
                moveTo(7f, 10f)
                arcTo(1f, 1f, 0f, false, true, 6f, 11f)
                arcTo(1f, 1f, 0f, false, true, 5f, 10f)
                arcTo(1f, 1f, 0f, false, true, 7f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 6f)
                arcTo(1f, 1f, 0f, false, true, 6f, 7f)
                arcTo(1f, 1f, 0f, false, true, 5f, 6f)
                arcTo(1f, 1f, 0f, false, true, 7f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 21f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
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
                moveTo(10.5f, 3f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11.5f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11.5f, 10f)
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
        }.build()
        
        return _Blur_on!!
    }

private var _Blur_on: ImageVector? = null

