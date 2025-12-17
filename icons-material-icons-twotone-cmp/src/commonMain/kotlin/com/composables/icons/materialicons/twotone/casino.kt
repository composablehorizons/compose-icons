package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Casino: ImageVector
    get() {
        if (_Casino != null) return _Casino!!
        
        _Casino = ImageVector.Builder(
            name = "casino",
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
                moveTo(5f, 19f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                close()
                moveTo(16.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(17.33f, 9f, 16.5f, 9f)
                reflectiveCurveTo(15f, 8.33f, 15f, 7.5f)
                reflectiveCurveTo(15.67f, 6f, 16.5f, 6f)
                close()
                moveToRelative(0f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12f, 10.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(7.5f, 6f)
                curveTo(8.33f, 6f, 9f, 6.67f, 9f, 7.5f)
                reflectiveCurveTo(8.33f, 9f, 7.5f, 9f)
                reflectiveCurveTo(6f, 8.33f, 6f, 7.5f)
                reflectiveCurveTo(6.67f, 6f, 7.5f, 6f)
                close()
                moveToRelative(0f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(8.33f, 18f, 7.5f, 18f)
                reflectiveCurveTo(6f, 17.33f, 6f, 16.5f)
                reflectiveCurveTo(6.67f, 15f, 7.5f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 18f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 18f, 7.5f)
                close()
            }
        }.build()
        
        return _Casino!!
    }

private var _Casino: ImageVector? = null

