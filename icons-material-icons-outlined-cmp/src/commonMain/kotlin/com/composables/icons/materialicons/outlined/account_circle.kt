package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Account_circle: ImageVector
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
                verticalLineTo(0f)
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
                moveTo(7.07f, 18.28f)
                curveToRelative(0.43f, -0.9f, 3.05f, -1.78f, 4.93f, -1.78f)
                reflectiveCurveToRelative(4.51f, 0.88f, 4.93f, 1.78f)
                curveTo(15.57f, 19.36f, 13.86f, 20f, 12f, 20f)
                reflectiveCurveToRelative(-3.57f, -0.64f, -4.93f, -1.72f)
                close()
                moveToRelative(11.29f, -1.45f)
                curveToRelative(-1.43f, -1.74f, -4.9f, -2.33f, -6.36f, -2.33f)
                reflectiveCurveToRelative(-4.93f, 0.59f, -6.36f, 2.33f)
                curveTo(4.62f, 15.49f, 4f, 13.82f, 4f, 12f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                curveToRelative(0f, 1.82f, -0.62f, 3.49f, -1.64f, 4.83f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-1.94f, 0f, -3.5f, 1.56f, -3.5f, 3.5f)
                reflectiveCurveTo(10.06f, 13f, 12f, 13f)
                reflectiveCurveToRelative(3.5f, -1.56f, 3.5f, -3.5f)
                reflectiveCurveTo(13.94f, 6f, 12f, 6f)
                close()
                moveToRelative(0f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(11.17f, 8f, 12f, 8f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(12.83f, 11f, 12f, 11f)
                close()
            }
        }.build()
        
        return _Account_circle!!
    }

private var _Account_circle: ImageVector? = null

