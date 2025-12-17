package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.More: ImageVector
    get() {
        if (_More != null) return _More!!
        
        _More = ImageVector.Builder(
            name = "more",
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
                moveTo(7.06f, 5f)
                lineTo(2.4f, 12f)
                lineToRelative(4.67f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(7.06f)
                curveToRelative(0.01f, 0f, 0.01f, 0f, 0f, 0f)
                close()
                moveTo(19f, 10.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveToRelative(-5f, 0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveToRelative(-5f, 0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 3f)
                horizontalLineTo(7f)
                curveToRelative(-0.69f, 0f, -1.23f, 0.35f, -1.59f, 0.88f)
                lineTo(0f, 12f)
                lineToRelative(5.41f, 8.11f)
                curveToRelative(0.36f, 0.53f, 0.97f, 0.89f, 1.66f, 0.89f)
                horizontalLineTo(22f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(7.07f)
                lineTo(2.4f, 12f)
                lineToRelative(4.66f, -7f)
                horizontalLineTo(22f)
                verticalLineToRelative(14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 19f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 20.5f, 12f)
                close()
            }
        }.build()
        
        return _More!!
    }

private var _More: ImageVector? = null

