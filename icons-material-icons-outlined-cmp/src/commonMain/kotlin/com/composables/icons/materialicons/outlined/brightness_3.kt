package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Brightness_3: ImageVector
    get() {
        if (_Brightness_3 != null) return _Brightness_3!!
        
        _Brightness_3 = ImageVector.Builder(
            name = "brightness_3",
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
                moveTo(12.7f, 4.91f)
                curveTo(15.25f, 6.24f, 17f, 8.92f, 17f, 12f)
                reflectiveCurveToRelative(-1.75f, 5.76f, -4.3f, 7.09f)
                curveToRelative(1.46f, -2f, 2.3f, -4.46f, 2.3f, -7.09f)
                reflectiveCurveToRelative(-0.84f, -5.09f, -2.3f, -7.09f)
                moveTo(9f, 2f)
                curveToRelative(-1.05f, 0f, -2.05f, 0.16f, -3f, 0.46f)
                curveToRelative(4.06f, 1.27f, 7f, 5.06f, 7f, 9.54f)
                reflectiveCurveToRelative(-2.94f, 8.27f, -7f, 9.54f)
                curveToRelative(0.95f, 0.3f, 1.95f, 0.46f, 3f, 0.46f)
                curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(14.52f, 2f, 9f, 2f)
                close()
            }
        }.build()
        
        return _Brightness_3!!
    }

private var _Brightness_3: ImageVector? = null

