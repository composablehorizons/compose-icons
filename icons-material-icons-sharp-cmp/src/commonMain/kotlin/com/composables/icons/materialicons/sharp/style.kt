package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Style: ImageVector
    get() {
        if (_Style != null) return _Style!!
        
        _Style = ImageVector.Builder(
            name = "style",
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
                moveTo(3.87f, 20.21f)
                verticalLineToRelative(-9.03f)
                lineToRelative(-3.19f, 7.7f)
                lineToRelative(3.19f, 1.33f)
                close()
                moveToRelative(18.92f, -2.43f)
                lineTo(16.31f, 2.14f)
                lineTo(5.26f, 6.71f)
                lineToRelative(6.48f, 15.64f)
                lineToRelative(11.05f, -4.57f)
                close()
                moveTo(7.88f, 8.75f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(-2f, 13f)
                horizontalLineToRelative(3.45f)
                lineToRelative(-3.45f, -8.34f)
                verticalLineToRelative(8.34f)
                close()
            }
        }.build()
        
        return _Style!!
    }

private var _Style: ImageVector? = null

