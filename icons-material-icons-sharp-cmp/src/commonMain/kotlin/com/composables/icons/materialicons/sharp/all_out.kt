package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.All_out: ImageVector
    get() {
        if (_All_out != null) return _All_out!!
        
        _All_out = ImageVector.Builder(
            name = "all_out",
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
                moveTo(4f, 4f)
                verticalLineToRelative(4f)
                lineToRelative(4f, -4f)
                close()
                moveToRelative(12f, 0f)
                lineToRelative(4f, 4f)
                verticalLineTo(4f)
                close()
                moveToRelative(4f, 16f)
                verticalLineToRelative(-4f)
                lineToRelative(-4f, 4f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(4f)
                lineToRelative(-4f, -4f)
                close()
                moveToRelative(15f, -8f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.13f, -7f, 7f)
                reflectiveCurveToRelative(3.13f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.13f, 7f, -7f)
                close()
                moveToRelative(-7f, 5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.build()
        
        return _All_out!!
    }

private var _All_out: ImageVector? = null

