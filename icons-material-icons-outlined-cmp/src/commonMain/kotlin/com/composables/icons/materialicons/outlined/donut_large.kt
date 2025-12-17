package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Donut_large: ImageVector
    get() {
        if (_Donut_large != null) return _Donut_large!!
        
        _Donut_large = ImageVector.Builder(
            name = "donut_large",
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
                moveTo(13f, 5.08f)
                curveToRelative(3.06f, 0.44f, 5.48f, 2.86f, 5.92f, 5.92f)
                horizontalLineToRelative(3.03f)
                curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f)
                verticalLineToRelative(3.03f)
                close()
                moveTo(18.92f, 13f)
                curveToRelative(-0.44f, 3.06f, -2.86f, 5.48f, -5.92f, 5.92f)
                verticalLineToRelative(3.03f)
                curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f)
                horizontalLineToRelative(-3.03f)
                close()
                moveTo(11f, 18.92f)
                curveToRelative(-3.39f, -0.49f, -6f, -3.4f, -6f, -6.92f)
                reflectiveCurveToRelative(2.61f, -6.43f, 6f, -6.92f)
                verticalLineTo(2.05f)
                curveToRelative(-5.05f, 0.5f, -9f, 4.76f, -9f, 9.95f)
                curveToRelative(0f, 5.19f, 3.95f, 9.45f, 9f, 9.95f)
                verticalLineToRelative(-3.03f)
                close()
            }
        }.build()
        
        return _Donut_large!!
    }

private var _Donut_large: ImageVector? = null

