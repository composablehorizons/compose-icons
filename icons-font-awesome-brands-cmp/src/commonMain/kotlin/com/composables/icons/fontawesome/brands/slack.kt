package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Slack: ImageVector
    get() {
        if (_Slack != null) return _Slack!!
        
        _Slack = ImageVector.Builder(
            name = "slack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(94.12f, 315.1f)
                curveToRelative(0f, 25.9f, -21.16f, 47.06f, -47.06f, 47.06f)
                reflectiveCurveTo(0f, 341f, 0f, 315.1f)
                curveToRelative(0f, -25.9f, 21.16f, -47.06f, 47.06f, -47.06f)
                horizontalLineToRelative(47.06f)
                verticalLineToRelative(47.06f)
                close()
                moveToRelative(23.72f, 0f)
                curveToRelative(0f, -25.9f, 21.16f, -47.06f, 47.06f, -47.06f)
                reflectiveCurveToRelative(47.06f, 21.16f, 47.06f, 47.06f)
                verticalLineToRelative(117.84f)
                curveToRelative(0f, 25.9f, -21.16f, 47.06f, -47.06f, 47.06f)
                reflectiveCurveToRelative(-47.06f, -21.16f, -47.06f, -47.06f)
                verticalLineTo(315.1f)
                close()
                moveToRelative(47.06f, -188.98f)
                curveToRelative(-25.9f, 0f, -47.06f, -21.16f, -47.06f, -47.06f)
                reflectiveCurveTo(139f, 32f, 164.9f, 32f)
                reflectiveCurveToRelative(47.06f, 21.16f, 47.06f, 47.06f)
                verticalLineToRelative(47.06f)
                horizontalLineTo(164.9f)
                close()
                moveToRelative(0f, 23.72f)
                curveToRelative(25.9f, 0f, 47.06f, 21.16f, 47.06f, 47.06f)
                reflectiveCurveToRelative(-21.16f, 47.06f, -47.06f, 47.06f)
                horizontalLineTo(47.06f)
                curveTo(21.16f, 243.96f, 0f, 222.8f, 0f, 196.9f)
                reflectiveCurveToRelative(21.16f, -47.06f, 47.06f, -47.06f)
                horizontalLineTo(164.9f)
                close()
                moveToRelative(188.98f, 47.06f)
                curveToRelative(0f, -25.9f, 21.16f, -47.06f, 47.06f, -47.06f)
                curveToRelative(25.9f, 0f, 47.06f, 21.16f, 47.06f, 47.06f)
                reflectiveCurveToRelative(-21.16f, 47.06f, -47.06f, 47.06f)
                horizontalLineToRelative(-47.06f)
                verticalLineTo(196.9f)
                close()
                moveToRelative(-23.72f, 0f)
                curveToRelative(0f, 25.9f, -21.16f, 47.06f, -47.06f, 47.06f)
                curveToRelative(-25.9f, 0f, -47.06f, -21.16f, -47.06f, -47.06f)
                verticalLineTo(79.06f)
                curveToRelative(0f, -25.9f, 21.16f, -47.06f, 47.06f, -47.06f)
                curveToRelative(25.9f, 0f, 47.06f, 21.16f, 47.06f, 47.06f)
                verticalLineTo(196.9f)
                close()
                moveTo(283.1f, 385.88f)
                curveToRelative(25.9f, 0f, 47.06f, 21.16f, 47.06f, 47.06f)
                curveToRelative(0f, 25.9f, -21.16f, 47.06f, -47.06f, 47.06f)
                curveToRelative(-25.9f, 0f, -47.06f, -21.16f, -47.06f, -47.06f)
                verticalLineToRelative(-47.06f)
                horizontalLineToRelative(47.06f)
                close()
                moveToRelative(0f, -23.72f)
                curveToRelative(-25.9f, 0f, -47.06f, -21.16f, -47.06f, -47.06f)
                curveToRelative(0f, -25.9f, 21.16f, -47.06f, 47.06f, -47.06f)
                horizontalLineToRelative(117.84f)
                curveToRelative(25.9f, 0f, 47.06f, 21.16f, 47.06f, 47.06f)
                curveToRelative(0f, 25.9f, -21.16f, 47.06f, -47.06f, 47.06f)
                horizontalLineTo(283.1f)
                close()
            }
        }.build()
        
        return _Slack!!
    }

private var _Slack: ImageVector? = null

