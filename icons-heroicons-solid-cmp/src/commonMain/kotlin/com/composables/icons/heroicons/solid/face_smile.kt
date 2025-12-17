package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.FaceSmile: ImageVector
    get() {
        if (_FaceSmile != null) return _FaceSmile!!
        
        _FaceSmile = ImageVector.Builder(
            name = "face-smile",
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
                moveToRelative(2.023f, 6.828f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, -5.304f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                arcToRelative(5.25f, 5.25f, 0f, false, false, 7.424f, 0f)
                close()
            }
        }.build()
        
        return _FaceSmile!!
    }

private var _FaceSmile: ImageVector? = null

