package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.QuestionMarkCircle: ImageVector
    get() {
        if (_QuestionMarkCircle != null) return _QuestionMarkCircle!!
        
        _QuestionMarkCircle = ImageVector.Builder(
            name = "question-mark-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                close()
                moveToRelative(11.378f, -3.917f)
                curveToRelative(-0.89f, -0.777f, -2.366f, -0.777f, -3.255f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.988f, -1.129f)
                curveToRelative(1.454f, -1.272f, 3.776f, -1.272f, 5.23f, 0f)
                curveToRelative(1.513f, 1.324f, 1.513f, 3.518f, 0f, 4.842f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, -0.837f, 0.552f)
                curveToRelative(-0.676f, 0.328f, -1.028f, 0.774f, -1.028f, 1.152f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0f, -1.279f, 1.06f, -2.107f, 1.875f, -2.502f)
                curveToRelative(0.182f, -0.088f, 0.351f, -0.199f, 0.503f, -0.331f)
                curveToRelative(0.83f, -0.727f, 0.83f, -1.857f, 0f, -2.584f)
                close()
                moveTo(12f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
            }
        }.build()
        
        return _QuestionMarkCircle!!
    }

private var _QuestionMarkCircle: ImageVector? = null

