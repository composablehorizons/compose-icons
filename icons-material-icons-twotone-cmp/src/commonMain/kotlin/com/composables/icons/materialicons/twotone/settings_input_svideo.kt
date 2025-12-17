package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Settings_input_svideo: ImageVector
    get() {
        if (_Settings_input_svideo != null) return _Settings_input_svideo!!
        
        _Settings_input_svideo = ImageVector.Builder(
            name = "settings_input_svideo",
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
                moveTo(12f, 3f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveToRelative(-4.04f, -9f, -9f, -9f)
                close()
                moveToRelative(-7f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(7.33f, 13f, 6.5f, 13f)
                reflectiveCurveTo(5f, 12.33f, 5f, 11.5f)
                close()
                moveTo(8.5f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(7.67f, 15f, 8.5f, 15f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(9.33f, 18f, 8.5f, 18f)
                close()
                moveToRelative(2f, -10f)
                curveTo(9.67f, 8f, 9f, 7.33f, 9f, 6.5f)
                reflectiveCurveTo(9.67f, 5f, 10.5f, 5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(14.33f, 8f, 13.5f, 8f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveToRelative(2f, -5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 6.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveTo(9.67f, 5f, 9f, 5.67f, 9f, 6.5f)
                reflectiveCurveTo(9.67f, 8f, 10.5f, 8f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 19f, 11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveToRelative(0f, 20f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveToRelative(4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8f, 11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 16.5f)
                close()
            }
        }.build()
        
        return _Settings_input_svideo!!
    }

private var _Settings_input_svideo: ImageVector? = null

