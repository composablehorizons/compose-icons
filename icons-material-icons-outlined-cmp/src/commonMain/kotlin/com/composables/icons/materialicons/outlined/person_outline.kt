package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Person_outline: ImageVector
    get() {
        if (_Person_outline != null) return _Person_outline!!
        
        _Person_outline = ImageVector.Builder(
            name = "person_outline",
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
                moveTo(12f, 5.9f)
                curveToRelative(1.16f, 0f, 2.1f, 0.94f, 2.1f, 2.1f)
                reflectiveCurveToRelative(-0.94f, 2.1f, -2.1f, 2.1f)
                reflectiveCurveTo(9.9f, 9.16f, 9.9f, 8f)
                reflectiveCurveToRelative(0.94f, -2.1f, 2.1f, -2.1f)
                moveToRelative(0f, 9f)
                curveToRelative(2.97f, 0f, 6.1f, 1.46f, 6.1f, 2.1f)
                verticalLineToRelative(1.1f)
                horizontalLineTo(5.9f)
                verticalLineTo(17f)
                curveToRelative(0f, -0.64f, 3.13f, -2.1f, 6.1f, -2.1f)
                moveTo(12f, 4f)
                curveTo(9.79f, 4f, 8f, 5.79f, 8f, 8f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveToRelative(0f, 9f)
                curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.66f, -5.33f, -4f, -8f, -4f)
                close()
            }
        }.build()
        
        return _Person_outline!!
    }

private var _Person_outline: ImageVector? = null

