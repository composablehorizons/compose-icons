package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.FaceFrown: ImageVector
    get() {
        if (_FaceFrown != null) return _FaceFrown!!
        
        _FaceFrown = ImageVector.Builder(
            name = "face-frown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 18f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, -16f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                close()
                moveToRelative(-3.536f, -3.475f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.061f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.95f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                arcToRelative(5f, 5f, 0f, false, false, -7.07f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                close()
                moveTo(9f, 8.5f)
                curveToRelative(0f, 0.828f, -0.448f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.672f, -1f, -1.5f)
                reflectiveCurveTo(7.448f, 7f, 8f, 7f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
                close()
                moveToRelative(3f, 1.5f)
                curveToRelative(0.552f, 0f, 1f, -0.672f, 1f, -1.5f)
                reflectiveCurveTo(12.552f, 7f, 12f, 7f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveToRelative(0.448f, 1.5f, 1f, 1.5f)
                close()
            }
        }.build()
        
        return _FaceFrown!!
    }

private var _FaceFrown: ImageVector? = null

