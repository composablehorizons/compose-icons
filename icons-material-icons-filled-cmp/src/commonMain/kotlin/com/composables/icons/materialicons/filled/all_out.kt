package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.All_out: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.21f, 4.16f)
                lineToRelative(4f, 4f)
                verticalLineToRelative(-4f)
                close()
                moveToRelative(4f, 12f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(-12f, 4f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(-4f, -12f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(12.95f, -0.95f)
                curveToRelative(-2.73f, -2.73f, -7.17f, -2.73f, -9.9f, 0f)
                reflectiveCurveToRelative(-2.73f, 7.17f, 0f, 9.9f)
                reflectiveCurveToRelative(7.17f, 2.73f, 9.9f, 0f)
                reflectiveCurveToRelative(2.73f, -7.16f, 0f, -9.9f)
                close()
                moveToRelative(-1.1f, 8.8f)
                curveToRelative(-2.13f, 2.13f, -5.57f, 2.13f, -7.7f, 0f)
                reflectiveCurveToRelative(-2.13f, -5.57f, 0f, -7.7f)
                reflectiveCurveToRelative(5.57f, -2.13f, 7.7f, 0f)
                reflectiveCurveToRelative(2.13f, 5.57f, 0f, 7.7f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0.21f, 0.16f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.build()
        
        return _All_out!!
    }

private var _All_out: ImageVector? = null

