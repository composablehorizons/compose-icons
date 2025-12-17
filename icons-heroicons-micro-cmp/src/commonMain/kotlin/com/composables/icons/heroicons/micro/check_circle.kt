package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CheckCircle: ImageVector
    get() {
        if (_CheckCircle != null) return _CheckCircle!!
        
        _CheckCircle = ImageVector.Builder(
            name = "check-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, false, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, 14f)
                close()
                moveToRelative(3.844f, -8.791f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.188f, -0.918f)
                lineToRelative(-3.7f, 4.79f)
                lineToRelative(-1.649f, -1.833f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.114f, 1.004f)
                lineToRelative(2.25f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.15f, -0.043f)
                lineToRelative(4.25f, -5.5f)
                close()
            }
        }.build()
        
        return _CheckCircle!!
    }

private var _CheckCircle: ImageVector? = null

