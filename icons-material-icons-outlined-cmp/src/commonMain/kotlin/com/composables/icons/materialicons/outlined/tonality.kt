package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Tonality: ImageVector
    get() {
        if (_Tonality != null) return _Tonality!!
        
        _Tonality = ImageVector.Builder(
            name = "tonality",
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
                moveToRelative(-1f, 17.93f)
                curveToRelative(-3.94f, -0.49f, -7f, -3.85f, -7f, -7.93f)
                reflectiveCurveToRelative(3.05f, -7.44f, 7f, -7.93f)
                verticalLineToRelative(15.86f)
                close()
                moveToRelative(2f, -15.86f)
                curveToRelative(1.03f, 0.13f, 2f, 0.45f, 2.87f, 0.93f)
                horizontalLineTo(13f)
                verticalLineToRelative(-0.93f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(5.24f)
                curveToRelative(0.25f, 0.31f, 0.48f, 0.65f, 0.68f, 1f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineToRelative(6.74f)
                curveToRelative(0.08f, 0.33f, 0.15f, 0.66f, 0.19f, 1f)
                horizontalLineTo(13f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(0f, 9.93f)
                verticalLineTo(19f)
                horizontalLineToRelative(2.87f)
                curveToRelative(-0.87f, 0.48f, -1.84f, 0.8f, -2.87f, 0.93f)
                close()
                moveTo(18.24f, 17f)
                horizontalLineTo(13f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.92f)
                curveToRelative(-0.2f, 0.35f, -0.43f, 0.69f, -0.68f, 1f)
                close()
                moveToRelative(1.5f, -3f)
                horizontalLineTo(13f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.04f, 0.34f, -0.11f, 0.67f, -0.19f, 1f)
                close()
            }
        }.build()
        
        return _Tonality!!
    }

private var _Tonality: ImageVector? = null

