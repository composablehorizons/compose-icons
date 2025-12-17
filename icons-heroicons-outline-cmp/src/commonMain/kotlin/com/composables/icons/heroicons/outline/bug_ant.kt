package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.BugAnt: ImageVector
    get() {
        if (_BugAnt != null) return _BugAnt!!
        
        _BugAnt = ImageVector.Builder(
            name = "bug-ant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(12f, 12.75f)
                curveToRelative(1.148f, 0f, 2.278f, 0.08f, 3.383f, 0.237f)
                curveToRelative(1.037f, 0.146f, 1.866f, 0.966f, 1.866f, 2.013f)
                curveToRelative(0f, 3.728f, -2.35f, 6.75f, -5.25f, 6.75f)
                reflectiveCurveTo(6.75f, 18.728f, 6.75f, 15f)
                curveToRelative(0f, -1.046f, 0.83f, -1.867f, 1.866f, -2.013f)
                arcTo(24.204f, 24.204f, 0f, false, true, 12f, 12.75f)
                close()
                moveToRelative(0f, 0f)
                curveToRelative(2.883f, 0f, 5.647f, 0.508f, 8.207f, 1.44f)
                arcToRelative(23.91f, 23.91f, 0f, false, true, -1.152f, 6.06f)
                moveTo(12f, 12.75f)
                curveToRelative(-2.883f, 0f, -5.647f, 0.508f, -8.208f, 1.44f)
                curveToRelative(0.125f, 2.104f, 0.52f, 4.136f, 1.153f, 6.06f)
                moveTo(12f, 12.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.248f, -2.354f)
                moveTo(12f, 12.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.248f, -2.354f)
                moveTo(12f, 8.25f)
                curveToRelative(0.995f, 0f, 1.971f, -0.08f, 2.922f, -0.236f)
                curveToRelative(0.403f, -0.066f, 0.74f, -0.358f, 0.795f, -0.762f)
                arcToRelative(3.778f, 3.778f, 0f, false, false, -0.399f, -2.25f)
                moveTo(12f, 8.25f)
                curveToRelative(-0.995f, 0f, -1.97f, -0.08f, -2.922f, -0.236f)
                curveToRelative(-0.402f, -0.066f, -0.74f, -0.358f, -0.795f, -0.762f)
                arcToRelative(3.734f, 3.734f, 0f, false, true, 0.4f, -2.253f)
                moveTo(12f, 8.25f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.248f, 2.146f)
                moveTo(12f, 8.25f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.248f, 2.146f)
                moveTo(8.683f, 5f)
                arcToRelative(6.032f, 6.032f, 0f, false, true, -1.155f, -1.002f)
                curveToRelative(0.07f, -0.63f, 0.27f, -1.222f, 0.574f, -1.747f)
                moveToRelative(0.581f, 2.749f)
                arcTo(3.75f, 3.75f, 0f, false, true, 15.318f, 5f)
                moveToRelative(0f, 0f)
                curveToRelative(0.427f, -0.283f, 0.815f, -0.62f, 1.155f, -0.999f)
                arcToRelative(4.471f, 4.471f, 0f, false, false, -0.575f, -1.752f)
                moveTo(4.921f, 6f)
                arcToRelative(24.048f, 24.048f, 0f, false, false, -0.392f, 3.314f)
                curveToRelative(1.668f, 0.546f, 3.416f, 0.914f, 5.223f, 1.082f)
                moveTo(19.08f, 6f)
                curveToRelative(0.205f, 1.08f, 0.337f, 2.187f, 0.392f, 3.314f)
                arcToRelative(23.882f, 23.882f, 0f, false, true, -5.223f, 1.082f)
            }
        }.build()
        
        return _BugAnt!!
    }

private var _BugAnt: ImageVector? = null

