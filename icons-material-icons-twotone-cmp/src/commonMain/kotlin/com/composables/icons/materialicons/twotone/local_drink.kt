package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Local_drink: ImageVector
    get() {
        if (_Local_drink != null) return _Local_drink!!
        
        _Local_drink = ImageVector.Builder(
            name = "local_drink",
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
                moveTo(7f, 20.01f)
                lineTo(17f, 20f)
                lineToRelative(1.1f, -10f)
                horizontalLineTo(5.89f)
                lineTo(7f, 20.01f)
                close()
                moveToRelative(5f, -9.41f)
                reflectiveCurveToRelative(3f, 3.4f, 3f, 5.4f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -2f, 3f, -5.4f, 3f, -5.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.01f, 20.23f)
                curveTo(5.13f, 21.23f, 5.97f, 22f, 7f, 22f)
                horizontalLineToRelative(10f)
                curveToRelative(1.03f, 0f, 1.87f, -0.77f, 1.99f, -1.77f)
                lineTo(21f, 2f)
                horizontalLineTo(3f)
                lineToRelative(2.01f, 18.23f)
                close()
                moveTo(17f, 20f)
                lineToRelative(-10f, 0.01f)
                lineTo(5.89f, 10f)
                horizontalLineTo(18.1f)
                lineTo(17f, 20f)
                close()
                moveToRelative(1.76f, -16f)
                lineToRelative(-0.43f, 4f)
                horizontalLineTo(5.67f)
                lineToRelative(-0.44f, -4f)
                horizontalLineToRelative(13.53f)
                close()
                moveTo(12f, 19f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -2f, -3f, -5.4f, -3f, -5.4f)
                reflectiveCurveTo(9f, 14f, 9f, 16f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                close()
                moveToRelative(0f, -5.09f)
                curveToRelative(0.59f, 0.91f, 1f, 1.73f, 1f, 2.09f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.37f, 0.41f, -1.19f, 1f, -2.09f)
                close()
            }
        }.build()
        
        return _Local_drink!!
    }

private var _Local_drink: ImageVector? = null

