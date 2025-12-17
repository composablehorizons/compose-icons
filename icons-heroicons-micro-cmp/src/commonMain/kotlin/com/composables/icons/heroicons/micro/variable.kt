package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Variable: ImageVector
    get() {
        if (_Variable != null) return _Variable!!
        
        _Variable = ImageVector.Builder(
            name = "variable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.38f, 3.012f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.408f, -0.516f)
                arcTo(15.97f, 15.97f, 0f, false, false, 1f, 8f)
                curveToRelative(0f, 1.932f, 0.343f, 3.786f, 0.972f, 5.503f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.408f, -0.516f)
                arcTo(14.47f, 14.47f, 0f, false, true, 2.5f, 8f)
                curveToRelative(0f, -1.754f, 0.311f, -3.434f, 0.88f, -4.988f)
                close()
                moveTo(12.62f, 3.012f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.408f, -0.516f)
                arcTo(15.97f, 15.97f, 0f, false, true, 15f, 8f)
                arcToRelative(15.97f, 15.97f, 0f, false, true, -0.972f, 5.503f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.408f, -0.516f)
                curveToRelative(0.569f, -1.554f, 0.88f, -3.233f, 0.88f, -4.987f)
                reflectiveCurveToRelative(-0.311f, -3.434f, -0.88f, -4.988f)
                close()
                moveTo(6.523f, 4.785f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.898f, 0.38f)
                lineToRelative(0.758f, 1.515f)
                lineToRelative(0.812f, -0.902f)
                arcToRelative(2.376f, 2.376f, 0f, false, true, 2.486f, -0.674f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.454f, 1.429f)
                arcToRelative(0.876f, 0.876f, 0f, false, false, -0.918f, 0.249f)
                lineTo(8.9f, 8.122f)
                lineToRelative(0.734f, 1.468f)
                lineToRelative(0.388f, -0.124f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.457f, 1.428f)
                lineToRelative(-1f, 0.32f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.899f, -0.379f)
                lineTo(7.821f, 9.32f)
                lineToRelative(-0.811f, 0.901f)
                arcToRelative(2.374f, 2.374f, 0f, false, true, -2.489f, 0.673f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.458f, -1.428f)
                arcToRelative(0.874f, 0.874f, 0f, false, false, 0.916f, -0.248f)
                lineTo(7.1f, 7.878f)
                lineTo(6.366f, 6.41f)
                lineToRelative(-0.389f, 0.124f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.454f, -1.43f)
                lineToRelative(1f, -0.318f)
                close()
            }
        }.build()
        
        return _Variable!!
    }

private var _Variable: ImageVector? = null

