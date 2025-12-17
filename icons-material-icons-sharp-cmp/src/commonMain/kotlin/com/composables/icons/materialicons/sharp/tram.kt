package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Tram: ImageVector
    get() {
        if (_Tram != null) return _Tram!!
        
        _Tram = ImageVector.Builder(
            name = "tram",
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
                moveTo(13f, 5f)
                lineToRelative(0.75f, -1.5f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.75f)
                lineTo(11f, 5f)
                curveToRelative(-3.13f, 0.09f, -6f, 0.73f, -6f, 3.5f)
                verticalLineTo(17f)
                curveToRelative(0f, 1.5f, 1.11f, 2.73f, 2.55f, 2.95f)
                lineTo(6f, 21.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(4f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-1.55f, -1.55f)
                curveTo(17.89f, 19.73f, 19f, 18.5f, 19f, 17f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -2.77f, -2.87f, -3.41f, -6f, -3.5f)
                close()
                moveToRelative(-1f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveToRelative(5f, -4.5f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _Tram!!
    }

private var _Tram: ImageVector? = null

