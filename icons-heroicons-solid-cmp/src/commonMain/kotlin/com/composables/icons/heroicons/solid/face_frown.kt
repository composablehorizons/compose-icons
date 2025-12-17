package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.FaceFrown: ImageVector
    get() {
        if (_FaceFrown != null) return _FaceFrown!!
        
        _FaceFrown = ImageVector.Builder(
            name = "face-frown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveToRelative(-2.625f, 6f)
                curveToRelative(-0.54f, 0f, -0.828f, 0.419f, -0.936f, 0.634f)
                arcToRelative(1.96f, 1.96f, 0f, false, false, -0.189f, 0.866f)
                curveToRelative(0f, 0.298f, 0.059f, 0.605f, 0.189f, 0.866f)
                curveToRelative(0.108f, 0.215f, 0.395f, 0.634f, 0.936f, 0.634f)
                curveToRelative(0.54f, 0f, 0.828f, -0.419f, 0.936f, -0.634f)
                curveToRelative(0.13f, -0.26f, 0.189f, -0.568f, 0.189f, -0.866f)
                curveToRelative(0f, -0.298f, -0.059f, -0.605f, -0.189f, -0.866f)
                curveToRelative(-0.108f, -0.215f, -0.395f, -0.634f, -0.936f, -0.634f)
                close()
                moveToRelative(4.314f, 0.634f)
                curveToRelative(0.108f, -0.215f, 0.395f, -0.634f, 0.936f, -0.634f)
                curveToRelative(0.54f, 0f, 0.828f, 0.419f, 0.936f, 0.634f)
                curveToRelative(0.13f, 0.26f, 0.189f, 0.568f, 0.189f, 0.866f)
                curveToRelative(0f, 0.298f, -0.059f, 0.605f, -0.189f, 0.866f)
                curveToRelative(-0.108f, 0.215f, -0.395f, 0.634f, -0.936f, 0.634f)
                curveToRelative(-0.54f, 0f, -0.828f, -0.419f, -0.936f, -0.634f)
                arcToRelative(1.96f, 1.96f, 0f, false, true, -0.189f, -0.866f)
                curveToRelative(0f, -0.298f, 0.059f, -0.605f, 0.189f, -0.866f)
                close()
                moveToRelative(-4.34f, 7.964f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, -1.06f)
                arcToRelative(5.236f, 5.236f, 0f, false, true, 3.73f, -1.538f)
                arcToRelative(5.236f, 5.236f, 0f, false, true, 3.695f, 1.538f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.061f, 1.06f)
                arcToRelative(3.736f, 3.736f, 0f, false, false, -2.639f, -1.098f)
                arcToRelative(3.736f, 3.736f, 0f, false, false, -2.664f, 1.098f)
                close()
            }
        }.build()
        
        return _FaceFrown!!
    }

private var _FaceFrown: ImageVector? = null

