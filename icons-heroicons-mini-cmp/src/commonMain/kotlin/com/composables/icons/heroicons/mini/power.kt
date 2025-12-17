package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Power: ImageVector
    get() {
        if (_Power != null) return _Power!!
        
        _Power = ImageVector.Builder(
            name = "power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 2f)
                close()
                moveTo(5.404f, 4.343f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, 9.192f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                arcToRelative(8f, 8f, 0f, true, true, -11.313f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _Power!!
    }

private var _Power: ImageVector? = null

