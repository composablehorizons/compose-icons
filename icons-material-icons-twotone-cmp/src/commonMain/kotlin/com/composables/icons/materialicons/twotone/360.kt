package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.`360`: ImageVector
    get() {
        if (_360 != null) return _360!!
        
        _360 = ImageVector.Builder(
            name = "360",
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
                moveTo(9f, 16.77f)
                verticalLineTo(20f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(2.73f)
                curveToRelative(-3.15f, -0.56f, -5f, -1.9f, -5f, -2.73f)
                curveToRelative(0f, -1.06f, 3.04f, -3f, 8f, -3f)
                reflectiveCurveToRelative(8f, 1.94f, 8f, 3f)
                curveToRelative(0f, 0.73f, -1.46f, 1.89f, -4f, 2.53f)
                verticalLineToRelative(2.05f)
                curveToRelative(3.53f, -0.77f, 6f, -2.53f, 6f, -4.58f)
                curveToRelative(0f, -2.76f, -4.48f, -5f, -10f, -5f)
                reflectiveCurveTo(2f, 9.24f, 2f, 12f)
                curveToRelative(0f, 2.24f, 2.94f, 4.13f, 7f, 4.77f)
                close()
            }
        }.build()
        
        return _360!!
    }

private var _360: ImageVector? = null

