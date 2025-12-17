package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Toll: ImageVector
    get() {
        if (_Toll != null) return _Toll!!
        
        _Toll = ImageVector.Builder(
            name = "toll",
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
                moveTo(15f, 4f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                reflectiveCurveToRelative(3.58f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                reflectiveCurveToRelative(-3.58f, -8f, -8f, -8f)
                close()
                moveToRelative(0f, 14f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -2.39f, 1.4f, -4.46f, 3.43f, -5.42f)
                curveToRelative(0.34f, -0.16f, 0.57f, -0.47f, 0.57f, -0.84f)
                verticalLineToRelative(-0.19f)
                curveToRelative(0f, -0.68f, -0.71f, -1.11f, -1.32f, -0.82f)
                curveTo(2.92f, 5.99f, 1f, 8.77f, 1f, 12f)
                reflectiveCurveToRelative(1.92f, 6.01f, 4.68f, 7.27f)
                curveToRelative(0.61f, 0.28f, 1.32f, -0.14f, 1.32f, -0.82f)
                verticalLineToRelative(-0.18f)
                curveToRelative(0f, -0.37f, -0.23f, -0.69f, -0.57f, -0.85f)
                curveTo(4.4f, 16.46f, 3f, 14.39f, 3f, 12f)
                close()
            }
        }.build()
        
        return _Toll!!
    }

private var _Toll: ImageVector? = null

