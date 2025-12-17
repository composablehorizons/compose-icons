package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Title: ImageVector
    get() {
        if (_Title != null) return _Title!!
        
        _Title = ImageVector.Builder(
            name = "title",
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
                moveTo(5f, 5.5f)
                curveTo(5f, 6.33f, 5.67f, 7f, 6.5f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(18.33f, 4f, 17.5f, 4f)
                horizontalLineToRelative(-11f)
                curveTo(5.67f, 4f, 5f, 4.67f, 5f, 5.5f)
                close()
            }
        }.build()
        
        return _Title!!
    }

private var _Title: ImageVector? = null

