package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Nature: ImageVector
    get() {
        if (_Nature != null) return _Nature!!
        
        _Nature = ImageVector.Builder(
            name = "nature",
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
                moveTo(13f, 16.12f)
                curveToRelative(3.47f, -0.41f, 6.17f, -3.36f, 6.17f, -6.95f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.13f, -7f, 7f)
                curveToRelative(0f, 3.47f, 2.52f, 6.34f, 5.83f, 6.89f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3.88f)
                close()
            }
        }.build()
        
        return _Nature!!
    }

private var _Nature: ImageVector? = null

