package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Slack: ImageVector
    get() {
        if (_Slack != null) return _Slack!!
        
        _Slack = ImageVector.Builder(
            name = "slack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.362f, 10.11f)
                curveToRelative(0f, 0.926f, -0.756f, 1.681f, -1.681f, 1.681f)
                reflectiveCurveTo(0f, 11.036f, 0f, 10.111f)
                reflectiveCurveTo(0.756f, 8.43f, 1.68f, 8.43f)
                horizontalLineToRelative(1.682f)
                close()
                moveToRelative(0.846f, 0f)
                curveToRelative(0f, -0.924f, 0.756f, -1.68f, 1.681f, -1.68f)
                reflectiveCurveToRelative(1.681f, 0.756f, 1.681f, 1.68f)
                verticalLineToRelative(4.21f)
                curveToRelative(0f, 0.924f, -0.756f, 1.68f, -1.68f, 1.68f)
                arcToRelative(1.685f, 1.685f, 0f, false, true, -1.682f, -1.68f)
                close()
                moveTo(5.89f, 3.362f)
                curveToRelative(-0.926f, 0f, -1.682f, -0.756f, -1.682f, -1.681f)
                reflectiveCurveTo(4.964f, 0f, 5.89f, 0f)
                reflectiveCurveToRelative(1.68f, 0.756f, 1.68f, 1.68f)
                verticalLineToRelative(1.682f)
                close()
                moveToRelative(0f, 0.846f)
                curveToRelative(0.924f, 0f, 1.68f, 0.756f, 1.68f, 1.681f)
                reflectiveCurveTo(6.814f, 7.57f, 5.89f, 7.57f)
                horizontalLineTo(1.68f)
                curveTo(0.757f, 7.57f, 0f, 6.814f, 0f, 5.89f)
                curveToRelative(0f, -0.926f, 0.756f, -1.682f, 1.68f, -1.682f)
                close()
                moveToRelative(6.749f, 1.682f)
                curveToRelative(0f, -0.926f, 0.755f, -1.682f, 1.68f, -1.682f)
                reflectiveCurveTo(16f, 4.964f, 16f, 5.889f)
                reflectiveCurveToRelative(-0.756f, 1.681f, -1.68f, 1.681f)
                horizontalLineToRelative(-1.681f)
                close()
                moveToRelative(-0.848f, 0f)
                curveToRelative(0f, 0.924f, -0.755f, 1.68f, -1.68f, 1.68f)
                arcTo(1.685f, 1.685f, 0f, false, true, 8.43f, 5.89f)
                verticalLineTo(1.68f)
                curveTo(8.43f, 0.757f, 9.186f, 0f, 10.11f, 0f)
                curveToRelative(0.926f, 0f, 1.681f, 0.756f, 1.681f, 1.68f)
                close()
                moveToRelative(-1.681f, 6.748f)
                curveToRelative(0.926f, 0f, 1.682f, 0.756f, 1.682f, 1.681f)
                reflectiveCurveTo(11.036f, 16f, 10.11f, 16f)
                reflectiveCurveToRelative(-1.681f, -0.756f, -1.681f, -1.68f)
                verticalLineToRelative(-1.682f)
                horizontalLineToRelative(1.68f)
                close()
                moveToRelative(0f, -0.847f)
                curveToRelative(-0.924f, 0f, -1.68f, -0.755f, -1.68f, -1.68f)
                reflectiveCurveToRelative(0.756f, -1.681f, 1.68f, -1.681f)
                horizontalLineToRelative(4.21f)
                curveToRelative(0.924f, 0f, 1.68f, 0.756f, 1.68f, 1.68f)
                curveToRelative(0f, 0.926f, -0.756f, 1.681f, -1.68f, 1.681f)
                close()
            }
        }.build()
        
        return _Slack!!
    }

private var _Slack: ImageVector? = null

