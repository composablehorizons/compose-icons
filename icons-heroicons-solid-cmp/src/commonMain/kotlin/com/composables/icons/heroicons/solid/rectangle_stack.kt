package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.RectangleStack: ImageVector
    get() {
        if (_RectangleStack != null) return _RectangleStack!!
        
        _RectangleStack = ImageVector.Builder(
            name = "rectangle-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.566f, 4.657f)
                arcTo(4.505f, 4.505f, 0f, false, true, 6.75f, 4.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.41f, 0f, 0.806f, 0.055f, 1.183f, 0.157f)
                arcTo(3f, 3f, 0f, false, false, 15.75f, 3f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(3f, 3f, 0f, false, false, -2.684f, 1.657f)
                close()
                moveTo(2.25f, 12f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(5.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(5.25f, 7.5f)
                curveToRelative(-0.41f, 0f, -0.806f, 0.055f, -1.184f, 0.157f)
                arcTo(3f, 3f, 0f, false, true, 6.75f, 6f)
                horizontalLineToRelative(10.5f)
                arcToRelative(3f, 3f, 0f, false, true, 2.683f, 1.657f)
                arcTo(4.505f, 4.505f, 0f, false, false, 18.75f, 7.5f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()
        
        return _RectangleStack!!
    }

private var _RectangleStack: ImageVector? = null

