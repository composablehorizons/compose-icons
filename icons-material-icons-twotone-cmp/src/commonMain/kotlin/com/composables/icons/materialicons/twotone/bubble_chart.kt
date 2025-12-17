package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Bubble_chart: ImageVector
    get() {
        if (_Bubble_chart != null) return _Bubble_chart!!
        
        _Bubble_chart = ImageVector.Builder(
            name = "bubble_chart",
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
                moveTo(16.5f, 12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(18.43f, 5f, 16.5f, 5f)
                reflectiveCurveTo(13f, 6.57f, 13f, 8.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.01f, 18f)
                arcTo(1f, 1f, 0f, false, true, 15.01f, 19f)
                arcTo(1f, 1f, 0f, false, true, 14.01f, 18f)
                arcTo(1f, 1f, 0f, false, true, 16.01f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 14f)
                arcTo(2f, 2f, 0f, false, true, 7f, 16f)
                arcTo(2f, 2f, 0f, false, true, 5f, 14f)
                arcTo(2f, 2f, 0f, false, true, 9f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 18f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveToRelative(0f, -6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveToRelative(11.01f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveToRelative(-4f, 0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveToRelative(2.49f, -4f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveTo(19.53f, 3f, 16.5f, 3f)
                reflectiveCurveTo(11f, 5.47f, 11f, 8.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                close()
                moveToRelative(0f, -9f)
                curveTo(18.43f, 5f, 20f, 6.57f, 20f, 8.5f)
                reflectiveCurveTo(18.43f, 12f, 16.5f, 12f)
                reflectiveCurveTo(13f, 10.43f, 13f, 8.5f)
                reflectiveCurveTo(14.57f, 5f, 16.5f, 5f)
                close()
            }
        }.build()
        
        return _Bubble_chart!!
    }

private var _Bubble_chart: ImageVector? = null

