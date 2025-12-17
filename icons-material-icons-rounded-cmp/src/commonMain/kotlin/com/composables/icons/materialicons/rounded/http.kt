package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Http: ImageVector
    get() {
        if (_Http != null) return _Http!!
        
        _Http = ImageVector.Builder(
            name = "http",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9.75f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveTo(1f, 9.34f, 1f, 9.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(12.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                curveTo(6f, 9.34f, 5.66f, 9f, 5.25f, 9f)
                reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                verticalLineTo(11f)
                close()
                moveToRelative(3.25f, -0.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveTo(11.16f, 9f, 10.75f, 9f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                close()
                moveToRelative(5.5f, 0f)
                horizontalLineTo(14f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveTo(16.66f, 9f, 16.25f, 9f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                close()
                moveTo(21.5f, 9f)
                horizontalLineTo(19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.25f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                curveToRelative(0.83f, 0f, 1.5f, -0.68f, 1.5f, -1.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.82f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveToRelative(0f, 2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Http!!
    }

private var _Http: ImageVector? = null

