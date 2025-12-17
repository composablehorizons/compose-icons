package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.AcademicCap: ImageVector
    get() {
        if (_AcademicCap != null) return _AcademicCap!!
        
        _AcademicCap = ImageVector.Builder(
            name = "academic-cap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.664f, 1.319f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.672f, 0f)
                arcToRelative(41.059f, 41.059f, 0f, false, true, 8.198f, 5.424f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.254f, 1.285f)
                arcToRelative(31.372f, 31.372f, 0f, false, false, -7.86f, 3.83f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.84f, 0f)
                arcToRelative(31.508f, 31.508f, 0f, false, false, -2.08f, -1.287f)
                verticalLineTo(9.394f)
                curveToRelative(0f, -0.244f, 0.116f, -0.463f, 0.302f, -0.592f)
                arcToRelative(35.504f, 35.504f, 0f, false, true, 3.305f, -2.033f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.714f, -1.319f)
                arcToRelative(37f, 37f, 0f, false, false, -3.446f, 2.12f)
                arcTo(2.216f, 2.216f, 0f, false, false, 6f, 9.393f)
                verticalLineToRelative(0.38f)
                arcToRelative(31.293f, 31.293f, 0f, false, false, -4.28f, -1.746f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.254f, -1.285f)
                arcToRelative(41.059f, 41.059f, 0f, false, true, 8.198f, -5.424f)
                close()
                moveTo(6f, 11.459f)
                arcToRelative(29.848f, 29.848f, 0f, false, false, -2.455f, -1.158f)
                arcToRelative(41.029f, 41.029f, 0f, false, false, -0.39f, 3.114f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.419f, 0.74f)
                curveToRelative(0.528f, 0.256f, 1.046f, 0.53f, 1.554f, 0.82f)
                curveToRelative(-0.21f, 0.324f, -0.455f, 0.63f, -0.739f, 0.914f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                curveToRelative(0.37f, -0.369f, 0.69f, -0.77f, 0.96f, -1.193f)
                arcToRelative(26.61f, 26.61f, 0f, false, true, 3.095f, 2.348f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.992f, 0f)
                arcToRelative(26.547f, 26.547f, 0f, false, true, 5.93f, -3.95f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.42f, -0.739f)
                arcToRelative(41.053f, 41.053f, 0f, false, false, -0.39f, -3.114f)
                arcToRelative(29.925f, 29.925f, 0f, false, false, -5.199f, 2.801f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.514f, 0f)
                curveToRelative(-0.41f, -0.275f, -0.826f, -0.541f, -1.25f, -0.797f)
                arcToRelative(6.985f, 6.985f, 0f, false, true, -1.084f, 3.45f)
                arcToRelative(26.503f, 26.503f, 0f, false, false, -1.281f, -0.78f)
                arcTo(5.487f, 5.487f, 0f, false, false, 6f, 12f)
                verticalLineToRelative(-0.54f)
                close()
            }
        }.build()
        
        return _AcademicCap!!
    }

private var _AcademicCap: ImageVector? = null

