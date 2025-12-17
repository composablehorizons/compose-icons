package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TypeH1: ImageVector
    get() {
        if (_TypeH1 != null) return _TypeH1!!
        
        _TypeH1 = ImageVector.Builder(
            name = "type-h1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.648f, 13f)
                verticalLineTo(3f)
                horizontalLineTo(6.3f)
                verticalLineToRelative(4.234f)
                horizontalLineTo(1.348f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1.348f)
                verticalLineTo(8.421f)
                horizontalLineTo(6.3f)
                verticalLineTo(13f)
                close()
                moveTo(14f, 13f)
                verticalLineTo(3f)
                horizontalLineToRelative(-1.333f)
                lineToRelative(-2.381f, 1.766f)
                verticalLineTo(6.12f)
                lineTo(12.6f, 4.443f)
                horizontalLineToRelative(0.066f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _TypeH1!!
    }

private var _TypeH1: ImageVector? = null

