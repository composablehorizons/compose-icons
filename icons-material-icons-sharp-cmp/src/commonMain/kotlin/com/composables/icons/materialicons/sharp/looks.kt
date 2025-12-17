package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Looks: ImageVector
    get() {
        if (_Looks != null) return _Looks!!
        
        _Looks = ImageVector.Builder(
            name = "looks",
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
                moveTo(12f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveToRelative(0f, -4f)
                curveTo(5.93f, 6f, 1f, 10.93f, 1f, 17f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                close()
            }
        }.build()
        
        return _Looks!!
    }

private var _Looks: ImageVector? = null

