package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Variable: ImageVector
    get() {
        if (_Variable != null) return _Variable!!
        
        _Variable = ImageVector.Builder(
            name = "variable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.212f, 2.079f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.006f, 0.336f)
                arcTo(16.932f, 16.932f, 0f, false, true, 18f, 10f)
                curveToRelative(0f, 2.724f, -0.641f, 5.3f, -1.782f, 7.585f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.342f, -0.67f)
                arcTo(15.432f, 15.432f, 0f, false, false, 16.5f, 10f)
                curveToRelative(0f, -2.486f, -0.585f, -4.834f, -1.624f, -6.915f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.336f, -1.006f)
                close()
                moveToRelative(-10.424f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.336f, 1.006f)
                arcTo(15.433f, 15.433f, 0f, false, false, 3.5f, 10f)
                curveToRelative(0f, 2.486f, 0.585f, 4.834f, 1.624f, 6.915f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.342f, 0.67f)
                arcTo(16.933f, 16.933f, 0f, false, true, 2f, 10f)
                curveToRelative(0f, -2.724f, 0.641f, -5.3f, 1.782f, -7.585f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.006f, -0.336f)
                close()
                moveToRelative(2.285f, 3.554f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.219f, 0.677f)
                lineToRelative(0.856f, 2.08f)
                lineToRelative(1.146f, -1.77f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 3.137f, -0.65f)
                lineToRelative(0.235f, 0.156f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.832f, 1.248f)
                lineToRelative(-0.235f, -0.156f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.045f, 0.216f)
                lineToRelative(-1.71f, 2.644f)
                lineToRelative(1.251f, 3.04f)
                lineToRelative(0.739f, -0.492f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.832f, 1.248f)
                lineToRelative(-0.739f, 0.493f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -2.219f, -0.677f)
                lineToRelative(-0.856f, -2.08f)
                lineToRelative(-1.146f, 1.77f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -3.137f, 0.65f)
                lineToRelative(-0.235f, -0.156f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.832f, -1.248f)
                lineToRelative(0.235f, 0.157f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.045f, -0.217f)
                lineToRelative(1.71f, -2.644f)
                lineToRelative(-1.251f, -3.04f)
                lineToRelative(-0.739f, 0.492f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.832f, -1.248f)
                lineToRelative(0.739f, -0.493f)
                close()
            }
        }.build()
        
        return _Variable!!
    }

private var _Variable: ImageVector? = null

