package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Accessibility_new: ImageVector
    get() {
        if (_Accessibility_new != null) return _Accessibility_new!!
        
        _Accessibility_new = ImageVector.Builder(
            name = "accessibility_new",
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
                moveTo(20.75f, 6.99f)
                curveToRelative(-0.14f, -0.55f, -0.69f, -0.87f, -1.24f, -0.75f)
                curveToRelative(-2.38f, 0.53f, -5.03f, 0.76f, -7.51f, 0.76f)
                reflectiveCurveToRelative(-5.13f, -0.23f, -7.51f, -0.76f)
                curveToRelative(-0.55f, -0.12f, -1.1f, 0.2f, -1.24f, 0.75f)
                curveToRelative(-0.14f, 0.56f, 0.2f, 1.13f, 0.75f, 1.26f)
                curveToRelative(1.61f, 0.36f, 3.35f, 0.61f, 5f, 0.75f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(9f)
                curveToRelative(1.65f, -0.14f, 3.39f, -0.39f, 4.99f, -0.75f)
                curveToRelative(0.56f, -0.13f, 0.9f, -0.7f, 0.76f, -1.26f)
                close()
                moveTo(12f, 6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
            }
        }.build()
        
        return _Accessibility_new!!
    }

private var _Accessibility_new: ImageVector? = null

