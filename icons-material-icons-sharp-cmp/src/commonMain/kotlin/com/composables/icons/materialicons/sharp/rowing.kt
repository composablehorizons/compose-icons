package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Rowing: ImageVector
    get() {
        if (_Rowing != null) return _Rowing!!
        
        _Rowing = ImageVector.Builder(
            name = "rowing",
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
                moveTo(8.5f, 14.5f)
                lineTo(4f, 19f)
                lineToRelative(1.5f, 1.5f)
                lineTo(9f, 17f)
                horizontalLineToRelative(2f)
                lineToRelative(-2.5f, -2.5f)
                close()
                moveTo(15f, 1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(6f, 20.01f)
                lineTo(18f, 24f)
                lineToRelative(-2.99f, -3.01f)
                verticalLineTo(19.5f)
                lineToRelative(-7.1f, -7.09f)
                curveToRelative(-0.31f, 0.05f, -0.61f, 0.07f, -0.91f, 0.07f)
                verticalLineToRelative(-2.16f)
                curveToRelative(1.66f, 0.03f, 3.61f, -0.87f, 4.67f, -2.04f)
                lineToRelative(1.4f, -1.55f)
                curveToRelative(0.19f, -0.21f, 0.43f, -0.38f, 0.69f, -0.5f)
                curveToRelative(0.29f, -0.14f, 0.62f, -0.23f, 0.96f, -0.23f)
                horizontalLineToRelative(0.03f)
                curveTo(15.99f, 6f, 17f, 7.01f, 17f, 8.25f)
                verticalLineTo(17f)
                lineToRelative(-0.92f, -0.83f)
                lineToRelative(-3.58f, -3.58f)
                verticalLineToRelative(-2.27f)
                curveToRelative(-0.63f, 0.52f, -1.43f, 1.02f, -2.29f, 1.39f)
                lineTo(16.5f, 18f)
                horizontalLineTo(18f)
                lineToRelative(3f, 3.01f)
                close()
            }
        }.build()
        
        return _Rowing!!
    }

private var _Rowing: ImageVector? = null

