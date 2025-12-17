package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Link: ImageVector
    get() {
        if (_Link != null) return _Link!!
        
        _Link = ImageVector.Builder(
            name = "link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.914f, 6.025f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 4.95f)
                lineToRelative(-2f, 2f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -5.396f, -4.402f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.251f, 0.827f)
                arcToRelative(2f, 2f, 0f, false, false, 3.085f, 2.514f)
                lineToRelative(2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -2.828f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.086f, 9.975f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -4.95f)
                lineToRelative(2f, -2f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 5.396f, 4.402f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.251f, -0.827f)
                arcToRelative(2f, 2f, 0f, false, false, -3.085f, -2.514f)
                lineToRelative(-2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 2.828f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                close()
            }
        }.build()
        
        return _Link!!
    }

private var _Link: ImageVector? = null

