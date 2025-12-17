package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.H3: ImageVector
    get() {
        if (_H3 != null) return _H3!!
        
        _H3 = ImageVector.Builder(
            name = "h3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.75f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(4.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2.75f, 4f)
                close()
                moveTo(15f, 9.5f)
                curveToRelative(-0.73f, 0f, -1.448f, 0.051f, -2.15f, 0.15f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.209f, -1.485f)
                arcToRelative(16.886f, 16.886f, 0f, false, true, 3.476f, -0.128f)
                curveToRelative(0.985f, 0.065f, 1.878f, 0.837f, 1.883f, 1.932f)
                verticalLineTo(10f)
                arcToRelative(6.75f, 6.75f, 0f, false, true, -0.301f, 2f)
                arcTo(6.75f, 6.75f, 0f, false, true, 18f, 14f)
                verticalLineToRelative(0.031f)
                curveToRelative(-0.005f, 1.095f, -0.898f, 1.867f, -1.883f, 1.932f)
                arcToRelative(17.018f, 17.018f, 0f, false, true, -3.467f, -0.127f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.209f, -1.485f)
                arcToRelative(15.377f, 15.377f, 0f, false, false, 3.16f, 0.115f)
                curveToRelative(0.308f, -0.02f, 0.48f, -0.24f, 0.48f, -0.441f)
                lineTo(16.5f, 14f)
                curveToRelative(0f, -0.431f, -0.052f, -0.85f, -0.15f, -1.25f)
                horizontalLineToRelative(-2.6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(2.6f)
                curveToRelative(0.098f, -0.4f, 0.15f, -0.818f, 0.15f, -1.25f)
                verticalLineToRelative(-0.024f)
                curveToRelative(-0.001f, -0.201f, -0.173f, -0.422f, -0.481f, -0.443f)
                arcTo(15.485f, 15.485f, 0f, false, false, 15f, 9.5f)
                close()
            }
        }.build()
        
        return _H3!!
    }

private var _H3: ImageVector? = null

