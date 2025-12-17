package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TypeUnderline: ImageVector
    get() {
        if (_TypeUnderline != null) return _TypeUnderline!!
        
        _TypeUnderline = ImageVector.Builder(
            name = "type-underline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.313f, 3.136f)
                horizontalLineToRelative(-1.23f)
                verticalLineTo(9.54f)
                curveToRelative(0f, 2.105f, 1.47f, 3.623f, 3.917f, 3.623f)
                reflectiveCurveToRelative(3.917f, -1.518f, 3.917f, -3.623f)
                verticalLineTo(3.136f)
                horizontalLineToRelative(-1.23f)
                verticalLineToRelative(6.323f)
                curveToRelative(0f, 1.49f, -0.978f, 2.57f, -2.687f, 2.57f)
                reflectiveCurveToRelative(-2.687f, -1.08f, -2.687f, -2.57f)
                close()
                moveTo(12.5f, 15f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(9f)
                close()
            }
        }.build()
        
        return _TypeUnderline!!
    }

private var _TypeUnderline: ImageVector? = null

