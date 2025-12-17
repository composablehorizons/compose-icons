package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Pregnant_woman: ImageVector
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
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Pregnant_woman!!
    }

private var _Pregnant_woman: ImageVector? = null

