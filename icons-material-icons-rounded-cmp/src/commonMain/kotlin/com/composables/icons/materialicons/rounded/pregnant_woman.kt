package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pregnant_woman: ImageVector
    get() {
        if (_Pregnant_woman != null) return _Pregnant_woman!!
        
        _Pregnant_woman = ImageVector.Builder(
            name = "pregnant_woman",
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
                moveTo(9f, 4f)
                curveToRelative(0f, -1.11f, 0.89f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.89f, 2f, 2f)
                reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.89f, -2f, -2f)
                close()
                moveToRelative(7f, 9f)
                curveToRelative(-0.01f, -1.34f, -0.83f, -2.51f, -2f, -3f)
                curveToRelative(0f, -1.71f, -1.42f, -3.08f, -3.16f, -3f)
                curveTo(9.22f, 7.09f, 8f, 8.54f, 8f, 10.16f)
                verticalLineTo(16f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(17f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Pregnant_woman!!
    }

private var _Pregnant_woman: ImageVector? = null

