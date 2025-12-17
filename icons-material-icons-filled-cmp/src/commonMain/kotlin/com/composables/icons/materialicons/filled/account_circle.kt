package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Account_circle: ImageVector
    get() {
        if (_Account_circle != null) return _Account_circle!!
        
        _Account_circle = ImageVector.Builder(
            name = "account_circle",
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
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(0f, 3f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveToRelative(0f, 14.2f)
                curveToRelative(-2.5f, 0f, -4.71f, -1.28f, -6f, -3.22f)
                curveToRelative(0.03f, -1.99f, 4f, -3.08f, 6f, -3.08f)
                curveToRelative(1.99f, 0f, 5.97f, 1.09f, 6f, 3.08f)
                curveToRelative(-1.29f, 1.94f, -3.5f, 3.22f, -6f, 3.22f)
                close()
            }
        }.build()
        
        return _Account_circle!!
    }

private var _Account_circle: ImageVector? = null

