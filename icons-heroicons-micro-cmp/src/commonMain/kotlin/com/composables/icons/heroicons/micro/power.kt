package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Power: ImageVector
    get() {
        if (_Power != null) return _Power!!
        
        _Power = ImageVector.Builder(
            name = "power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-6.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 1f)
                close()
                moveTo(4.11f, 3.05f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 7.78f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                arcToRelative(7f, 7f, 0f, true, true, -9.9f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _Power!!
    }

private var _Power: ImageVector? = null

