package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Brightness_6: ImageVector
    get() {
        if (_Brightness_6 != null) return _Brightness_6!!
        
        _Brightness_6 = ImageVector.Builder(
            name = "brightness_6",
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
                moveToRelative(-6f, 7.98f)
                verticalLineToRelative(-11f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
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
                moveTo(12f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveTo(15.03f, 6.5f, 12f, 6.5f)
                close()
            }
        }.build()
        
        return _Brightness_6!!
    }

private var _Brightness_6: ImageVector? = null

