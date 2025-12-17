package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Brightness_high: ImageVector
    get() {
        if (_Brightness_high != null) return _Brightness_high!!
        
        _Brightness_high = ImageVector.Builder(
            name = "brightness_high",
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
                moveTo(18f, 9.52f)
                verticalLineTo(6f)
                horizontalLineToRelative(-3.52f)
                lineTo(12f, 3.52f)
                lineTo(9.52f, 6f)
                horizontalLineTo(6f)
                verticalLineToRelative(3.52f)
                lineTo(3.52f, 12f)
                lineTo(6f, 14.48f)
                verticalLineTo(18f)
                horizontalLineToRelative(3.52f)
                lineTo(12f, 20.48f)
                lineTo(14.48f, 18f)
                horizontalLineTo(18f)
                verticalLineToRelative(-3.52f)
                lineTo(20.48f, 12f)
                lineTo(18f, 9.52f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 8.69f)
                verticalLineTo(4f)
                horizontalLineToRelative(-4.69f)
                lineTo(12f, 0.69f)
                lineTo(8.69f, 4f)
                horizontalLineTo(4f)
                verticalLineToRelative(4.69f)
                lineTo(0.69f, 12f)
                lineTo(4f, 15.31f)
                verticalLineTo(20f)
                horizontalLineToRelative(4.69f)
                lineTo(12f, 23.31f)
                lineTo(15.31f, 20f)
                horizontalLineTo(20f)
                verticalLineToRelative(-4.69f)
                lineTo(23.31f, 12f)
                lineTo(20f, 8.69f)
                close()
                moveToRelative(-2f, 5.79f)
                verticalLineTo(18f)
                horizontalLineToRelative(-3.52f)
                lineTo(12f, 20.48f)
                lineTo(9.52f, 18f)
                horizontalLineTo(6f)
                verticalLineToRelative(-3.52f)
                lineTo(3.52f, 12f)
                lineTo(6f, 9.52f)
                verticalLineTo(6f)
                horizontalLineToRelative(3.52f)
                lineTo(12f, 3.52f)
                lineTo(14.48f, 6f)
                horizontalLineTo(18f)
                verticalLineToRelative(3.52f)
                lineTo(20.48f, 12f)
                lineTo(18f, 14.48f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveToRelative(0f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 12f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 9.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 14.5f, 12f)
                close()
            }
        }.build()
        
        return _Brightness_high!!
    }

private var _Brightness_high: ImageVector? = null

