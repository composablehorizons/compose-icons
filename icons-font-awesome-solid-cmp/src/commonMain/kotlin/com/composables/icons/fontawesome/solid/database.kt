package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Database: ImageVector
    get() {
        if (_Database != null) return _Database!!
        
        _Database = ImageVector.Builder(
            name = "database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 73.143f)
                verticalLineToRelative(45.714f)
                curveTo(448f, 159.143f, 347.667f, 192f, 224f, 192f)
                reflectiveCurveTo(0f, 159.143f, 0f, 118.857f)
                verticalLineTo(73.143f)
                curveTo(0f, 32.857f, 100.333f, 0f, 224f, 0f)
                reflectiveCurveToRelative(224f, 32.857f, 224f, 73.143f)
                close()
                moveTo(448f, 176f)
                verticalLineToRelative(102.857f)
                curveTo(448f, 319.143f, 347.667f, 352f, 224f, 352f)
                reflectiveCurveTo(0f, 319.143f, 0f, 278.857f)
                verticalLineTo(176f)
                curveToRelative(48.125f, 33.143f, 136.208f, 48.572f, 224f, 48.572f)
                reflectiveCurveTo(399.874f, 209.143f, 448f, 176f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(102.857f)
                curveTo(448f, 479.143f, 347.667f, 512f, 224f, 512f)
                reflectiveCurveTo(0f, 479.143f, 0f, 438.857f)
                verticalLineTo(336f)
                curveToRelative(48.125f, 33.143f, 136.208f, 48.572f, 224f, 48.572f)
                reflectiveCurveTo(399.874f, 369.143f, 448f, 336f)
                close()
            }
        }.build()
        
        return _Database!!
    }

private var _Database: ImageVector? = null

