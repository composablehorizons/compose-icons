package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Alternate_email: ImageVector
    get() {
        if (_Alternate_email != null) return _Alternate_email!!
        
        _Alternate_email = ImageVector.Builder(
            name = "alternate_email",
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
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-4.34f, 0f, -8f, -3.66f, -8f, -8f)
                reflectiveCurveToRelative(3.66f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.66f, 8f, 8f)
                verticalLineToRelative(1.43f)
                curveToRelative(0f, 0.79f, -0.71f, 1.57f, -1.5f, 1.57f)
                reflectiveCurveToRelative(-1.5f, -0.78f, -1.5f, -1.57f)
                verticalLineTo(12f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.38f, 0f, 2.64f, -0.56f, 3.54f, -1.47f)
                curveToRelative(0.65f, 0.89f, 1.77f, 1.47f, 2.96f, 1.47f)
                curveToRelative(1.97f, 0f, 3.5f, -1.6f, 3.5f, -3.57f)
                verticalLineTo(12f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                close()
                moveToRelative(0f, 13f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                close()
            }
        }.build()
        
        return _Alternate_email!!
    }

private var _Alternate_email: ImageVector? = null

