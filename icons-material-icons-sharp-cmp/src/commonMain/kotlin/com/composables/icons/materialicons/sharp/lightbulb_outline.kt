package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Lightbulb_outline: ImageVector
    get() {
        if (_Lightbulb_outline != null) return _Lightbulb_outline!!
        
        _Lightbulb_outline = ImageVector.Builder(
            name = "lightbulb_outline",
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
                moveTo(9f, 22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(1.54f, -19.85f)
                curveToRelative(-2.75f, 0.56f, -4.94f, 2.81f, -5.43f, 5.58f)
                curveToRelative(-0.51f, 2.89f, 0.76f, 5.52f, 2.89f, 7.01f)
                verticalLineTo(18f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3.26f)
                curveToRelative(1.81f, -1.27f, 3f, -3.36f, 3f, -5.74f)
                curveToRelative(0f, -4.34f, -3.97f, -7.77f, -8.46f, -6.85f)
                close()
                moveToRelative(4.31f, 10.95f)
                lineToRelative(-0.85f, 0.6f)
                verticalLineTo(16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.3f)
                lineToRelative(-0.85f, -0.6f)
                curveTo(7.8f, 12.16f, 7f, 10.63f, 7f, 9f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.63f, -0.8f, 3.16f, -2.15f, 4.1f)
                close()
            }
        }.build()
        
        return _Lightbulb_outline!!
    }

private var _Lightbulb_outline: ImageVector? = null

