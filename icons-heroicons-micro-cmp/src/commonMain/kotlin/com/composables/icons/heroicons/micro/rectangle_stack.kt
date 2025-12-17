package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.RectangleStack: ImageVector
    get() {
        if (_RectangleStack != null) return _RectangleStack!!
        
        _RectangleStack = ImageVector.Builder(
            name = "rectangle-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 2f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11f, 3.5f)
                horizontalLineTo(5f)
                close()
                moveTo(4.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 6.5f)
                verticalLineToRelative(0.041f)
                arcToRelative(3.02f, 3.02f, 0f, false, true, 0.5f, -0.041f)
                horizontalLineToRelative(9f)
                curveToRelative(0.17f, 0f, 0.337f, 0.014f, 0.5f, 0.041f)
                verticalLineTo(6.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.5f, 5f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(12.5f, 8f)
                horizontalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 9.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 14f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 8f)
                close()
            }
        }.build()
        
        return _RectangleStack!!
    }

private var _RectangleStack: ImageVector? = null

