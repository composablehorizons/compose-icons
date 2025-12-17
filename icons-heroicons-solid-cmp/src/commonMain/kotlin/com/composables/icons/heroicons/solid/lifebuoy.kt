package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Lifebuoy: ImageVector
    get() {
        if (_Lifebuoy != null) return _Lifebuoy!!
        
        _Lifebuoy = ImageVector.Builder(
            name = "lifebuoy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.449f, 8.448f)
                lineTo(16.388f, 11f)
                arcToRelative(4.52f, 4.52f, 0f, false, true, 0f, 2.002f)
                lineToRelative(3.061f, 2.55f)
                arcToRelative(8.275f, 8.275f, 0f, false, false, 0f, -7.103f)
                close()
                moveTo(15.552f, 19.45f)
                lineTo(13f, 16.388f)
                arcToRelative(4.52f, 4.52f, 0f, false, true, -2.002f, 0f)
                lineToRelative(-2.55f, 3.061f)
                arcToRelative(8.275f, 8.275f, 0f, false, false, 7.103f, 0f)
                close()
                moveTo(4.55f, 15.552f)
                lineTo(7.612f, 13f)
                arcToRelative(4.52f, 4.52f, 0f, false, true, 0f, -2.002f)
                lineTo(4.551f, 8.45f)
                arcToRelative(8.275f, 8.275f, 0f, false, false, 0f, 7.103f)
                close()
                moveTo(8.448f, 4.55f)
                lineTo(11f, 7.612f)
                arcToRelative(4.52f, 4.52f, 0f, false, true, 2.002f, 0f)
                lineToRelative(2.55f, -3.061f)
                arcToRelative(8.275f, 8.275f, 0f, false, false, -7.103f, 0f)
                close()
                moveToRelative(8.657f, -0.86f)
                arcToRelative(9.776f, 9.776f, 0f, false, true, 1.79f, 1.415f)
                arcToRelative(9.776f, 9.776f, 0f, false, true, 1.414f, 1.788f)
                arcToRelative(9.764f, 9.764f, 0f, false, true, 0f, 10.211f)
                arcToRelative(9.777f, 9.777f, 0f, false, true, -1.415f, 1.79f)
                arcToRelative(9.777f, 9.777f, 0f, false, true, -1.788f, 1.414f)
                arcToRelative(9.764f, 9.764f, 0f, false, true, -10.212f, 0f)
                arcToRelative(9.776f, 9.776f, 0f, false, true, -1.788f, -1.415f)
                arcToRelative(9.776f, 9.776f, 0f, false, true, -1.415f, -1.788f)
                arcToRelative(9.764f, 9.764f, 0f, false, true, 0f, -10.212f)
                arcToRelative(9.774f, 9.774f, 0f, false, true, 1.415f, -1.788f)
                arcTo(9.774f, 9.774f, 0f, false, true, 6.894f, 3.69f)
                arcToRelative(9.764f, 9.764f, 0f, false, true, 10.211f, 0f)
                close()
                moveTo(14.121f, 9.88f)
                arcToRelative(2.985f, 2.985f, 0f, false, false, -1.11f, -0.704f)
                arcToRelative(3.015f, 3.015f, 0f, false, false, -2.022f, 0f)
                arcToRelative(2.985f, 2.985f, 0f, false, false, -1.11f, 0.704f)
                curveToRelative(-0.326f, 0.325f, -0.56f, 0.705f, -0.704f, 1.11f)
                arcToRelative(3.015f, 3.015f, 0f, false, false, 0f, 2.022f)
                curveToRelative(0.144f, 0.405f, 0.378f, 0.785f, 0.704f, 1.11f)
                curveToRelative(0.325f, 0.326f, 0.705f, 0.56f, 1.11f, 0.704f)
                curveToRelative(0.652f, 0.233f, 1.37f, 0.233f, 2.022f, 0f)
                arcToRelative(2.985f, 2.985f, 0f, false, false, 1.11f, -0.704f)
                curveToRelative(0.326f, -0.325f, 0.56f, -0.705f, 0.704f, -1.11f)
                arcToRelative(3.016f, 3.016f, 0f, false, false, 0f, -2.022f)
                arcToRelative(2.985f, 2.985f, 0f, false, false, -0.704f, -1.11f)
                close()
            }
        }.build()
        
        return _Lifebuoy!!
    }

private var _Lifebuoy: ImageVector? = null

