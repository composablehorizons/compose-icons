package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Lightbulb_outline: ImageVector
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
                moveTo(9f, 21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineTo(9f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(3f, -19f)
                curveTo(8.14f, 2f, 5f, 5.14f, 5f, 9f)
                curveToRelative(0f, 2.38f, 1.19f, 4.47f, 3f, 5.74f)
                verticalLineTo(17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.26f)
                curveToRelative(1.81f, -1.27f, 3f, -3.36f, 3f, -5.74f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveToRelative(2.85f, 11.1f)
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

