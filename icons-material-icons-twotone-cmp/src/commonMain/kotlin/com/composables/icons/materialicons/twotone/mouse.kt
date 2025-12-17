package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mouse: ImageVector
    get() {
        if (_Mouse != null) return _Mouse!!
        
        _Mouse = ImageVector.Builder(
            name = "mouse",
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
                moveTo(13f, 3.16f)
                verticalLineTo(9f)
                horizontalLineToRelative(5f)
                curveToRelative(-0.04f, -2.94f, -2.19f, -5.37f, -5f, -5.84f)
                close()
                moveToRelative(-2f, 0f)
                curveTo(8.19f, 3.63f, 6.04f, 6.06f, 6f, 9f)
                horizontalLineToRelative(5f)
                verticalLineTo(3.16f)
                close()
                moveTo(11f, 11f)
                horizontalLineTo(6f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 9f)
                curveToRelative(-0.04f, -4.39f, -3.6f, -7.93f, -8f, -7.93f)
                reflectiveCurveTo(4.04f, 4.61f, 4f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                verticalLineTo(9f)
                close()
                moveToRelative(-7f, -5.84f)
                curveToRelative(2.81f, 0.47f, 4.96f, 2.9f, 5f, 5.84f)
                horizontalLineToRelative(-5f)
                verticalLineTo(3.16f)
                close()
                moveToRelative(-2f, 0f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                curveToRelative(0.04f, -2.94f, 2.19f, -5.37f, 5f, -5.84f)
                close()
                moveTo(18f, 15f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Mouse!!
    }

private var _Mouse: ImageVector? = null

