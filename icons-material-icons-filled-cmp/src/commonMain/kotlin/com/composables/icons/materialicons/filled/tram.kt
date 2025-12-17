package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Tram: ImageVector
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
                moveTo(19f, 16.94f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -2.79f, -2.61f, -3.4f, -6.01f, -3.49f)
                lineToRelative(0.76f, -1.51f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.75f)
                lineToRelative(-0.76f, 1.52f)
                curveTo(7.86f, 5.11f, 5f, 5.73f, 5f, 8.5f)
                verticalLineToRelative(8.44f)
                curveToRelative(0f, 1.45f, 1.19f, 2.66f, 2.59f, 2.97f)
                lineTo(6f, 21.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2.23f)
                lineToRelative(2f, -2f)
                horizontalLineTo(14f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                lineTo(16.5f, 20f)
                horizontalLineToRelative(-0.08f)
                curveToRelative(1.69f, 0f, 2.58f, -1.37f, 2.58f, -3.06f)
                close()
                moveToRelative(-7f, 1.56f)
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

