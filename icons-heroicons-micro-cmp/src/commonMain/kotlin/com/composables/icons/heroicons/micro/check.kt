package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Check: ImageVector
    get() {
        if (_Check != null) return _Check!!
        
        _Check = ImageVector.Builder(
            name = "check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.416f, 3.376f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.208f, 1.04f)
                lineToRelative(-5f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.154f, 0.114f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineToRelative(2.353f, 2.353f)
                lineToRelative(4.493f, -6.74f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.04f, -0.207f)
                close()
            }
        }.build()
        
        return _Check!!
    }

private var _Check: ImageVector? = null

