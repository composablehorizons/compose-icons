package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Flag: ImageVector
    get() {
        if (_Flag != null) return _Flag!!
        
        _Flag = ImageVector.Builder(
            name = "flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-4.392f)
                lineToRelative(1.657f, -0.348f)
                arcToRelative(6.449f, 6.449f, 0f, false, true, 4.271f, 0.572f)
                arcToRelative(7.948f, 7.948f, 0f, false, false, 5.965f, 0.524f)
                lineToRelative(2.078f, -0.64f)
                arcTo(0.75f, 0.75f, 0f, false, false, 18f, 12.25f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.904f, -0.734f)
                lineToRelative(-2.38f, 0.501f)
                arcToRelative(7.25f, 7.25f, 0f, false, true, -4.186f, -0.363f)
                lineToRelative(-0.502f, -0.2f)
                arcToRelative(8.75f, 8.75f, 0f, false, false, -5.053f, -0.439f)
                lineToRelative(-1.475f, 0.31f)
                verticalLineTo(2.75f)
                close()
            }
        }.build()
        
        return _Flag!!
    }

private var _Flag: ImageVector? = null

