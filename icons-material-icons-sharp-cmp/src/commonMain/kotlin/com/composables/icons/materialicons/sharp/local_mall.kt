package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Local_mall: ImageVector
    get() {
        if (_Local_mall != null) return _Local_mall!!
        
        _Local_mall = ImageVector.Builder(
            name = "local_mall",
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
                moveTo(21f, 6f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveTo(7f, 3.24f, 7f, 6f)
                horizontalLineTo(3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(18f)
                verticalLineTo(6f)
                close()
                moveToRelative(-9f, -3f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                horizontalLineTo(9f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                close()
                moveToRelative(0f, 10f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
            }
        }.build()
        
        return _Local_mall!!
    }

private var _Local_mall: ImageVector? = null

